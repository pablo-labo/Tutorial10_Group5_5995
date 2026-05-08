package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzao;

/* JADX INFO: loaded from: classes2.dex */
public final class nai implements Runnable {
    public final /* synthetic */ zzao a;
    public final /* synthetic */ String b;
    public final /* synthetic */ gmi c;
    public final /* synthetic */ y8i d;

    public nai(y8i y8iVar, zzao zzaoVar, String str, gmi gmiVar) {
        this.d = y8iVar;
        this.a = zzaoVar;
        this.b = str;
        this.c = gmiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gmi gmiVar = this.c;
        y8i y8iVar = this.d;
        try {
            pvh pvhVar = y8iVar.d;
            if (pvhVar == null) {
                y8iVar.zzr().f.b("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] bArrY0 = pvhVar.Y0(this.a, this.b);
            y8iVar.u();
            y8iVar.e().H(gmiVar, bArrY0);
        } catch (RemoteException e) {
            y8iVar.zzr().f.a(e, "Failed to send event to the service to bundle");
        } finally {
            y8iVar.e().H(gmiVar, null);
        }
    }
}
