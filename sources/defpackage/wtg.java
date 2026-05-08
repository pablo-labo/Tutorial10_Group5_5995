package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class wtg {
    public static ScheduledExecutorService k;
    public final wtg a;
    public final PowerManager.WakeLock b;
    public final WorkSource c;
    public final String d;
    public final Context e;
    public boolean f;
    public final HashMap g;
    public final Set<Future<?>> h;
    public int i;
    public final AtomicInteger j;

    public wtg(Context context) {
        vfd vfdVar;
        String packageName = context.getPackageName();
        this.a = this;
        this.f = true;
        this.g = new HashMap();
        this.h = Collections.synchronizedSet(new HashSet());
        this.j = new AtomicInteger(0);
        fib.g("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        this.e = context.getApplicationContext();
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.d = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.d = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        this.b = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (q3h.b(context)) {
            packageName = rve.a(packageName) ? context.getPackageName() : packageName;
            WorkSource workSource = null;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoA = a5h.a(context).a(0, packageName);
                    if (applicationInfoA == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i = applicationInfoA.uid;
                        workSource = new WorkSource();
                        q3h.a(workSource, i, packageName);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            this.c = workSource;
            if (workSource != null && q3h.b(this.e)) {
                workSource.add(workSource);
                try {
                    this.b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (k == null) {
            synchronized (jgb.class) {
                try {
                    if (jgb.a == null) {
                        jgb.a = new vfd();
                    }
                    vfdVar = jgb.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            vfdVar.getClass();
            k = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
        }
    }

    public final void a() {
        this.j.incrementAndGet();
        if (this.f) {
            TextUtils.isEmpty(null);
        }
        synchronized (this.a) {
            try {
                if (!this.g.isEmpty() || this.i > 0) {
                    if (!this.b.isHeld()) {
                        this.g.clear();
                        this.i = 0;
                    }
                }
                if (this.f) {
                    Integer[] numArr = (Integer[]) this.g.get(null);
                    if (numArr == null) {
                        this.g.put(null, new Integer[]{1});
                        pte.a(this.b, null);
                        c();
                        this.i++;
                    } else {
                        numArr[0] = Integer.valueOf(numArr[0].intValue() + 1);
                        if (!this.f) {
                            pte.a(this.b, null);
                            c();
                            this.i++;
                        }
                    }
                } else if (!this.f && this.i == 0) {
                    pte.a(this.b, null);
                    c();
                    this.i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.acquire();
        k.schedule(new tkh(this), 60000L, TimeUnit.MILLISECONDS);
    }

    public final void b() {
        Integer[] numArr;
        if (this.j.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.d).concat(" release without a matched acquire!"));
        }
        if (this.f) {
            TextUtils.isEmpty(null);
        }
        synchronized (this.a) {
            try {
                if (!this.f || (numArr = (Integer[]) this.g.get(null)) == null) {
                    if (!this.f && this.i == 1) {
                        pte.a(this.b, null);
                        c();
                        this.i--;
                    }
                } else if (numArr[0].intValue() == 1) {
                    this.g.remove(null);
                    pte.a(this.b, null);
                    c();
                    this.i--;
                } else {
                    numArr[0] = Integer.valueOf(numArr[0].intValue() - 1);
                    if (!this.f) {
                        pte.a(this.b, null);
                        c();
                        this.i--;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d();
    }

    public final void c() {
        String str;
        Method method = q3h.a;
        ArrayList arrayList = new ArrayList();
        WorkSource workSource = this.c;
        int iD = workSource == null ? 0 : q3h.d(workSource);
        if (iD != 0) {
            for (int i = 0; i < iD; i++) {
                Method method2 = q3h.d;
                if (method2 != null) {
                    try {
                        str = (String) method2.invoke(workSource, Integer.valueOf(i));
                    } catch (Exception e) {
                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (!rve.a(str)) {
                    fib.i(str);
                    arrayList.add(str);
                }
            }
        }
    }

    public final void d() {
        PowerManager.WakeLock wakeLock = this.b;
        if (wakeLock.isHeld()) {
            try {
                wakeLock.release();
            } catch (RuntimeException e) {
                if (!e.getClass().equals(RuntimeException.class)) {
                    throw e;
                }
                Log.e("WakeLock", String.valueOf(this.d).concat(" was already released!"), e);
            }
            wakeLock.isHeld();
        }
    }
}
