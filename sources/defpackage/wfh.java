package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wfh extends zoh {
    public final int d;
    public final Bundle e;
    public final /* synthetic */ g91 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfh(g91 g91Var, int i, Bundle bundle) {
        super(g91Var);
        this.f = g91Var;
        this.d = i;
        this.e = bundle;
    }

    @Override // defpackage.zoh
    public final void a(Object obj) {
        g91 g91Var = this.f;
        int i = this.d;
        if (i != 0) {
            g91Var.p(1, null);
            Bundle bundle = this.e;
            c(new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
        } else {
            if (b()) {
                return;
            }
            g91Var.p(1, null);
            c(new ConnectionResult(8, null, null));
        }
    }

    public abstract boolean b();

    public abstract void c(ConnectionResult connectionResult);
}
