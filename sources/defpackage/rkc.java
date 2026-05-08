package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.bridge.ReactContext;
import defpackage.kbc;

/* JADX INFO: loaded from: classes2.dex */
public interface rkc {
    ReactContext a();

    qoc b(Context context, String str, Bundle bundle);

    void c(kbc.d dVar);

    maf d(String str);

    /* JADX INFO: renamed from: e */
    w24 getH();

    boolean f();

    void g(Context context);

    void h(Activity activity);

    void i(Activity activity);

    void j(kbc.d dVar);

    void k(Activity activity);

    void l(Activity activity, tn3 tn3Var);

    void onActivityResult(Activity activity, int i, int i2, Intent intent);

    void onHostPause();

    void onNewIntent(Intent intent);

    void onWindowFocusChange(boolean z);

    maf start();
}
