package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.o97;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xl1 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xl1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ca caVar = (ca) obj5;
                gu5 gu5Var = (gu5) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    bm1.a(caVar, gu5Var, bVar, 48);
                } else {
                    bVar.D();
                }
                break;
            default:
                wj7 wj7Var = (wj7) obj5;
                o97 o97Var = (o97) obj4;
                o97.a aVar = o97Var.c;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (!bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    bVar2.D();
                } else if (wj7Var.v) {
                    bVar2.L(1794256468);
                    e eVarN = g.n(e.a.b, bkf.c(o97Var.e.d));
                    o97.a.e eVar = aVar.a;
                    z2c.a(3.0f, 1, 384, 0, eVar.d, da2.b(eVar.c, 0.25f), bVar2, eVarN);
                    bVar2.F();
                } else {
                    bVar2.L(1794836075);
                    cif.b(ak2.I(R.string.cancel_interview, bVar2), null, aVar.a.d, 0L, null, o97Var.f.c, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, o97Var.j.f, bVar2, 0, 0, 64986);
                    bVar2.F();
                }
                break;
        }
        return j6g.a;
    }
}
