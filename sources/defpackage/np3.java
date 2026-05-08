package defpackage;

import androidx.compose.runtime.r;

/* JADX INFO: loaded from: classes.dex */
public final class np3 extends e2b {
    public static final ko2 I = pnb.H(new gm0(6, 0), new nf(7));
    public final g4a<gu5<Integer>> H;

    public np3(int i, float f, gu5<Integer> gu5Var) {
        super(f, i);
        this.H = r.f(gu5Var);
    }

    @Override // defpackage.e2b
    public final int o() {
        return ((Number) ((gu5) ((gme) this.H).getValue()).invoke()).intValue();
    }
}
