package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ol7 extends tl7 {
    public sl7 d0;
    public boolean e0;

    @Override // defpackage.tl7
    public final long c2(vf9 vf9Var, long j) {
        int iK = this.d0 == sl7.a ? vf9Var.K(iq2.h(j)) : vf9Var.w(iq2.h(j));
        if (iK < 0) {
            iK = 0;
        }
        if (iK < 0) {
            ce7.a("height must be >= 0");
        }
        return mq2.h(0, Integer.MAX_VALUE, iK, iK);
    }

    @Override // defpackage.tl7
    public final boolean d2() {
        return this.e0;
    }

    @Override // defpackage.tl7, defpackage.lm8
    public final int r(w59 w59Var, pl7 pl7Var, int i) {
        return this.d0 == sl7.a ? pl7Var.K(i) : pl7Var.w(i);
    }

    @Override // defpackage.tl7, defpackage.lm8
    public final int v(w59 w59Var, pl7 pl7Var, int i) {
        return this.d0 == sl7.a ? pl7Var.K(i) : pl7Var.w(i);
    }
}
