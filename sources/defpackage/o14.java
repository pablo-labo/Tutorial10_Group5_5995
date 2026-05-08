package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o14 extends mya {
    public final xf1 V;
    public final p8a W;
    public final s4c X;
    public f5c Y;
    public p14 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o14(mq5 mq5Var, j29 j29Var, xx9 xx9Var, f5c f5cVar, dp1 dp1Var) {
        super(xx9Var, mq5Var);
        mq5Var.getClass();
        xx9Var.getClass();
        dp1Var.getClass();
        this.V = dp1Var;
        i5c i5cVarC = f5cVar.C();
        i5cVarC.getClass();
        h5c h5cVarB = f5cVar.B();
        h5cVarB.getClass();
        p8a p8aVar = new p8a(i5cVarC, h5cVarB);
        this.W = p8aVar;
        this.X = new s4c(f5cVar, p8aVar, dp1Var, new a04(this));
        this.Y = f5cVar;
    }

    public final void L0(g04 g04Var) {
        g04Var.getClass();
        f5c f5cVar = this.Y;
        if (f5cVar == null) {
            r6.g("Repeated call to DeserializedPackageFragmentImpl::initialize");
            return;
        }
        this.Y = null;
        e5c e5cVarA = f5cVar.A();
        e5cVarA.getClass();
        this.Z = new p14(this, e5cVarA, this.W, this.V, null, g04Var, "scope of " + this, new n14(this, 0));
    }

    @Override // defpackage.lya
    public final in9 n() {
        p14 p14Var = this.Z;
        if (p14Var != null) {
            return p14Var;
        }
        wl7.g("_memberScope");
        throw null;
    }
}
