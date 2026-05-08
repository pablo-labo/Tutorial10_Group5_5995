package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.iid.FirebaseInstanceId;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class mlh extends BroadcastReceiver {
    public plh a;

    public final void a() {
        ikh ikhVar = FirebaseInstanceId.i;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        plh plhVar = this.a;
        if (plhVar == null) {
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) plhVar.a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
        }
        FirebaseInstanceId.d(this.a, 0L);
        this.a.a().unregisterReceiver(this);
        this.a = null;
    }
}
