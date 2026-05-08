package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public class a6e {
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final xja b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(a6e.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(a6e.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(a6e.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(a6e.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater V = AtomicIntegerFieldUpdater.newUpdater(a6e.class, "_availablePermits$volatile");

    public /* synthetic */ class a extends qv5 implements Function2<Long, e6e, e6e> {
        public static final a a = new a(2, d6e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);

        @Override // kotlin.jvm.functions.Function2
        public final e6e invoke(Long l, e6e e6eVar) {
            int i = d6e.a;
            return new e6e(l.longValue(), e6eVar, 0);
        }
    }

    public a6e(int i, int i2) {
        this.a = i;
        if (i <= 0) {
            h5.k(p6.c(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i2 < 0 || i2 > i) {
            h5.k(p6.c(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        e6e e6eVar = new e6e(0L, null, 2);
        this.head$volatile = e6eVar;
        this.tail$volatile = e6eVar;
        this._availablePermits$volatile = i - i2;
        this.b = new xja(this, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r4.r(defpackage.j6g.a, r3.b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.pu2 r4) throws java.lang.Throwable {
        /*
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.a6e.V
            int r1 = r0.getAndDecrement(r3)
            int r2 = r3.a
            if (r1 > r2) goto L0
            if (r1 <= 0) goto Lf
            j6g r3 = defpackage.j6g.a
            return r3
        Lf:
            lu2 r4 = defpackage.ewa.v(r4)
            qw1 r4 = defpackage.ka2.x(r4)
            boolean r1 = r3.b(r4)     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L33
        L1d:
            int r1 = r0.getAndDecrement(r3)     // Catch: java.lang.Throwable -> L44
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2d
            j6g r0 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L44
            xja r3 = r3.b     // Catch: java.lang.Throwable -> L44
            r4.r(r0, r3)     // Catch: java.lang.Throwable -> L44
            goto L33
        L2d:
            boolean r1 = r3.b(r4)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L1d
        L33:
            java.lang.Object r3 = r4.p()
            g13 r4 = defpackage.g13.a
            if (r3 != r4) goto L3c
            goto L3e
        L3c:
            j6g r3 = defpackage.j6g.a
        L3e:
            if (r3 != r4) goto L41
            return r3
        L41:
            j6g r3 = defpackage.j6g.a
            return r3
        L44:
            r3 = move-exception
            r4.B()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6e.a(pu2):java.lang.Object");
    }

    public final boolean b(ttg ttgVar) {
        Object objK;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        e6e e6eVar = (e6e) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        a aVar = a.a;
        long j = andIncrement / ((long) d6e.f);
        loop0: while (true) {
            objK = nn2.k(e6eVar, j, aVar);
            if (!pyd.E(objK)) {
                myd mydVarY = pyd.y(objK);
                while (true) {
                    myd mydVar = (myd) atomicReferenceFieldUpdater.get(this);
                    if (mydVar.c >= mydVarY.c) {
                        break loop0;
                    }
                    if (!mydVarY.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, mydVar, mydVarY)) {
                        if (atomicReferenceFieldUpdater.get(this) != mydVar) {
                            if (mydVarY.f()) {
                                mydVarY.e();
                            }
                        }
                    }
                    if (mydVar.f()) {
                        mydVar.e();
                    }
                }
            } else {
                break;
            }
        }
        e6e e6eVar2 = (e6e) pyd.y(objK);
        AtomicReferenceArray atomicReferenceArray = e6eVar2.e;
        int i = (int) (andIncrement % ((long) d6e.f));
        while (!atomicReferenceArray.compareAndSet(i, null, ttgVar)) {
            if (atomicReferenceArray.get(i) != null) {
                ux0 ux0Var = d6e.b;
                ux0 ux0Var2 = d6e.c;
                while (!atomicReferenceArray.compareAndSet(i, ux0Var, ux0Var2)) {
                    if (atomicReferenceArray.get(i) != ux0Var) {
                        return false;
                    }
                }
                ((pw1) ttgVar).r(j6g.a, this.b);
                return true;
            }
        }
        ttgVar.a(e6eVar2, i);
        return true;
    }

    public final void release() {
        int i;
        Object objK;
        boolean zC;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = V;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            e6e e6eVar = (e6e) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = d.getAndIncrement(this);
            long j = andIncrement2 / ((long) d6e.f);
            b6e b6eVar = b6e.a;
            while (true) {
                objK = nn2.k(e6eVar, j, b6eVar);
                if (pyd.E(objK)) {
                    break;
                }
                myd mydVarY = pyd.y(objK);
                while (true) {
                    myd mydVar = (myd) atomicReferenceFieldUpdater.get(this);
                    if (mydVar.c >= mydVarY.c) {
                        break;
                    }
                    if (!mydVarY.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, mydVar, mydVarY)) {
                        if (atomicReferenceFieldUpdater.get(this) != mydVar) {
                            if (mydVarY.f()) {
                                mydVarY.e();
                            }
                        }
                    }
                    if (mydVar.f()) {
                        mydVar.e();
                    }
                }
            }
            e6e e6eVar2 = (e6e) pyd.y(objK);
            AtomicReferenceArray atomicReferenceArray = e6eVar2.e;
            e6eVar2.a();
            zC = false;
            if (e6eVar2.c <= j) {
                int i3 = (int) (andIncrement2 % ((long) d6e.f));
                Object andSet = atomicReferenceArray.getAndSet(i3, d6e.b);
                if (andSet == null) {
                    int i4 = d6e.a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == d6e.c) {
                            zC = true;
                            break;
                        }
                    }
                    ux0 ux0Var = d6e.b;
                    ux0 ux0Var2 = d6e.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, ux0Var, ux0Var2)) {
                            if (atomicReferenceArray.get(i3) != ux0Var) {
                                break;
                            }
                        } else {
                            zC = true;
                            break;
                        }
                    }
                    zC = !zC;
                } else if (andSet != d6e.e) {
                    if (andSet instanceof pw1) {
                        pw1 pw1Var = (pw1) andSet;
                        ux0 ux0VarD = pw1Var.d(j6g.a, this.b);
                        if (ux0VarD != null) {
                            pw1Var.w(ux0VarD);
                            zC = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof pzd)) {
                            ja.i(andSet, "unexpected: ");
                            return;
                        }
                        zC = ((pzd) andSet).c(this, j6g.a);
                    }
                }
            }
        } while (!zC);
    }
}
