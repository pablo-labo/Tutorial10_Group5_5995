package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a40 extends mj8 implements gu5<Float> {
    final /* synthetic */ q30<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(q30<Object> q30Var) {
        super(0);
        this.this$0 = q30Var;
    }

    @Override // defpackage.gu5
    public final Float invoke() {
        float f = this.this$0.e().f(((gme) this.this$0.g).getValue());
        float f2 = this.this$0.e().f(this.this$0.i.getValue()) - f;
        float fAbs = Math.abs(f2);
        float f3 = 1.0f;
        if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
            float fG = (this.this$0.g() - f) / f2;
            if (fG < 1.0E-6f) {
                f3 = 0.0f;
            } else if (fG <= 0.999999f) {
                f3 = fG;
            }
        }
        return Float.valueOf(f3);
    }
}
