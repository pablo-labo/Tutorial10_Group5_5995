package defpackage;

import defpackage.ex7;
import defpackage.v03;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes3.dex */
@sy3
public class d78 implements ex7, d4b {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(d78.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(d78.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public static final class a<T> extends qw1<T> {
        public final d78 X;

        public a(lu2<? super T> lu2Var, d78 d78Var) {
            super(1, lu2Var);
            this.X = d78Var;
        }

        @Override // defpackage.qw1
        public final String A() {
            return "AwaitContinuation";
        }

        @Override // defpackage.qw1
        public final Throwable o(d78 d78Var) {
            Throwable thC;
            d78 d78Var2 = this.X;
            d78Var2.getClass();
            Object obj = d78.a.get(d78Var2);
            return (!(obj instanceof c) || (thC = ((c) obj).c()) == null) ? obj instanceof rf2 ? ((rf2) obj).a : d78Var.G() : thC;
        }
    }

    public static final class b extends bz7 {
        public final e42 V;
        public final Object W;
        public final d78 e;
        public final c f;

        public b(d78 d78Var, c cVar, e42 e42Var, Object obj) {
            this.e = d78Var;
            this.f = cVar;
            this.V = e42Var;
            this.W = obj;
        }

        @Override // defpackage.bz7
        public final boolean i() {
            return false;
        }

        @Override // defpackage.bz7
        public final void j(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d78.a;
            d78 d78Var = this.e;
            d78Var.getClass();
            e42 e42Var = this.V;
            e42 e42VarT = d78.T(e42Var);
            c cVar = this.f;
            Object obj = this.W;
            if (e42VarT == null || !d78Var.e0(cVar, e42VarT, obj)) {
                cVar.a.b(new ky8(2), 2);
                e42 e42VarT2 = d78.T(e42Var);
                if (e42VarT2 == null || !d78Var.e0(cVar, e42VarT2, obj)) {
                    d78Var.m(d78Var.B(cVar, obj));
                }
            }
        }
    }

    public static final class c implements b77 {
        public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile = 0;
        private volatile /* synthetic */ Object _rootCause$volatile;
        public final zia a;

        public c(zia ziaVar, Throwable th) {
            this.a = ziaVar;
            this._rootCause$volatile = th;
        }

        @Override // defpackage.b77
        public final zia a() {
            return this.a;
        }

        public final void b(Throwable th) {
            Throwable thC = c();
            if (thC == null) {
                c.set(this, th);
                return;
            }
            if (th == thC) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                    return;
                } else {
                    ja.i(obj, "State is ");
                    return;
                }
            }
            if (th == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            atomicReferenceFieldUpdater.set(this, arrayList);
        }

        public final Throwable c() {
            return (Throwable) c.get(this);
        }

        public final boolean d() {
            return c() != null;
        }

        public final ArrayList e(Throwable th) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    ja.i(obj, "State is ");
                    return null;
                }
                arrayList = (ArrayList) obj;
            }
            Throwable thC = c();
            if (thC != null) {
                arrayList.add(0, thC);
            }
            if (th != null && !th.equals(thC)) {
                arrayList.add(th);
            }
            atomicReferenceFieldUpdater.set(this, pnb.f0);
            return arrayList;
        }

        @Override // defpackage.b77
        public final boolean isActive() {
            return c() == null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Finishing[cancelling=");
            sb.append(d());
            sb.append(", completing=");
            sb.append(b.get(this) == 1);
            sb.append(", rootCause=");
            sb.append(c());
            sb.append(", exceptions=");
            sb.append(d.get(this));
            sb.append(", list=");
            sb.append(this.a);
            sb.append(']');
            return sb.toString();
        }
    }

    @uh3(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, 1005}, m = "invokeSuspend")
    public static final class d extends n7d implements Function2<t6e<? super ex7>, lu2<? super j6g>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ d78 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(lu2 lu2Var, d78 d78Var) {
            super(2, lu2Var);
            this.this$0 = d78Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            d dVar = new d(lu2Var, this.this$0);
            dVar.L$0 = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(t6e<? super ex7> t6eVar, lu2<? super j6g> lu2Var) {
            return ((d) create(t6eVar, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006a -> B:25:0x007d). Please report as a decompilation issue!!! */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                int r0 = r5.label
                r1 = 2
                r2 = 1
                g13 r3 = defpackage.g13.a
                if (r0 == 0) goto L27
                if (r0 == r2) goto L23
                if (r0 != r1) goto L1c
                java.lang.Object r0 = r5.L$2
                o29 r0 = (defpackage.o29) r0
                java.lang.Object r2 = r5.L$1
                n29 r2 = (defpackage.n29) r2
                java.lang.Object r4 = r5.L$0
                t6e r4 = (defpackage.t6e) r4
                defpackage.r7d.b(r6)
                goto L7d
            L1c:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r5)
                r5 = 0
                return r5
            L23:
                defpackage.r7d.b(r6)
                goto L82
            L27:
                defpackage.r7d.b(r6)
                java.lang.Object r6 = r5.L$0
                t6e r6 = (defpackage.t6e) r6
                d78 r0 = r5.this$0
                r0.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.d78.a
                java.lang.Object r0 = r4.get(r0)
                boolean r4 = r0 instanceof defpackage.e42
                if (r4 == 0) goto L47
                e42 r0 = (defpackage.e42) r0
                d78 r0 = r0.e
                r5.label = r2
                r6.a(r5, r0)
                return r3
            L47:
                boolean r2 = r0 instanceof defpackage.b77
                if (r2 == 0) goto L82
                b77 r0 = (defpackage.b77) r0
                zia r0 = r0.a()
                if (r0 == 0) goto L82
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.o29.a
                java.lang.Object r2 = r2.get(r0)
                r2.getClass()
                o29 r2 = (defpackage.o29) r2
                r4 = r2
                r2 = r0
                r0 = r4
                r4 = r6
            L62:
                boolean r6 = r0.equals(r2)
                if (r6 != 0) goto L82
                boolean r6 = r0 instanceof defpackage.e42
                if (r6 == 0) goto L7d
                r6 = r0
                e42 r6 = (defpackage.e42) r6
                d78 r6 = r6.e
                r5.L$0 = r4
                r5.L$1 = r2
                r5.L$2 = r0
                r5.label = r1
                r4.a(r5, r6)
                return r3
            L7d:
                o29 r0 = r0.f()
                goto L62
            L82:
                j6g r5 = defpackage.j6g.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: d78.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public d78(boolean z) {
        this._state$volatile = z ? pnb.h0 : pnb.g0;
    }

    public static e42 T(o29 o29Var) {
        while (o29Var.g()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o29.b;
            o29 o29VarD = o29Var.d();
            if (o29VarD == null) {
                Object obj = atomicReferenceFieldUpdater.get(o29Var);
                while (true) {
                    o29Var = (o29) obj;
                    if (!o29Var.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(o29Var);
                }
            } else {
                o29Var = o29VarD;
            }
        }
        while (true) {
            o29Var = o29Var.f();
            if (!o29Var.g()) {
                if (o29Var instanceof e42) {
                    return (e42) o29Var;
                }
                if (o29Var instanceof zia) {
                    return null;
                }
            }
        }
    }

    public static String b0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof b77 ? ((b77) obj).isActive() ? "Active" : "New" : obj instanceof rf2 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.d() ? "Cancelling" : c.b.get(cVar) == 1 ? "Completing" : "Active";
    }

    public final Throwable A(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(x(), null, this) : th;
        }
        obj.getClass();
        return ((d4b) obj).m0();
    }

    public final Object B(c cVar, Object obj) {
        Throwable thD;
        rf2 rf2Var = obj instanceof rf2 ? (rf2) obj : null;
        Throwable th = rf2Var != null ? rf2Var.a : null;
        synchronized (cVar) {
            cVar.d();
            ArrayList<Throwable> arrayListE = cVar.e(th);
            thD = D(cVar, arrayListE);
            if (thD != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                for (Throwable th2 : arrayListE) {
                    if (th2 != thD && th2 != thD && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        boa.h(thD, th2);
                    }
                }
            }
        }
        if (thD != null && thD != th) {
            obj = new rf2(thD, false);
        }
        if (thD != null && (u(thD) || I(thD))) {
            obj.getClass();
            rf2.b.compareAndSet((rf2) obj, 0, 1);
        }
        V(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object c77Var = obj instanceof b77 ? new c77((b77) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, c77Var) && atomicReferenceFieldUpdater.get(this) == cVar) {
        }
        z(cVar, obj);
        return obj;
    }

    public final Object C() throws Throwable {
        Object obj = a.get(this);
        if (obj instanceof b77) {
            r6.g("This job has not completed yet");
            return null;
        }
        if (obj instanceof rf2) {
            throw ((rf2) obj).a;
        }
        return pnb.R(obj);
    }

    public final Throwable D(c cVar, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (cVar.d()) {
                return new JobCancellationException(x(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean E() {
        return true;
    }

    public boolean F() {
        return this instanceof yd2;
    }

    @Override // defpackage.ex7
    public final CancellationException G() {
        CancellationException cancellationException;
        Object obj = a.get(this);
        if (obj instanceof c) {
            Throwable thC = ((c) obj).c();
            if (thC == null) {
                ja.i(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
            return cancellationException == null ? new JobCancellationException(strConcat, thC, this) : cancellationException;
        }
        if (obj instanceof b77) {
            ja.i(this, "Job is still new or active: ");
            return null;
        }
        if (!(obj instanceof rf2)) {
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((rf2) obj).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new JobCancellationException(x(), th, this) : cancellationException;
    }

    public final zia H(b77 b77Var) {
        zia ziaVarA = b77Var.a();
        if (ziaVarA != null) {
            return ziaVarA;
        }
        if (b77Var instanceof qr4) {
            return new zia();
        }
        if (b77Var instanceof bz7) {
            Z((bz7) b77Var);
            return null;
        }
        ja.i(b77Var, "State should have list: ");
        return null;
    }

    public boolean I(Throwable th) {
        return false;
    }

    public void J(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void K(ex7 ex7Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        jja jjaVar = jja.a;
        if (ex7Var == null) {
            atomicReferenceFieldUpdater.set(this, jjaVar);
            return;
        }
        ex7Var.start();
        d42 d42VarL0 = ex7Var.L0(this);
        atomicReferenceFieldUpdater.set(this, d42VarL0);
        if (o0()) {
            d42VarL0.dispose();
            atomicReferenceFieldUpdater.set(this, jjaVar);
        }
    }

    public final o74 L(boolean z, bz7 bz7Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        jja jjaVar;
        boolean z2;
        boolean zB;
        bz7Var.d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof qr4;
            jjaVar = jja.a;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof b77)) {
                    z2 = false;
                    break;
                }
                b77 b77Var = (b77) obj;
                zia ziaVarA = b77Var.a();
                if (ziaVarA == null) {
                    Z((bz7) obj);
                } else {
                    if (bz7Var.i()) {
                        c cVar = b77Var instanceof c ? (c) b77Var : null;
                        Throwable thC = cVar != null ? cVar.c() : null;
                        if (thC == null) {
                            zB = ziaVarA.b(bz7Var, 5);
                        } else if (z) {
                            bz7Var.j(thC);
                            return jjaVar;
                        }
                    } else {
                        zB = ziaVarA.b(bz7Var, 1);
                    }
                    if (zB) {
                        break;
                    }
                }
            } else {
                qr4 qr4Var = (qr4) obj;
                if (qr4Var.a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, bz7Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                Y(qr4Var);
            }
        }
        if (z2) {
            return bz7Var;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            rf2 rf2Var = obj2 instanceof rf2 ? (rf2) obj2 : null;
            bz7Var.j(rf2Var != null ? rf2Var.a : null);
        }
        return jjaVar;
    }

    @Override // defpackage.ex7
    public final d42 L0(d78 d78Var) {
        e42 e42Var = new e42(d78Var);
        e42Var.d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof qr4) {
                qr4 qr4Var = (qr4) obj;
                if (qr4Var.a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e42Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                Y(qr4Var);
            } else {
                boolean z = obj instanceof b77;
                jja jjaVar = jja.a;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    rf2 rf2Var = obj2 instanceof rf2 ? (rf2) obj2 : null;
                    e42Var.j(rf2Var != null ? rf2Var.a : null);
                    return jjaVar;
                }
                zia ziaVarA = ((b77) obj).a();
                if (ziaVarA == null) {
                    Z((bz7) obj);
                } else if (!ziaVarA.b(e42Var, 7)) {
                    boolean zB = ziaVarA.b(e42Var, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof c) {
                        thC = ((c) obj3).c();
                    } else {
                        rf2 rf2Var2 = obj3 instanceof rf2 ? (rf2) obj3 : null;
                        if (rf2Var2 != null) {
                            thC = rf2Var2.a;
                        }
                    }
                    e42Var.j(thC);
                    if (zB) {
                        break loop0;
                    }
                    return jjaVar;
                }
            }
        }
        return e42Var;
    }

    public boolean M() {
        return this instanceof wh1;
    }

    public final boolean O(Object obj) {
        Object objC0;
        do {
            objC0 = c0(a.get(this), obj);
            if (objC0 == pnb.b0) {
                return false;
            }
            if (objC0 == pnb.c0) {
                return true;
            }
        } while (objC0 == pnb.d0);
        m(objC0);
        return true;
    }

    @Override // defpackage.v03
    public final v03 P(v03.b<?> bVar) {
        return v03.a.C0438a.b(this, bVar);
    }

    public final Object R(Object obj) {
        Object objC0;
        do {
            objC0 = c0(a.get(this), obj);
            if (objC0 == pnb.b0) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                rf2 rf2Var = obj instanceof rf2 ? (rf2) obj : null;
                throw new IllegalStateException(str, rf2Var != null ? rf2Var.a : null);
            }
        } while (objC0 == pnb.d0);
        return objC0;
    }

    public String S() {
        return getClass().getSimpleName();
    }

    public final void U(zia ziaVar, Throwable th) {
        ziaVar.b(new ky8(4), 4);
        Object obj = o29.a.get(ziaVar);
        obj.getClass();
        CompletionHandlerException completionHandlerException = null;
        for (o29 o29VarF = (o29) obj; !o29VarF.equals(ziaVar); o29VarF = o29VarF.f()) {
            if ((o29VarF instanceof bz7) && ((bz7) o29VarF).i()) {
                try {
                    ((bz7) o29VarF).j(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        boa.h(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + o29VarF + " for " + this, th2);
                        j6g j6gVar = j6g.a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            J(completionHandlerException);
        }
        u(th);
    }

    public void V(Object obj) {
    }

    public void X() {
    }

    public final void Y(qr4 qr4Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        zia ziaVar = new zia();
        Object p47Var = ziaVar;
        if (!qr4Var.a) {
            p47Var = new p47(ziaVar);
        }
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, qr4Var, p47Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == qr4Var);
    }

    public final void Z(bz7 bz7Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        zia ziaVar = new zia();
        bz7Var.getClass();
        o29.b.set(ziaVar, bz7Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = o29.a;
        atomicReferenceFieldUpdater2.set(ziaVar, bz7Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(bz7Var) == bz7Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(bz7Var, bz7Var, ziaVar)) {
                    if (atomicReferenceFieldUpdater2.get(bz7Var) != bz7Var) {
                        break;
                    }
                }
                ziaVar.e(bz7Var);
                break loop0;
            }
            break;
        }
        o29 o29VarF = bz7Var.f();
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, bz7Var, o29VarF)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == bz7Var);
    }

    @Override // defpackage.ex7
    public final r6e<ex7> a() {
        return new u6e(new d(null, this));
    }

    public final int a0(Object obj) {
        boolean z = obj instanceof qr4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (z) {
            if (((qr4) obj).a) {
                return 0;
            }
            qr4 qr4Var = pnb.h0;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qr4Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            X();
            return 1;
        }
        if (!(obj instanceof p47)) {
            return 0;
        }
        zia ziaVar = ((p47) obj).a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ziaVar)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        X();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final Object c0(Object obj, Object obj2) {
        if (!(obj instanceof b77)) {
            return pnb.b0;
        }
        if (((obj instanceof qr4) || (obj instanceof bz7)) && !(obj instanceof e42) && !(obj2 instanceof rf2)) {
            b77 b77Var = (b77) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            Object c77Var = obj2 instanceof b77 ? new c77((b77) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, b77Var, c77Var)) {
                if (atomicReferenceFieldUpdater.get(this) != b77Var) {
                    return pnb.d0;
                }
            }
            V(obj2);
            z(b77Var, obj2);
            return obj2;
        }
        b77 b77Var2 = (b77) obj;
        zia ziaVarH = H(b77Var2);
        if (ziaVarH == null) {
            return pnb.d0;
        }
        c cVar = b77Var2 instanceof c ? (c) b77Var2 : null;
        if (cVar == null) {
            cVar = new c(ziaVarH, null);
        }
        luc lucVar = new luc();
        synchronized (cVar) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c.b;
            if (atomicIntegerFieldUpdater.get(cVar) == 1) {
                return pnb.b0;
            }
            atomicIntegerFieldUpdater.set(cVar, 1);
            if (cVar != b77Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, b77Var2, cVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != b77Var2) {
                        return pnb.d0;
                    }
                }
            }
            boolean zD = cVar.d();
            rf2 rf2Var = obj2 instanceof rf2 ? (rf2) obj2 : null;
            if (rf2Var != null) {
                cVar.b(rf2Var.a);
            }
            ?? C = zD ? 0 : cVar.c();
            lucVar.element = C;
            j6g j6gVar = j6g.a;
            if (C != 0) {
                U(ziaVarH, C);
            }
            e42 e42VarT = T(ziaVarH);
            if (e42VarT != null && e0(cVar, e42VarT, obj2)) {
                return pnb.c0;
            }
            ziaVarH.b(new ky8(2), 2);
            e42 e42VarT2 = T(ziaVarH);
            return (e42VarT2 == null || !e0(cVar, e42VarT2, obj2)) ? B(cVar, obj2) : pnb.c0;
        }
    }

    @Override // defpackage.ex7
    public final o74 d0(Function1<? super Throwable, j6g> function1) {
        return L(true, new co7(function1));
    }

    @Override // defpackage.v03
    public final v03 d1(v03 v03Var) {
        return v03.a.C0438a.c(this, v03Var);
    }

    public final boolean e0(c cVar, e42 e42Var, Object obj) {
        do {
            d78 d78Var = e42Var.e;
            b bVar = new b(this, cVar, e42Var, obj);
            if ((d78Var != null ? d78Var.L(false, bVar) : d78Var.v(false, false, new wy7(1, bVar, bz7.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0))) != jja.a) {
                return true;
            }
            e42Var = T(e42Var);
        } while (e42Var != null);
        return false;
    }

    @Override // v03.a
    public final v03.b<?> getKey() {
        return ex7.a.a;
    }

    @Override // defpackage.ex7
    public void h(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(x(), null, this);
        }
        t(cancellationException);
    }

    @Override // defpackage.v03
    public final <E extends v03.a> E h1(v03.b<E> bVar) {
        return (E) v03.a.C0438a.a(this, bVar);
    }

    @Override // defpackage.ex7
    public boolean isActive() {
        Object obj = a.get(this);
        return (obj instanceof b77) && ((b77) obj).isActive();
    }

    @Override // defpackage.ex7
    public final boolean isCancelled() {
        Object obj = a.get(this);
        if (obj instanceof rf2) {
            return true;
        }
        return (obj instanceof c) && ((c) obj).d();
    }

    public boolean j0(Object obj) {
        return O(obj);
    }

    @Override // defpackage.v03
    public final <R> R j1(R r, Function2<? super R, ? super v03.a, ? extends R> function2) {
        return function2.invoke(r, this);
    }

    public void m(Object obj) {
    }

    @Override // defpackage.d4b
    public final CancellationException m0() {
        Throwable thC;
        Object obj = a.get(this);
        if (obj instanceof c) {
            thC = ((c) obj).c();
        } else if (obj instanceof rf2) {
            thC = ((rf2) obj).a;
        } else {
            if (obj instanceof b77) {
                ja.i(obj, "Cannot be cancelling child in this state: ");
                return null;
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(b0(obj)), thC, this) : cancellationException;
    }

    public void n(Object obj) {
        m(obj);
    }

    public final Object o(lu2<Object> lu2Var) throws Throwable {
        Object obj;
        do {
            obj = a.get(this);
            if (!(obj instanceof b77)) {
                if (obj instanceof rf2) {
                    throw ((rf2) obj).a;
                }
                return pnb.R(obj);
            }
        } while (a0(obj) < 0);
        a aVar = new a(ewa.v(lu2Var), this);
        aVar.q();
        aVar.u(new u74(u63.T(this, new s7d(aVar))));
        return aVar.p();
    }

    @Override // defpackage.ex7
    public final boolean o0() {
        return !(a.get(this) instanceof b77);
    }

    public Object p() {
        return C();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
  0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d78.q(java.lang.Object):boolean");
    }

    public final Throwable s() {
        Object obj = a.get(this);
        if (obj instanceof b77) {
            r6.g("This job has not completed yet");
            return null;
        }
        rf2 rf2Var = obj instanceof rf2 ? (rf2) obj : null;
        if (rf2Var != null) {
            return rf2Var.a;
        }
        return null;
    }

    @Override // defpackage.ex7
    public final Object s0(pu2 pu2Var) throws Throwable {
        Object obj;
        do {
            obj = a.get(this);
            if (!(obj instanceof b77)) {
                u63.u(pu2Var.getContext());
                return j6g.a;
            }
        } while (a0(obj) < 0);
        qw1 qw1Var = new qw1(1, ewa.v(pu2Var));
        qw1Var.q();
        qw1Var.u(new u74(u63.T(this, new b9d(qw1Var))));
        Object objP = qw1Var.p();
        g13 g13Var = g13.a;
        if (objP != g13Var) {
            objP = j6g.a;
        }
        return objP == g13Var ? objP : j6g.a;
    }

    @Override // defpackage.ex7
    public final boolean start() {
        int iA0;
        do {
            iA0 = a0(a.get(this));
            if (iA0 == 0) {
                return false;
            }
        } while (iA0 != 1);
        return true;
    }

    public void t(CancellationException cancellationException) {
        q(cancellationException);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(S() + '{' + b0(a.get(this)) + '}');
        sb.append('@');
        sb.append(pi3.f(this));
        return sb.toString();
    }

    public final boolean u(Throwable th) {
        if (!M()) {
            boolean z = th instanceof CancellationException;
            d42 d42Var = (d42) b.get(this);
            return (d42Var == null || d42Var == jja.a) ? z : d42Var.c(th) || z;
        }
        return true;
    }

    @Override // defpackage.ex7
    public final o74 v(boolean z, boolean z2, wy7 wy7Var) {
        return L(z2, z ? new bo7(wy7Var) : new co7(wy7Var));
    }

    public String x() {
        return "Job was cancelled";
    }

    public boolean y(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return q(th) && E();
    }

    public final void z(b77 b77Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        d42 d42Var = (d42) atomicReferenceFieldUpdater.get(this);
        if (d42Var != null) {
            d42Var.dispose();
            atomicReferenceFieldUpdater.set(this, jja.a);
        }
        CompletionHandlerException completionHandlerException = null;
        rf2 rf2Var = obj instanceof rf2 ? (rf2) obj : null;
        Throwable th = rf2Var != null ? rf2Var.a : null;
        if (b77Var instanceof bz7) {
            try {
                ((bz7) b77Var).j(th);
                return;
            } catch (Throwable th2) {
                J(new CompletionHandlerException("Exception in completion handler " + b77Var + " for " + this, th2));
                return;
            }
        }
        zia ziaVarA = b77Var.a();
        if (ziaVarA != null) {
            ziaVarA.b(new ky8(1), 1);
            Object obj2 = o29.a.get(ziaVarA);
            obj2.getClass();
            for (o29 o29VarF = (o29) obj2; !o29VarF.equals(ziaVarA); o29VarF = o29VarF.f()) {
                if (o29VarF instanceof bz7) {
                    try {
                        ((bz7) o29VarF).j(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            boa.h(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + o29VarF + " for " + this, th3);
                            j6g j6gVar = j6g.a;
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                J(completionHandlerException);
            }
        }
    }
}
