package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class g61<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(g61.class, "notCompletedCount$volatile");
    public final xr3<T>[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public final class a extends bz7 {
        public static final /* synthetic */ AtomicReferenceFieldUpdater W = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;
        public final qw1 e;
        public o74 f;

        public a(qw1 qw1Var) {
            this.e = qw1Var;
        }

        @Override // defpackage.bz7
        public final boolean i() {
            return false;
        }

        @Override // defpackage.bz7
        public final void j(Throwable th) {
            qw1 qw1Var = this.e;
            if (th != null) {
                qw1Var.getClass();
                ux0 ux0VarF = qw1Var.F(new rf2(th, false), null);
                if (ux0VarF != null) {
                    qw1Var.w(ux0VarF);
                    b bVar = (b) W.get(this);
                    if (bVar != null) {
                        bVar.a();
                        return;
                    }
                    return;
                }
                return;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g61.b;
            g61<T> g61Var = g61.this;
            if (atomicIntegerFieldUpdater.decrementAndGet(g61Var) == 0) {
                xr3<T>[] xr3VarArr = g61Var.a;
                ArrayList arrayList = new ArrayList(xr3VarArr.length);
                for (xr3<T> xr3Var : xr3VarArr) {
                    arrayList.add(xr3Var.p());
                }
                qw1Var.resumeWith(arrayList);
            }
        }
    }

    public final class b implements gw1 {
        public final g61<T>.a[] a;

        public b(a[] aVarArr) {
            this.a = aVarArr;
        }

        public final void a() {
            for (g61<T>.a aVar : this.a) {
                o74 o74Var = aVar.f;
                if (o74Var == null) {
                    wl7.g("handle");
                    throw null;
                }
                o74Var.dispose();
            }
        }

        @Override // defpackage.gw1
        public final void b(Throwable th) {
            a();
        }

        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.a + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g61(xr3<? extends T>[] xr3VarArr) {
        this.a = xr3VarArr;
        this.notCompletedCount$volatile = xr3VarArr.length;
    }

    public final Object a(c1f c1fVar) {
        qw1 qw1Var = new qw1(1, ewa.v(c1fVar));
        qw1Var.q();
        xr3<T>[] xr3VarArr = this.a;
        int length = xr3VarArr.length;
        a[] aVarArr = new a[length];
        for (int i = 0; i < length; i++) {
            xr3<T> xr3Var = xr3VarArr[i];
            xr3Var.start();
            a aVar = new a(qw1Var);
            aVar.f = u63.T(xr3Var, aVar);
            j6g j6gVar = j6g.a;
            aVarArr[i] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            a aVar2 = aVarArr[i2];
            aVar2.getClass();
            a.W.set(aVar2, bVar);
        }
        if (qw1Var.x()) {
            bVar.a();
        } else {
            qw1Var.u(bVar);
        }
        return qw1Var.p();
    }
}
