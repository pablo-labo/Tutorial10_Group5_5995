package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wr1 extends ai7<Byte> {
    public wr1(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // defpackage.up2
    public final ui8 a(xx9 xx9Var) {
        xx9Var.getClass();
        ei8 ei8VarL = xx9Var.l();
        ei8VarL.getClass();
        return ei8VarL.t(bnb.BYTE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.up2
    public final String toString() {
        return ((Number) this.a).intValue() + ".toByte()";
    }
}
