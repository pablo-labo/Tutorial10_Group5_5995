package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ln4 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ ln4(int i, gu5 gu5Var) {
        this.a = i;
        this.b = gu5Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        gu5 gu5Var = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    h82.a(gu5Var, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    cyb.a(gu5Var, bVar2, 0);
                } else {
                    bVar2.D();
                }
                break;
            default:
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    nof.c(this.b, R.drawable.ic_idl_close_24, fv6.W1, ak2.I(R.string.desc_close, bVar3), "DetailsCloseButton", null, bVar3, 24960, 96);
                } else {
                    bVar3.D();
                }
                break;
        }
        return j6g.a;
    }
}
