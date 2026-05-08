package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sn2 {
    public final d82 a;
    public boolean b;

    public sn2() {
        this(d82.a);
    }

    public final synchronized void a() {
        while (!this.b) {
            this.a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z = false;
        while (!this.b) {
            try {
                this.a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j) {
        if (j <= 0) {
            return this.b;
        }
        long jD = this.a.d();
        long j2 = j + jD;
        if (j2 < jD) {
            b();
        } else {
            boolean z = false;
            while (!this.b && jD < j2) {
                try {
                    this.a.getClass();
                    wait(j2 - jD);
                } catch (InterruptedException unused) {
                    z = true;
                }
                jD = this.a.d();
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        return this.b;
    }

    public final synchronized boolean d() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public sn2(d82 d82Var) {
        this.a = d82Var;
    }
}
