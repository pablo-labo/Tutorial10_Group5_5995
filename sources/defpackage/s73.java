package defpackage;

import androidx.compose.runtime.g;
import androidx.compose.runtime.p;
import androidx.compose.runtime.r;

/* JADX INFO: loaded from: classes.dex */
public final class s73 extends x2b {
    public final x2b V;
    public final ft2 W;
    public final int X;
    public final boolean Y;
    public ylf a0;
    public boolean b0;
    public x2b f;
    public final c3a Z = p.a(0);
    public final x2a c0 = g.a(1.0f);
    public final g4a d0 = r.f(null);

    public s73(x2b x2bVar, x2b x2bVar2, ft2 ft2Var, int i, boolean z) {
        this.f = x2bVar;
        this.V = x2bVar2;
        this.W = ft2Var;
        this.X = i;
        this.Y = z;
    }

    @Override // defpackage.x2b
    public final boolean a(float f) {
        ((cme) this.c0).q(f);
        return true;
    }

    @Override // defpackage.x2b
    public final boolean c(ga2 ga2Var) {
        ((gme) this.d0).setValue(ga2Var);
        return true;
    }

    @Override // defpackage.x2b
    public final long h() {
        x2b x2bVar = this.f;
        long jH = x2bVar != null ? x2bVar.h() : 0L;
        x2b x2bVar2 = this.V;
        long jH2 = x2bVar2 != null ? x2bVar2.h() : 0L;
        boolean z = jH != 9205357640488583168L;
        boolean z2 = jH2 != 9205357640488583168L;
        if (z && z2) {
            return oie.e(Math.max(kie.d(jH), kie.d(jH2)), Math.max(kie.b(jH), kie.b(jH2)));
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.x2b
    public final void i(gb4 gb4Var) {
        long jA;
        boolean z = this.b0;
        x2b x2bVar = this.V;
        x2a x2aVar = this.c0;
        if (z) {
            j(gb4Var, x2bVar, ((cme) x2aVar).g());
            return;
        }
        ylf ylfVar = this.a0;
        if (ylfVar != null) {
            jA = ylfVar.a;
        } else {
            jA = ny9.a();
            this.a0 = new ylf(jA);
        }
        float f = wd4.f((1 | (jA - 1)) == Long.MAX_VALUE ? wd4.r(ak2.s(jA)) : ak2.F(ny9.a(), jA)) / this.X;
        cme cmeVar = (cme) x2aVar;
        float fG = cmeVar.g() * nic.B(f, 0.0f, 1.0f);
        float fG2 = this.Y ? cmeVar.g() - fG : cmeVar.g();
        this.b0 = f >= 1.0f;
        j(gb4Var, this.f, fG2);
        j(gb4Var, x2bVar, fG);
        if (this.b0) {
            this.f = null;
        } else {
            dme dmeVar = (dme) this.Z;
            dmeVar.h(dmeVar.e() + 1);
        }
    }

    public final void j(gb4 gb4Var, x2b x2bVar, float f) {
        if (x2bVar == null || f <= 0.0f) {
            return;
        }
        long jC = gb4Var.c();
        long jH = x2bVar.h();
        long jB = (jH == 9205357640488583168L || kie.e(jH) || jC == 9205357640488583168L || kie.e(jC)) ? jC : r03.B(jH, this.W.a(jH, jC));
        g4a g4aVar = this.d0;
        if (jC == 9205357640488583168L || kie.e(jC)) {
            x2bVar.g(gb4Var, jB, f, (ga2) ((gme) g4aVar).getValue());
            return;
        }
        float fD = (kie.d(jC) - kie.d(jB)) / 2.0f;
        float fB = (kie.b(jC) - kie.b(jB)) / 2.0f;
        gb4Var.w1().a.e(fD, fB, fD, fB);
        try {
            x2bVar.g(gb4Var, jB, f, (ga2) ((gme) g4aVar).getValue());
        } finally {
            bx1 bx1Var = gb4Var.w1().a;
            float f2 = -fD;
            float f3 = -fB;
            bx1Var.e(f2, f3, f2, f3);
        }
    }
}
