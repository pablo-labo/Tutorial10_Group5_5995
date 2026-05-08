package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hi5 extends up2<Float> {
    public hi5(float f) {
        super(Float.valueOf(f));
    }

    @Override // defpackage.up2
    public final ui8 a(xx9 xx9Var) {
        xx9Var.getClass();
        ei8 ei8VarL = xx9Var.l();
        ei8VarL.getClass();
        return ei8VarL.t(bnb.FLOAT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.up2
    public final String toString() {
        return ((Number) this.a).floatValue() + ".toFloat()";
    }
}
