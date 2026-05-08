package defpackage;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.view.View;
import android.widget.EditText;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"MissingPermission"})
public final class qrc implements oga {
    public Object a;
    public Object b;
    public Object c;

    public static final void b(qrc qrcVar, Network network, boolean z) {
        j6g j6gVar;
        boolean z2;
        Network[] allNetworks = ((ConnectivityManager) qrcVar.a).getAllNetworks();
        int length = allNetworks.length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (wl7.b(network2, network)) {
                z2 = z;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) qrcVar.a).getNetworkCapabilities(network2);
                z2 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z2) {
                z3 = true;
                break;
            }
            i++;
        }
        m2f m2fVar = (m2f) qrcVar.b;
        if (m2fVar.b.get() != null) {
            m2fVar.d = z3;
            j6gVar = j6g.a;
        } else {
            j6gVar = null;
        }
        if (j6gVar == null) {
            m2fVar.a();
        }
    }

    @Override // defpackage.oga
    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    public EditText c() {
        View viewFindViewById = ((qb3) this.a).findViewById(R.id.search_src_text);
        if (viewFindViewById instanceof EditText) {
            return (EditText) viewFindViewById;
        }
        return null;
    }

    @Override // defpackage.oga
    public void shutdown() {
        ((ConnectivityManager) this.a).unregisterNetworkCallback((prc) this.c);
    }
}
