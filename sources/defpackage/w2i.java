package defpackage;

import com.google.android.gms.measurement.internal.zzn;

/* JADX INFO: loaded from: classes2.dex */
public final class w2i implements Runnable {
    public final /* synthetic */ zzn a;
    public final /* synthetic */ h1i b;

    public w2i(h1i h1iVar, zzn zznVar) {
        this.b = h1iVar;
        this.a = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fei feiVar = this.b.a;
        feiVar.F();
        feiVar.s(this.a);
    }
}
