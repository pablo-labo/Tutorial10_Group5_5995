package defpackage;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p95 implements Closeable {
    public boolean a;
    public int b;
    public final ReentrantLock c = new ReentrantLock();

    public static final class a implements pne {
        public final p95 a;
        public long b;
        public boolean c;

        public a(p95 p95Var, long j) {
            this.a = p95Var;
            this.b = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.c) {
                return;
            }
            this.c = true;
            p95 p95Var = this.a;
            ReentrantLock reentrantLock = p95Var.c;
            reentrantLock.lock();
            try {
                int i = p95Var.b - 1;
                p95Var.b = i;
                if (i == 0 && p95Var.a) {
                    j6g j6gVar = j6g.a;
                    reentrantLock.unlock();
                    p95Var.a();
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // defpackage.pne
        public final long f1(zn1 zn1Var, long j) {
            long j2;
            long j3;
            zn1Var.getClass();
            if (this.c) {
                r6.g("closed");
                return 0L;
            }
            long j4 = this.b;
            if (j < 0) {
                h5.k(r6.c(j, "byteCount < 0: "));
                return 0L;
            }
            long j5 = j + j4;
            long j6 = j4;
            while (true) {
                if (j6 >= j5) {
                    j2 = -1;
                    break;
                }
                lyd lydVarM0 = zn1Var.m0(1);
                j2 = -1;
                int iH = this.a.h(j6, lydVarM0.a, lydVarM0.c, (int) Math.min(j5 - j6, 8192 - r13));
                if (iH == -1) {
                    if (lydVarM0.b == lydVarM0.c) {
                        zn1Var.a = lydVarM0.a();
                        qyd.a(lydVarM0);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                    }
                } else {
                    lydVarM0.c += iH;
                    long j7 = iH;
                    j6 += j7;
                    zn1Var.b += j7;
                }
            }
            j3 = j6 - j4;
            if (j3 != j2) {
                this.b += j3;
            }
            return j3;
        }

        @Override // defpackage.pne
        public final kmf g() {
            return kmf.d;
        }
    }

    public abstract void a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.a) {
                return;
            }
            this.a = true;
            if (this.b != 0) {
                return;
            }
            j6g j6gVar = j6g.a;
            reentrantLock.unlock();
            a();
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract int h(long j, byte[] bArr, int i, int i2);

    public abstract long p();

    public final a s(long j) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.a) {
                throw new IllegalStateException("closed");
            }
            this.b++;
            reentrantLock.unlock();
            return new a(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.a) {
                throw new IllegalStateException("closed");
            }
            j6g j6gVar = j6g.a;
            reentrantLock.unlock();
            return p();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
