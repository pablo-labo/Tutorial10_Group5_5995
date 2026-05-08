package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class qw8 extends y03 implements js3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater W = AtomicIntegerFieldUpdater.newUpdater(qw8.class, "runningWorkers$volatile");
    public final Object V;
    public final /* synthetic */ js3 c;
    public final y03 d;
    public final int e;
    public final p29<Runnable> f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    public final class a implements Runnable {
        public Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 0;
            while (true) {
                try {
                    this.a.run();
                } catch (Throwable th) {
                    b13.a(vr4.a, th);
                }
                Runnable runnableJ1 = qw8.this.J1();
                if (runnableJ1 == null) {
                    return;
                }
                try {
                    this.a = runnableJ1;
                    i++;
                    if (i >= 16) {
                        qw8 qw8Var = qw8.this;
                        if (mh2.z(qw8Var.d, qw8Var)) {
                            qw8 qw8Var2 = qw8.this;
                            mh2.y(qw8Var2.d, qw8Var2, this);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    qw8 qw8Var3 = qw8.this;
                    synchronized (qw8Var3.V) {
                        qw8.W.decrementAndGet(qw8Var3);
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qw8(y03 y03Var, int i) {
        js3 js3Var = y03Var instanceof js3 ? (js3) y03Var : null;
        this.c = js3Var == null ? fn3.a : js3Var;
        this.d = y03Var;
        this.e = i;
        this.f = new p29<>();
        this.V = new Object();
    }

    @Override // defpackage.y03
    public final y03 E1(int i) {
        h4.g(i);
        return i >= this.e ? this : super.E1(i);
    }

    public final Runnable J1() {
        while (true) {
            Runnable runnableD = this.f.d();
            if (runnableD != null) {
                return runnableD;
            }
            synchronized (this.V) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = W;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean L1() {
        synchronized (this.V) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = W;
            if (atomicIntegerFieldUpdater.get(this) >= this.e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.js3
    public final o74 R0(long j, lmf lmfVar, v03 v03Var) {
        return this.c.R0(j, lmfVar, v03Var);
    }

    @Override // defpackage.js3
    public final void b0(long j, qw1 qw1Var) {
        this.c.b0(j, qw1Var);
    }

    @Override // defpackage.y03
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(".limitedParallelism(");
        return k6.h(sb, this.e, ')');
    }

    @Override // defpackage.y03
    public final void v1(v03 v03Var, Runnable runnable) {
        Runnable runnableJ1;
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = W;
        if (atomicIntegerFieldUpdater.get(this) >= this.e || !L1() || (runnableJ1 = J1()) == null) {
            return;
        }
        try {
            mh2.y(this.d, this, new a(runnableJ1));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.y03
    public final void w1(v03 v03Var, Runnable runnable) {
        Runnable runnableJ1;
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = W;
        if (atomicIntegerFieldUpdater.get(this) >= this.e || !L1() || (runnableJ1 = J1()) == null) {
            return;
        }
        try {
            this.d.w1(this, new a(runnableJ1));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }
}
