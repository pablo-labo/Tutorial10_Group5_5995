package defpackage;

import android.os.Binder;
import com.google.android.gms.auth.api.signin.RevocationBoundService;

/* JADX INFO: loaded from: classes2.dex */
public final class veh extends meh {
    public final RevocationBoundService a;

    public veh(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.a = revocationBoundService;
    }

    public final void e() {
        if (!g5g.a(this.a, Binder.getCallingUid())) {
            throw new SecurityException(bg.d(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }
}
