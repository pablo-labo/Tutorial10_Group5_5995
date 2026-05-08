package defpackage;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class de implements e.b {
    public final /* synthetic */ int a;

    public /* synthetic */ de(int i) {
        this.a = i;
    }

    @Override // androidx.navigation.e.b
    public final void onDestinationChanged(e eVar, k kVar, Bundle bundle) {
        k kVar2;
        k kVar3;
        int i = this.a;
        bs4 bs4Var = bs4.a;
        rxb rxbVar = rxb.a;
        switch (i) {
            case 0:
                kVar.getClass();
                d dVarK = eVar.k();
                ke keVarB = je.b((dVarK == null || (kVar2 = dVarK.b) == null) ? null : kVar2.X);
                ke keVarB2 = je.b(kVar.X);
                if (keVarB != null) {
                    je.c(keVarB);
                }
                dg3.f(dg3.b(rxbVar, "profile-tab-add-award", keVarB2, null, 8), bs4Var);
                break;
            default:
                kVar.getClass();
                d dVarK2 = eVar.k();
                vh vhVarB = uh.b((dVarK2 == null || (kVar3 = dVarK2.b) == null) ? null : kVar3.X);
                vh vhVarB2 = uh.b(kVar.X);
                if (vhVarB != null) {
                    uh.c(vhVarB);
                }
                dg3.f(dg3.b(rxbVar, "profile-tab-add-accounting-license", vhVarB2, null, 8), bs4Var);
                break;
        }
    }
}
