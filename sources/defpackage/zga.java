package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class zga extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ aha a;

    public zga(aha ahaVar) {
        this.a = ahaVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        z39.d().a(bha.a, "Network capabilities changed: " + networkCapabilities);
        aha ahaVar = this.a;
        ahaVar.c(bha.a(ahaVar.f));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        z39.d().a(bha.a, "Network connection lost");
        aha ahaVar = this.a;
        ahaVar.c(bha.a(ahaVar.f));
    }
}
