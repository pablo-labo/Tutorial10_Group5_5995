package defpackage;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ck4 implements e.b {
    @Override // androidx.navigation.e.b
    public final void onDestinationChanged(e eVar, k kVar, Bundle bundle) {
        k kVar2;
        kVar.getClass();
        d dVarK = eVar.k();
        pt9 pt9VarB = fk4.b((dVarK == null || (kVar2 = dVarK.b) == null) ? null : kVar2.X);
        pt9 pt9VarB2 = fk4.b(kVar.X);
        if (pt9VarB != null) {
            fk4.c(pt9VarB);
        }
        if (pt9VarB2 != null) {
            dg3.f(dg3.b(rxb.a, "profile-tab-edit-military-experience", pt9VarB2, null, 8), bs4.a);
        }
    }
}
