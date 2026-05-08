package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fn9 implements gu5 {
    public final gn9 a;
    public final g5c b;
    public final q14 c;

    public fn9(gn9 gn9Var, g5c g5cVar, q14 q14Var) {
        this.a = gn9Var;
        this.b = g5cVar;
        this.c = q14Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        gn9 gn9Var = this.a;
        h04 h04Var = gn9Var.a;
        s5c s5cVarA = gn9Var.a(h04Var.c);
        s5cVarA.getClass();
        re0<af0, up2<?>> re0Var = h04Var.a.e;
        ui8 returnType = this.c.getReturnType();
        returnType.getClass();
        return re0Var.h(s5cVarA, this.b, returnType);
    }
}
