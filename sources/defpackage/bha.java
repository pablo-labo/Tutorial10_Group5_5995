package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes.dex */
public final class bha {
    public static final String a = z39.f("NetworkStateTracker");

    public static final yga a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilitiesA;
        connectivityManager.getClass();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilitiesA = hfa.a(connectivityManager, ifa.a(connectivityManager));
        } catch (SecurityException e) {
            z39.d().c(a, "Unable to validate active network", e);
        }
        boolean zB = networkCapabilitiesA != null ? hfa.b(networkCapabilitiesA, 16) : false;
        return new yga(z, zB, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
