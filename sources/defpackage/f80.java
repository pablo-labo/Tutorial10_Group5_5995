package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import defpackage.g80;

/* JADX INFO: loaded from: classes.dex */
public final class f80 implements u2b {
    public final Paint a;
    public int b = 3;
    public Shader c;
    public ga2 d;
    public n80 e;

    public f80(Paint paint) {
        this.a = paint;
    }

    @Override // defpackage.u2b
    public final float a() {
        return this.a.getAlpha() / 255.0f;
    }

    @Override // defpackage.u2b
    public final void b(float f) {
        this.a.setAlpha((int) Math.rint(f * 255.0f));
    }

    @Override // defpackage.u2b
    public final long c() {
        return pnb.d(this.a.getColor());
    }

    @Override // defpackage.u2b
    public final void d(long j) {
        this.a.setColor(pnb.P(j));
    }

    @Override // defpackage.u2b
    public final Paint e() {
        return this.a;
    }

    @Override // defpackage.u2b
    public final void f(Shader shader) {
        this.c = shader;
        this.a.setShader(shader);
    }

    @Override // defpackage.u2b
    public final Shader g() {
        return this.c;
    }

    public final int h() {
        Paint.Cap strokeCap = this.a.getStrokeCap();
        int i = strokeCap == null ? -1 : g80.a.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int i() {
        Paint.Join strokeJoin = this.a.getStrokeJoin();
        int i = strokeJoin == null ? -1 : g80.a.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void j(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        int i2 = Build.VERSION.SDK_INT;
        Paint paint = this.a;
        if (i2 >= 29) {
            y4h.a(i, paint);
        } else {
            paint.setXfermode(new PorterDuffXfermode(x40.b(i)));
        }
    }

    public final void k(ga2 ga2Var) {
        this.d = ga2Var;
        this.a.setColorFilter(ga2Var != null ? ga2Var.a : null);
    }

    public final void l(int i) {
        this.a.setFilterBitmap(!(i == 0));
    }

    public final void m(n80 n80Var) {
        this.a.setPathEffect(n80Var != null ? n80Var.a : null);
        this.e = n80Var;
    }

    public final void n(int i) {
        this.a.setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public final void o(int i) {
        this.a.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public final void p(float f) {
        this.a.setStrokeMiter(f);
    }

    public final void q(float f) {
        this.a.setStrokeWidth(f);
    }

    public final void r(int i) {
        this.a.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
