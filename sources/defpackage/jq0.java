package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.jobsearch.R;
import defpackage.o97;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jq0 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jq0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        e.a aVar = e.a.b;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String string = context.getString(R.string.Past14days);
                    string.getClass();
                    qq0.f(string, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                o97 o97Var = (o97) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x2b x2bVarA = z2b.a(R.drawable.ic_grabber, 0, bVar2);
                    e eVarF = g.f(aVar, 1.0f);
                    o97.g gVar = o97Var.i;
                    f17.a(x2bVarA, null, f.a(androidx.compose.foundation.layout.f.f(eVarF, 4.0f), "GrabberIcon"), null, null, 0.0f, null, bVar2, 48, 120);
                } else {
                    bVar2.D();
                }
                break;
            default:
                t7b t7bVar = (t7b) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (!bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    bVar3.D();
                } else if (t7bVar.l) {
                    bVar3.L(1929260604);
                    z2c.a(3.0f, 1, 438, 0, pnb.g(4280637351L), da2.b(eu6.k, 0.25f), bVar3, g.n(aVar, 24.0f));
                    bVar3.F();
                } else {
                    bVar3.L(1929727340);
                    cif.b(ak2.I(R.string.decline_interview, bVar3), null, eu6.c, 0L, null, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, hz6.g, bVar3, 0, 0, 65018);
                    bVar3.F();
                }
                break;
        }
        return j6g.a;
    }
}
