package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class o1i implements Callable<List<bfi>> {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ h1i d;

    public o1i(h1i h1iVar, String str, String str2, String str3) {
        this.d = h1iVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<bfi> call() {
        fei feiVar = this.d.a;
        feiVar.F();
        return feiVar.z().u(this.a, this.b, this.c);
    }
}
