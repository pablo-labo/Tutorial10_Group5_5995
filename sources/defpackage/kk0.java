package defpackage;

import androidx.credentials.exceptions.GetCredentialException;
import defpackage.o7d;

/* JADX INFO: loaded from: classes3.dex */
public final class kk0 implements n8, t63 {
    public final /* synthetic */ qw1 a;

    @Override // defpackage.t63
    public void a(Object obj) {
        GetCredentialException getCredentialException = (GetCredentialException) obj;
        getCredentialException.getClass();
        qw1 qw1Var = this.a;
        if (qw1Var.v()) {
            qw1Var.resumeWith(new o7d.a(getCredentialException));
        }
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        qw1 qw1Var = this.a;
        if (qw1Var.v()) {
            qw1Var.resumeWith(obj);
        }
    }

    @Override // defpackage.t63
    public void onResult(Object obj) {
        d06 d06Var = (d06) obj;
        d06Var.getClass();
        qw1 qw1Var = this.a;
        if (qw1Var.v()) {
            qw1Var.resumeWith(d06Var);
        }
    }
}
