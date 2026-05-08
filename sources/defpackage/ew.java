package defpackage;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ew implements e.b {
    public final /* synthetic */ int a;

    public /* synthetic */ ew(int i) {
        this.a = i;
    }

    @Override // androidx.navigation.e.b
    public final void onDestinationChanged(e eVar, k kVar, Bundle bundle) {
        k kVar2;
        k kVar3;
        f78 f78Var = null;
        switch (this.a) {
            case 0:
                kVar.getClass();
                d dVarK = eVar.k();
                nw nwVarB = mw.b((dVarK == null || (kVar2 = dVarK.b) == null) ? null : kVar2.X);
                nw nwVarB2 = mw.b(kVar.X);
                if (nwVarB != null) {
                    mw.c(nwVarB);
                }
                dg3.f(dg3.b(rxb.a, "profile-tab-add-publication", nwVarB2, null, 8), bs4.a);
                break;
            default:
                kVar.getClass();
                d dVarK2 = eVar.k();
                String str = (dVarK2 == null || (kVar3 = dVarK2.b) == null) ? null : kVar3.X;
                boolean zB = wl7.b(str, "DESIRED_JOB_TITLES");
                f78 f78Var2 = f78.b;
                f78 f78Var3 = f78.a;
                f78 f78Var4 = zB ? f78Var3 : wl7.b(str, "JOB_TITLE_AUTOCOMPLETE") ? f78Var2 : null;
                String str2 = kVar.X;
                if (wl7.b(str2, "DESIRED_JOB_TITLES")) {
                    f78Var = f78Var3;
                } else if (wl7.b(str2, "JOB_TITLE_AUTOCOMPLETE")) {
                    f78Var = f78Var2;
                }
                if (f78Var4 != null) {
                    dg3.i(r78.b(f78Var4));
                }
                if (f78Var != null) {
                    if (f78Var4 != null || f78Var != f78Var3) {
                        dg3.g(r78.b(f78Var));
                    }
                }
                break;
        }
    }
}
