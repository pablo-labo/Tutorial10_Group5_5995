package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class hx5 implements dbe {
    public final ColorDrawable a;
    public final Resources b;
    public ogd c;
    public final nfd d;
    public final l65 e;
    public final up5 f;

    public hx5(ix5 ix5Var) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.a = colorDrawable;
        it5.a();
        this.b = ix5Var.a;
        this.c = ix5Var.g;
        up5 up5Var = new up5(colorDrawable);
        this.f = up5Var;
        Drawable[] drawableArr = new Drawable[7];
        drawableArr[0] = f(null);
        drawableArr[1] = f(ix5Var.b);
        fnd fndVar = ix5Var.f;
        up5Var.setColorFilter(null);
        drawableArr[2] = b5h.e(up5Var, fndVar);
        drawableArr[3] = f(ix5Var.e);
        drawableArr[4] = f(ix5Var.c);
        drawableArr[5] = f(ix5Var.d);
        l65 l65Var = new l65(drawableArr);
        this.e = l65Var;
        l65Var.a0 = 300;
        if (l65Var.Z == 1) {
            l65Var.Z = 0;
        }
        nfd nfdVar = new nfd(b5h.d(l65Var, this.c));
        nfdVar.d = null;
        this.d = nfdVar;
        nfdVar.mutate();
        l();
        it5.a();
    }

    @Override // defpackage.dbe
    public final void a(float f, boolean z) {
        l65 l65Var = this.e;
        if (l65Var.a(3) == null) {
            return;
        }
        l65Var.g0++;
        m(f);
        if (z) {
            l65Var.e();
        }
        l65Var.d();
    }

    @Override // defpackage.ic4
    public final nfd b() {
        return this.d;
    }

    @Override // defpackage.dbe
    public final void c(gh3 gh3Var) {
        nfd nfdVar = this.d;
        nfdVar.d = gh3Var;
        nfdVar.invalidateSelf();
    }

    @Override // defpackage.dbe
    public final void d(Drawable drawable, float f, boolean z) {
        Drawable drawableC = b5h.c(drawable, this.c, this.b);
        drawableC.mutate();
        this.f.u(drawableC);
        l65 l65Var = this.e;
        l65Var.g0++;
        h();
        g(2);
        m(f);
        if (z) {
            l65Var.e();
        }
        l65Var.d();
    }

    @Override // defpackage.dbe
    public final void e() {
        l65 l65Var = this.e;
        l65Var.g0++;
        h();
        if (l65Var.a(5) != null) {
            g(5);
        } else {
            g(1);
        }
        l65Var.d();
    }

    public final Drawable f(dnd dndVar) {
        return b5h.e(b5h.c(null, this.c, this.b), dndVar);
    }

    public final void g(int i) {
        if (i >= 0) {
            l65 l65Var = this.e;
            l65Var.Z = 0;
            l65Var.f0[i] = true;
            l65Var.invalidateSelf();
        }
    }

    @Override // defpackage.ic4
    public final Rect getBounds() {
        return this.d.getBounds();
    }

    public final void h() {
        i(1);
        i(2);
        i(3);
        i(4);
        i(5);
    }

    public final void i(int i) {
        if (i >= 0) {
            l65 l65Var = this.e;
            l65Var.Z = 0;
            l65Var.f0[i] = false;
            l65Var.invalidateSelf();
        }
    }

    public final ub4 j(int i) {
        l65 l65Var = this.e;
        ub4[] ub4VarArr = l65Var.d;
        web.e(Boolean.valueOf(i >= 0));
        web.e(Boolean.valueOf(i < ub4VarArr.length));
        if (ub4VarArr[i] == null) {
            ub4VarArr[i] = new at0(l65Var, i);
        }
        ub4 ub4Var = ub4VarArr[i];
        if (ub4Var.q() instanceof jf9) {
            ub4Var = (jf9) ub4Var.q();
        }
        return ub4Var.q() instanceof zmd ? (zmd) ub4Var.q() : ub4Var;
    }

    public final zmd k(int i) {
        ub4 ub4VarJ = j(i);
        if (ub4VarJ instanceof zmd) {
            return (zmd) ub4VarJ;
        }
        Drawable drawableE = b5h.e(ub4VarJ.e(b5h.a), ind.b);
        ub4VarJ.e(drawableE);
        web.h(drawableE, "Parent has no child drawable!");
        return (zmd) drawableE;
    }

    public final void l() {
        l65 l65Var = this.e;
        if (l65Var != null) {
            l65Var.g0++;
            l65Var.Z = 0;
            Arrays.fill(l65Var.f0, true);
            l65Var.invalidateSelf();
            h();
            g(1);
            l65Var.e();
            l65Var.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(float f) {
        Drawable drawableA = this.e.a(3);
        if (drawableA == 0) {
            return;
        }
        if (f >= 0.999f) {
            if (drawableA instanceof Animatable) {
                ((Animatable) drawableA).stop();
            }
            i(3);
        } else {
            if (drawableA instanceof Animatable) {
                ((Animatable) drawableA).start();
            }
            g(3);
        }
        drawableA.setLevel(Math.round(f * 10000.0f));
    }

    @Override // defpackage.dbe
    public final void reset() {
        this.f.u(this.a);
        l();
    }
}
