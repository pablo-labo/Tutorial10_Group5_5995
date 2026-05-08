package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes.dex */
public final class prc extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ qrc a;

    public prc(qrc qrcVar) {
        this.a = qrcVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        qrc.b(this.a, network, true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        qrc.b(this.a, network, false);
    }
}
