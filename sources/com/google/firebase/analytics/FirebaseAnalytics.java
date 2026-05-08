package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.firebase.iid.FirebaseInstanceId;
import defpackage.fib;
import defpackage.ikh;
import defpackage.j7i;
import defpackage.mhh;
import defpackage.pf5;
import defpackage.rih;
import defpackage.voh;
import defpackage.xih;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;
    public final mhh a;

    public FirebaseAnalytics(mhh mhhVar) {
        fib.i(mhhVar);
        this.a = mhhVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(mhh.a(context, null));
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Keep
    public static j7i getScionFrontendApiImplementation(Context context, Bundle bundle) {
        mhh mhhVarA = mhh.a(context, bundle);
        if (mhhVarA == null) {
            return null;
        }
        return new voh(mhhVarA);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        ikh ikhVar = FirebaseInstanceId.i;
        FirebaseInstanceId firebaseInstanceId = FirebaseInstanceId.getInstance(pf5.c());
        pf5 pf5Var = firebaseInstanceId.b;
        FirebaseInstanceId.c(pf5Var);
        if (firebaseInstanceId.e(firebaseInstanceId.f(xih.b(pf5Var), "*"))) {
            firebaseInstanceId.i();
        }
        return firebaseInstanceId.j();
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        mhh mhhVar = this.a;
        mhhVar.getClass();
        mhhVar.c(new rih(mhhVar, activity, str, str2));
    }
}
