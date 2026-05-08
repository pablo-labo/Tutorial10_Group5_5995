package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class fb6 implements p7d {
    public final Status a;
    public final GoogleSignInAccount b;

    public fb6(GoogleSignInAccount googleSignInAccount, Status status) {
        this.b = googleSignInAccount;
        this.a = status;
    }

    @Override // defpackage.p7d
    public final Status a() {
        return this.a;
    }
}
