package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public final class t0i extends wfh {
    public final /* synthetic */ g91 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0i(g91 g91Var, int i, Bundle bundle) {
        super(g91Var, i, bundle);
        this.g = g91Var;
    }

    @Override // defpackage.wfh
    public final boolean b() {
        this.g.j.a(ConnectionResult.f);
        return true;
    }

    @Override // defpackage.wfh
    public final void c(ConnectionResult connectionResult) {
        g91 g91Var = this.g;
        g91Var.getClass();
        g91Var.j.a(connectionResult);
        System.currentTimeMillis();
    }
}
