package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class a5a extends a6e implements z4a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater W = AtomicReferenceFieldUpdater.newUpdater(a5a.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public final class a implements pw1<j6g>, ttg {
        public final qw1<j6g> a;

        public a(qw1 qw1Var) {
            this.a = qw1Var;
        }

        @Override // defpackage.ttg
        public final void a(myd<?> mydVar, int i) {
            this.a.a(mydVar, i);
        }

        @Override // defpackage.pw1
        public final ux0 d(Object obj, wu5 wu5Var) {
            a5a a5aVar = a5a.this;
            d76 d76Var = new d76(a5aVar, this);
            ux0 ux0VarF = this.a.F((j6g) obj, d76Var);
            if (ux0VarF != null) {
                a5a.W.set(a5aVar, null);
            }
            return ux0VarF;
        }

        @Override // defpackage.pw1
        public final boolean g(Throwable th) {
            return this.a.g(th);
        }

        @Override // defpackage.lu2
        public final v03 getContext() {
            return this.a.e;
        }

        @Override // defpackage.pw1
        public final void r(Object obj, wu5 wu5Var) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a5a.W;
            a5a a5aVar = a5a.this;
            atomicReferenceFieldUpdater.set(a5aVar, null);
            cd cdVar = new cd(a5aVar, this);
            qw1<j6g> qw1Var = this.a;
            qw1Var.C((j6g) obj, qw1Var.c, new oq0(cdVar, 1));
        }

        @Override // defpackage.lu2
        public final void resumeWith(Object obj) {
            this.a.resumeWith(obj);
        }

        @Override // defpackage.pw1
        public final void w(Object obj) {
            this.a.w(obj);
        }
    }

    public a5a(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : pnb.i0;
    }

    public final boolean c() {
        return Math.max(a6e.V.get(this), 0) == 0;
    }

    public final boolean d() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = a6e.V;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    W.set(this, null);
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r0.r(defpackage.j6g.a, r3.b);
     */
    @Override // defpackage.z4a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.lu2 r4) throws java.lang.Throwable {
        /*
            r3 = this;
            boolean r0 = r3.d()
            if (r0 == 0) goto L9
            j6g r3 = defpackage.j6g.a
            return r3
        L9:
            lu2 r4 = defpackage.ewa.v(r4)
            qw1 r4 = defpackage.ka2.x(r4)
            a5a$a r0 = new a5a$a     // Catch: java.lang.Throwable -> L41
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L41
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.a6e.V     // Catch: java.lang.Throwable -> L41
            int r1 = r1.getAndDecrement(r3)     // Catch: java.lang.Throwable -> L41
            int r2 = r3.a     // Catch: java.lang.Throwable -> L41
            if (r1 > r2) goto L16
            if (r1 <= 0) goto L2a
            j6g r1 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L41
            xja r3 = r3.b     // Catch: java.lang.Throwable -> L41
            r0.r(r1, r3)     // Catch: java.lang.Throwable -> L41
            goto L30
        L2a:
            boolean r1 = r3.b(r0)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L16
        L30:
            java.lang.Object r3 = r4.p()
            g13 r4 = defpackage.g13.a
            if (r3 != r4) goto L39
            goto L3b
        L39:
            j6g r3 = defpackage.j6g.a
        L3b:
            if (r3 != r4) goto L3e
            return r3
        L3e:
            j6g r3 = defpackage.j6g.a
            return r3
        L41:
            r3 = move-exception
            r4.B()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a5a.h(lu2):java.lang.Object");
    }

    @Override // defpackage.z4a
    public final void p(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = W;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            ux0 ux0Var = pnb.i0;
            if (obj2 != ux0Var) {
                if (obj2 != obj && obj != null) {
                    b0.v("This mutex is locked by ", obj2, ", but ", obj, " is expected");
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, ux0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                release();
                return;
            }
        }
        r6.g("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + pi3.f(this) + "[isLocked=" + c() + ",owner=" + W.get(this) + ']';
    }
}
