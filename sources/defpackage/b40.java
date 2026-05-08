package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b40 extends mj8 implements gu5<Object> {
    final /* synthetic */ q30<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(q30<Object> q30Var) {
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
        return !zIsNaN ? q30Var.c(fG, 0.0f, ((gme) g4aVar).getValue()) : ((gme) g4aVar).getValue();
    }
}
