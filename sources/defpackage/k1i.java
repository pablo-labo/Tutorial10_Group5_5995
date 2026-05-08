package defpackage;

import com.google.android.gms.measurement.internal.zzn;
import com.google.android.gms.measurement.internal.zzw;

/* JADX INFO: loaded from: classes2.dex */
public final class k1i implements Runnable {
    public final /* synthetic */ zzw a;
    public final /* synthetic */ h1i b;

    public k1i(h1i h1iVar, zzw zzwVar) {
        this.b = h1iVar;
        this.a = zzwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fei feiVar = this.b.a;
        feiVar.F();
        zzw zzwVar = this.a;
        if (zzwVar.c.s0() == null) {
            feiVar.getClass();
            zzn zznVarL = feiVar.l(zzwVar.a);
            if (zznVarL != null) {
                feiVar.t(zzwVar, zznVarL);
                return;
            }
            return;
        }
        feiVar.getClass();
        zzn zznVarL2 = feiVar.l(zzwVar.a);
        if (zznVarL2 != null) {
            feiVar.e(zzwVar, zznVarL2);
        }
    }
}
