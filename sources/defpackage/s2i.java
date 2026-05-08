package defpackage;

import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzn;

/* JADX INFO: loaded from: classes2.dex */
public final class s2i implements Runnable {
    public final /* synthetic */ zzkq a;
    public final /* synthetic */ zzn b;
    public final /* synthetic */ h1i c;

    public s2i(h1i h1iVar, zzkq zzkqVar, zzn zznVar) {
        this.c = h1iVar;
        this.a = zzkqVar;
        this.b = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fei feiVar = this.c.a;
        feiVar.F();
        zzkq zzkqVar = this.a;
        Object objS0 = zzkqVar.s0();
        zzn zznVar = this.b;
        if (objS0 == null) {
            feiVar.r(zzkqVar, zznVar);
        } else {
            feiVar.d(zzkqVar, zznVar);
        }
    }
}
