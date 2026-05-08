package defpackage;

import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzn;

/* JADX INFO: loaded from: classes2.dex */
public final class b9i implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ zzkq b;
    public final /* synthetic */ zzn c;
    public final /* synthetic */ y8i d;

    public b9i(y8i y8iVar, boolean z, zzkq zzkqVar, zzn zznVar) {
        this.d = y8iVar;
        this.a = z;
        this.b = zzkqVar;
        this.c = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        y8i y8iVar = this.d;
        pvh pvhVar = y8iVar.d;
        if (pvhVar == null) {
            y8iVar.zzr().f.b("Discarding data. Failed to set user property");
        } else {
            y8iVar.q(pvhVar, this.a ? null : this.b, this.c);
            y8iVar.u();
        }
    }
}
