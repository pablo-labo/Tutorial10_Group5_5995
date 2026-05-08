package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzn;

/* JADX INFO: loaded from: classes2.dex */
public final class uai implements Runnable {
    public final /* synthetic */ zzn a;
    public final /* synthetic */ y8i b;

    public uai(y8i y8iVar, zzn zznVar) {
        this.b = y8iVar;
        this.a = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y8i y8iVar = this.b;
        pvh pvhVar = y8iVar.d;
        if (pvhVar == null) {
            y8iVar.zzr().f.b("Failed to send measurementEnabled to service");
            return;
        }
        try {
            pvhVar.N(this.a);
            y8iVar.u();
        } catch (RemoteException e) {
            y8iVar.zzr().f.a(e, "Failed to send measurementEnabled to the service");
        }
    }
}
