package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import defpackage.g91;

/* JADX INFO: loaded from: classes2.dex */
public final class zwh extends wfh {
    public final IBinder g;
    public final /* synthetic */ g91 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwh(g91 g91Var, int i, IBinder iBinder, Bundle bundle) {
        super(g91Var, i, bundle);
        this.h = g91Var;
        this.g = iBinder;
    }

    @Override // defpackage.wfh
    public final boolean b() {
        IBinder iBinder = this.g;
        try {
            fib.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            g91 g91Var = this.h;
            if (!g91Var.j().equals(interfaceDescriptor)) {
                String strJ = g91Var.j();
                Log.w("GmsClient", z3.n(new StringBuilder(strJ.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strJ, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceD = g91Var.d(iBinder);
            if (iInterfaceD == null || !(g91Var.o(2, 4, iInterfaceD) || g91Var.o(3, 4, iInterfaceD))) {
                return false;
            }
            g91Var.t = null;
            g91.a aVar = g91Var.o;
            if (aVar == null) {
                return true;
            }
            aVar.c();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // defpackage.wfh
    public final void c(ConnectionResult connectionResult) {
        g91.b bVar = this.h.p;
        if (bVar != null) {
            bVar.h(connectionResult);
        }
        System.currentTimeMillis();
    }
}
