package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import defpackage.f2;
import defpackage.t4h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class kob implements l15, jp5 {
    public static final String b0 = z39.f("Processor");
    public final List<god> X;
    public final Context b;
    public final androidx.work.a c;
    public final x2h d;
    public final WorkDatabase e;
    public final HashMap V = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet Y = new HashSet();
    public final ArrayList Z = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object a0 = new Object();
    public final HashMap W = new HashMap();

    public static class a implements Runnable {
        public final kob a;
        public final r2h b;
        public final hz8<Boolean> c;

        public a(kob kobVar, r2h r2hVar, fbe fbeVar) {
            this.a = kobVar;
            this.b = r2hVar;
            this.c = fbeVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = this.c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.a.b(this.b, zBooleanValue);
        }
    }

    public kob(Context context, androidx.work.a aVar, x2h x2hVar, WorkDatabase workDatabase, List list) {
        this.b = context;
        this.c = aVar;
        this.d = x2hVar;
        this.e = workDatabase;
        this.X = list;
    }

    public static boolean c(t4h t4hVar, String str) {
        if (t4hVar == null) {
            z39.d().a(b0, "WorkerWrapper could not be found for " + str);
            return false;
        }
        t4hVar.g0 = true;
        t4hVar.h();
        t4hVar.f0.cancel(true);
        if (t4hVar.f == null || !(t4hVar.f0.a instanceof f2.b)) {
            z39.d().a(t4h.h0, "WorkSpec " + t4hVar.e + " is already done. Not interrupting.");
        } else {
            t4hVar.f.stop();
        }
        z39.d().a(b0, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(l15 l15Var) {
        synchronized (this.a0) {
            this.Z.add(l15Var);
        }
    }

    @Override // defpackage.l15
    public final void b(r2h r2hVar, boolean z) {
        synchronized (this.a0) {
            try {
                t4h t4hVar = (t4h) this.V.get(r2hVar.a);
                if (t4hVar != null && r2hVar.equals(yid.d(t4hVar.e))) {
                    this.V.remove(r2hVar.a);
                }
                z39.d().a(b0, kob.class.getSimpleName() + " " + r2hVar.a + " executed; reschedule = " + z);
                Iterator it = this.Z.iterator();
                while (it.hasNext()) {
                    ((l15) it.next()).b(r2hVar, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z;
        synchronized (this.a0) {
            try {
                z = this.V.containsKey(str) || this.f.containsKey(str);
            } finally {
            }
        }
        return z;
    }

    public final void e(l15 l15Var) {
        synchronized (this.a0) {
            this.Z.remove(l15Var);
        }
    }

    public final void f(r2h r2hVar) {
        this.d.c.execute(new ky0(6, this, r2hVar));
    }

    public final void g(String str, hp5 hp5Var) {
        synchronized (this.a0) {
            try {
                z39.d().e(b0, "Moving WorkSpec (" + str + ") to the foreground");
                t4h t4hVar = (t4h) this.V.remove(str);
                if (t4hVar != null) {
                    if (this.a == null) {
                        PowerManager.WakeLock wakeLockA = ytg.a(this.b, "ProcessorForegroundLck");
                        this.a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f.put(str, t4hVar);
                    this.b.startForegroundService(q2f.d(this.b, yid.d(t4hVar.e), hp5Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(tre treVar, WorkerParameters.a aVar) {
        r2h r2hVar = treVar.a;
        String str = r2hVar.a;
        ArrayList arrayList = new ArrayList();
        r3h r3hVar = (r3h) this.e.v(new w69(this, arrayList, str, 1));
        if (r3hVar == null) {
            z39.d().g(b0, "Didn't find WorkSpec for id " + r2hVar);
            f(r2hVar);
            return false;
        }
        synchronized (this.a0) {
            try {
                if (d(str)) {
                    Set set = (Set) this.W.get(str);
                    if (((tre) set.iterator().next()).a.b == r2hVar.b) {
                        set.add(treVar);
                        z39.d().a(b0, "Work " + r2hVar + " is already enqueued for processing");
                    } else {
                        f(r2hVar);
                    }
                    return false;
                }
                if (r3hVar.t != r2hVar.b) {
                    f(r2hVar);
                    return false;
                }
                t4h.a aVar2 = new t4h.a(this.b, this.c, this.d, this, this.e, r3hVar, arrayList);
                aVar2.g = this.X;
                if (aVar != null) {
                    aVar2.i = aVar;
                }
                t4h t4hVar = new t4h(aVar2);
                fbe<Boolean> fbeVar = t4hVar.e0;
                fbeVar.a(new a(this, treVar.a, fbeVar), this.d.c);
                this.V.put(str, t4hVar);
                HashSet hashSet = new HashSet();
                hashSet.add(treVar);
                this.W.put(str, hashSet);
                this.d.a.execute(t4hVar);
                z39.d().a(b0, kob.class.getSimpleName() + ": processing " + r2hVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.a0) {
            try {
                if (this.f.isEmpty()) {
                    Context context = this.b;
                    String str = q2f.Y;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.b.startService(intent);
                    } catch (Throwable th) {
                        z39.d().c(b0, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
