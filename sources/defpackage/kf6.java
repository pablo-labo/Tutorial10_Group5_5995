package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kf6 implements zgb {
    public final c20 a;
    public final toa b;
    public long c = 0;

    public kf6(c20 c20Var, toa toaVar) {
        this.a = c20Var;
        this.b = toaVar;
    }

    @Override // defpackage.zgb
    public final long e(ph7 ph7Var, long j, vl8 vl8Var, long j2) {
        long jA = this.b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.c;
        }
        this.c = jA;
        return lh7.d(lh7.d(ph7Var.a(), ak2.E(jA)), this.a.a(j2, 0L, vl8Var));
    }
}
