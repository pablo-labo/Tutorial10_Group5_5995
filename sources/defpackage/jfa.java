package defpackage;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class jfa {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.getClass();
        networkCallback.getClass();
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
