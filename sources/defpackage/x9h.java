package defpackage;

import defpackage.vf0;

/* JADX INFO: loaded from: classes2.dex */
public final class x9h implements Runnable {
    public final /* synthetic */ c00 a;

    public x9h(c00 c00Var) {
        this.a = c00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vf0.f fVar = ((y9h) this.a.a).b;
        fVar.p0(fVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
