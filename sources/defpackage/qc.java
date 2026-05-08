package defpackage;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qc implements e.b {
    public final /* synthetic */ int a;

    public /* synthetic */ qc(int i) {
        this.a = i;
    }

    @Override // androidx.navigation.e.b
    public final void onDestinationChanged(e eVar, k kVar, Bundle bundle) {
        k kVar2;
        k kVar3;
        k kVar4;
        int i = this.a;
        bs4 bs4Var = bs4.a;
        rxb rxbVar = rxb.a;
        switch (i) {
            case 0:
                kVar.getClass();
                d dVarK = eVar.k();
                bd bdVarB = ad.b((dVarK == null || (kVar2 = dVarK.b) == null) ? null : kVar2.X);
                bd bdVarB2 = ad.b(kVar.X);
                if (bdVarB != null) {
                    ad.c(bdVarB);
                }
                dg3.f(dg3.b(rxbVar, "profile-tab-add-groups", bdVarB2, null, 8), bs4Var);
                break;
            case 1:
                kVar.getClass();
                d dVarK2 = eVar.k();
                gv gvVarB = fv.b((dVarK2 == null || (kVar3 = dVarK2.b) == null) ? null : kVar3.X);
                gv gvVarB2 = fv.b(kVar.X);
                if (gvVarB != null) {
                    fv.c(gvVarB);
                }
                dg3.f(dg3.b(rxbVar, "profile-tab-add-patent", gvVarB2, null, 8), bs4Var);
                break;
            default:
                kVar.getClass();
                d dVarK3 = eVar.k();
                i2h i2hVarB = yn4.b((dVarK3 == null || (kVar4 = dVarK3.b) == null) ? null : kVar4.X);
                i2h i2hVarB2 = yn4.b(kVar.X);
                if (i2hVarB != null) {
                    yn4.c(i2hVarB);
                }
                if (i2hVarB2 != null) {
                    dg3.f(dg3.b(rxbVar, "profile-tab-edit-work-experience", i2hVarB2, null, 8), bs4Var);
                }
                break;
        }
    }
}
