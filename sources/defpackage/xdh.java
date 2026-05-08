package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class xdh extends tch {
    public final /* synthetic */ zdh a;

    public xdh(zdh zdhVar) {
        this.a = zdhVar;
    }

    @Override // defpackage.tch, defpackage.reh
    public final void E(GoogleSignInAccount googleSignInAccount, Status status) {
        zdh zdhVar = this.a;
        if (googleSignInAccount != null) {
            keh kehVarA = keh.a(zdhVar.k);
            GoogleSignInOptions googleSignInOptions = zdhVar.l;
            synchronized (kehVarA) {
                kehVarA.a.c(googleSignInAccount, googleSignInOptions);
                kehVarA.b = googleSignInAccount;
                kehVarA.c = googleSignInOptions;
            }
        }
        zdhVar.f(new fb6(googleSignInAccount, status));
    }
}
