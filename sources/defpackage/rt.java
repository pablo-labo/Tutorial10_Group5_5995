package defpackage;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rt implements e.b {
    @Override // androidx.navigation.e.b
    public final void onDestinationChanged(e eVar, k kVar, Bundle bundle) {
        k kVar2;
        kVar.getClass();
        d dVarK = eVar.k();
        tt ttVarB = st.b((dVarK == null || (kVar2 = dVarK.b) == null) ? null : kVar2.X);
        tt ttVarB2 = st.b(kVar.X);
        if (ttVarB != null) {
            st.c(ttVarB);
        }
        dg3.f(dg3.b(rxb.a, "profile-tab-add-accounting-license", ttVarB2, null, 8), bs4.a);
    }
}
