package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.g;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import defpackage.c00;
import defpackage.e09;
import defpackage.f09;
import defpackage.goa;
import defpackage.keh;
import defpackage.loe;
import defpackage.pa6;
import defpackage.qdh;
import defpackage.r6;
import defpackage.zv8;
import java.lang.reflect.Modifier;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public class SignInHubActivity extends g {
    public static boolean u0 = false;
    public boolean p0 = false;
    public SignInConfiguration q0;
    public boolean r0;
    public int s0;
    public Intent t0;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.g, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.p0) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.b) != null) {
                keh kehVarA = keh.a(this);
                GoogleSignInOptions googleSignInOptions = this.q0.b;
                synchronized (kehVarA) {
                    kehVarA.a.c(googleSignInAccount, googleSignInOptions);
                    kehVarA.b = googleSignInAccount;
                    kehVarA.c = googleSignInOptions;
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.r0 = true;
                this.s0 = i2;
                this.t0 = intent;
                w();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                y(intExtra);
                return;
            }
        }
        y(8);
    }

    @Override // androidx.fragment.app.g, androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            y(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.q0 = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.r0 = z;
            if (z) {
                this.s0 = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                intent2.getClass();
                this.t0 = intent2;
                w();
                return;
            }
            return;
        }
        if (u0) {
            setResult(0);
            y(12502);
            return;
        }
        u0 = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.q0);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.p0 = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            y(17);
        }
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        u0 = false;
    }

    @Override // androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.r0);
        if (this.r0) {
            bundle.putInt("signInResultCode", this.s0);
            bundle.putParcelable("signInResultData", this.t0);
        }
    }

    public final void w() {
        f09 f09VarA = e09.a(this);
        c00 c00Var = new c00(this);
        zv8 zv8Var = f09VarA.a;
        f09.c cVar = f09VarA.b;
        boolean z = cVar.c;
        loe<f09.a> loeVar = cVar.b;
        if (z) {
            r6.g("Called while creating a loader");
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            r6.g("initLoader must be called on the main thread");
            return;
        }
        f09.a aVarE = loeVar.e(0);
        if (aVarE == null) {
            try {
                cVar.c = true;
                Set set = pa6.a;
                synchronized (set) {
                }
                qdh qdhVar = new qdh(this, set);
                if (qdh.class.isMemberClass() && !Modifier.isStatic(qdh.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + qdhVar);
                }
                f09.a aVar = new f09.a(qdhVar);
                loeVar.g(0, aVar);
                cVar.c = false;
                f09.b<D> bVar = new f09.b<>(aVar.l, c00Var);
                aVar.e(zv8Var, bVar);
                goa goaVar = aVar.n;
                if (goaVar != null) {
                    aVar.i(goaVar);
                }
                aVar.m = zv8Var;
                aVar.n = bVar;
            } catch (Throwable th) {
                cVar.c = false;
                throw th;
            }
        } else {
            f09.b<D> bVar2 = new f09.b<>(aVarE.l, c00Var);
            aVarE.e(zv8Var, bVar2);
            goa goaVar2 = aVarE.n;
            if (goaVar2 != null) {
                aVarE.i(goaVar2);
            }
            aVarE.m = zv8Var;
            aVarE.n = bVar2;
        }
        u0 = false;
    }

    public final void y(int i) {
        Status status = new Status(i, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        u0 = false;
    }
}
