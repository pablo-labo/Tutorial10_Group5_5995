package defpackage;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yh4 implements e.b {
    @Override // androidx.navigation.e.b
    public final void onDestinationChanged(e eVar, k kVar, Bundle bundle) {
        k kVar2;
        kVar.getClass();
        d dVarK = eVar.k();
        String str = (dVarK == null || (kVar2 = dVarK.b) == null) ? null : kVar2.X;
        boolean zB = wl7.b(str, "LICENSE_TYPE_SELECTOR");
        fi4 fi4Var = fi4.b;
        fi4 fi4Var2 = fi4.a;
        fi4 fi4Var3 = zB ? fi4Var2 : wl7.b(str, "STATE_SELECTOR") ? fi4Var : null;
        String str2 = kVar.X;
        if (wl7.b(str2, "LICENSE_TYPE_SELECTOR")) {
            fi4Var = fi4Var2;
        } else if (!wl7.b(str2, "STATE_SELECTOR")) {
            fi4Var = null;
        }
        if (fi4Var3 != null) {
            ei4.b(fi4Var3);
        }
        if (fi4Var != null) {
            dg3.f(dg3.b(rxb.a, "profile-tab-edit-accounting-license", fi4Var, null, 8), bs4.a);
        }
    }
}
