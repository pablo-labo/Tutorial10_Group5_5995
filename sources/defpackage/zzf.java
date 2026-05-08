package defpackage;

import defpackage.ere;

/* JADX INFO: loaded from: classes3.dex */
public final class zzf extends l7g<Byte> {
    public zzf(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // defpackage.up2
    public final ui8 a(xx9 xx9Var) {
        mge mgeVarO;
        xx9Var.getClass();
        t52 t52VarA = rc5.a(xx9Var, ere.a.S);
        return (t52VarA == null || (mgeVarO = t52VarA.o()) == null) ? lx4.c(kx4.m0, "UByte") : mgeVarO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.up2
    public final String toString() {
        return ((Number) this.a).intValue() + ".toUByte()";
    }
}
