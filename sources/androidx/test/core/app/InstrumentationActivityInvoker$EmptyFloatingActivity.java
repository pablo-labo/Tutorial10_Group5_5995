package androidx.test.core.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class InstrumentationActivityInvoker$EmptyFloatingActivity extends Activity {
    public final BroadcastReceiver a = new BroadcastReceiver() { // from class: androidx.test.core.app.InstrumentationActivityInvoker$EmptyFloatingActivity.1
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            InstrumentationActivityInvoker$EmptyFloatingActivity.this.finish();
        }
    };

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IntentFilter intentFilter = new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES");
        int i = Build.VERSION.SDK_INT;
        BroadcastReceiver broadcastReceiver = this.a;
        if (i < 33) {
            registerReceiver(broadcastReceiver, intentFilter);
        } else {
            registerReceiver(broadcastReceiver, intentFilter, 2);
        }
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
        sendBroadcast(new Intent("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_FLOATING_ACTIVITY_RESUMED"));
    }
}
