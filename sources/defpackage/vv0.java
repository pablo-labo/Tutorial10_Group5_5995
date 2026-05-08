package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lvv0;", "Lkmf;", "<init>", "()V", "a", "b", "okio"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public class vv0 extends kmf {
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;
    public static final long k;
    public static vv0 l;
    public int e;
    public vv0 f;
    public long g;

    public static final class a {
        public static final void a(vv0 vv0Var, long j, boolean z) {
            vv0 vv0Var2;
            ReentrantLock reentrantLock = vv0.h;
            if (vv0.l == null) {
                vv0.l = new vv0();
                b bVar = new b("Okio Watchdog");
                bVar.setDaemon(true);
                bVar.start();
            }
            long jNanoTime = System.nanoTime();
            if (j != 0 && z) {
                vv0Var.g = Math.min(j, vv0Var.c() - jNanoTime) + jNanoTime;
            } else if (j != 0) {
                vv0Var.g = j + jNanoTime;
            } else {
                if (!z) {
                    b0.t();
                    return;
                }
                vv0Var.g = vv0Var.c();
            }
            long j2 = vv0Var.g - jNanoTime;
            vv0 vv0Var3 = vv0.l;
            vv0Var3.getClass();
            while (true) {
                vv0Var2 = vv0Var3.f;
                if (vv0Var2 == null || j2 < vv0Var2.g - jNanoTime) {
                    break;
                } else {
                    vv0Var3 = vv0Var2;
                }
            }
            vv0Var.f = vv0Var2;
            vv0Var3.f = vv0Var;
            if (vv0Var3 == vv0.l) {
                vv0.i.signal();
            }
        }

        public static vv0 b() throws InterruptedException {
            vv0 vv0Var = vv0.l;
            vv0Var.getClass();
            vv0 vv0Var2 = vv0Var.f;
            if (vv0Var2 == null) {
                long jNanoTime = System.nanoTime();
                vv0.i.await(vv0.j, TimeUnit.MILLISECONDS);
                vv0 vv0Var3 = vv0.l;
                vv0Var3.getClass();
                if (vv0Var3.f != null || System.nanoTime() - jNanoTime < vv0.k) {
                    return null;
                }
                return vv0.l;
            }
            long jNanoTime2 = vv0Var2.g - System.nanoTime();
            if (jNanoTime2 > 0) {
                vv0.i.await(jNanoTime2, TimeUnit.NANOSECONDS);
                return null;
            }
            vv0 vv0Var4 = vv0.l;
            vv0Var4.getClass();
            vv0Var4.f = vv0Var2.f;
            vv0Var2.f = null;
            vv0Var2.e = 2;
            return vv0Var2;
        }
    }

    public static final class b extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            vv0 vv0VarB;
            while (true) {
                try {
                    ReentrantLock reentrantLock2 = vv0.h;
                    reentrantLock = vv0.h;
                    reentrantLock.lock();
                    try {
                        vv0VarB = a.b();
                    } finally {
                        reentrantLock.unlock();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (vv0VarB == vv0.l) {
                    vv0.l = null;
                    return;
                }
                j6g j6gVar = j6g.a;
                reentrantLock.unlock();
                if (vv0VarB != null) {
                    vv0VarB.k();
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        i = conditionNewCondition;
        j = 60000L;
        k = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    public final void i() {
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = 1;
                a.a(this, j2, z);
                j6g j6gVar = j6g.a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            int i2 = this.e;
            this.e = 0;
            if (i2 != 1) {
                return i2 == 2;
            }
            vv0 vv0Var = l;
            while (vv0Var != null) {
                vv0 vv0Var2 = vv0Var.f;
                if (vv0Var2 == this) {
                    vv0Var.f = this.f;
                    this.f = null;
                    return false;
                }
                vv0Var = vv0Var2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    public void k() {
    }
}
