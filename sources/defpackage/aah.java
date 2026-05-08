package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
import defpackage.vf0;

/* JADX INFO: loaded from: classes2.dex */
public final class aah implements Runnable {
    public final /* synthetic */ ConnectionResult a;
    public final /* synthetic */ bah b;

    public aah(bah bahVar, ConnectionResult connectionResult) {
        this.b = bahVar;
        this.a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        bah bahVar = this.b;
        vf0.f fVar = bahVar.a;
        y9h y9hVar = (y9h) bahVar.f.Y.get(bahVar.b);
        if (y9hVar == null) {
            return;
        }
        ConnectionResult connectionResult = this.a;
        if (!connectionResult.s0()) {
            y9hVar.p(connectionResult, null);
            return;
        }
        bahVar.e = true;
        if (fVar.t0()) {
            if (!bahVar.e || (bVar = bahVar.c) == null) {
                return;
            }
            fVar.v0(bVar, bahVar.d);
            return;
        }
        try {
            fVar.v0(null, fVar.u0());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            fVar.p0("Failed to get service from broker.");
            y9hVar.p(new ConnectionResult(10, null, null), null);
        }
    }
}
