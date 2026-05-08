package defpackage;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oi4 implements e.b {
    @Override // androidx.navigation.e.b
    public final void onDestinationChanged(e eVar, k kVar, Bundle bundle) {
        k kVar2;
        kVar.getClass();
        d dVarK = eVar.k();
        aj4 aj4VarB = zi4.b((dVarK == null || (kVar2 = dVarK.b) == null) ? null : kVar2.X);
        aj4 aj4VarB2 = zi4.b(kVar.X);
        if (aj4VarB != null) {
            zi4.c(aj4VarB);
        }
        if (aj4VarB2 != null) {
            dg3.f(dg3.b(rxb.a, "profile-tab-edit-education", aj4VarB2, null, 8), bs4.a);
        }
    }
}
