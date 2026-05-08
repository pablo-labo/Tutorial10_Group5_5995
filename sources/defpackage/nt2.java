package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nt2 extends y3 implements l47 {
    public final t52 c;
    public final n8a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt2(t52 t52Var, ui8 ui8Var, n8a n8aVar) {
        super(ui8Var, (jsc) null);
        ui8Var.getClass();
        this.c = t52Var;
        this.d = n8aVar;
    }

    @Override // defpackage.l47
    public final n8a a() {
        return this.d;
    }

    public final String toString() {
        return getType() + ": Ctx { " + this.c + " }";
    }
}
