package defpackage;

import androidx.compose.runtime.p;
import androidx.compose.runtime.r;
import defpackage.ax1;

/* JADX INFO: loaded from: classes.dex */
public final class img extends x2b {
    public final g4a V;
    public final dmg W;
    public final c3a X;
    public float Y;
    public ga2 Z;
    public int a0;
    public final g4a f;

    public static final class a extends mj8 implements gu5<j6g> {
        public a() {
            super(0);
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            img imgVar = img.this;
            if (imgVar.a0 == ((dme) imgVar.X).e()) {
                int iE = ((dme) img.this.X).e();
                ((dme) img.this.X).h(iE + 1);
            }
            return j6g.a;
        }
    }

    public img(nd6 nd6Var) {
        this.f = r.f(new kie(0L));
        this.V = r.f(Boolean.FALSE);
        dmg dmgVar = new dmg(nd6Var);
        dmgVar.f = new a();
        this.W = dmgVar;
        this.X = p.a(0);
        this.Y = 1.0f;
        this.a0 = -1;
    }

    @Override // defpackage.x2b
    public final boolean a(float f) {
        this.Y = f;
        return true;
    }

    @Override // defpackage.x2b
    public final boolean c(ga2 ga2Var) {
        this.Z = ga2Var;
        return true;
    }

    @Override // defpackage.x2b
    public final long h() {
        return ((kie) ((gme) this.f).getValue()).a;
    }

    @Override // defpackage.x2b
    public final void i(gb4 gb4Var) {
        ga2 ga2Var = this.Z;
        dmg dmgVar = this.W;
        if (ga2Var == null) {
            ga2Var = (ga2) ((gme) dmgVar.g).getValue();
        }
        if (((Boolean) ((gme) this.V).getValue()).booleanValue() && gb4Var.getLayoutDirection() == vl8.b) {
            long jF1 = gb4Var.F1();
            ax1.b bVarW1 = gb4Var.w1();
            long jD = bVarW1.d();
            bVarW1.a().o();
            try {
                bVarW1.a.g(jF1, -1.0f, 1.0f);
                dmgVar.e(gb4Var, this.Y, ga2Var);
            } finally {
                g7.k(bVarW1, jD);
            }
        } else {
            dmgVar.e(gb4Var, this.Y, ga2Var);
        }
        this.a0 = ((dme) this.X).e();
    }

    public img() {
        this(new nd6());
    }
}
