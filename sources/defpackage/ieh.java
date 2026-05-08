package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ieh extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ieh(pa6 pa6Var) {
        super(pa6Var);
        vf0<GoogleSignInOptions> vf0Var = xy0.a;
        fib.j(pa6Var, "GoogleApiClient must not be null");
        fib.j(vf0Var, "Api must not be null");
    }
}
