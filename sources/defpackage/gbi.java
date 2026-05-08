package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzn;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class gbi implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzn c;
    public final /* synthetic */ gmi d;
    public final /* synthetic */ y8i e;

    public gbi(y8i y8iVar, String str, String str2, zzn zznVar, gmi gmiVar) {
        this.e = y8iVar;
        this.a = str;
        this.b = str2;
        this.c = zznVar;
        this.d = gmiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.b;
        String str2 = this.a;
        gmi gmiVar = this.d;
        y8i y8iVar = this.e;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            pvh pvhVar = y8iVar.d;
            if (pvhVar == null) {
                y8iVar.zzr().f.c("Failed to get conditional properties; not connected to service", str2, str);
                return;
            }
            ArrayList<Bundle> arrayListX = yei.X(pvhVar.z(str2, str, this.c));
            y8iVar.u();
            y8iVar.e().F(gmiVar, arrayListX);
        } catch (RemoteException e) {
            y8iVar.zzr().f.d("Failed to get conditional properties; remote exception", str2, str, e);
        } finally {
            y8iVar.e().F(gmiVar, arrayList);
        }
    }
}
