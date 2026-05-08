package defpackage;

import android.util.Log;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 2;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                v5.a((w5) obj3, (b) obj, ka2.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((bi) obj3).M(ka2.L(1), (b) obj);
                break;
            case 2:
                ((g4a) obj3).setValue(new tg3(Boolean.FALSE, (s38) obj, (Integer) obj2));
                break;
            case 3:
                break;
            case 4:
                p91 p91Var = (p91) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                qf8<Object>[] qf8VarArr = p91.i0;
                if (bVar.o(1 & iIntValue, (iIntValue & 3) != 2)) {
                    p91Var.L(0, bVar);
                } else {
                    bVar.D();
                }
                break;
            case 5:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                ((String) obj).getClass();
                ((Function1) obj3).invoke(bool);
                break;
            case 6:
                ((Integer) obj2).getClass();
                ue6.c((String) obj3, (b) obj, ka2.L(1));
                break;
            case 7:
                String str = (String) obj;
                ((Boolean) obj2).getClass();
                str.getClass();
                IanMainFragment.P((IanMainFragment) obj3, str, false, false, 6);
                break;
            case 8:
                com.indeed.android.profile.screens.sheets.profilesubtab.skills.b bVar2 = (com.indeed.android.profile.screens.sheets.profilesubtab.skills.b) obj3;
                zie zieVar = (zie) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                zieVar.getClass();
                Log.d("ManageSkillsFlowBottomSheet", "onDeleteSkill(" + zieVar + ", " + zBooleanValue + ")");
                bVar2.Q().y(bVar2.k0, zieVar, zBooleanValue);
                break;
            default:
                gu5 gu5Var = (gu5) obj3;
                b bVar3 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qi0.a(lk2.a, f.a(e.a.b, "ProfileHomeTopNav"), null, bh2.c(-1792646407, new jec(i2, gu5Var), bVar3), 0.0f, null, null, bVar3, 3126, 244);
                } else {
                    bVar3.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ s5(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
