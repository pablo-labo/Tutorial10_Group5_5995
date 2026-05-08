package defpackage;

import defpackage.z03;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes3.dex */
public final class b13 {
    public static final void a(v03 v03Var, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        try {
            z03 z03Var = (z03) v03Var.h1(z03.a.a);
            if (z03Var != null) {
                z03Var.N0(v03Var, th);
            } else {
                yid.f(v03Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                boa.h(runtimeException, th);
                th = runtimeException;
            }
            yid.f(v03Var, th);
        }
    }
}
