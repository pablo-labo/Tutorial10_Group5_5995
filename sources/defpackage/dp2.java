package defpackage;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"MissingPermission"})
public final class dp2 implements cp2 {
    public final ConnectivityManager b;

    public dp2(ConnectivityManager connectivityManager) {
        this.b = connectivityManager;
    }

    @Override // defpackage.cp2
    public final boolean a() {
        ConnectivityManager connectivityManager = this.b;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
