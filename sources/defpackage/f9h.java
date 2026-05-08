package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import defpackage.pa6;
import defpackage.vf0;

/* JADX INFO: loaded from: classes2.dex */
public final class f9h extends vf0.a {
    @Override // vf0.a
    public final vf0.f a(Context context, Looper looper, w72 w72Var, Object obj, pa6.a aVar, pa6.b bVar) {
        w72Var.getClass();
        Integer num = w72Var.h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", w72Var.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new xee(context, looper, w72Var, bundle, aVar, bVar);
    }
}
