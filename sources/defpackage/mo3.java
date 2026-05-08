package defpackage;

import androidx.compose.ui.layout.w;

/* JADX INFO: loaded from: classes.dex */
public final class mo3 implements vf9 {
    public final /* synthetic */ int a;
    public final pl7 b;
    public final Enum c;
    public final Enum d;

    public /* synthetic */ mo3(pl7 pl7Var, Enum r2, Enum r3, int i) {
        this.a = i;
        this.b = pl7Var;
        this.c = r2;
        this.d = r3;
    }

    @Override // defpackage.pl7
    public final int K(int i) {
        switch (this.a) {
        }
        return this.b.K(i);
    }

    @Override // defpackage.pl7
    public final int O(int i) {
        switch (this.a) {
        }
        return this.b.O(i);
    }

    @Override // defpackage.pl7
    public final int P(int i) {
        switch (this.a) {
        }
        return this.b.P(i);
    }

    @Override // defpackage.vf9
    public final w R(long j) {
        int i = this.a;
        Enum r1 = this.c;
        Enum r2 = this.d;
        pl7 pl7Var = this.b;
        switch (i) {
            case 0:
                ul7 ul7Var = (ul7) r2;
                rl7 rl7Var = (rl7) r1;
                rl7 rl7Var2 = rl7.b;
                if (ul7Var == ul7.a) {
                    return new rg5(rl7Var == rl7Var2 ? pl7Var.P(iq2.g(j)) : pl7Var.O(iq2.g(j)), iq2.c(j) ? iq2.g(j) : 32767);
                }
                return new rg5(iq2.d(j) ? iq2.h(j) : 32767, rl7Var == rl7Var2 ? pl7Var.w(iq2.h(j)) : pl7Var.K(iq2.h(j)));
            default:
                kg9 kg9Var = (kg9) r2;
                jg9 jg9Var = (jg9) r1;
                jg9 jg9Var2 = jg9.b;
                if (kg9Var == kg9.a) {
                    return new ig9(jg9Var == jg9Var2 ? pl7Var.P(iq2.g(j)) : pl7Var.O(iq2.g(j)), iq2.c(j) ? iq2.g(j) : 32767);
                }
                return new ig9(iq2.d(j) ? iq2.h(j) : 32767, jg9Var == jg9Var2 ? pl7Var.w(iq2.h(j)) : pl7Var.K(iq2.h(j)));
        }
    }

    @Override // defpackage.pl7
    public final Object g() {
        switch (this.a) {
        }
        return this.b.g();
    }

    @Override // defpackage.pl7
    public final int w(int i) {
        switch (this.a) {
        }
        return this.b.w(i);
    }
}
