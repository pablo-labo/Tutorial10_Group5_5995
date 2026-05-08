package defpackage;

import defpackage.j29;

/* JADX INFO: loaded from: classes3.dex */
public final class an9 implements gu5 {
    public final gn9 a;
    public final g5c b;
    public final q14 c;

    public an9(gn9 gn9Var, g5c g5cVar, q14 q14Var) {
        this.a = gn9Var;
        this.b = g5cVar;
        this.c = q14Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        gn9 gn9Var = this.a;
        j29 j29Var = gn9Var.a.a.a;
        op8 op8Var = new op8(1, gn9Var, this.b, this.c);
        j29Var.getClass();
        return new j29.f(j29Var, op8Var);
    }
}
