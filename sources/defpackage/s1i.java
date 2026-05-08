package defpackage;

import com.google.android.gms.measurement.internal.zzn;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class s1i implements Callable<List<bfi>> {
    public final /* synthetic */ zzn a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ h1i d;

    public s1i(h1i h1iVar, zzn zznVar, String str, String str2) {
        this.d = h1iVar;
        this.a = zznVar;
        this.b = str;
        this.c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<bfi> call() {
        fei feiVar = this.d.a;
        feiVar.F();
        return feiVar.z().u(this.a.a, this.b, this.c);
    }
}
