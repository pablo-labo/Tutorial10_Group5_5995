package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import defpackage.rya;
import defpackage.w2h;
import defpackage.z39;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = z39.f("ConstrntProxyUpdtRecvr");

    public class a implements Runnable {
        public final /* synthetic */ Intent a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ BroadcastReceiver.PendingResult c;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.a = intent;
            this.b = context;
            this.c = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.c;
            Context context = this.b;
            Intent intent = this.a;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                z39.d().a(ConstraintProxyUpdateReceiver.a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                rya.a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                rya.a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                rya.a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                rya.a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            w2h.a(context).d.a(new a(intent, context, goAsync()));
            return;
        }
        z39.d().a(a, "Ignoring unknown action " + action);
    }
}
