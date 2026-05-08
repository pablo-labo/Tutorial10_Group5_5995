package defpackage;

import defpackage.ex7;
import defpackage.gw1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: loaded from: classes3.dex */
public class qw1<T> extends x64<T> implements pw1<T>, h13, ttg {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final lu2<T> d;
    public final v03 e;
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(qw1.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater V = AtomicReferenceFieldUpdater.newUpdater(qw1.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater W = AtomicReferenceFieldUpdater.newUpdater(qw1.class, Object.class, "_parentHandle$volatile");

    public qw1(int i, lu2 lu2Var) {
        super(i);
        this.d = lu2Var;
        this.e = lu2Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = r7.a;
    }

    public static Object E(bla blaVar, Object obj, int i, wu5 wu5Var) {
        if (obj instanceof rf2) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (wu5Var != null || (blaVar instanceof gw1)) {
            return new pf2(obj, blaVar instanceof gw1 ? (gw1) blaVar : null, wu5Var, (Throwable) null, 16);
        }
        return obj;
    }

    public static void z(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        lu2<T> lu2Var = this.d;
        Throwable th = null;
        v64 v64Var = lu2Var instanceof v64 ? (v64) lu2Var : null;
        if (v64Var != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v64.W;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(v64Var);
                ux0 ux0Var = mh2.W;
                if (obj == ux0Var) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(v64Var, ux0Var, this)) {
                        if (atomicReferenceFieldUpdater.get(v64Var) != ux0Var) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        ja.i(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(v64Var, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(v64Var) != obj) {
                            l5.q("Failed requirement.");
                            return;
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            m();
            g(th);
        }
    }

    public final <R> void C(R r, int i, wu5<? super Throwable, ? super R, ? super v03, j6g> wu5Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof bla) {
                Object objE = E((bla) obj, r, i, wu5Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, objE)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (!y()) {
                    m();
                }
                n(i);
                return;
            }
            if (obj instanceof uw1) {
                uw1 uw1Var = (uw1) obj;
                if (uw1.c.compareAndSet(uw1Var, 0, 1)) {
                    if (wu5Var != null) {
                        k(wu5Var, uw1Var.a, r);
                        return;
                    }
                    return;
                }
            }
            ja.i(r, "Already resumed, but proposed with update ");
            return;
        }
    }

    public final void D(y03 y03Var, T t) {
        lu2<T> lu2Var = this.d;
        v64 v64Var = lu2Var instanceof v64 ? (v64) lu2Var : null;
        C(t, (v64Var != null ? v64Var.d : null) == y03Var ? 4 : this.c, null);
    }

    public final ux0 F(Object obj, wu5 wu5Var) {
        ux0 ux0Var = hh1.c;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof bla)) {
                return null;
            }
            Object objE = E((bla) obj2, obj, this.c, wu5Var);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objE)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!y()) {
                m();
            }
            return ux0Var;
        }
    }

    @Override // defpackage.ttg
    public final void a(myd<?> mydVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                r6.g("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        u(mydVar);
    }

    @Override // defpackage.x64
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof bla) {
                r6.g("Not completed");
                return;
            }
            if (obj instanceof rf2) {
                return;
            }
            if (!(obj instanceof pf2)) {
                cancellationException2 = cancellationException;
                pf2 pf2Var = new pf2(obj, (gw1) null, (wu5) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pf2Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            pf2 pf2Var2 = (pf2) obj;
            if (pf2Var2.e != null) {
                r6.g("Must be called at most once");
                return;
            }
            pf2 pf2VarA = pf2.a(pf2Var2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pf2VarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            gw1 gw1Var = pf2Var2.b;
            if (gw1Var != null) {
                j(gw1Var, cancellationException);
            }
            wu5<Throwable, R, v03, j6g> wu5Var = pf2Var2.c;
            if (wu5Var != 0) {
                k(wu5Var, cancellationException, pf2Var2.a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // defpackage.x64
    public final lu2<T> c() {
        return this.d;
    }

    @Override // defpackage.pw1
    public final ux0 d(Object obj, wu5 wu5Var) {
        return F(obj, wu5Var);
    }

    @Override // defpackage.x64
    public final Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x64
    public final <T> T f(Object obj) {
        return obj instanceof pf2 ? (T) ((pf2) obj).a : obj;
    }

    @Override // defpackage.pw1
    public final boolean g(Throwable th) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof bla)) {
                return false;
            }
            boolean z = (obj instanceof gw1) || (obj instanceof myd);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            uw1 uw1Var = new uw1(cancellationException, z);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, uw1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            bla blaVar = (bla) obj;
            if (blaVar instanceof gw1) {
                j((gw1) obj, th);
            } else if (blaVar instanceof myd) {
                l((myd) obj, th);
            }
            if (!y()) {
                m();
            }
            n(this.c);
            return true;
        }
    }

    @Override // defpackage.h13
    public final h13 getCallerFrame() {
        lu2<T> lu2Var = this.d;
        if (lu2Var instanceof h13) {
            return (h13) lu2Var;
        }
        return null;
    }

    @Override // defpackage.lu2
    public final v03 getContext() {
        return this.e;
    }

    @Override // defpackage.x64
    public final Object i() {
        return V.get(this);
    }

    public final void j(gw1 gw1Var, Throwable th) {
        try {
            gw1Var.b(th);
        } catch (Throwable th2) {
            b13.a(this.e, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void k(wu5<? super Throwable, ? super R, ? super v03, j6g> wu5Var, Throwable th, R r) {
        v03 v03Var = this.e;
        try {
            wu5Var.q(th, r, v03Var);
        } catch (Throwable th2) {
            b13.a(v03Var, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(myd<?> mydVar, Throwable th) {
        v03 v03Var = this.e;
        int i = f.get(this) & 536870911;
        if (i == 536870911) {
            r6.g("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            mydVar.h(i, v03Var);
        } catch (Throwable th2) {
            b13.a(v03Var, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = W;
        o74 o74Var = (o74) atomicReferenceFieldUpdater.get(this);
        if (o74Var == null) {
            return;
        }
        o74Var.dispose();
        atomicReferenceFieldUpdater.set(this, jja.a);
    }

    public final void n(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    r6.g("Already resumed");
                    return;
                }
                boolean z = i == 4;
                lu2<T> lu2Var = this.d;
                if (!z && (lu2Var instanceof v64)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.c;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        v64 v64Var = (v64) lu2Var;
                        y03 y03Var = v64Var.d;
                        v03 context = v64Var.e.getContext();
                        if (mh2.z(y03Var, context)) {
                            mh2.y(y03Var, context, this);
                            return;
                        }
                        d05 d05VarA = ukf.a();
                        if (d05VarA.c >= 4294967296L) {
                            d05VarA.L1(this);
                            return;
                        }
                        d05VarA.O1(true);
                        try {
                            hh1.R(this, lu2Var, true);
                            do {
                            } while (d05VarA.S1());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                hh1.R(this, lu2Var, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable o(d78 d78Var) {
        return d78Var.G();
    }

    public final Object p() throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        ex7 ex7Var;
        boolean zY = y();
        do {
            atomicIntegerFieldUpdater = f;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    r6.g("Already suspended");
                    return null;
                }
                if (zY) {
                    B();
                }
                Object obj = V.get(this);
                if (obj instanceof rf2) {
                    throw ((rf2) obj).a;
                }
                int i3 = this.c;
                if ((i3 != 1 && i3 != 2) || (ex7Var = (ex7) this.e.h1(ex7.a.a)) == null || ex7Var.isActive()) {
                    return f(obj);
                }
                CancellationException cancellationExceptionG = ex7Var.G();
                b(cancellationExceptionG);
                throw cancellationExceptionG;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((o74) W.get(this)) == null) {
            s();
        }
        if (zY) {
            B();
        }
        return g13.a;
    }

    public final void q() {
        o74 o74VarS = s();
        if (o74VarS != null && x()) {
            o74VarS.dispose();
            W.set(this, jja.a);
        }
    }

    @Override // defpackage.pw1
    public final <R extends T> void r(R r, wu5<? super Throwable, ? super R, ? super v03, j6g> wu5Var) {
        C(r, this.c, wu5Var);
    }

    @Override // defpackage.lu2
    public final void resumeWith(Object obj) {
        Throwable thA = o7d.a(obj);
        if (thA != null) {
            obj = new rf2(thA, false);
        }
        C(obj, this.c, null);
    }

    public final o74 s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ex7 ex7Var = (ex7) this.e.h1(ex7.a.a);
        if (ex7Var == null) {
            return null;
        }
        o74 o74VarT = u63.T(ex7Var, new c42(this));
        do {
            atomicReferenceFieldUpdater = W;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, o74VarT)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return o74VarT;
    }

    public final void t(Function1<? super Throwable, j6g> function1) {
        u(new gw1.a(function1));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(pi3.l(this.d));
        sb.append("){");
        Object obj = V.get(this);
        sb.append(obj instanceof bla ? "Active" : obj instanceof uw1 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(pi3.f(this));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00aa, code lost:
    
        z(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ad, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(defpackage.bla r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.qw1.V
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof defpackage.r7
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto La1
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof defpackage.gw1
            r3 = 0
            if (r1 != 0) goto Laa
            boolean r1 = r2 instanceof defpackage.myd
            if (r1 != 0) goto Laa
            boolean r1 = r2 instanceof defpackage.rf2
            if (r1 == 0) goto L50
            r0 = r2
            rf2 r0 = (defpackage.rf2) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.rf2.b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L4c
            boolean r1 = r2 instanceof defpackage.uw1
            if (r1 == 0) goto La1
            java.lang.Throwable r0 = r0.a
            boolean r1 = r8 instanceof defpackage.gw1
            if (r1 == 0) goto L43
            gw1 r8 = (defpackage.gw1) r8
            r7.j(r8, r0)
            return
        L43:
            r8.getClass()
            myd r8 = (defpackage.myd) r8
            r7.l(r8, r0)
            return
        L4c:
            z(r8, r2)
            throw r3
        L50:
            boolean r1 = r2 instanceof defpackage.pf2
            if (r1 == 0) goto L87
            r1 = r2
            pf2 r1 = (defpackage.pf2) r1
            gw1 r4 = r1.b
            if (r4 != 0) goto L83
            boolean r4 = r8 instanceof defpackage.myd
            if (r4 == 0) goto L60
            return
        L60:
            r8.getClass()
            r4 = r8
            gw1 r4 = (defpackage.gw1) r4
            java.lang.Throwable r5 = r1.e
            if (r5 == 0) goto L6e
            r7.j(r4, r5)
            return
        L6e:
            r5 = 29
            pf2 r1 = defpackage.pf2.a(r1, r4, r3, r5)
        L74:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L7b
            goto La1
        L7b:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L74
            goto L0
        L83:
            z(r8, r2)
            throw r3
        L87:
            boolean r1 = r8 instanceof defpackage.myd
            if (r1 == 0) goto L8c
            return
        L8c:
            r8.getClass()
            r3 = r8
            gw1 r3 = (defpackage.gw1) r3
            pf2 r1 = new pf2
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L9b:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto La2
        La1:
            return
        La2:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L9b
            goto L0
        Laa:
            z(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw1.u(bla):void");
    }

    public final boolean v() {
        return V.get(this) instanceof bla;
    }

    @Override // defpackage.pw1
    public final void w(Object obj) {
        n(this.c);
    }

    public final boolean x() {
        return !(V.get(this) instanceof bla);
    }

    public final boolean y() {
        if (this.c != 2) {
            return false;
        }
        lu2<T> lu2Var = this.d;
        lu2Var.getClass();
        return v64.W.get((v64) lu2Var) != null;
    }
}
