package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.soloader.OpenSourceMergedSoMapping;
import com.facebook.soloader.SysUtil;
import defpackage.akb;
import defpackage.am2;
import defpackage.cne;
import defpackage.d3f;
import defpackage.dne;
import defpackage.ene;
import defpackage.eo0;
import defpackage.foa;
import defpackage.hh2;
import defpackage.ioa;
import defpackage.l54;
import defpackage.msb;
import defpackage.ntc;
import defpackage.p39;
import defpackage.p54;
import defpackage.pi3;
import defpackage.u9a;
import defpackage.wab;
import defpackage.wp3;
import defpackage.z3;
import defpackage.zme;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
public class SoLoader {
    public static pi3 b;
    public static int m;
    public static final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    public static Context d = null;
    public static volatile ene[] e = null;
    public static final AtomicInteger f = new AtomicInteger(0);
    public static wp3 g = null;
    public static final Set<String> h = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final HashMap i = new HashMap();
    public static final Set<String> j = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final HashMap k = new HashMap();
    public static boolean l = true;
    public static int n = 0;
    public static OpenSourceMergedSoMapping o = null;
    public static final boolean a = true;

    public static final class a extends UnsatisfiedLinkError {
    }

    public static void a(ArrayList<ene> arrayList) {
        String strM = SysUtil.MarshmallowSysdeps.is64Bit() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str = System.getenv("LD_LIBRARY_PATH");
        if (str != null && !str.equals("")) {
            strM = z3.m(str, ":", strM);
        }
        for (String str2 : new HashSet(Arrays.asList(strM.split(":")))) {
            p39.a("adding system library source: " + str2);
            arrayList.add(new p54(new File(str2), 2));
        }
    }

    public static void b(String str, String str2, int i2, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (e == null) {
                Log.e("SoLoader", "Could not load: " + str + " because SoLoader is not initialized");
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z = true;
            } else {
                z = false;
            }
            if (a) {
                if (str2 != null) {
                    Api18TraceUtils.a("SoLoader.loadLibrary[", str2, "]");
                }
                Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (ene eneVar : e) {
                            if (p(eneVar, str, i2, threadPolicy)) {
                                if (z) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                        throw cne.b(str, d, e);
                    } finally {
                    }
                } catch (IOException e2) {
                    dne dneVar = new dne(str, e2.toString());
                    dneVar.initCause(e2);
                    throw dneVar;
                }
            } finally {
                if (a) {
                    if (str2 != null) {
                        Trace.endSection();
                    }
                    Trace.endSection();
                }
                if (z) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
        } finally {
        }
    }

