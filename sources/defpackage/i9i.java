package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzn;

/* JADX INFO: loaded from: classes2.dex */
public final class i9i implements Runnable {
    public final /* synthetic */ zzn a;
    public final /* synthetic */ y8i b;

    public i9i(y8i y8iVar, zzn zznVar) {
        this.b = y8iVar;
        this.a = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzn zznVar = this.a;
        y8i y8iVar = this.b;
        pvh pvhVar = y8iVar.d;
        if (pvhVar == null) {
            y8iVar.zzr().f.b("Discarding data. Failed to send app launch");
            return;
        }
        try {
            pvhVar.J(zznVar);
            y8iVar.a.l().q();
            y8iVar.q(pvhVar, null, zznVar);
            y8iVar.u();
        } catch (RemoteException e) {
            y8iVar.zzr().f.a(e, "Failed to send app launch to the service");
        }
    }
}
