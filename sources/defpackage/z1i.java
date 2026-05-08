package defpackage;

import com.google.android.gms.measurement.internal.zzn;
import com.google.android.gms.measurement.internal.zzw;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class z1i implements Callable<List<zzw>> {
    public final /* synthetic */ zzn a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ h1i d;

    public z1i(h1i h1iVar, zzn zznVar, String str, String str2) {
        this.d = h1iVar;
        this.a = zznVar;
        this.b = str;
        this.c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzw> call() {
        fei feiVar = this.d.a;
        feiVar.F();
        return feiVar.z().L(this.a.a, this.b, this.c);
    }
}
