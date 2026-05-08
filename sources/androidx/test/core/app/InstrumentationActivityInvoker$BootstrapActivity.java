package androidx.test.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.test.internal.platform.ThreadChecker;
import androidx.test.internal.util.Checks;
import defpackage.l5;

/* JADX INFO: loaded from: classes.dex */
public class InstrumentationActivityInvoker$BootstrapActivity extends Activity {
    public final BroadcastReceiver a = new BroadcastReceiver() { // from class: androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity.1
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            InstrumentationActivityInvoker$BootstrapActivity instrumentationActivityInvoker$BootstrapActivity = InstrumentationActivityInvoker$BootstrapActivity.this;
            instrumentationActivityInvoker$BootstrapActivity.finishActivity(0);
            instrumentationActivityInvoker$BootstrapActivity.finish();
        }
    };
    public boolean b;

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            Intent intent2 = new Intent("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_RECEIVED");
            intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_CODE_KEY", i2);
            if (intent != null) {
                intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_DATA_KEY", intent);
            }
            sendBroadcast(intent2);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IntentFilter intentFilter = new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_BOOTSTRAP_ACTIVITY");
        int i = Build.VERSION.SDK_INT;
        BroadcastReceiver broadcastReceiver = this.a;
        if (i < 33) {
            registerReceiver(broadcastReceiver, intentFilter);
        } else {
            registerReceiver(broadcastReceiver, intentFilter, 2);
        }
        this.b = bundle != null && bundle.getBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", false);
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.a);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.b) {
            return;
        }
        this.b = true;
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("androidx.test.core.app.InstrumentationActivityInvoker.START_TARGET_ACTIVITY_INTENT_KEY");
        ThreadChecker threadChecker = Checks.a;
        pendingIntent.getClass();
        Bundle bundleExtra = getIntent().getBundleExtra("androidx.test.core.app.InstrumentationActivityInvoker.TARGET_ACTIVITY_OPTIONS_BUNDLE_KEY");
        try {
            if (bundleExtra != null) {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 268435456, 0, 0, bundleExtra);
            } else {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 268435456, 0, 0);
            }
        } catch (IntentSender.SendIntentException e) {
            Log.e("androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity", "Failed to start target activity.", e);
            l5.r(e);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", this.b);
    }
}
