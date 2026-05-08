package defpackage;

import defpackage.ex7;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p1<T> extends d78 implements lu2<T>, e13 {
    public final v03 c;

    public p1(v03 v03Var, boolean z) {
        super(z);
        K((ex7) v03Var.h1(ex7.a.a));
        this.c = v03Var.d1(this);
    }

    @Override // defpackage.d78
    public final void J(CompletionHandlerException completionHandlerException) {
        b13.a(this.c, completionHandlerException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d78
    public final void V(Object obj) {
        if (!(obj instanceof rf2)) {
            i0(obj);
        } else {
            rf2 rf2Var = (rf2) obj;
            g0(rf2Var.a, rf2.b.get(rf2Var) == 1);
        }
    }

    public void g0(Throwable th, boolean z) {
    }

    @Override // defpackage.lu2
    public final v03 getContext() {
        return this.c;
    }

    @Override // defpackage.e13
    public final v03 getCoroutineContext() {
        return this.c;
    }

    public void i0(T t) {
    }

    public final void l0(i13 i13Var, p1 p1Var, Function2 function2) {
        Object objInvoke;
        int iOrdinal = i13Var.ordinal();
        if (iOrdinal == 0) {
            try {
                mh2.w(ewa.v(ewa.s(p1Var, this, function2)), j6g.a);
                return;
            } finally {
                th = th;
                if (th instanceof DispatchException) {
                    th = ((DispatchException) th).getCause();
                }
                resumeWith(r7d.a(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                function2.getClass();
                ewa.v(ewa.s(p1Var, this, function2)).resumeWith(j6g.a);
                return;
            }
            if (iOrdinal != 3) {
                l.g();
                return;
            }
            try {
                v03 v03Var = this.c;
                Object objC = rkf.c(v03Var, null);
                try {
                    if (function2 instanceof x81) {
                        pxf.d(2, function2);
                        objInvoke = function2.invoke(p1Var, this);
                    } else {
                        objInvoke = ewa.Q(function2, p1Var, this);
                    }
                    rkf.a(v03Var, objC);
                    if (objInvoke != g13.a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    rkf.a(v03Var, objC);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.lu2
    public final void resumeWith(Object obj) {
        Throwable thA = o7d.a(obj);
        if (thA != null) {
            obj = new rf2(thA, false);
        }
        Object objR = R(obj);
        if (objR == pnb.c0) {
            return;
        }
        n(objR);
    }

    @Override // defpackage.d78
    public final String x() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
