package defpackage;

import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p99 implements e.b {
    @Override // androidx.navigation.e.b
    public final void onDestinationChanged(e eVar, k kVar, Bundle bundle) {
        k kVar2;
        kVar.getClass();
        d dVarK = eVar.k();
        ba9 ba9VarB = aa9.b((dVarK == null || (kVar2 = dVarK.b) == null) ? null : kVar2.X);
        ba9 ba9VarB2 = aa9.b(kVar.X);
        if (ba9VarB != null) {
            aa9.c(ba9VarB);
        }
        dg3.f(dg3.b(rxb.a, "profile-tab-manage-language", ba9VarB2, null, 8), bs4.a);
    }
}
