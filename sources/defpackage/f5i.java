package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class f5i implements Runnable {
    public final /* synthetic */ boolean V;
    public final /* synthetic */ m4i W;
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    public f5i(m4i m4iVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.W = m4iVar;
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = bundle;
        this.e = z;
        this.f = z2;
        this.V = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.W.q(this.a, this.b, this.c, this.d, this.e, this.f, this.V);
    }
}
