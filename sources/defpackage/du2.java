package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class du2 extends y3 implements l47 {
    public final fv1 c;
    public final n8a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du2(fv1 fv1Var, ui8 ui8Var, n8a n8aVar, jsc jscVar) {
        super(ui8Var, jscVar);
        ui8Var.getClass();
        this.c = fv1Var;
        this.d = n8aVar;
    }

    @Override // defpackage.l47
    public final n8a a() {
        return this.d;
    }

    public final String toString() {
        return "Cxt { " + this.c + " }";
    }
}
