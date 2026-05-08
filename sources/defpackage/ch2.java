package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ch2 implements wu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ ch2(int i) {
        this.a = i;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    f17.a(z2b.a(R.drawable.ai_messaging_promo_stars, 0, bVar), null, null, null, null, 0.0f, null, bVar, 48, 124);
                } else {
                    bVar.D();
                }
                break;
            case 1:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    x2b x2bVarA = z2b.a(R.drawable.download_icon, 0, bVar2);
                    e.a aVar = e.a.b;
                    f17.a(x2bVarA, null, g.n(aVar, 22.0f), null, null, 0.0f, null, bVar2, 432, 120);
                    jh2.f(bVar2, g.r(aVar, 8.0f));
                    String strI = ak2.I(R.string.share_hired_download_button, bVar2);
                    fif.b(strI, null, eu6.c, strI.length() > 8 ? hh2.t(13) : hh2.t(16), to5.d0, null, 0L, null, null, hh2.t(18), 0, false, 2, 0, null, null, bVar2, 196608, 3078, 121810);
                } else {
                    bVar2.D();
                }
                break;
            case 2:
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (!bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    bVar3.D();
                }
                break;
            default:
                b bVar4 = (b) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (!bVar4.o(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    bVar4.D();
                }
                break;
        }
        return j6g.a;
    }
}
