package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vl7 extends tl7 {
    public sl7 d0;
    public boolean e0;

    @Override // defpackage.tl7
    public final long c2(vf9 vf9Var, long j) {
        int iO = this.d0 == sl7.a ? vf9Var.O(iq2.g(j)) : vf9Var.P(iq2.g(j));
        if (iO < 0) {
            iO = 0;
        }
        if (iO < 0) {
            ce7.a("width must be >= 0");
        }
        return mq2.h(iO, iO, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.tl7
    public final boolean d2() {
        return this.e0;
    }

    @Override // defpackage.tl7, defpackage.lm8
    public final int p(w59 w59Var, pl7 pl7Var, int i) {
        return this.d0 == sl7.a ? pl7Var.O(i) : pl7Var.P(i);
    }

    @Override // defpackage.tl7, defpackage.lm8
    public final int z(w59 w59Var, pl7 pl7Var, int i) {
        return this.d0 == sl7.a ? pl7Var.O(i) : pl7Var.P(i);
    }
}
