package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.nq7;
import defpackage.o97;
import defpackage.qq7;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uk7 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uk7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                o97 o97Var = (o97) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strI = ak2.I(R.string.cancelled, bVar);
                    o97.g gVar = o97Var.i;
                    cif.b(strI, f.j(e.a.b, 16.0f, 16.0f, 0.0f, 0.0f, 12), eu6.m, 0L, null, o97Var.f.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.f, bVar, 0, 0, 65496);
                } else {
                    bVar.D();
                }
                break;
            default:
                x8f x8fVar = (x8f) obj4;
                String str = (String) obj;
                String str2 = (String) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                str.getClass();
                try {
                    rq7 rq7Var = (rq7) cr8.p(rq7.class);
                    lr5 lr5VarU = x8fVar.requireActivity().u();
                    lr5VarU.getClass();
                    rq7Var.c(lr5VarU, new nq7.e(new qq7.f(str, str2, zBooleanValue), new xr(14)), "tare-debug-screen");
                } catch (Exception e) {
                    ((np7) cr8.p(np7.class)).c("TareDebugFragment", l5.l("openModal(interviewScheduling) error: ", e.getMessage()), false, e);
                }
                break;
        }
        return j6g.a;
    }
}
