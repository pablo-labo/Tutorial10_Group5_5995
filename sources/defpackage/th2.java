package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class th2 implements wu5 {
    public final /* synthetic */ int a;

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (!bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    bVar.D();
                }
                break;
            default:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    x2b x2bVarA = z2b.a(R.drawable.share_icon, 0, bVar2);
                    e.a aVar = e.a.b;
                    f17.a(x2bVarA, null, g.n(aVar, 22.0f), null, null, 0.0f, null, bVar2, 432, 120);
                    jh2.f(bVar2, g.r(aVar, 8.0f));
                    String strI = ak2.I(R.string.share_hired_share_button, bVar2);
                    fif.b(strI, null, eu6.c, strI.length() > 8 ? hh2.t(13) : hh2.t(16), to5.d0, null, 0L, null, null, hh2.t(18), 0, false, 2, 0, null, null, bVar2, 196608, 3078, 121810);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
