package defpackage;

import com.google.android.gms.measurement.internal.zzw;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class w1i implements Callable<List<zzw>> {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ h1i d;

    public w1i(h1i h1iVar, String str, String str2, String str3) {
        this.d = h1iVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzw> call() {
        fei feiVar = this.d.a;
        feiVar.F();
        return feiVar.z().L(this.a, this.b, this.c);
    }
}
