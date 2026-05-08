package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class jeh {
    public static final b49 a = new b49("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static void b(Context context) {
        keh.a(context).b();
        Set set = pa6.a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((pa6) it.next()).getClass();
            b0.l();
            return;
        }
        synchronized (qa6.g0) {
            try {
                qa6 qa6Var = qa6.h0;
                if (qa6Var != null) {
                    qa6Var.X.incrementAndGet();
                    och ochVar = qa6Var.c0;
                    ochVar.sendMessageAtFrontOfQueue(ochVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
