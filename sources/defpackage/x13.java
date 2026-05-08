package defpackage;

import defpackage.qa5;

/* JADX INFO: loaded from: classes3.dex */
public final class x13 extends eq5 {
    public final v13 b;
    public final w13 c;
    public long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x13(ro1 ro1Var, v13 v13Var, qa5.i iVar) {
        super(ro1Var);
        ro1Var.getClass();
        iVar.getClass();
        this.b = v13Var;
        this.c = iVar;
    }

    @Override // defpackage.eq5, defpackage.fie
    public final void I1(zn1 zn1Var, long j) {
        zn1Var.getClass();
        this.a.I1(zn1Var, j);
        long j2 = this.d + j;
        this.d = j2;
        this.c.a(j2, this.b.contentLength());
    }
}
