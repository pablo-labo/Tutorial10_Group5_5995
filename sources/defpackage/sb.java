package defpackage;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sb implements e.b {
    @Override // androidx.navigation.e.b
    public final void onDestinationChanged(e eVar, k kVar, Bundle bundle) {
        k kVar2;
        kVar.getClass();
        d dVarK = eVar.k();
        wb wbVarB = vb.b((dVarK == null || (kVar2 = dVarK.b) == null) ? null : kVar2.X);
        wb wbVarB2 = vb.b(kVar.X);
        if (wbVarB != null) {
            vb.c(wbVarB);
        }
        dg3.f(dg3.b(rxb.a, "profile-tab-add-accounting-license", wbVarB2, null, 8), bs4.a);
    }
}
