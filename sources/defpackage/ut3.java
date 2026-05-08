package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ut3 extends mj8 implements gu5<j6g> {
    final /* synthetic */ vt3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut3(vt3 vt3Var) {
        super(0);
        this.this$0 = vt3Var;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        jdd jddVar = (jdd) om2.a(this.this$0, rdd.b);
        vt3 vt3Var = this.this$0;
        if (jddVar == null) {
            n90 n90Var = vt3Var.j0;
            if (n90Var != null) {
                vt3Var.d2(n90Var);
            }
        } else if (vt3Var.j0 == null) {
            rt3 rt3Var = new rt3(vt3Var);
            tt3 tt3Var = new tt3(vt3Var);
            ei7 ei7Var = vt3Var.f0;
            boolean z = vt3Var.g0;
            float f = vt3Var.h0;
            dvf<Float> dvfVar = qdd.a;
            n90 n90Var2 = new n90(ei7Var, z, f, rt3Var, tt3Var);
            vt3Var.c2(n90Var2);
            vt3Var.j0 = n90Var2;
        }
        return j6g.a;
    }
}
