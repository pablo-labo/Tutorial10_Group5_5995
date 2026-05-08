package defpackage;

import defpackage.lf0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ws8 extends bj3 implements wya {
    public static final /* synthetic */ qf8<Object>[] W;
    public final it8 V;
    public final yx9 c;
    public final mq5 d;
    public final fla e;
    public final fla f;

    static {
        l4c l4cVar = new l4c(ws8.class, "fragments", "getFragments()Ljava/util/List;", 0);
        iwc iwcVar = fwc.a;
        W = new qf8[]{iwcVar.g(l4cVar), z3.i(ws8.class, "empty", "getEmpty()Z", 0, iwcVar)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ws8(yx9 yx9Var, mq5 mq5Var, aue aueVar) {
        mq5Var.getClass();
        aueVar.getClass();
        nq5 nq5Var = mq5Var.a;
        super(lf0.a.a, nq5Var.c() ? nq5.e : nq5Var.f());
        this.c = yx9Var;
        this.d = mq5Var;
        int i = 3;
        this.e = aueVar.f(new qc8(this, i));
        this.f = aueVar.f(new x4(this, i));
        this.V = new it8(aueVar, new ve0(this, i));
    }

    @Override // defpackage.wya
    public final yx9 A0() {
        return this.c;
    }

    @Override // defpackage.aj3
    public final aj3 d() {
        mq5 mq5Var = this.d;
        if (mq5Var.a.c()) {
            return null;
        }
        return this.c.S(mq5Var.b());
    }

    public final boolean equals(Object obj) {
        wya wyaVar = obj instanceof wya ? (wya) obj : null;
        return wyaVar != null && wl7.b(this.d, wyaVar.h()) && wl7.b(this.c, wyaVar.A0());
    }

    @Override // defpackage.wya
    public final mq5 h() {
        return this.d;
    }

    @Override // defpackage.wya
    public final List<lya> h0() {
        return (List) zte.c(this.e, W[0]);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    @Override // defpackage.wya
    public final boolean isEmpty() {
        return ((Boolean) zte.c(this.f, W[1])).booleanValue();
    }

    @Override // defpackage.wya
    public final in9 n() {
        return this.V;
    }

    @Override // defpackage.aj3
    public final <R, D> R o0(ej3<R, D> ej3Var, D d) {
        return (R) ej3Var.m(this, d);
    }
}
