package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import defpackage.wle;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vrd extends e.c implements lm8, c5e {
    public zrd d0;
    public boolean e0;

    @Override // defpackage.c5e
    public final void F0(s5e s5eVar) {
        o5e.k(s5eVar);
        lrd lrdVar = new lrd(new z0(this, 20), new a1(this, 23), false);
        if (this.e0) {
            r5e<lrd> r5eVar = k5e.u;
            qf8<Object> qf8Var = o5e.a[12];
            s5eVar.a(r5eVar, lrdVar);
        } else {
            r5e<lrd> r5eVar2 = k5e.t;
            qf8<Object> qf8Var2 = o5e.a[11];
            s5eVar.a(r5eVar2, lrdVar);
        }
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        pg8.m(j, this.e0 ? dwa.a : dwa.b);
        w wVarR = vf9Var.R(iq2.a(0, this.e0 ? iq2.h(j) : Integer.MAX_VALUE, 0, this.e0 ? Integer.MAX_VALUE : iq2.g(j), 5, j));
        int i = wVarR.a;
        int iH = iq2.h(j);
        if (i > iH) {
            i = iH;
        }
        int i2 = wVarR.b;
        int iG = iq2.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        int i3 = wVarR.b - i2;
        int i4 = wVarR.a - i;
        if (!this.e0) {
            i3 = i4;
        }
        zrd zrdVar = this.d0;
        c3a c3aVar = zrdVar.d;
        c3a c3aVar2 = zrdVar.a;
        ((dme) c3aVar).h(i3);
        wle.e.getClass();
        wle wleVarA = wle.a.a();
        Function1<Object, j6g> function1E = wleVarA != null ? wleVarA.e() : null;
        wle wleVarB = wle.a.b(wleVarA);
        try {
            if (((dme) c3aVar2).e() > i3) {
                ((dme) c3aVar2).h(i3);
            }
            j6g j6gVar = j6g.a;
            wle.a.e(wleVarA, wleVarB, function1E);
            ((dme) this.d0.b).h(this.e0 ? i2 : i);
            return qVar.Y0(i, i2, bs4.a, new urd(this, i3, wVarR));
        } catch (Throwable th) {
            wle.a.e(wleVarA, wleVarB, function1E);
            throw th;
        }
    }

    @Override // defpackage.lm8
    public final int p(w59 w59Var, pl7 pl7Var, int i) {
        if (this.e0) {
            i = Integer.MAX_VALUE;
        }
        return pl7Var.O(i);
    }

    @Override // defpackage.lm8
    public final int r(w59 w59Var, pl7 pl7Var, int i) {
        if (!this.e0) {
            i = Integer.MAX_VALUE;
        }
        return pl7Var.w(i);
    }

    @Override // defpackage.lm8
    public final int v(w59 w59Var, pl7 pl7Var, int i) {
        if (!this.e0) {
            i = Integer.MAX_VALUE;
        }
        return pl7Var.K(i);
    }

    @Override // defpackage.lm8
    public final int z(w59 w59Var, pl7 pl7Var, int i) {
        if (this.e0) {
            i = Integer.MAX_VALUE;
        }
        return pl7Var.P(i);
    }
}
