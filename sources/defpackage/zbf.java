package defpackage;

import defpackage.v03;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class zbf extends k89 implements js3 {
    public final d2f c;
    public final a<y03> d = new a<>();

    public static final class a<T> {
        public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "reader$volatile");
        public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(a.class, "readers$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "writer$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "exceptionWhenReading$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_value$volatile");
        private volatile /* synthetic */ Object _value$volatile = null;
        private volatile /* synthetic */ Object exceptionWhenReading$volatile;
        private volatile /* synthetic */ Object reader$volatile;
        private volatile /* synthetic */ int readers$volatile;
        private volatile /* synthetic */ Object writer$volatile;
    }

    public zbf(gx gxVar) {
        this.c = new d2f(gxVar);
    }

    @Override // defpackage.y03
    public final boolean A1(v03 v03Var) {
        return L1().A1(v03Var);
    }

    @Override // defpackage.k89
    public final k89 J1() {
        k89 k89VarJ1;
        y03 y03VarL1 = L1();
        k89 k89Var = y03VarL1 instanceof k89 ? (k89) y03VarL1 : null;
        return (k89Var == null || (k89VarJ1 = k89Var.J1()) == null) ? this : k89VarJ1;
    }

    public final y03 L1() {
        a<y03> aVar = this.d;
        aVar.getClass();
        a.a.set(aVar, new Throwable("reader location"));
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = a.b;
        atomicIntegerFieldUpdater.incrementAndGet(aVar);
        Throwable th = (Throwable) a.c.get(aVar);
        if (th != null) {
            a.d.set(aVar, new IllegalStateException("Dispatchers.Main is used concurrently with setting it", th));
        }
        Object obj = a.e.get(aVar);
        atomicIntegerFieldUpdater.decrementAndGet(aVar);
        y03 y03Var = (y03) obj;
        return y03Var == null ? (y03) this.c.getValue() : y03Var;
    }

    @Override // defpackage.js3
    public final o74 R0(long j, lmf lmfVar, v03 v03Var) {
        v03.a aVarL1 = L1();
        js3 js3Var = aVarL1 instanceof js3 ? (js3) aVarL1 : null;
        if (js3Var == null) {
            js3Var = fn3.a;
        }
        return js3Var.R0(j, lmfVar, v03Var);
    }

    @Override // defpackage.js3
    public final void b0(long j, qw1 qw1Var) {
        v03.a aVarL1 = L1();
        js3 js3Var = aVarL1 instanceof js3 ? (js3) aVarL1 : null;
        if (js3Var == null) {
            js3Var = fn3.a;
        }
        js3Var.b0(j, qw1Var);
    }

    @Override // defpackage.y03
    public final void v1(v03 v03Var, Runnable runnable) {
        L1().v1(v03Var, runnable);
    }

    @Override // defpackage.y03
    public final void w1(v03 v03Var, Runnable runnable) {
        L1().w1(v03Var, runnable);
    }
}
