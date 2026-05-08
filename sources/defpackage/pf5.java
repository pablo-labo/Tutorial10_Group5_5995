package defpackage;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import defpackage.ht0;
import defpackage.o71;
import defpackage.xna;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class pf5 {
    public static final Object k = new Object();
    public static final ht0 l = new ht0();
    public final Context a;
    public final String b;
    public final xf5 c;
    public final sg2 d;
    public final cn8<de3> g;
    public final j6c<xn3> h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z);
    }

    @TargetApi(ModuleDescriptor.MODULE_VERSION)
    public static class b implements o71.a {
        public static final AtomicReference<b> a = new AtomicReference<>();

        @Override // o71.a
        public final void a(boolean z) {
            synchronized (pf5.k) {
                try {
                    for (pf5 pf5Var : new ArrayList(pf5.l.values())) {
                        if (pf5Var.e.get()) {
                            Log.d("FirebaseApp", "Notifying background state change listeners.");
                            Iterator it = pf5Var.i.iterator();
                            while (it.hasNext()) {
                                ((a) it.next()).a(z);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @TargetApi(24)
    public static class c extends BroadcastReceiver {
        public static final AtomicReference<c> b = new AtomicReference<>();
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (pf5.k) {
                try {
                    Iterator it = ((ht0.e) pf5.l.values()).iterator();
                    while (it.hasNext()) {
                        ((pf5) it.next()).e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.a.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public pf5(final Context context, String str, xf5 xf5Var) {
        ?? arrayList;
        this.a = context;
        fib.f(str);
        this.b = str;
        this.c = xf5Var;
        p31 p31Var = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        for (final String str3 : arrayList) {
            arrayList2.add(new j6c() { // from class: ig2
                @Override // defpackage.j6c
                public final Object get() {
                    String str4 = str3;
                    try {
                        Class<?> cls = Class.forName(str4);
                        if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                            return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                        }
                        throw new InvalidRegistrarException("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                    } catch (ClassNotFoundException unused2) {
                        Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                        return null;
                    } catch (IllegalAccessException e) {
                        throw new InvalidRegistrarException(l5.m("Could not instantiate ", str4, "."), e);
                    } catch (InstantiationException e2) {
                        throw new InvalidRegistrarException(l5.m("Could not instantiate ", str4, "."), e2);
                    } catch (NoSuchMethodException e3) {
                        throw new InvalidRegistrarException(l5.l("Could not instantiate ", str4), e3);
                    } catch (InvocationTargetException e4) {
                        throw new InvalidRegistrarException(l5.l("Could not instantiate ", str4), e4);
                    }
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        a5g a5gVar = a5g.a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
        arrayList3.add(new j6c() { // from class: rg2
            @Override // defpackage.j6c
            public final Object get() {
                return firebaseCommonRegistrar;
            }
        });
        final ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
        arrayList3.add(new j6c() { // from class: rg2
            @Override // defpackage.j6c
            public final Object get() {
                return executorsRegistrar;
            }
        });
        arrayList4.add(uf2.c(context, Context.class, new Class[0]));
        arrayList4.add(uf2.c(this, pf5.class, new Class[0]));
        arrayList4.add(uf2.c(xf5Var, xf5.class, new Class[0]));
        mg2 mg2Var = new mg2();
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.b.get()) {
            arrayList4.add(uf2.c(p31Var, zre.class, new Class[0]));
        }
        sg2 sg2Var = new sg2(arrayList3, arrayList4, mg2Var);
        this.d = sg2Var;
        Trace.endSection();
        this.g = new cn8<>(new j6c() { // from class: nf5
            @Override // defpackage.j6c
            public final Object get() {
                pf5 pf5Var = this.a;
                return new de3(context, pf5Var.d(), (w6c) pf5Var.d.get(w6c.class));
            }
        });
        this.h = sg2Var.e(xn3.class);
        a aVar = new a() { // from class: of5
            @Override // pf5.a
            public final void a(boolean z) {
                if (z) {
                    return;
                }
                this.a.h.get().c();
            }
        };
        a();
        if (this.e.get()) {
            o71.e.a.get();
        }
        this.i.add(aVar);
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static pf5 c() {
        pf5 pf5Var;
        synchronized (k) {
            try {
                pf5Var = (pf5) l.get("[DEFAULT]");
                if (pf5Var == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + hob.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                pf5Var.h.get().c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return pf5Var;
    }

    public static pf5 f(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return c();
                }
                xf5 xf5VarA = xf5.a(context);
                if (xf5VarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, xf5VarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static pf5 g(Context context, xf5 xf5Var) {
        pf5 pf5Var;
        AtomicReference<b> atomicReference = b.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<b> atomicReference2 = b.a;
            if (atomicReference2.get() == null) {
                b bVar = new b();
                while (true) {
                    if (atomicReference2.compareAndSet(null, bVar)) {
                        o71.a(application);
                        o71 o71Var = o71.e;
                        o71Var.getClass();
                        synchronized (o71Var) {
                            o71Var.c.add(bVar);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            ht0 ht0Var = l;
            fib.k("FirebaseApp name [DEFAULT] already exists!", !ht0Var.containsKey("[DEFAULT]"));
            fib.j(context, "Application context cannot be null.");
            pf5Var = new pf5(context, "[DEFAULT]", xf5Var);
            ht0Var.put("[DEFAULT]", pf5Var);
        }
        pf5Var.e();
        return pf5Var;
    }

    public final void a() {
        fib.k("FirebaseApp was deleted", !this.f.get());
    }

    public final <T> T b(Class<T> cls) {
        a();
        return (T) this.d.get(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(pyd.p(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(pyd.p(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void e() {
        HashMap map;
        if (!((UserManager) this.a.getSystemService(UserManager.class)).isUserUnlocked()) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.a;
            AtomicReference<c> atomicReference = c.b;
            if (atomicReference.get() == null) {
                c cVar = new c(context);
                while (!atomicReference.compareAndSet(null, cVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.b);
        Log.i("FirebaseApp", sb2.toString());
        sg2 sg2Var = this.d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.b);
        AtomicReference<Boolean> atomicReference2 = sg2Var.f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (true) {
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (sg2Var) {
                    map = new HashMap(sg2Var.a);
                }
                sg2Var.g(map, zEquals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        this.h.get().c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pf5)) {
            return false;
        }
        pf5 pf5Var = (pf5) obj;
        pf5Var.a();
        return this.b.equals(pf5Var.b);
    }

    public final boolean h() {
        boolean z;
        a();
        de3 de3Var = this.g.get();
        synchronized (de3Var) {
            z = de3Var.b;
        }
        return z;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        xna.a aVar = new xna.a(this);
        aVar.a(this.b, "name");
        aVar.a(this.c, "options");
        return aVar.toString();
    }
}
