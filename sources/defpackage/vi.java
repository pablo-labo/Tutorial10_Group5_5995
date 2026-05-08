package defpackage;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vi implements e.b {
    public final /* synthetic */ int a;

    public /* synthetic */ vi(int i) {
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
                io4 io4VarB = mj.b((dVarK == null || (kVar2 = dVarK.b) == null) ? null : kVar2.X);
                io4 io4VarB2 = mj.b(kVar.X);
                if (io4VarB != null) {
                    mj.c(io4VarB);
                }
                dg3.f(dg3.b(rxbVar, "profile-tab-add-education", io4VarB2, null, 8), bs4Var);
                break;
            default:
                kVar.getClass();
                d dVarK2 = eVar.k();
                i2h i2hVarB = hz.b((dVarK2 == null || (kVar3 = dVarK2.b) == null) ? null : kVar3.X);
                i2h i2hVarB2 = hz.b(kVar.X);
                if (i2hVarB != null) {
                    hz.c(i2hVarB);
                }
                if (i2hVarB2 != null) {
                    dg3.f(dg3.b(rxbVar, "profile-tab-add-work-experience", i2hVarB2, null, 8), bs4Var);
                }
                break;
        }
    }
}
