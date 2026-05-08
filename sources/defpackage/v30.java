package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v30 extends mj8 implements gu5<Object> {
    final /* synthetic */ q30<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(q30<Object> q30Var) {
        super(0);
        this.this$0 = q30Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        Object value = ((gme) this.this$0.m).getValue();
        if (value != null) {
            return value;
        }
        q30<Object> q30Var = this.this$0;
        float fG = ((cme) q30Var.j).g();
        boolean zIsNaN = Float.isNaN(fG);
        g4a g4aVar = q30Var.g;
        if (zIsNaN) {
            return ((gme) g4aVar).getValue();
        }
        Object value2 = ((gme) g4aVar).getValue();
        oa4<Object> oa4VarE = q30Var.e();
        float f = oa4VarE.f(value2);
        if (f != fG && !Float.isNaN(f)) {
            if (f < fG) {
                Object objB = oa4VarE.b(fG, true);
                if (objB != null) {
                    return objB;
                }
            } else {
                Object objB2 = oa4VarE.b(fG, false);
                if (objB2 != null) {
                    return objB2;
                }
            }
        }
        return value2;
    }
}
