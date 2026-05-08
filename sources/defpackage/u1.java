package defpackage;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u1<T> implements ye3<T> {
    public Map<String, Object> a;
    public T d = null;
    public Throwable e = null;
    public float f = 0.0f;
    public boolean c = false;
    public a b = a.a;
    public final ConcurrentLinkedQueue<Pair<lf3<T>, Executor>> g = new ConcurrentLinkedQueue<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("IN_PROGRESS", 0);
            a = aVar;
            a aVar2 = new a("SUCCESS", 1);
            b = aVar2;
            a aVar3 = new a("FAILURE", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public void a(T t) {
    }

    @Override // defpackage.ye3
    public final synchronized float b() {
        return this.f;
    }

    @Override // defpackage.ye3
    public synchronized boolean c() {
        return this.d != null;
    }

    @Override // defpackage.ye3
    public boolean close() {
        synchronized (this) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                T t = this.d;
                this.d = null;
                if (t != null) {
                    a(t);
                }
                if (!d()) {
                    h();
                }
                synchronized (this) {
                    this.g.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ye3
    public final synchronized boolean d() {
        return this.b != a.a;
    }

    @Override // defpackage.ye3
    public final synchronized Throwable e() {
        return this.e;
    }

    @Override // defpackage.ye3
    public final void f(lf3<T> lf3Var, Executor executor) {
        boolean z;
        executor.getClass();
        synchronized (this) {
            try {
                if (this.c) {
                    return;
                }
                if (this.b == a.a) {
                    this.g.add(Pair.create(lf3Var, executor));
                }
                boolean z2 = c() || d() || l();
                if (z2) {
                    synchronized (this) {
                        z = this.b == a.c;
                    }
                    executor.execute(new s1(this, z, lf3Var, l()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean g() {
        return this.c;
    }

    @Override // defpackage.ye3
    public final Map<String, Object> getExtras() {
        return this.a;
    }

    @Override // defpackage.ye3
    public synchronized T getResult() {
        return this.d;
    }

    public final void h() {
        boolean z;
        synchronized (this) {
            z = this.b == a.c;
        }
        boolean zL = l();
        for (Pair<lf3<T>, Executor> pair : this.g) {
            ((Executor) pair.second).execute(new s1(this, z, (lf3) pair.first, zL));
        }
    }

    public final boolean i(Throwable th, Map<String, Object> map) {
        boolean z;
        synchronized (this) {
            if (this.c || this.b != a.a) {
                z = false;
            } else {
                this.b = a.c;
                this.e = th;
                this.a = map;
                z = true;
            }
        }
        if (z) {
            h();
        }
        return z;
    }

    public final boolean j(float f) {
        int i;
        boolean z;
        synchronized (this) {
            i = 0;
            if (this.c || this.b != a.a || f < this.f) {
                z = false;
            } else {
                this.f = f;
                z = true;
            }
        }
        if (z) {
            for (Pair<lf3<T>, Executor> pair : this.g) {
                ((Executor) pair.second).execute(new t1(i, this, (lf3) pair.first));
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002c A[DONT_GENERATE, PHI: r3 r4
  0x002c: PHI (r3v7 T) = (r3v0 T), (r3v10 T) binds: [B:28:0x0036, B:22:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x002c: PHI (r4v4 boolean) = (r4v2 boolean), (r4v6 boolean) binds: [B:28:0x0036, B:22:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x001b -> B:33:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(T r3, boolean r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
        /*
            r2 = this;
            r2.a = r5
            r5 = 0
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L41
            boolean r0 = r2.c     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L34
            u1$a r0 = r2.b     // Catch: java.lang.Throwable -> L1a
            u1$a r1 = u1.a.a     // Catch: java.lang.Throwable -> L1a
            if (r0 == r1) goto Lf
            goto L34
        Lf:
            if (r4 == 0) goto L1c
            u1$a r4 = u1.a.b     // Catch: java.lang.Throwable -> L1a
            r2.b = r4     // Catch: java.lang.Throwable -> L1a
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.f = r4     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r3 = move-exception
            goto L3f
        L1c:
            T r4 = r2.d     // Catch: java.lang.Throwable -> L1a
            if (r4 == r3) goto L27
            r2.d = r3     // Catch: java.lang.Throwable -> L24
            r3 = r4
            goto L28
        L24:
            r3 = move-exception
            r5 = r4
            goto L3f
        L27:
            r3 = r5
        L28:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            r4 = 1
            if (r3 == 0) goto L39
        L2c:
            r2.a(r3)
            goto L39
        L30:
            r4 = move-exception
            r5 = r3
            r3 = r4
            goto L3f
        L34:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            r4 = 0
            if (r3 == 0) goto L39
            goto L2c
        L39:
            if (r4 == 0) goto L3e
            r2.h()
        L3e:
            return r4
        L3f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r3     // Catch: java.lang.Throwable -> L41
        L41:
            r3 = move-exception
            if (r5 == 0) goto L47
            r2.a(r5)
        L47:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u1.k(java.lang.Object, boolean, java.util.Map):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean l() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.g()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            boolean r0 = r1.d()     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        Lf:
            r0 = move-exception
            goto L14
        L11:
            r0 = 0
        L12:
            monitor-exit(r1)
            return r0
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u1.l():boolean");
    }
}
