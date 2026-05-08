package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hi2 implements wu5 {
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((fhd) obj).getClass();
        if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
            fif.b(ak2.I(R.string.common_cancel, bVar), f.a(androidx.compose.foundation.layout.f.h(e.a.b, 0.0f, 5.0f, 1), "CancelButtonText"), eu6.c, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, hz6.g, bVar, 48, 0, 65528);
        } else {
            bVar.D();
        }
        return j6g.a;
    }
}
