package defpackage;

import com.google.android.gms.measurement.internal.zzn;
import com.google.android.gms.measurement.internal.zzw;

/* JADX INFO: loaded from: classes2.dex */
public final class bbi implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ zzw b;
    public final /* synthetic */ zzn c;
    public final /* synthetic */ y8i d;

    public bbi(y8i y8iVar, boolean z, zzw zzwVar, zzn zznVar, zzw zzwVar2) {
        this.d = y8iVar;
        this.a = z;
        this.b = zzwVar;
        this.c = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        y8i y8iVar = this.d;
        pvh pvhVar = y8iVar.d;
        if (pvhVar == null) {
            y8iVar.zzr().f.b("Discarding data. Failed to send conditional user property to service");
        } else {
            y8iVar.q(pvhVar, this.a ? null : this.b, this.c);
            y8iVar.u();
        }
    }
}
