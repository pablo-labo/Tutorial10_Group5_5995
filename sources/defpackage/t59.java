package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t59 extends ai7<Long> {
    public t59(long j) {
        super(Long.valueOf(j));
    }

    @Override // defpackage.up2
    public final ui8 a(xx9 xx9Var) {
        xx9Var.getClass();
        ei8 ei8VarL = xx9Var.l();
        ei8VarL.getClass();
        return ei8VarL.t(bnb.LONG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.up2
    public final String toString() {
        return ((Number) this.a).longValue() + ".toLong()";
    }
}
