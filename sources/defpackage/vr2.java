package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vr2 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ vr2(int i, gu5 gu5Var) {
        this.a = i;
        this.b = gu5Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        gu5 gu5Var = this.b;
        e.a aVar = e.a.b;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    fv6 fv6Var = fv6.o0;
                    e eVarA = f.a(aVar, "ContactInformationBackArrow");
                    boolean zK = bVar.K(gu5Var);
                    Object objV = bVar.v();
                    if (zK || objV == b.a.a) {
                        objV = new mg(2, gu5Var);
                        bVar.p(objV);
                    }
                    ev6.b(fv6Var, androidx.compose.foundation.b.d(eVarA, false, null, null, (gu5) objV, 15), null, null, 0L, null, bVar, 6, 60);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nof.a(gu5Var, bVar2, 48);
                } else {
                    bVar2.D();
                }
                break;
            default:
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    gt6.l(fv6.W1, this.b, f.a(aVar, "ResumePreviewBackButton"), ak2.I(R.string.desc_close, bVar3), null, bVar3, 390, 240);
                } else {
                    bVar3.D();
                }
                break;
        }
        return j6g.a;
    }
}
