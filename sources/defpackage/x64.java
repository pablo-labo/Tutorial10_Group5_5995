package defpackage;

import defpackage.ex7;
import defpackage.o7d;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x64<T> extends naf {
    public int c;

    public x64(int i) {
        this.c = i;
    }

    public void b(CancellationException cancellationException) {
    }

    public abstract lu2<T> c();

    public Throwable e(Object obj) {
        rf2 rf2Var = obj instanceof rf2 ? (rf2) obj : null;
        if (rf2Var != null) {
            return rf2Var.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T f(Object obj) {
        return obj;
    }

    public final void h(Throwable th) {
        b13.a(c().getContext(), new j13("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            lu2<T> lu2VarC = c();
            lu2VarC.getClass();
            v64 v64Var = (v64) lu2VarC;
            pu2 pu2Var = v64Var.e;
            Object obj = v64Var.V;
            v03 context = pu2Var.getContext();
            Object objC = rkf.c(context, obj);
            ex7 ex7Var = null;
            z5g<?> z5gVarC = objC != rkf.a ? x03.c(pu2Var, context, objC) : null;
            try {
                v03 context2 = pu2Var.getContext();
                Object objI = i();
                Throwable thE = e(objI);
                if (thE == null) {
                    int i = this.c;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        ex7Var = (ex7) context2.h1(ex7.a.a);
                    }
                }
                if (ex7Var != null && !ex7Var.isActive()) {
                    CancellationException cancellationExceptionG = ex7Var.G();
                    b(cancellationExceptionG);
                    pu2Var.resumeWith(r7d.a(cancellationExceptionG));
                } else if (thE != null) {
                    pu2Var.resumeWith(new o7d.a(thE));
                } else {
                    pu2Var.resumeWith(f(objI));
                }
                j6g j6gVar = j6g.a;
                if (z5gVarC == null || z5gVarC.p0()) {
                    rkf.a(context, objC);
                }
            } catch (Throwable th) {
                if (z5gVarC == null || z5gVarC.p0()) {
                    rkf.a(context, objC);
                }
                throw th;
            }
        } catch (DispatchException e) {
            b13.a(c().getContext(), e.getCause());
        } catch (Throwable th2) {
            h(th2);
        }
    }
}
