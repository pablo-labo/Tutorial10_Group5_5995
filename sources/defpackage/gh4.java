package defpackage;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gh4 implements e.b {
    public final /* synthetic */ int a;

    public /* synthetic */ gh4(int i) {
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
                String str = (dVarK == null || (kVar2 = dVarK.b) == null) ? null : kVar2.X;
                boolean zB = wl7.b(str, "HOME");
                ph4 ph4Var = ph4.b;
                ph4 ph4Var2 = ph4.a;
                ph4 ph4Var3 = zB ? ph4Var2 : wl7.b(str, "TITLE") ? ph4Var : null;
                String str2 = kVar.X;
                if (wl7.b(str2, "HOME")) {
                    ph4Var = ph4Var2;
                } else if (!wl7.b(str2, "TITLE")) {
                    ph4Var = null;
                }
                if (ph4Var3 != null) {
                    dg3.i(dg3.b(rxbVar, "profile-tab-edit-certification", ph4Var3, null, 8));
                }
                dg3.f(dg3.b(rxbVar, "profile-tab-edit-certification", ph4Var, null, 8), bs4Var);
                break;
            default:
                kVar.getClass();
                d dVarK2 = eVar.k();
                String str3 = (dVarK2 == null || (kVar3 = dVarK2.b) == null) ? null : kVar3.X;
                boolean zB2 = wl7.b(str3, "LICENSE_TYPE_SELECTOR");
                zk4 zk4Var = zk4.b;
                zk4 zk4Var2 = zk4.a;
                zk4 zk4Var3 = zB2 ? zk4Var2 : wl7.b(str3, "STATE_SELECTOR") ? zk4Var : null;
                String str4 = kVar.X;
                if (wl7.b(str4, "LICENSE_TYPE_SELECTOR")) {
                    zk4Var = zk4Var2;
                } else if (!wl7.b(str4, "STATE_SELECTOR")) {
                    zk4Var = null;
                }
                if (zk4Var3 != null) {
                    yk4.b(zk4Var3);
                }
                if (zk4Var != null) {
                    dg3.f(dg3.b(rxbVar, "profile-tab-edit-accounting-license", zk4Var, null, 8), bs4Var);
                }
                break;
        }
    }
}
