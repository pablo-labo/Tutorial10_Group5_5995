package defpackage;

import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class a6g {
    public static a6g a;

    public static final Object a(vpd vpdVar, boolean z, vpd vpdVar2, Function2 function2) throws Throwable {
        Object rf2Var;
        Object objR;
        try {
            if (function2 instanceof x81) {
                pxf.d(2, function2);
                rf2Var = function2.invoke(vpdVar2, vpdVar);
            } else {
                rf2Var = ewa.Q(function2, vpdVar2, vpdVar);
            }
        } catch (DispatchException e) {
            vpdVar.O(new rf2(e.getCause(), false));
            throw e.getCause();
        } catch (Throwable th) {
            rf2Var = new rf2(th, false);
        }
        g13 g13Var = g13.a;
        if (rf2Var == g13Var || (objR = vpdVar.R(rf2Var)) == pnb.c0) {
            return g13Var;
        }
        vpdVar.n0();
        if (!(objR instanceof rf2)) {
            return pnb.R(objR);
        }
        if (!z) {
            Throwable th2 = ((rf2) objR).a;
            if ((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).a == vpdVar) {
                if (rf2Var instanceof rf2) {
                    throw ((rf2) rf2Var).a;
                }
                return rf2Var;
            }
        }
        throw ((rf2) objR).a;
    }
}