    public static int c(Context context) {
        int i2 = n;
        if (i2 != 0) {
            return i2;
        }
        if (context == null) {
            p39.a("context is null, fallback to THIRD_PARTY_APP appType");
            return 1;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i3 = applicationInfo.flags;
        int i4 = (i3 & 1) != 0 ? (i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? 3 : 2 : 1;
        p39.a("ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + i4);
        return i4;
    }

    public static synchronized am2 d() {
        wp3 wp3Var;
        wp3Var = g;
        return wp3Var == null ? null : wp3Var.a();
    }

    public static void e(Context context, int i2) {
        if (j()) {
            Log.w("SoLoader", "SoLoader already initialized");
            return;
        }
        Log.w("SoLoader", "Initializing SoLoader: " + i2);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean zG = g(context);
            l = zG;
            if (zG) {
                int iC = c(context);
                n = iC;
                if ((i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                    if (iC == 2 || (context != null && (context.getApplicationInfo().flags & 268435456) == 0)) {
                        i2 |= 8;
                    }
                }
                h(context, i2);
                i(context, i2);
                p39.b("SoLoader", "Init SoLoader delegate");
                u9a.a(new hh2(23));
            } else {
                f();
                p39.b("SoLoader", "Init System Loader delegate");
                u9a.a(new msb());
            }
            Log.w("SoLoader", "SoLoader initialized: " + i2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static void f() {
        if (e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (e == null) {
                e = new ene[0];
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            c.writeLock().unlock();
            throw th;
        }
    }

    public static boolean g(Context context) {
        String packageName;
        if (o != null) {
            return true;
        }
        Bundle bundle = null;
        try {
            packageName = context.getPackageName();
            try {
                bundle = context.getPackageManager().getApplicationInfo(packageName, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData;
            } catch (Exception e2) {
                e = e2;
                Log.w("SoLoader", "Unexpected issue with package manager (" + packageName + ")", e);
            }
        } catch (Exception e3) {
            e = e3;
            packageName = null;
        }
        return bundle == null || bundle.getBoolean("com.facebook.soloader.enabled", true);
    }

    public static synchronized void h(Context context, int i2) {
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
                } else {
                    context = applicationContext;
                }
                d = context;
                g = new wp3(context, (i2 & 2048) != 0 ? 1 : 0);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b != null) {
            return;
        }
        b = new pi3(new zme());
    }

    public static void i(Context context, int i2) {
        int i3;
        int i4;
        ReentrantReadWriteLock.WriteLock writeLock;
        if (e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (e != null) {
                writeLock = reentrantReadWriteLock.writeLock();
            } else {
                m = i2;
                ArrayList arrayList = new ArrayList();
                boolean z = (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0;
                boolean z2 = (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0;
                if (z) {
                    d3f d3fVar = new d3f();
                    p39.a("adding systemLoadWrapper source: " + d3fVar);
                    arrayList.add(0, d3fVar);
                } else if (z2) {
                    a(arrayList);
                    arrayList.add(0, new l54());
                } else {
                    a(arrayList);
                    if (context != null) {
                        if ((i2 & 1) != 0) {
                            int i5 = n;
                            if (i5 != 1) {
                                if (i5 != 2 && i5 != 3) {
                                    throw new RuntimeException("Unsupported app type, we should not reach here");
                                }
                                i4 = 1;
                            } else {
                                i4 = 0;
                            }
                            eo0 eo0Var = new eo0(d, i4);
                            p39.a("Adding application source: ".concat(eo0Var.toString()));
                            arrayList.add(0, eo0Var);
                            p39.a("Adding exo package source: lib-main");
                            arrayList.add(0, new c(context, "lib-main", true));
                        } else {
                            if (n == 2 || (context.getApplicationInfo().flags & 268435456) == 0) {
                                b bVar = new b(context);
                                p39.a("validating/adding directApk source: ".concat(bVar.toString()));
                                if (!bVar.c.isEmpty()) {
                                    arrayList.add(0, bVar);
                                }
                            }
                            int i6 = n;
                            if (i6 != 1) {
                                if (i6 != 2 && i6 != 3) {
                                    throw new RuntimeException("Unsupported app type, we should not reach here");
                                }
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            eo0 eo0Var2 = new eo0(d, i3);
                            p39.a("Adding application source: ".concat(eo0Var2.toString()));
                            arrayList.add(0, eo0Var2);
                            boolean z3 = (i2 & 4096) != 0;
                            if ((m & 8) == 0) {
                                arrayList.add(0, new com.facebook.soloader.a(context, "lib-main", !z3));
                            }
                        }
                    }
                }
                ene[] eneVarArr = (ene[]) arrayList.toArray(new ene[arrayList.size()]);
                reentrantReadWriteLock.writeLock().lock();
                try {
                    int i7 = m;
                    int i8 = (i7 & 2) == 0 ? 0 : 1;
                    if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                        i8 |= 4;
                    }
                    if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                        i8 |= 8;
                    }
                    reentrantReadWriteLock.writeLock().unlock();
                    int length = eneVarArr.length;
                    while (true) {
                        int i9 = length - 1;
                        if (length <= 0) {
                            break;
                        }
                        String str = "Preparing SO source: " + eneVarArr[i9];
                        if (Log.isLoggable("SoLoader", 4)) {
                            Log.i("SoLoader", str);
                        }
                        boolean z4 = a;
                        if (z4) {
                            Api18TraceUtils.a("SoLoader", "_", eneVarArr[i9].getClass().getSimpleName());
                        }
                        eneVarArr[i9].e(i8);
                        if (z4) {
                            Trace.endSection();
                        }
                        length = i9;
                    }
                    e = eneVarArr;
                    f.getAndIncrement();
                    String str2 = "init finish: " + e.length + " SO sources prepared";
                    if (Log.isLoggable("SoLoader", 4)) {
                        Log.i("SoLoader", str2);
                    }
                    writeLock = c.writeLock();
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            writeLock.unlock();
        } catch (Throwable th) {
            reentrantReadWriteLock = c;
            throw th;
        }
    }

    public static void init(Context context, int i2) {
        e(context, i2);
    }

    public static boolean j() {
        if (e != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean z = e != null;
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            c.readLock().unlock();
            throw th;
        }
    }

    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock"})
    public static void k(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        foa[] foaVarArr = ioa.a.get();
        int i3 = 0;
        if (foaVarArr != null) {
            for (foa foaVar : foaVarArr) {
                foaVar.i();
            }
        }
        try {
            o(str, null, null, i2 | 1, threadPolicy);
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                foa[] foaVarArr2 = ioa.a.get();
                if (foaVarArr2 != null) {
                    int length = foaVarArr2.length;
                    while (i3 < length) {
                        foaVarArr2[i3].d();
                        i3++;
                    }
                }
            }
        }
    }

    public static void l(String str) {
        if (l) {
            m(0, str);
        } else {
            u9a.b(str);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean m(int i2, String str) {
        Boolean boolValueOf;
        String str2;
        String str3 = null;
        if (e == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = c;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (e == null) {
                    if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        synchronized (SoLoader.class) {
                            try {
                                boolean zContains = h.contains(str);
                                boolean z = !zContains;
                                if (!zContains) {
                                    System.loadLibrary(str);
                                }
                                boolValueOf = Boolean.valueOf(z);
                            } finally {
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                    } else if (!j()) {
                        throw new IllegalStateException("SoLoader.init() not yet called");
                    }
                }
                reentrantReadWriteLock.readLock().unlock();
                boolValueOf = null;
            } catch (Throwable th) {
                c.readLock().unlock();
                throw th;
            }
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        if (!l) {
            return u9a.b(str);
        }
        if (n != 2) {
        }
        if (o != null) {
            switch (str.hashCode()) {
                case -1793638007:
                    if (!str.equals("mapbufferjni")) {
                        str3 = str;
                    }
                    str2 = "reactnative";
                    str3 = str2;
                    break;
                case -1624070447:
                    if (!str.equals("rninstance")) {
                        str3 = str;
                    }
                    str2 = "reactnative";
                    str3 = str2;
                    break;
                case -1570429553:
                    if (!str.equals("reactnativejni")) {
                        str3 = str;
                    }
                    str2 = "reactnative";
                    str3 = str2;
                    break;
                case -1438915853:
                    if (!str.equals("reactnativeblob")) {
                        str3 = str;
                    }
                    str2 = "reactnative";
                    str3 = str2;
                    break;
                case -1382694412:
                    if (!str.equals("react_featureflagsjni")) {
                        str3 = str;
                    }
                    str2 = "reactnative";
                    str3 = str2;
                    break;
                case -1259441509:
                    if (!str.equals("reactnativejni_common")) {
                        str3 = str;
                    }
                    str2 = "reactnative";
                    str3 = str2;
                    break;
                case -579037304:
                    if (!str.equals("react_newarchdefaults")) {
                        str3 = str;
                    }
                    str2 = "reactnative";
                    str3 = str2;
                    break;
                case -49345041:
                    if (!str.equals("turbomodulejsijni")) {
                        str3 = str;
                    }
                    str2 = "reactnative";
                    str3 = str2;
                    break;
                case 3714672:
                    if (!str.equals("yoga")) {
                        str3 = str;
                    }
                    str2 = "reactnative";
                    str3 = str2;
                    break;
                case 65536138:
                    if (!str.equals("hermesinstancejni")) {
                        str3 = str;
                    }
                    str2 = "hermestooling";
                    str3 = str2;
                    break;
                case 86183502:
                    if (!str.equals("jsijniprofiler")) {
                        str3 = str;
                    }
                    str2 = "hermestooling";
                    str3 = str2;
                    break;
                case 352552524:
                    if (!str.equals("hermes_executor")) {
                        str3 = str;
                    }
                    str2 = "hermestooling";
                    str3 = str2;
                    break;
                case 688235659:
                    if (!str.equals("react_devsupportjni")) {
                        str3 = str;
                    }
                    str2 = "reactnative";
                    str3 = str2;
                    break;
                case 716617324:
                    if (!str.equals("uimanagerjni")) {
                        str3 = str;
                    }
                    str2 = "reactnative";
                    str3 = str2;
                    break;
                case 1590431694:
                    if (!str.equals("jsinspector")) {
                        str3 = str;
                    }
                    str2 = "reactnative";
                    str3 = str2;
                    break;
                case 2016911584:
                    if (!str.equals("fabricjni")) {
                        str3 = str;
                    }
                    str2 = "reactnative";
                    str3 = str2;
                    break;
                default:
                    str3 = str;
                    break;
            }
        }
        String str4 = str3 != null ? str3 : str;
        foa[] foaVarArr = ioa.a.get();
        int i3 = 0;
        if (foaVarArr != null) {
            for (foa foaVar : foaVarArr) {
                foaVar.h();
            }
        }
        try {
            return n(i2, System.mapLibraryName(str4), str, str3);
        } finally {
        }
    }

    public static boolean n(int i2, String str, String str2, String str3) {
        am2 am2VarD = null;
        while (true) {
            try {
                return o(str, str2, str3, i2, null);
            } catch (UnsatisfiedLinkError e2) {
                StringBuilder sbM = akb.m("Running a recovery step for ", str, " due to ");
                sbM.append(e2.toString());
                Log.w("SoLoader", sbM.toString());
                ReentrantReadWriteLock reentrantReadWriteLock = c;
                reentrantReadWriteLock.writeLock().lock();
                if (am2VarD == null) {
                    try {
                        try {
                            am2VarD = d();
                            if (am2VarD == null) {
                                Log.w("SoLoader", "No recovery strategy");
                                throw e2;
                            }
                        } catch (NoBaseApkException e3) {
                            Log.e("SoLoader", "Base APK not found during recovery", e3);
                            throw e3;
                        } catch (Exception e4) {
                            Log.e("SoLoader", "Got an exception during recovery, will throw the initial error instead", e4);
                            throw e2;
                        }
                    } catch (Throwable th) {
                        reentrantReadWriteLock.writeLock().unlock();
                        throw th;
                    }
                }
                if (!q(e2, am2VarD)) {
                    reentrantReadWriteLock.writeLock().unlock();
                    Log.w("SoLoader", "Failed to recover");
                    throw e2;
                }
                f.getAndIncrement();
                reentrantReadWriteLock.writeLock().unlock();
            }
        }
    }

    public static boolean o(String str, String str2, String str3, int i2, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        Object obj;
        Object obj2;
        if (TextUtils.isEmpty(str2) || !j.contains(str2)) {
            Set<String> set = h;
            if (!set.contains(str) || str3 != null) {
                synchronized (SoLoader.class) {
                    try {
                        if (!set.contains(str)) {
                            z = false;
                        } else {
                            if (str3 == null) {
                                return false;
                            }
                            z = true;
                        }
                        HashMap map = i;
                        if (map.containsKey(str)) {
                            obj = map.get(str);
                        } else {
                            Object obj3 = new Object();
                            map.put(str, obj3);
                            obj = obj3;
                        }
                        HashMap map2 = k;
                        if (map2.containsKey(str2)) {
                            obj2 = map2.get(str2);
                        } else {
                            Object obj4 = new Object();
                            map2.put(str2, obj4);
                            obj2 = obj4;
                        }
                        ReentrantReadWriteLock reentrantReadWriteLock = c;
                        reentrantReadWriteLock.readLock().lock();
                        try {
                            synchronized (obj) {
                                if (!z) {
                                    if (set.contains(str)) {
                                        if (str3 == null) {
                                            reentrantReadWriteLock.readLock().unlock();
                                            return false;
                                        }
                                        z = true;
                                    }
                                    if (!z) {
                                        try {
                                            p39.a("About to load: " + str);
                                            b(str, str2, i2, threadPolicy);
                                            p39.a("Loaded: " + str);
                                            set.add(str);
                                        } catch (UnsatisfiedLinkError e2) {
                                            String message = e2.getMessage();
                                            if (message == null || !message.contains("unexpected e_machine:")) {
                                                throw e2;
                                            }
                                            a aVar = new a("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.MarshmallowSysdeps.getSupportedAbis()) + " error: " + message.substring(message.lastIndexOf("unexpected e_machine:")));
                                            aVar.initCause(e2);
                                            throw aVar;
                                        }
                                    }
                                }
                                synchronized (obj2) {
                                    if ((i2 & 16) == 0 && str3 != null) {
                                        try {
                                            if (TextUtils.isEmpty(str2) || !j.contains(str2)) {
                                                boolean z2 = a;
                                                if (z2 && o == null) {
                                                    Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                                                }
                                                try {
                                                    try {
                                                        p39.a("About to invoke JNI_OnLoad for merged library " + str2 + ", which was merged into " + str);
                                                        OpenSourceMergedSoMapping openSourceMergedSoMapping = o;
                                                        if (openSourceMergedSoMapping == null) {
                                                            wab.o(str2);
                                                            throw null;
                                                        }
                                                        openSourceMergedSoMapping.a(str2);
                                                        j.add(str2);
                                                        if (z2 && o == null) {
                                                            Trace.endSection();
                                                        }
                                                    } finally {
                                                    }
                                                } catch (UnsatisfiedLinkError e3) {
                                                    throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e3);
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                                reentrantReadWriteLock.readLock().unlock();
                                return !z;
                            }
                        } catch (Throwable th) {
                            c.readLock().unlock();
                            throw th;
                        }
                    } finally {
                    }
                }
            }
        }
        return false;
    }

    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock", "MissingSoLoaderLibrary"})
    public static boolean p(ene eneVar, String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        foa[] foaVarArr = ioa.a.get();
        int i3 = 0;
        if (foaVarArr != null) {
            for (foa foaVar : foaVarArr) {
                foaVar.j();
            }
        }
        try {
            return eneVar.d(str, i2, threadPolicy) != 0;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                foa[] foaVarArr2 = ioa.a.get();
                if (foaVarArr2 != null) {
                    int length = foaVarArr2.length;
                    while (i3 < length) {
                        foaVarArr2[i3].a();
                        i3++;
                    }
                }
            }
        }
    }

    @SuppressLint({"CatchGeneralException", "EmptyCatchBlock"})
    public static boolean q(UnsatisfiedLinkError unsatisfiedLinkError, ntc ntcVar) {
        foa[] foaVarArr = ioa.a.get();
        int i2 = 0;
        if (foaVarArr != null) {
            for (foa foaVar : foaVarArr) {
                foaVar.l();
            }
        }
        try {
            return ntcVar.b(unsatisfiedLinkError, e);
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                foa[] foaVarArr2 = ioa.a.get();
                if (foaVarArr2 != null) {
                    int length = foaVarArr2.length;
                    while (i2 < length) {
                        foaVarArr2[i2].e();
                        i2++;
                    }
                }
            }
        }
    }
}
