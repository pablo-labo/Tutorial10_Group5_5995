package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ljc extends wi0 implements tn3, f8b {
    public final a r0 = new a();
    public final njc q0 = new njc(this, (String) null);

    public class a extends wpa {
        public a() {
            super(true);
        }

        @Override // defpackage.wpa
        public final void b() {
            f(false);
            ljc.this.onBackPressed();
            f(true);
        }
    }

    @Override // defpackage.tn3
    public final void a() {
        this.r0.f(false);
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.g, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.q0.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.q0.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // defpackage.wi0, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.q0.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.g, androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.q0.onCreate(bundle);
        if (Build.VERSION.SDK_INT < 36 || getApplicationInfo().targetSdkVersion < 36) {
            return;
        }
        r().a(this, this.r0);
    }

    @Override // defpackage.wi0, androidx.fragment.app.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.q0.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.q0.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.q0.onKeyLongPress(i, keyEvent) || super.onKeyLongPress(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.q0.onKeyUp(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        if (this.q0.onNewIntent(intent)) {
            return;
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.q0.onPause();
    }

    @Override // androidx.fragment.app.g, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.q0.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.q0.onResume();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        this.q0.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.q0.onWindowFocusChanged(z);
    }

    @Override // defpackage.f8b
    public final void x(String[] strArr, int i, g8b g8bVar) {
        this.q0.requestPermissions(strArr, i, g8bVar);
    }
}
