package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.r;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class sb4 extends x2b implements k0d {
    public final g4a V;
    public final g4a W;
    public final d2f X;
    public final Drawable f;

    public static final class a extends mj8 implements gu5<rb4> {
        public a() {
            super(0);
        }

        @Override // defpackage.gu5
        public final rb4 invoke() {
            return new rb4(sb4.this);
        }
    }

    public sb4(Drawable drawable) {
        drawable.getClass();
        this.f = drawable;
        this.V = r.f(0);
        Lazy lazy = tb4.a;
        this.W = r.f(new kie((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : oie.e(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.X = new d2f(new a());
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // defpackage.x2b
    public final boolean a(float f) {
        this.f.setAlpha(nic.C(gf9.b(f * 255.0f), 0, 255));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k0d
    public final void b() {
        Drawable.Callback callback = (Drawable.Callback) this.X.getValue();
        Drawable drawable = this.f;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.x2b
    public final boolean c(ga2 ga2Var) {
        this.f.setColorFilter(ga2Var != null ? ga2Var.a : null);
        return true;
    }

    @Override // defpackage.k0d
    public final void d() {
        e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k0d
    public final void e() {
        Drawable drawable = this.f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // defpackage.x2b
    public final void f(vl8 vl8Var) {
        int i;
        vl8Var.getClass();
        int iOrdinal = vl8Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                l.g();
                return;
            }
        } else {
            i = 0;
        }
        this.f.setLayoutDirection(i);
    }

    @Override // defpackage.x2b
    public final long h() {
        return ((kie) ((gme) this.W).getValue()).a;
    }

    @Override // defpackage.x2b
    public final void i(gb4 gb4Var) {
        gb4Var.getClass();
        ww1 ww1VarA = gb4Var.w1().a();
        ((Number) ((gme) this.V).getValue()).intValue();
        int iB = gf9.b(kie.d(gb4Var.c()));
        int iB2 = gf9.b(kie.b(gb4Var.c()));
        Drawable drawable = this.f;
        drawable.setBounds(0, 0, iB, iB2);
        try {
            ww1VarA.o();
            Canvas canvas = z40.a;
            drawable.draw(((y40) ww1VarA).a);
        } finally {
            ww1VarA.h();
        }
    }
}
