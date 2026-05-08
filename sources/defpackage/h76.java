package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h76 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h76(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                g4a g4aVar = (g4a) obj4;
                pb2 pb2Var = (pb2) obj;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= bVar.K(pb2Var) ? 4 : 2;
                }
                if (bVar.o(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ((wu5) g4aVar.getValue()).q(pb2Var, bVar, Integer.valueOf(iIntValue & 14));
                } else {
                    bVar.D();
                }
                break;
            case 1:
                t7b t7bVar = (t7b) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (!bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    bVar2.D();
                } else if (t7bVar.k) {
                    bVar2.L(-768420039);
                    z2c.a(3.0f, 1, 438, 0, da2.e, da2.b(eu6.k, 0.25f), bVar2, g.n(e.a.b, 24.0f));
                    bVar2.F();
                } else {
                    bVar2.L(-767959286);
                    cif.b(ak2.I(R.string.schedule_interview, bVar2), null, da2.e, 0L, null, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, hz6.g, bVar2, 384, 0, 65018);
                    bVar2.F();
                }
                break;
            default:
                gu5 gu5Var = (gu5) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    q9f.e(6, gu5Var, bVar3, "Profile");
                } else {
                    bVar3.D();
                }
                break;
        }
        return j6g.a;
    }
}
