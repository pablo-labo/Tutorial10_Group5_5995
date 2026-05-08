package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.c20;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wl1 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wl1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        String str;
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                e13 e13Var = (e13) obj5;
                hw9 hw9Var = (hw9) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p37 p37VarA = i82.a();
                    String strI = ak2.I(R.string.close_button, bVar);
                    boolean zX = bVar.x(e13Var) | bVar.x(hw9Var);
                    Object objV = bVar.v();
                    if (zX || objV == c0020a) {
                        objV = new gq0(2, e13Var, hw9Var);
                        bVar.p(objV);
                    }
                    vq6.a(p37VarA, strI, androidx.compose.foundation.b.d(e.a.b, false, null, null, (gu5) objV, 15), 0L, bVar, 0, 8);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                exb exbVar = (exb) obj5;
                o97 o97Var = (o97) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ml1) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    yz7 yz7Var = exbVar.c;
                    if (yz7Var == null || (str = yz7Var.f) == null) {
                        str = "";
                    }
                    fif.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjf.a(o97Var.j.f, 0L, 0L, o97Var.f.a, null, null, 0L, 3, 0L, null, null, 0, 16744443), bVar2, 0, 0, 65534);
                } else {
                    bVar2.D();
                }
                break;
            default:
                gu5 gu5Var = (gu5) obj5;
                o97 o97Var2 = (o97) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    hza hzaVar = new hza(0.0f, 0.0f, 0.0f, 0.0f);
                    e eVarV = g.v(f.f(e.a.b, 15.0f), c20.a.d, 2);
                    boolean zK = bVar3.K(gu5Var);
                    Object objV2 = bVar3.v();
                    if (zK || objV2 == c0020a) {
                        objV2 = new mg(6, gu5Var);
                        bVar3.p(objV2);
                    }
                    sq1.c((gu5) objV2, eVarV, null, hzaVar, bh2.c(348172105, new o19(o97Var2, 1), bVar3), bVar3, 905969712, 252);
                } else {
                    bVar3.D();
                }
                break;
        }
        return j6g.a;
    }
}
