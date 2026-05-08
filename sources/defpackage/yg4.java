package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yg4 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yg4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj5;
                g4a g4aVar = (g4a) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String str2 = (String) g4aVar.getValue();
                    Object objV = bVar.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (objV == c0020a) {
                        objV = new sg4(0, g4aVar);
                        bVar.p(objV);
                    }
                    Function1 function1 = (Function1) objV;
                    String strI = ak2.I(R.string.title, bVar);
                    Object objV2 = bVar.v();
                    if (objV2 == c0020a) {
                        objV2 = new pg0(2, g4aVar);
                        bVar.p(objV2);
                    }
                    jyb.a(str2, function1, strI, true, str, false, null, null, (gu5) objV2, true, null, "EditAwardTitle", null, null, null, bVar, 905972784, 48, 29920);
                } else {
                    bVar.D();
                }
                break;
            default:
                gu5 gu5Var = (gu5) obj5;
                gu5 gu5Var2 = (gu5) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nj6.b(gu5Var, bVar2, 0);
                    if (((h2g) cr8.p(h2g.class)).a()) {
                        bVar2.L(1350429592);
                        nof.c(gu5Var2, R.drawable.ic_idl_profile_24, fv6.o7, ak2.I(R.string.bottom_nav_top_bar_title_profile, bVar2), "TopNavProfileButton", null, bVar2, 24960, 96);
                    } else {
                        bVar2.L(1341088889);
                    }
                    bVar2.F();
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
