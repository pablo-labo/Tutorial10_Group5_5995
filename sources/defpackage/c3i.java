package defpackage;

import com.google.android.gms.measurement.internal.zzn;
import com.google.android.gms.measurement.internal.zzw;

/* JADX INFO: loaded from: classes2.dex */
public final class c3i implements Runnable {
    public final /* synthetic */ zzw a;
    public final /* synthetic */ zzn b;
    public final /* synthetic */ h1i c;

    public c3i(h1i h1iVar, zzw zzwVar, zzn zznVar) {
        this.c = h1iVar;
        this.a = zzwVar;
        this.b = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fei feiVar = this.c.a;
        feiVar.F();
        zzw zzwVar = this.a;
        Object objS0 = zzwVar.c.s0();
        zzn zznVar = this.b;
        if (objS0 == null) {
            feiVar.t(zzwVar, zznVar);
        } else {
            feiVar.e(zzwVar, zznVar);
        }
    }
}
