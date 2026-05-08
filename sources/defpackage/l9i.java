package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzn;

/* JADX INFO: loaded from: classes2.dex */
public final class l9i implements Runnable {
    public final /* synthetic */ zzn a;
    public final /* synthetic */ gmi b;
    public final /* synthetic */ y8i c;

    public l9i(y8i y8iVar, zzn zznVar, gmi gmiVar) {
        this.c = y8iVar;
        this.a = zznVar;
        this.b = gmiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gmi gmiVar = this.b;
        y8i y8iVar = this.c;
        try {
            pvh pvhVar = y8iVar.d;
            if (pvhVar == null) {
                y8iVar.zzr().f.b("Failed to get app instance id");
                return;
            }
            String strY0 = pvhVar.y0(this.a);
            if (strY0 != null) {
                y8iVar.h().V.set(strY0);
                y8iVar.f().a0.b(strY0);
            }
            y8iVar.u();
            y8iVar.e().A(strY0, gmiVar);
        } catch (RemoteException e) {
            y8iVar.zzr().f.a(e, "Failed to get app instance id");
        } finally {
            y8iVar.e().A(null, gmiVar);
        }
    }
}
