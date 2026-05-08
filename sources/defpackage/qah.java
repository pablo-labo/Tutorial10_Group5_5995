package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import defpackage.pa6;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class qah extends jah implements pa6.a, pa6.b {
    public static final f9h l = xah.a;
    public final Context a;
    public final Handler b;
    public final f9h c;
    public final Set d;
    public final w72 e;
    public fbh f;
    public bah k;

    public qah(Context context, och ochVar, w72 w72Var) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.a = context;
        this.b = ochVar;
        this.e = w72Var;
        this.d = w72Var.b;
        this.c = l;
    }

    @Override // defpackage.oo2
    public final void c() {
        this.f.b(this);
    }

    @Override // defpackage.oo2
    public final void e(int i) {
        bah bahVar = this.k;
        y9h y9hVar = (y9h) bahVar.f.Y.get(bahVar.b);
        if (y9hVar != null) {
            if (y9hVar.m) {
                y9hVar.q(new ConnectionResult(17, null, null));
            } else {
                y9hVar.e(i);
            }
        }
    }

    @Override // defpackage.jqa
    public final void h(ConnectionResult connectionResult) {
        this.k.b(connectionResult);
    }
}
