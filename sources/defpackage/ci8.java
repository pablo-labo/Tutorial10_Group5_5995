package defpackage;

import defpackage.grg;

/* JADX INFO: loaded from: classes3.dex */
public final class ci8 implements grg.c {
    public final yd8<? extends brg> a;
    public final qpd b;
    public final a9c c;
    public final gu5<v3b> d;

    /* JADX WARN: Multi-variable type inference failed */
    public ci8(yd8<? extends brg> yd8Var, qpd qpdVar, a9c a9cVar, gu5<? extends v3b> gu5Var) {
        yd8Var.getClass();
        qpdVar.getClass();
        this.a = yd8Var;
        this.b = qpdVar;
        this.c = a9cVar;
        this.d = gu5Var;
    }

    @Override // grg.c
    public final brg a(Class cls, u2a u2aVar) {
        return (brg) this.b.a(new bi8(new l80(this.d, u2aVar)), this.a, this.c);
    }
}
