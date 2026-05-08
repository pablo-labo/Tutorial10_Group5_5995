package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class x5i implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ m4i e;

    public x5i(m4i m4iVar, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.e = m4iVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y8i y8iVarM = this.e.a.m();
        y8iVarM.b();
        y8iVarM.k();
        y8iVarM.p(new dbi(y8iVarM, this.a, this.b, this.c, this.d, y8iVarM.n(false)));
    }
}
