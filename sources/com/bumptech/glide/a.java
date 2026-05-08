package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.engine.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.ao9;
import defpackage.au8;
import defpackage.bh1;
import defpackage.ch1;
import defpackage.f89;
import defpackage.gp2;
import defpackage.ht0;
import defpackage.j4d;
import defpackage.ja;
import defpackage.k4d;
import defpackage.k96;
import defpackage.ke0;
import defpackage.kt0;
import defpackage.l5;
import defpackage.l96;
import defpackage.m96;
import defpackage.mm3;
import defpackage.ri7;
import defpackage.uk0;
import defpackage.v79;
import defpackage.va9;
import defpackage.w79;
import defpackage.xjg;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ComponentCallbacks2 {
    public static volatile a W;
    public static volatile boolean X;
    public final ArrayList V = new ArrayList();
    public final bh1 a;
    public final f89 b;
    public final c c;
    public final kt0 d;
    public final k4d e;
    public final gp2 f;

    /* JADX INFO: renamed from: com.bumptech.glide.a$a, reason: collision with other inner class name */
    public interface InterfaceC0113a {
    }

    public a(Context context, f fVar, f89 f89Var, bh1 bh1Var, kt0 kt0Var, k4d k4dVar, gp2 gp2Var, int i, InterfaceC0113a interfaceC0113a, Map map, List list, ArrayList arrayList, uk0 uk0Var, l96 l96Var) {
        this.a = bh1Var;
        this.d = kt0Var;
        this.b = f89Var;
        this.e = k4dVar;
        this.f = gp2Var;
        this.c = new c(context, kt0Var, new au8(this, arrayList, uk0Var), interfaceC0113a, map, list, fVar, l96Var, i);
    }

    public static a a(Context context) {
        if (W == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException e) {
                ja.m("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
                return null;
            } catch (InstantiationException e2) {
                ja.m("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                ja.m("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
                return null;
            } catch (InvocationTargetException e4) {
                ja.m("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
                return null;
            }
            synchronized (a.class) {
                if (W == null) {
                    if (X) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    X = true;
                    try {
                        b(context, generatedAppGlideModule);
                        X = false;
                    } catch (Throwable th) {
                        X = false;
                        throw th;
                    }
                }
            }
        }
        return W;
    }

    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        ht0 ht0Var = new ht0();
        l96.a aVar = new l96.a();
        b bVar = new b();
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(va9.a(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e);
            }
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m96 m96Var = (m96) it.next();
                if (hashSet.contains(m96Var.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + m96Var);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + ((m96) it2.next()).getClass());
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((m96) it3.next()).b();
        }
        k96.a aVar2 = new k96.a();
        if (k96.b == 0) {
            k96.b = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = k96.b;
        if (TextUtils.isEmpty("source")) {
            l5.q("Name must be non-null and non-empty, but given: source");
            return;
        }
        k96 k96Var = new k96(new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new k96.b(aVar2, "source", false)));
        k96.a aVar3 = new k96.a();
        if (TextUtils.isEmpty("disk-cache")) {
            l5.q("Name must be non-null and non-empty, but given: disk-cache");
            return;
        }
        k96 k96Var2 = new k96(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new k96.b(aVar3, "disk-cache", true)));
        if (k96.b == 0) {
            k96.b = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i2 = k96.b >= 4 ? 2 : 1;
        k96.a aVar4 = new k96.a();
        if (TextUtils.isEmpty("animation")) {
            l5.q("Name must be non-null and non-empty, but given: animation");
            return;
        }
        k96 k96Var3 = new k96(new ThreadPoolExecutor(i2, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new k96.b(aVar4, "animation", true)));
        ao9 ao9Var = new ao9(new ao9.a(applicationContext));
        mm3 mm3Var = new mm3();
        int i3 = ao9Var.a;
        bh1 w79Var = i3 > 0 ? new w79(i3) : new ch1();
        v79 v79Var = new v79(ao9Var.c);
        f89 f89Var = new f89(ao9Var.b);
        a aVar5 = new a(applicationContext, new f(f89Var, new ri7(new ke0(applicationContext)), k96Var2, k96Var, new k96(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10000L, TimeUnit.MILLISECONDS, new SynchronousQueue(), new k96.b(new k96.a(), "source-unlimited", false))), k96Var3), f89Var, w79Var, v79Var, new k4d(), mm3Var, 4, bVar, ht0Var, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new l96(aVar));
        applicationContext.registerComponentCallbacks(aVar5);
        W = aVar5;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        xjg.a();
        this.b.e(0L);
        this.a.b();
        this.d.b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        xjg.a();
        synchronized (this.V) {
            try {
                Iterator it = this.V.iterator();
                while (it.hasNext()) {
                    ((j4d) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f89 f89Var = this.b;
        f89Var.getClass();
        if (i >= 40) {
            f89Var.e(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (f89Var) {
                j = f89Var.b;
            }
            f89Var.e(j / 2);
        }
        this.a.a(i);
        this.d.a(i);
    }
}
