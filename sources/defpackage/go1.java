package defpackage;

import defpackage.j22;
import defpackage.o7d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* JADX INFO: loaded from: classes3.dex */
public class go1<E> implements u12<E> {
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(go1.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(go1.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(go1.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(go1.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(go1.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater V = AtomicReferenceFieldUpdater.newUpdater(go1.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater W = AtomicReferenceFieldUpdater.newUpdater(go1.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater X = AtomicReferenceFieldUpdater.newUpdater(go1.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y = AtomicReferenceFieldUpdater.newUpdater(go1.class, Object.class, "closeHandler$volatile");

    public final class a implements g22<E>, ttg {
        public Object a = ko1.p;
        public qw1<? super Boolean> b;

        public a() {
        }

        @Override // defpackage.ttg
        public final void a(myd<?> mydVar, int i) {
            qw1<? super Boolean> qw1Var = this.b;
            if (qw1Var != null) {
                qw1Var.a(mydVar, i);
            }
        }

        @Override // defpackage.g22
        public final Object b(pu2 pu2Var) throws Throwable {
            k22<E> k22VarR;
            Object obj = this.a;
            boolean z = true;
            if (obj == ko1.p || obj == ko1.l) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = go1.V;
                go1<E> go1Var = go1.this;
                k22<E> k22Var = (k22) atomicReferenceFieldUpdater.get(go1Var);
                while (true) {
                    if (go1Var.y()) {
                        this.a = ko1.l;
                        Throwable thS = go1Var.s();
                        if (thS != null) {
                            int i = qqe.a;
                            throw thS;
                        }
                        z = false;
                    } else {
                        long andIncrement = go1.c.getAndIncrement(go1Var);
                        long j = ko1.b;
                        long j2 = andIncrement / j;
                        int i2 = (int) (andIncrement % j);
                        if (k22Var.c != j2) {
                            k22VarR = go1Var.r(j2, k22Var);
                            if (k22VarR == null) {
                                continue;
                            }
                        } else {
                            k22VarR = k22Var;
                        }
                        Object objI = go1Var.I(k22VarR, i2, andIncrement, null);
                        ux0 ux0Var = ko1.m;
                        if (objI == ux0Var) {
                            r6.g("unreachable");
                            return null;
                        }
                        ux0 ux0Var2 = ko1.o;
                        if (objI == ux0Var2) {
                            if (andIncrement < go1Var.v()) {
                                k22VarR.a();
                            }
                            k22Var = k22VarR;
                        } else {
                            if (objI == ko1.n) {
                                go1<E> go1Var2 = go1.this;
                                qw1<? super Boolean> qw1VarX = ka2.x(ewa.v(pu2Var));
                                try {
                                    this.b = qw1VarX;
                                    Object objI2 = go1Var2.I(k22VarR, i2, andIncrement, this);
                                    if (objI2 == ux0Var) {
                                        a(k22VarR, i2);
                                    } else {
                                        if (objI2 == ux0Var2) {
                                            if (andIncrement < go1Var2.v()) {
                                                k22VarR.a();
                                            }
                                            k22<E> k22Var2 = (k22) go1.V.get(go1Var2);
                                            while (true) {
                                                if (go1Var2.y()) {
                                                    qw1<? super Boolean> qw1Var = this.b;
                                                    qw1Var.getClass();
                                                    this.b = null;
                                                    this.a = ko1.l;
                                                    Throwable thS2 = go1Var.s();
                                                    if (thS2 == null) {
                                                        qw1Var.resumeWith(Boolean.FALSE);
                                                    } else {
                                                        qw1Var.resumeWith(new o7d.a(thS2));
                                                    }
                                                } else {
                                                    long andIncrement2 = go1.c.getAndIncrement(go1Var2);
                                                    long j3 = ko1.b;
                                                    long j4 = andIncrement2 / j3;
                                                    int i3 = (int) (andIncrement2 % j3);
                                                    if (k22Var2.c != j4) {
                                                        k22<E> k22VarR2 = go1Var2.r(j4, k22Var2);
                                                        if (k22VarR2 != null) {
                                                            k22Var2 = k22VarR2;
                                                        }
                                                    }
                                                    Object objI3 = go1Var2.I(k22Var2, i3, andIncrement2, this);
                                                    if (objI3 == ko1.m) {
                                                        a(k22Var2, i3);
                                                        break;
                                                    }
                                                    if (objI3 == ko1.o) {
                                                        if (andIncrement2 < go1Var2.v()) {
                                                            k22Var2.a();
                                                        }
                                                    } else {
                                                        if (objI3 == ko1.n) {
                                                            throw new IllegalStateException("unexpected");
                                                        }
                                                        k22Var2.a();
                                                        this.a = objI3;
                                                        this.b = null;
                                                    }
                                                }
                                            }
                                        } else {
                                            k22VarR.a();
                                            this.a = objI2;
                                            this.b = null;
                                        }
                                        qw1VarX.r(Boolean.TRUE, null);
                                    }
                                    return qw1VarX.p();
                                } catch (Throwable th) {
                                    qw1VarX.B();
                                    throw th;
                                }
                            }
                            k22VarR.a();
                            this.a = objI;
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        }

        @Override // defpackage.g22
        public final E next() throws Throwable {
            E e = (E) this.a;
            ux0 ux0Var = ko1.p;
            if (e == ux0Var) {
                r6.g("`hasNext()` has not been invoked");
                return null;
            }
            this.a = ux0Var;
            if (e != ko1.l) {
                return e;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = go1.b;
            Throwable thT = go1.this.t();
            int i = qqe.a;
            throw thT;
        }
    }

    public static final class b implements ttg {
    }

    public go1(int i) {
        this.a = i;
        if (i < 0) {
            h5.k(bg.d(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        k22<Object> k22Var = ko1.a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = d.get(this);
        k22<Object> k22Var2 = new k22<>(0L, null, this, 3);
        this.sendSegment$volatile = k22Var2;
        this.receiveSegment$volatile = k22Var2;
        if (A()) {
            k22Var2 = ko1.a;
            k22Var2.getClass();
        }
        this.bufferEndSegment$volatile = k22Var2;
        this._closeCause$volatile = ko1.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object D(defpackage.go1 r13, defpackage.pu2 r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof defpackage.ho1
            if (r0 == 0) goto L14
            r0 = r14
            ho1 r0 = (defpackage.ho1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ho1 r0 = new ho1
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.result
            int r0 = r6.label
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2c
            defpackage.r7d.b(r14)
            j22 r14 = (defpackage.j22) r14
            java.lang.Object r13 = r14.a
            return r13
        L2c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r13)
            return r1
        L32:
            defpackage.r7d.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = defpackage.go1.V
            java.lang.Object r14 = r14.get(r13)
            k22 r14 = (defpackage.k22) r14
        L3d:
            boolean r0 = r13.y()
            if (r0 == 0) goto L4d
            java.lang.Throwable r13 = r13.s()
            j22$a r14 = new j22$a
            r14.<init>(r13)
            return r14
        L4d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.go1.c
            long r4 = r0.getAndIncrement(r13)
            int r0 = defpackage.ko1.b
            long r7 = (long) r0
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.c
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L6a
            k22 r0 = r13.r(r9, r14)
            if (r0 != 0) goto L68
            goto L3d
        L68:
            r8 = r0
            goto L6b
        L6a:
            r8 = r14
        L6b:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.I(r8, r9, r10, r12)
            ux0 r14 = defpackage.ko1.m
            if (r13 == r14) goto L9f
            ux0 r14 = defpackage.ko1.o
            if (r13 != r14) goto L89
            long r13 = r7.v()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L86
            r8.a()
        L86:
            r13 = r7
            r14 = r8
            goto L3d
        L89:
            ux0 r14 = defpackage.ko1.n
            if (r13 != r14) goto L9b
            r6.label = r2
            r1 = r7
            r2 = r8
            java.lang.Object r13 = r1.E(r2, r3, r4, r6)
            g13 r14 = defpackage.g13.a
            if (r13 != r14) goto L9a
            return r14
        L9a:
            return r13
        L9b:
            r8.a()
            return r13
        L9f:
            java.lang.String r13 = "unexpected"
            defpackage.r6.g(r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go1.D(go1, pu2):java.lang.Object");
    }

    public static final k22 a(go1 go1Var, long j, k22 k22Var) {
        Object objK;
        go1 go1Var2;
        k22<Object> k22Var2 = ko1.a;
        jo1 jo1Var = jo1.a;
        loop0: while (true) {
            objK = nn2.k(k22Var, j, jo1Var);
            if (!pyd.E(objK)) {
                myd mydVarY = pyd.y(objK);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                    myd mydVar = (myd) atomicReferenceFieldUpdater.get(go1Var);
                    if (mydVar.c >= mydVarY.c) {
                        break loop0;
                    }
                    if (!mydVarY.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(go1Var, mydVar, mydVarY)) {
                        if (atomicReferenceFieldUpdater.get(go1Var) != mydVar) {
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
        boolean zE = pyd.E(objK);
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        if (zE) {
            go1Var.l();
            if (k22Var.c * ((long) ko1.b) < atomicLongFieldUpdater.get(go1Var)) {
                k22Var.a();
                return null;
            }
        } else {
            k22 k22Var3 = (k22) pyd.y(objK);
            long j2 = k22Var3.c;
            if (j2 <= j) {
                return k22Var3;
            }
            long j3 = ((long) ko1.b) * j2;
            while (true) {
                long j4 = b.get(go1Var);
                long j5 = 1152921504606846975L & j4;
                if (j5 >= j3) {
                    go1Var2 = go1Var;
                    break;
                }
                go1Var2 = go1Var;
                if (b.compareAndSet(go1Var2, j4, (((long) ((int) (j4 >> 60))) << 60) + j5)) {
                    break;
                }
                go1Var = go1Var2;
            }
            if (j2 * ((long) ko1.b) < atomicLongFieldUpdater.get(go1Var2)) {
                k22Var3.a();
            }
        }
        return null;
    }

    public static final void d(go1 go1Var, Object obj, qw1 qw1Var) {
        qw1Var.resumeWith(new o7d.a(go1Var.u()));
    }

    public static final int g(go1 go1Var, k22 k22Var, int i, Object obj, long j, Object obj2, boolean z) {
        k22Var.n(i, obj);
        if (z) {
            return go1Var.J(k22Var, i, obj, j, obj2, z);
        }
        Object objL = k22Var.l(i);
        if (objL == null) {
            if (go1Var.m(j)) {
                if (k22Var.k(i, null, ko1.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (k22Var.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof ttg) {
            k22Var.n(i, null);
            if (go1Var.G(objL, obj)) {
                k22Var.o(i, ko1.i);
                return 0;
            }
            ux0 ux0Var = ko1.k;
            if (k22Var.f.getAndSet((i * 2) + 1, ux0Var) == ux0Var) {
                return 5;
            }
            k22Var.m(i, true);
            return 5;
        }
        return go1Var.J(k22Var, i, obj, j, obj2, z);
    }

    public static void w(go1 go1Var) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if ((atomicLongFieldUpdater.addAndGet(go1Var, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(go1Var) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A() {
        long j = d.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(long r5, defpackage.k22<E> r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            on2 r0 = r7.c()
            k22 r0 = (defpackage.k22) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            on2 r5 = r7.c()
            k22 r5 = (defpackage.k22) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.go1.W
            java.lang.Object r6 = r5.get(r4)
            myd r6 = (defpackage.myd) r6
            long r0 = r6.c
            long r2 = r7.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r4 = r6.f()
            if (r4 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go1.B(long, k22):void");
    }

    public final Object C(lu2 lu2Var, Object obj) throws Throwable {
        qw1 qw1Var = new qw1(1, ewa.v(lu2Var));
        qw1Var.q();
        qw1Var.resumeWith(new o7d.a(u()));
        Object objP = qw1Var.p();
        return objP == g13.a ? objP : j6g.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(defpackage.k22 r10, int r11, long r12, defpackage.pu2 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go1.E(k22, int, long, pu2):java.lang.Object");
    }

    public final void F(ttg ttgVar, boolean z) {
        if (ttgVar instanceof b) {
            throw null;
        }
        if (ttgVar instanceof pw1) {
            ((lu2) ttgVar).resumeWith(new o7d.a(z ? t() : u()));
            return;
        }
        if (ttgVar instanceof csc) {
            ((csc) ttgVar).a.resumeWith(new j22(new j22.a(s())));
            return;
        }
        if (!(ttgVar instanceof a)) {
            if (ttgVar instanceof pzd) {
                ((pzd) ttgVar).c(this, ko1.l);
                return;
            } else {
                ja.i(ttgVar, "Unexpected waiter: ");
                return;
            }
        }
        a aVar = (a) ttgVar;
        qw1<? super Boolean> qw1Var = aVar.b;
        qw1Var.getClass();
        aVar.b = null;
        aVar.a = ko1.l;
        Throwable thS = go1.this.s();
        if (thS == null) {
            qw1Var.resumeWith(Boolean.FALSE);
        } else {
            qw1Var.resumeWith(new o7d.a(thS));
        }
    }

    public final boolean G(Object obj, E e2) {
        if (obj instanceof pzd) {
            return ((pzd) obj).c(this, e2);
        }
        if (obj instanceof csc) {
            return ko1.a(((csc) obj).a, new j22(e2), null);
        }
        if (!(obj instanceof a)) {
            if (obj instanceof pw1) {
                return ko1.a((pw1) obj, e2, null);
            }
            ja.i(obj, "Unexpected receiver type: ");
            return false;
        }
        a aVar = (a) obj;
        qw1<? super Boolean> qw1Var = aVar.b;
        qw1Var.getClass();
        aVar.b = null;
        aVar.a = e2;
        Boolean bool = Boolean.TRUE;
        go1.this.getClass();
        return ko1.a(qw1Var, bool, null);
    }

    public final boolean H(Object obj, k22<E> k22Var, int i) {
        ruf rufVar;
        if (obj instanceof pw1) {
            return ko1.a((pw1) obj, j6g.a, null);
        }
        if (!(obj instanceof pzd)) {
            if (obj instanceof b) {
                ko1.a(null, Boolean.TRUE, null);
                throw null;
            }
            ja.i(obj, "Unexpected waiter: ");
            return false;
        }
        j6g j6gVar = j6g.a;
        int iD = ((ozd) obj).d(this);
        ruf rufVar2 = ruf.a;
        ruf rufVar3 = ruf.b;
        if (iD == 0) {
            rufVar = rufVar2;
        } else if (iD == 1) {
            rufVar = rufVar3;
        } else if (iD == 2) {
            rufVar = ruf.c;
        } else {
            if (iD != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iD).toString());
            }
            rufVar = ruf.d;
        }
        if (rufVar == rufVar3) {
            k22Var.n(i, null);
        }
        return rufVar == rufVar2;
    }

    public final Object I(k22<E> k22Var, int i, long j, Object obj) {
        Object objL = k22Var.l(i);
        AtomicReferenceArray atomicReferenceArray = k22Var.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (objL == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return ko1.n;
                }
                if (k22Var.k(i, objL, obj)) {
                    q();
                    return ko1.m;
                }
            }
        } else if (objL == ko1.d && k22Var.k(i, objL, ko1.i)) {
            q();
            Object obj2 = atomicReferenceArray.get(i * 2);
            k22Var.n(i, null);
            return obj2;
        }
        while (true) {
            Object objL2 = k22Var.l(i);
            if (objL2 == null || objL2 == ko1.e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (k22Var.k(i, objL2, ko1.h)) {
                        q();
                        return ko1.o;
                    }
                } else {
                    if (obj == null) {
                        return ko1.n;
                    }
                    if (k22Var.k(i, objL2, obj)) {
                        q();
                        return ko1.m;
                    }
                }
            } else {
                if (objL2 != ko1.d) {
                    ux0 ux0Var = ko1.j;
                    if (objL2 != ux0Var && objL2 != ko1.h) {
                        if (objL2 == ko1.l) {
                            q();
                            return ko1.o;
                        }
                        if (objL2 != ko1.g && k22Var.k(i, objL2, ko1.f)) {
                            boolean z = objL2 instanceof utg;
                            if (z) {
                                objL2 = ((utg) objL2).a;
                            }
                            if (H(objL2, k22Var, i)) {
                                k22Var.o(i, ko1.i);
                                q();
                                Object obj3 = atomicReferenceArray.get(i * 2);
                                k22Var.n(i, null);
                                return obj3;
                            }
                            k22Var.o(i, ux0Var);
                            k22Var.i();
                            if (z) {
                                q();
                            }
                            return ko1.o;
                        }
                    }
                    return ko1.o;
                }
                if (k22Var.k(i, objL2, ko1.i)) {
                    q();
                    Object obj4 = atomicReferenceArray.get(i * 2);
                    k22Var.n(i, null);
                    return obj4;
                }
            }
        }
    }

    public final int J(k22<E> k22Var, int i, E e2, long j, Object obj, boolean z) {
        while (true) {
            Object objL = k22Var.l(i);
            if (objL == null) {
                if (!m(j) || z) {
                    if (z) {
                        if (k22Var.k(i, null, ko1.j)) {
                            k22Var.i();
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (k22Var.k(i, null, obj)) {
                            return 2;
                        }
                    }
                } else if (k22Var.k(i, null, ko1.d)) {
                    break;
                }
            } else {
                if (objL != ko1.e) {
                    ux0 ux0Var = ko1.k;
                    if (objL == ux0Var) {
                        k22Var.n(i, null);
                        return 5;
                    }
                    if (objL == ko1.h) {
                        k22Var.n(i, null);
                        return 5;
                    }
                    if (objL == ko1.l) {
                        k22Var.n(i, null);
                        l();
                        return 4;
                    }
                    k22Var.n(i, null);
                    if (objL instanceof utg) {
                        objL = ((utg) objL).a;
                    }
                    if (G(objL, e2)) {
                        k22Var.o(i, ko1.i);
                        return 0;
                    }
                    if (k22Var.f.getAndSet((i * 2) + 1, ux0Var) != ux0Var) {
                        k22Var.m(i, true);
                    }
                    return 5;
                }
                if (k22Var.k(i, objL, ko1.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void K(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        go1<E> go1Var = this;
        if (go1Var.A()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = d;
            if (atomicLongFieldUpdater.get(go1Var) > j) {
                break;
            } else {
                go1Var = this;
            }
        }
        int i = ko1.c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(go1Var);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(go1Var)) && j2 == atomicLongFieldUpdater.get(go1Var)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(go1Var);
                    if (atomicLongFieldUpdater2.compareAndSet(go1Var, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        go1Var = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(go1Var);
                    long j5 = atomicLongFieldUpdater2.get(go1Var);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(go1Var)) {
                        break;
                    }
                    if (z) {
                        go1Var = this;
                    } else {
                        go1Var = this;
                        atomicLongFieldUpdater2.compareAndSet(go1Var, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(go1Var);
                    if (atomicLongFieldUpdater2.compareAndSet(go1Var, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        go1Var = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014c A[RETURN] */
    @Override // defpackage.g6e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(defpackage.lu2 r23, java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go1.b(lu2, java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.dsc
    public final Object c(lu2<? super E> lu2Var) throws Throwable {
        k22<E> k22Var;
        Throwable th;
        k22<E> k22Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V;
        k22<E> k22Var3 = (k22) atomicReferenceFieldUpdater.get(this);
        while (!this.y()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = ko1.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (k22Var3.c != j2) {
                k22<E> k22VarR = this.r(j2, k22Var3);
                if (k22VarR == null) {
                    continue;
                } else {
                    k22Var = k22VarR;
                }
            } else {
                k22Var = k22Var3;
            }
            go1<E> go1Var = this;
            Object objI = go1Var.I(k22Var, i, andIncrement, null);
            ux0 ux0Var = ko1.m;
            if (objI == ux0Var) {
                r6.g("unexpected");
                return null;
            }
            ux0 ux0Var2 = ko1.o;
            if (objI == ux0Var2) {
                if (andIncrement < go1Var.v()) {
                    k22Var.a();
                }
                this = go1Var;
                k22Var3 = k22Var;
            } else {
                if (objI != ko1.n) {
                    k22Var.a();
                    return objI;
                }
                qw1 qw1VarX = ka2.x(ewa.v(lu2Var));
                try {
                    Object objI2 = go1Var.I(k22Var, i, andIncrement, qw1VarX);
                    if (objI2 == ux0Var) {
                        qw1VarX.a(k22Var, i);
                    } else {
                        if (objI2 == ux0Var2) {
                            if (andIncrement < go1Var.v()) {
                                k22Var.a();
                            }
                            k22<E> k22Var4 = (k22) atomicReferenceFieldUpdater.get(go1Var);
                            while (true) {
                                if (go1Var.y()) {
                                    qw1VarX.resumeWith(new o7d.a(go1Var.t()));
                                    break;
                                }
                                qw1 qw1Var = qw1VarX;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(go1Var);
                                    long j3 = ko1.b;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (k22Var4.c != j4) {
                                        try {
                                            k22<E> k22VarR2 = go1Var.r(j4, k22Var4);
                                            if (k22VarR2 == null) {
                                                qw1VarX = qw1Var;
                                            } else {
                                                k22Var2 = k22VarR2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            qw1VarX = qw1Var;
                                            qw1VarX.B();
                                            throw th;
                                        }
                                    } else {
                                        k22Var2 = k22Var4;
                                    }
                                    go1<E> go1Var2 = go1Var;
                                    objI2 = go1Var2.I(k22Var2, i2, andIncrement2, qw1Var);
                                    go1Var = go1Var2;
                                    k22<E> k22Var5 = k22Var2;
                                    qw1VarX = qw1Var;
                                    if (objI2 == ko1.m) {
                                        qw1VarX.a(k22Var5, i2);
                                        break;
                                    }
                                    if (objI2 == ko1.o) {
                                        if (andIncrement2 < go1Var.v()) {
                                            k22Var5.a();
                                        }
                                        k22Var4 = k22Var5;
                                    } else {
                                        if (objI2 == ko1.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        k22Var5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    qw1VarX = qw1Var;
                                    th = th;
                                    qw1VarX.B();
                                    throw th;
                                }
                            }
                        } else {
                            k22Var.a();
                        }
                        qw1VarX.r(objI2, null);
                    }
                    return qw1VarX.p();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thT = this.t();
        int i3 = qqe.a;
        throw thT;
    }

    @Override // defpackage.g6e
    public final void e(Function1<? super Throwable, j6g> function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = Y;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, function1)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            ux0 ux0Var = ko1.q;
            if (obj != ux0Var) {
                if (obj == ko1.r) {
                    r6.g("Another handler was already registered and successfully invoked");
                    return;
                } else {
                    ja.i(obj, "Another handler is already registered: ");
                    return;
                }
            }
            ux0 ux0Var2 = ko1.r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, ux0Var, ux0Var2)) {
                if (atomicReferenceFieldUpdater.get(this) != ux0Var) {
                    break;
                }
            }
            function1.invoke(s());
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd A[SYNTHETIC] */
    @Override // defpackage.g6e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(E r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = defpackage.go1.b
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.x(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.m(r1)
            r1 = r1 ^ r10
        L1b:
            j22$b r13 = defpackage.j22.b
            if (r1 == 0) goto L20
            return r13
        L20:
            ux0 r6 = defpackage.ko1.j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.go1.f
            java.lang.Object r1 = r1.get(r15)
            k22 r1 = (defpackage.k22) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.x(r2, r9)
            int r14 = defpackage.ko1.b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.c
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            k22 r3 = a(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r0 = r15.u()
            j22$a r1 = new j22$a
            r1.<init>(r0)
            return r1
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = g(r0, r1, r2, r3, r4, r6, r7)
            if (r9 == 0) goto Lbd
            r3 = 1
            if (r9 == r3) goto Lba
            r10 = 2
            r11 = 0
            if (r9 == r10) goto L9a
            r2 = 3
            if (r9 == r2) goto L94
            r2 = 4
            if (r9 == r2) goto L7d
            r2 = 5
            if (r9 == r2) goto L77
            goto L7a
        L77:
            r1.a()
        L7a:
            r10 = r3
            r9 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.go1.c
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.a()
        L8a:
            java.lang.Throwable r0 = r15.u()
            j22$a r1 = new j22$a
            r1.<init>(r0)
            return r1
        L94:
            java.lang.String r0 = "unexpected"
            defpackage.r6.g(r0)
            return r11
        L9a:
            if (r7 == 0) goto La9
            r1.i()
            java.lang.Throwable r0 = r15.u()
            j22$a r1 = new j22$a
            r1.<init>(r0)
            return r1
        La9:
            boolean r0 = r6 instanceof defpackage.ttg
            if (r0 == 0) goto Lb0
            r11 = r6
            ttg r11 = (defpackage.ttg) r11
        Lb0:
            if (r11 == 0) goto Lb6
            int r2 = r2 + r14
            r11.a(r1, r2)
        Lb6:
            r1.i()
            return r13
        Lba:
            j6g r0 = defpackage.j6g.a
            return r0
        Lbd:
            r1.a()
            j6g r0 = defpackage.j6g.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go1.f(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.dsc
    public final void h(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        n(cancellationException, true);
    }

    @Override // defpackage.dsc
    public final Object i(rb2 rb2Var) {
        return D(this, rb2Var);
    }

    @Override // defpackage.dsc
    public final g22<E> iterator() {
        return new a();
    }

    @Override // defpackage.dsc
    public final Object j() {
        k22<E> k22Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = b.get(this);
        if (x(j2, true)) {
            return new j22.a(s());
        }
        long j3 = j2 & 1152921504606846975L;
        j22.b bVar = j22.b;
        if (j >= j3) {
            return bVar;
        }
        Object obj = ko1.k;
        k22<E> k22Var2 = (k22) V.get(this);
        while (!this.y()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = ko1.b;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (k22Var2.c != j5) {
                k22<E> k22VarR = this.r(j5, k22Var2);
                if (k22VarR == null) {
                    continue;
                } else {
                    k22Var = k22VarR;
                }
            } else {
                k22Var = k22Var2;
            }
            go1<E> go1Var = this;
            Object objI = go1Var.I(k22Var, i, andIncrement, obj);
            k22Var2 = k22Var;
            if (objI == ko1.m) {
                ttg ttgVar = obj instanceof ttg ? (ttg) obj : null;
                if (ttgVar != null) {
                    ttgVar.a(k22Var2, i);
                }
                go1Var.K(andIncrement);
                k22Var2.i();
                return bVar;
            }
            if (objI != ko1.o) {
                if (objI != ko1.n) {
                    k22Var2.a();
                    return objI;
                }
                r6.g("unexpected");
                return null;
            }
            if (andIncrement < go1Var.v()) {
                k22Var2.a();
            }
            this = go1Var;
        }
        return new j22.a(this.s());
    }

    @Override // defpackage.g6e
    public final boolean k(Throwable th) {
        return n(th, false);
    }

    @Override // defpackage.g6e
    public final boolean l() {
        return x(b.get(this), false);
    }

    public final boolean m(long j) {
        return j < d.get(this) || j < c.get(this) + ((long) this.a);
    }

    public final boolean n(Throwable th, boolean z) {
        go1<E> go1Var;
        boolean z2;
        long j;
        long j2;
        Object obj;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (z) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                k22<Object> k22Var = ko1.a;
                go1Var = this;
                if (atomicLongFieldUpdater.compareAndSet(go1Var, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = go1Var;
            }
        } else {
            go1Var = this;
        }
        ux0 ux0Var = ko1.s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
            if (atomicReferenceFieldUpdater.compareAndSet(go1Var, ux0Var, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(go1Var) != ux0Var) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(go1Var);
            } while (!atomicLongFieldUpdater.compareAndSet(go1Var, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(go1Var);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(go1Var, j, j2));
        }
        go1Var.l();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Y;
                obj = atomicReferenceFieldUpdater2.get(go1Var);
                ux0 ux0Var2 = obj == null ? ko1.q : ko1.r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(go1Var, obj, ux0Var2)) {
                    if (atomicReferenceFieldUpdater2.get(go1Var) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                pxf.d(1, obj);
                ((Function1) obj).invoke(go1Var.s());
                return z2;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (defpackage.k22) ((defpackage.on2) defpackage.on2.b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.k22<E> o(long r13) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go1.o(long):k22");
    }

    public final void p(long j) {
        k22<E> k22Var = (k22) V.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.a) + j2, d.get(this))) {
                return;
            }
            go1<E> go1Var = this;
            if (atomicLongFieldUpdater.compareAndSet(go1Var, j2, 1 + j2)) {
                long j3 = ko1.b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (k22Var.c != j4) {
                    k22<E> k22VarR = go1Var.r(j4, k22Var);
                    if (k22VarR != null) {
                        k22Var = k22VarR;
                    }
                }
                k22<E> k22Var2 = k22Var;
                if (go1Var.I(k22Var2, i, j2, null) != ko1.o || j2 < go1Var.v()) {
                    k22Var2.a();
                }
                this = go1Var;
                k22Var = k22Var2;
            }
            this = go1Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017b, code lost:
    
        w(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x017e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go1.q():void");
    }

    public final k22<E> r(long j, k22<E> k22Var) {
        Object objK;
        go1<E> go1Var;
        k22<Object> k22Var2 = ko1.a;
        jo1 jo1Var = jo1.a;
        loop0: while (true) {
            objK = nn2.k(k22Var, j, jo1Var);
            if (!pyd.E(objK)) {
                myd mydVarY = pyd.y(objK);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V;
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
        if (pyd.E(objK)) {
            l();
            if (k22Var.c * ((long) ko1.b) < v()) {
                k22Var.a();
                return null;
            }
        } else {
            k22<E> k22Var3 = (k22) pyd.y(objK);
            long j2 = k22Var3.c;
            if (!A() && j <= d.get(this) / ((long) ko1.b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = W;
                    myd mydVar2 = (myd) atomicReferenceFieldUpdater2.get(this);
                    if (mydVar2.c >= j2 || !k22Var3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, mydVar2, k22Var3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != mydVar2) {
                            if (k22Var3.f()) {
                                k22Var3.e();
                            }
                        }
                    }
                    if (mydVar2.f()) {
                        mydVar2.e();
                    }
                }
            }
            if (j2 <= j) {
                return k22Var3;
            }
            long j3 = j2 * ((long) ko1.b);
            while (true) {
                long j4 = c.get(this);
                if (j4 >= j3) {
                    go1Var = this;
                    break;
                }
                go1Var = this;
                if (c.compareAndSet(go1Var, j4, j3)) {
                    break;
                }
                this = go1Var;
            }
            if (j2 * ((long) ko1.b) < go1Var.v()) {
                k22Var3.a();
            }
        }
        return null;
    }

    public final Throwable s() {
        return (Throwable) X.get(this);
    }

    public final Throwable t() {
        Throwable thS = s();
        return thS == null ? new ClosedReceiveChannelException("Channel was closed") : thS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b8, code lost:
    
        r3 = (defpackage.k22) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bf, code lost:
    
        if (r3 != null) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go1.toString():java.lang.String");
    }

    public final Throwable u() {
        Throwable thS = s();
        return thS == null ? new ClosedSendChannelException("Channel was closed") : thS;
    }

    public final long v() {
        return b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (defpackage.k22) ((defpackage.on2) defpackage.on2.b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x(long r14, boolean r16) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go1.x(long, boolean):boolean");
    }

    public final boolean y() {
        return x(b.get(this), true);
    }

    public boolean z() {
        return false;
    }
}
