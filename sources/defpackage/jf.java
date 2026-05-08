package defpackage;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jf implements e.b {
    @Override // androidx.navigation.e.b
    public final void onDestinationChanged(e eVar, k kVar, Bundle bundle) {
        k kVar2;
        kVar.getClass();
        d dVarK = eVar.k();
        tf tfVarB = sf.b((dVarK == null || (kVar2 = dVarK.b) == null) ? null : kVar2.X);
        tf tfVarB2 = sf.b(kVar.X);
        if (tfVarB != null) {
            sf.c(tfVarB);
        }
        dg3.f(dg3.b(rxb.a, "profile-tab-add-certification", tfVarB2, null, 8), bs4.a);
    }
}
