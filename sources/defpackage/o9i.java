package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzn;

/* JADX INFO: loaded from: classes2.dex */
public final class o9i implements Runnable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ zzn b;
    public final /* synthetic */ y8i c;

    public o9i(y8i y8iVar, Bundle bundle, zzn zznVar) {
        this.c = y8iVar;
        this.a = bundle;
        this.b = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y8i y8iVar = this.c;
        pvh pvhVar = y8iVar.d;
        if (pvhVar == null) {
            y8iVar.zzr().f.b("Failed to send default event parameters to service");
            return;
        }
        try {
            pvhVar.X(this.a, this.b);
        } catch (RemoteException e) {
            y8iVar.zzr().f.a(e, "Failed to send default event parameters to service");
        }
    }
}
