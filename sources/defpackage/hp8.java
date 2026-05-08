package defpackage;

import defpackage.lf0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hp8 extends mya {
    public static final /* synthetic */ qf8<Object>[] b0;
    public final nv7 V;
    public final mp8 W;
    public final fla X;
    public final ld8 Y;
    public final fla<List<mq5>> Z;
    public final lf0 a0;

    static {
        l4c l4cVar = new l4c(hp8.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0);
        iwc iwcVar = fwc.a;
        b0 = new qf8[]{iwcVar.g(l4cVar), z3.i(hp8.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0, iwcVar)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hp8(mp8 mp8Var, nv7 nv7Var) {
        mp8Var.getClass();
        sv7 sv7Var = mp8Var.a;
        super(sv7Var.o, nv7Var.h());
        this.V = nv7Var;
        mp8 mp8VarI = boa.i(mp8Var, this, null, 6);
        this.W = mp8VarI;
        sv7Var.d.c().c.getClass();
        us9 us9Var = us9.g;
        sv7 sv7Var2 = mp8VarI.a;
        aue aueVar = sv7Var2.a;
        this.X = aueVar.f(new r4(this, 5));
        this.Y = new ld8(mp8VarI, nv7Var, this);
        this.Z = aueVar.c(new x04(this, 3));
        this.a0 = sv7Var2.v.c ? lf0.a.a : ee3.v(mp8VarI, nv7Var);
        new xe8(this, 2);
    }

    @Override // defpackage.mya, defpackage.dj3, defpackage.cj3
    public final qne g() {
        return new n2i(this, 1);
    }

    @Override // defpackage.ke0, defpackage.ie0
    public final lf0 getAnnotations() {
        return this.a0;
    }

    @Override // defpackage.lya
    public final in9 n() {
        return this.Y;
    }

    @Override // defpackage.mya, defpackage.bj3
    public final String toString() {
        return "Lazy Java package fragment: " + this.e + " of module " + this.W.a.o;
    }
}
