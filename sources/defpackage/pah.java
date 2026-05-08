package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class pah implements Runnable {
    public final /* synthetic */ zak a;
    public final /* synthetic */ qah b;

    public pah(qah qahVar, zak zakVar) {
        this.b = qahVar;
        this.a = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b cVar;
        zak zakVar = this.a;
        ConnectionResult connectionResult = zakVar.b;
        boolean zS0 = connectionResult.s0();
        qah qahVar = this.b;
        if (zS0) {
            zav zavVar = zakVar.c;
            fib.i(zavVar);
            ConnectionResult connectionResult2 = zavVar.c;
            if (!connectionResult2.s0()) {
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                qahVar.k.b(connectionResult2);
                qahVar.f.x0();
                return;
            }
            bah bahVar = qahVar.k;
            IBinder iBinder = zavVar.b;
            if (iBinder == null) {
                cVar = null;
            } else {
                int i = b.a.a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                cVar = iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            Set<Scope> set = qahVar.d;
            bahVar.getClass();
            if (cVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                bahVar.b(new ConnectionResult(4, null, null));
            } else {
                bahVar.c = cVar;
                bahVar.d = set;
                if (bahVar.e) {
                    bahVar.a.v0(cVar, set);
                }
            }
        } else {
            qahVar.k.b(connectionResult);
        }
        qahVar.f.x0();
    }
}
