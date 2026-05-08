package defpackage;

import androidx.compose.ui.layout.w;

/* JADX INFO: loaded from: classes.dex */
public final class aja implements vf9 {
    public final pl7 a;
    public final cja b;
    public final dja c;

    public aja(pl7 pl7Var, cja cjaVar, dja djaVar) {
        this.a = pl7Var;
        this.b = cjaVar;
        this.c = djaVar;
    }

    @Override // defpackage.pl7
    public final int K(int i) {
        return this.a.K(i);
    }

    @Override // defpackage.pl7
    public final int O(int i) {
        return this.a.O(i);
    }

    @Override // defpackage.pl7
    public final int P(int i) {
        return this.a.P(i);
    }

    @Override // defpackage.vf9
    public final w R(long j) {
        cja cjaVar = cja.b;
        pl7 pl7Var = this.a;
        dja djaVar = this.c;
        dja djaVar2 = dja.a;
        cja cjaVar2 = this.b;
        if (djaVar == djaVar2) {
            return new bja(cjaVar2 == cjaVar ? pl7Var.P(iq2.g(j)) : pl7Var.O(iq2.g(j)), iq2.c(j) ? iq2.g(j) : 32767);
        }
        return new bja(iq2.d(j) ? iq2.h(j) : 32767, cjaVar2 == cjaVar ? pl7Var.w(iq2.h(j)) : pl7Var.K(iq2.h(j)));
    }

    @Override // defpackage.pl7
    public final Object g() {
        return this.a.g();
    }

    @Override // defpackage.pl7
    public final int w(int i) {
        return this.a.w(i);
    }
}
