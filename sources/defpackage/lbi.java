package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzn;

/* JADX INFO: loaded from: classes2.dex */
public final class lbi implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ zzn d;
    public final /* synthetic */ gmi e;
    public final /* synthetic */ y8i f;

    public lbi(y8i y8iVar, String str, String str2, boolean z, zzn zznVar, gmi gmiVar) {
        this.f = y8iVar;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = zznVar;
        this.e = gmiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.a;
        gmi gmiVar = this.e;
        y8i y8iVar = this.f;
        Bundle bundle = new Bundle();
        try {
            pvh pvhVar = y8iVar.d;
            String str2 = this.b;
            if (pvhVar == null) {
                y8iVar.zzr().f.c("Failed to get user properties; not connected to service", str, str2);
                return;
            }
            Bundle bundleP = yei.p(pvhVar.K0(str, str2, this.c, this.d));
            y8iVar.u();
            y8iVar.e().E(gmiVar, bundleP);
        } catch (RemoteException e) {
            y8iVar.zzr().f.c("Failed to get user properties; remote exception", str, e);
        } finally {
            y8iVar.e().E(gmiVar, bundle);
        }
    }
}
