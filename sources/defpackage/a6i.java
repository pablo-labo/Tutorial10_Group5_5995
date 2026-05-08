package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class a6i implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ m4i d;

    public a6i(m4i m4iVar, AtomicReference atomicReference, String str, String str2) {
        this.d = m4iVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y8i y8iVarM = this.d.a.m();
        y8iVarM.b();
        y8iVarM.k();
        y8iVarM.p(new xai(y8iVarM, this.a, this.b, this.c, y8iVarM.n(false)));
    }
}
