package defpackage;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zq implements e.b {
    public final /* synthetic */ int a;

    public /* synthetic */ zq(int i) {
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
                String str = (dVarK == null || (kVar2 = dVarK.b) == null) ? null : kVar2.X;
                boolean zB = wl7.b(str, "LANGUAGE_NAME");
                gr grVar = gr.b;
                gr grVar2 = gr.a;
                gr grVar3 = zB ? grVar2 : wl7.b(str, "PROFICIENCY") ? grVar : null;
                String str2 = kVar.X;
                if (wl7.b(str2, "LANGUAGE_NAME")) {
                    grVar = grVar2;
                } else if (!wl7.b(str2, "PROFICIENCY")) {
                    grVar = null;
                }
                if (grVar3 != null) {
                    dg3.i(dg3.b(rxbVar, "profile-tab-add-language", grVar3, null, 8));
                }
                dg3.f(dg3.b(rxbVar, "profile-tab-add-language", grVar, null, 8), bs4Var);
                break;
            case 1:
                kVar.getClass();
                d dVarK2 = eVar.k();
                String str3 = (dVarK2 == null || (kVar3 = dVarK2.b) == null) ? null : kVar3.X;
                boolean zB2 = wl7.b(str3, "TITLE");
                fg4 fg4Var = fg4.b;
                fg4 fg4Var2 = fg4.a;
                fg4 fg4Var3 = zB2 ? fg4Var2 : wl7.b(str3, "STATE_SELECTOR") ? fg4Var : null;
                String str4 = kVar.X;
                if (wl7.b(str4, "TITLE")) {
                    fg4Var = fg4Var2;
                } else if (!wl7.b(str4, "STATE_SELECTOR")) {
                    fg4Var = null;
                }
                if (fg4Var3 != null) {
                    eg4.b(fg4Var3);
                }
                if (fg4Var != null) {
                    dg3.f(dg3.b(rxbVar, "profile-tab-edit-accounting-license", fg4Var, null, 8), bs4Var);
                }
                break;
            default:
                kVar.getClass();
                d dVarK3 = eVar.k();
                String str5 = (dVarK3 == null || (kVar4 = dVarK3.b) == null) ? null : kVar4.X;
                boolean zB3 = wl7.b(str5, "LANGUAGE_EDIT_HOME");
                qj4 qj4Var = qj4.b;
                qj4 qj4Var2 = qj4.a;
                qj4 qj4Var3 = zB3 ? qj4Var2 : wl7.b(str5, "LANGUAGE_NAME") ? qj4Var : null;
                String str6 = kVar.X;
                if (wl7.b(str6, "LANGUAGE_EDIT_HOME")) {
                    qj4Var = qj4Var2;
                } else if (!wl7.b(str6, "LANGUAGE_NAME")) {
                    qj4Var = null;
                }
                if (qj4Var3 != null) {
                    dg3.i(dg3.b(rxbVar, "profile-tab-edit-language", qj4Var3, null, 8));
                }
                dg3.f(dg3.b(rxbVar, "profile-tab-edit-language", qj4Var, null, 8), bs4Var);
                break;
        }
    }
}
