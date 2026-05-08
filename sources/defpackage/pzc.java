package defpackage;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pzc implements e.b {
    @Override // androidx.navigation.e.b
    public final void onDestinationChanged(e eVar, k kVar, Bundle bundle) {
        k kVar2;
        kVar.getClass();
        d dVarK = eVar.k();
        gzc gzcVar = null;
        String str = (dVarK == null || (kVar2 = dVarK.b) == null) ? null : kVar2.X;
        boolean zB = wl7.b(str, "RELOCATION_PREFERENCE");
        gzc gzcVar2 = gzc.b;
        gzc gzcVar3 = gzc.a;
        gzc gzcVar4 = zB ? gzcVar3 : wl7.b(str, "LOCATION_AUTOCOMPLETE") ? gzcVar2 : null;
        String str2 = kVar.X;
        if (wl7.b(str2, "RELOCATION_PREFERENCE")) {
            gzcVar = gzcVar3;
        } else if (wl7.b(str2, "LOCATION_AUTOCOMPLETE")) {
            gzcVar = gzcVar2;
        }
        if (gzcVar4 != null) {
            dg3.i(szc.b(gzcVar4));
        }
        if (gzcVar != null) {
            if (gzcVar4 == null && gzcVar == gzcVar3) {
                return;
            }
            dg3.g(szc.b(gzcVar));
        }
    }
}
