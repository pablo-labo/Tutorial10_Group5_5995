package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x00 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;

    public /* synthetic */ x00(int i, gu5 gu5Var) {
        this.a = i;
        this.b = gu5Var;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        gu5 gu5Var = this.b;
        fhd fhdVar = (fhd) obj;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fhdVar.getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    h82.a(gu5Var, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                fhdVar.getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e71.a(48, gu5Var, bVar2, "ConversationHeader");
                } else {
                    bVar2.D();
                }
                break;
            case 2:
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                fhdVar.getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    if (gu5Var == null) {
                        bVar3.L(2023260661);
                    } else {
                        bVar3.L(2023260662);
                        h82.a(gu5Var, bVar3, 0);
                    }
                    bVar3.F();
                } else {
                    bVar3.D();
                }
                break;
            default:
                b bVar4 = (b) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                fhdVar.getClass();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    gu5 gu5Var2 = this.b;
                    if (gu5Var2 != null) {
                        bVar4.L(1492796672);
                        gt6.l(fv6.W3, gu5Var2, null, ak2.I(R.string.desc_hamburger_menu, bVar4), null, bVar4, 6, 244);
                    } else {
                        bVar4.L(1485599557);
                    }
                    bVar4.F();
                } else {
                    bVar4.D();
                }
                break;
        }
        return j6g.a;
    }
}
