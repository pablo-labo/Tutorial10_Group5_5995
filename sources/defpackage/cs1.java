package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cs1 extends Drawable {
    public final Context A;
    public coe a;
    public coe b;
    public coe c;
    public cj1 d;
    public Path e;
    public Path f;
    public Path g;
    public Path h;
    public Path i;
    public Path k;
    public RectF l;
    public RectF m;
    public RectF n;
    public RectF o;
    public PointF p;
    public PointF q;
    public PointF r;
    public PointF s;
    public final Path j = new Path();
    public boolean t = false;
    public final Paint u = new Paint(1);
    public int v = 0;
    public List<r71> w = null;
    public int x = 255;
    public final aj1 y = new aj1(0);
    public cn2 z = new cn2(new q03(0.0f, 0.0f), new q03(0.0f, 0.0f), new q03(0.0f, 0.0f), new q03(0.0f, 0.0f));
    public final int B = -1;

    public cs1(Context context) {
        this.A = context;
    }

    public static void f(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double dAbs = Math.abs(d3 - d) / 2.0d;
        double dAbs2 = Math.abs(d4 - d2) / 2.0d;
        double d13 = ((d8 - d10) - d12) / ((d7 - d9) - d11);
        double d14 = d12 - (d11 * d13);
        double d15 = dAbs2 * dAbs2;
        double d16 = dAbs * dAbs;
        double dB = w40.b(d16, d13, d13, d15);
        double d17 = dAbs * 2.0d * dAbs * d14 * d13;
        double d18 = (-(d16 * ((d14 * d14) - d15))) / dB;
        double d19 = dB * 2.0d;
        double dSqrt = ((-d17) / d19) - Math.sqrt(Math.pow(d17 / d19, 2.0d) + d18);
        double d20 = (d13 * dSqrt) + d14;
        double d21 = dSqrt + d9;
        double d22 = d20 + d10;
        if (Double.isNaN(d21) || Double.isNaN(d22)) {
            return;
        }
        pointF.x = (float) d21;
        pointF.y = (float) d22;
    }

    public static float g(float f, float f2) {
        return Math.max(f - f2, 0.0f);
    }

    public static DashPathEffect h(cj1 cj1Var, float f) {
        int iOrdinal = cj1Var.ordinal();
        if (iOrdinal == 1) {
            float f2 = f * 3.0f;
            return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
        }
        if (iOrdinal != 2) {
            return null;
        }
        return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
    }

    public static int j(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    public final void a(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i == 0) {
            return;
        }
        if (this.i == null) {
            this.i = new Path();
        }
        Paint paint = this.u;
        paint.setColor(i);
        this.i.reset();
        this.i.moveTo(f, f2);
        this.i.lineTo(f3, f4);
        this.i.lineTo(f5, f6);
        this.i.lineTo(f7, f8);
        this.i.lineTo(f, f2);
        canvas.drawPath(this.i, paint);
    }

    public final Shader b() {
        List<r71> list = this.w;
        if (list == null) {
            return null;
        }
        Shader composeShader = null;
        for (r71 r71Var : list) {
            Rect bounds = getBounds();
            r71Var.getClass();
            bounds.getClass();
            hb6 hb6Var = r71Var.a;
            if (hb6Var == null) {
                wl7.g("gradient");
                throw null;
            }
            Shader shaderA = hb6Var.a(bounds.width(), bounds.height());
            composeShader = composeShader == null ? shaderA : new ComposeShader(shaderA, composeShader, PorterDuff.Mode.SRC_OVER);
        }
        return composeShader;
    }

    public final int c(int i) {
        coe coeVar = this.b;
        float fA = coeVar != null ? coeVar.a(i) : 0.0f;
        coe coeVar2 = this.c;
        return ((((int) (coeVar2 != null ? coeVar2.a(i) : 255.0f)) << 24) & (-16777216)) | (16777215 & ((int) fA));
    }

    public final float d(float f, int i) {
        coe coeVar = this.a;
        Float fValueOf = null;
        if (coeVar != null) {
            float f2 = coeVar.b[i];
            if (!Float.isNaN(f2)) {
                fValueOf = Float.valueOf(f2);
            }
        }
        return fValueOf == null ? f : fValueOf.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04d5  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r29) {
        /*
            Method dump skipped, instruction units count: 1271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs1.draw(android.graphics.Canvas):void");
    }

    public final RectF e() {
        float fD = d(0.0f, 8);
        float fD2 = d(fD, 1);
        float fD3 = d(fD, 3);
        float fD4 = d(fD, 0);
        float fD5 = d(fD, 2);
        if (this.a != null) {
            boolean z = getLayoutDirection() == 1;
            float[] fArr = this.a.b;
            float f = fArr[4];
            float f2 = fArr[5];
            Context context = this.A;
            context.getClass();
            if (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true)) {
                if (!Float.isNaN(f)) {
                    fD4 = f;
                }
                if (!Float.isNaN(f2)) {
                    fD5 = f2;
                }
                float f3 = z ? fD5 : fD4;
                if (z) {
                    fD5 = fD4;
                }
                fD4 = f3;
            } else {
                float f4 = z ? f2 : f;
                if (!z) {
                    f = f2;
                }
                if (!Float.isNaN(f4)) {
                    fD4 = f4;
                }
                if (!Float.isNaN(f)) {
                    fD5 = f;
                }
            }
        }
        return new RectF(fD4, fD2, fD5, fD3);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.x;
    }

    @Override // android.graphics.drawable.Drawable
    @SuppressLint({"WrongConstant"})
    public final int getLayoutDirection() {
        int i = this.B;
        return i == -1 ? super.getLayoutDirection() : i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int iAlpha = (Color.alpha(this.v) * this.x) >> 8;
        if (iAlpha != 0) {
            return iAlpha != 255 ? -3 : -1;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (!this.y.b()) {
            outline.setRect(getBounds());
            return;
        }
        k();
        Path path = this.h;
        path.getClass();
        outline.setConvexPath(path);
    }

    public final boolean i(int i) {
        coe coeVar = this.b;
        float fA = coeVar != null ? coeVar.a(i) : Float.NaN;
        coe coeVar2 = this.c;
        return (Float.isNaN(fA) || Float.isNaN(coeVar2 != null ? coeVar2.a(i) : Float.NaN)) ? false : true;
    }

    public final void k() {
        if (this.t) {
            this.t = false;
            if (this.e == null) {
                this.e = new Path();
            }
            if (this.f == null) {
                this.f = new Path();
            }
            if (this.g == null) {
                this.g = new Path();
            }
            if (this.h == null) {
                this.h = new Path();
            }
            if (this.k == null) {
                this.k = new Path();
            }
            if (this.l == null) {
                this.l = new RectF();
            }
            if (this.m == null) {
                this.m = new RectF();
            }
            if (this.n == null) {
                this.n = new RectF();
            }
            if (this.o == null) {
                this.o = new RectF();
            }
            this.e.reset();
            this.f.reset();
            this.g.reset();
            this.h.reset();
            this.k.reset();
            this.l.set(getBounds());
            this.m.set(getBounds());
            this.n.set(getBounds());
            this.o.set(getBounds());
            RectF rectFE = e();
            int iC = c(0);
            int iC2 = c(1);
            int iC3 = c(2);
            int iC4 = c(3);
            int iC5 = c(8);
            int iC6 = c(9);
            int iC7 = c(11);
            int iC8 = c(10);
            if (i(9)) {
                iC2 = iC6;
                iC4 = iC2;
            }
            if (!i(10)) {
                iC8 = iC4;
            }
            if (!i(11)) {
                iC7 = iC2;
            }
            if (Color.alpha(iC) != 0 || Color.alpha(iC7) != 0 || Color.alpha(iC3) != 0 || Color.alpha(iC8) != 0 || Color.alpha(iC5) != 0) {
                RectF rectF = this.l;
                rectF.top += rectFE.top;
                rectF.bottom -= rectFE.bottom;
                rectF.left += rectFE.left;
                rectF.right -= rectFE.right;
            }
            RectF rectF2 = this.o;
            rectF2.top = (rectFE.top * 0.5f) + rectF2.top;
            rectF2.bottom -= rectFE.bottom * 0.5f;
            rectF2.left = (rectFE.left * 0.5f) + rectF2.left;
            rectF2.right -= rectFE.right * 0.5f;
            cn2 cn2VarC = this.y.c(getLayoutDirection(), this.A, nn2.C(this.m.width()), nn2.C(this.m.height()));
            this.z = cn2VarC;
            q03 q03VarA = cn2VarC.a.a();
            float f = q03VarA.b;
            float f2 = q03VarA.a;
            q03 q03VarA2 = this.z.b.a();
            float f3 = q03VarA2.b;
            float f4 = q03VarA2.a;
            q03 q03VarA3 = this.z.c.a();
            float f5 = q03VarA3.b;
            float f6 = q03VarA3.a;
            q03 q03VarA4 = this.z.d.a();
            float f7 = q03VarA4.b;
            float f8 = q03VarA4.a;
            float fG = g(f2, rectFE.left);
            float fG2 = g(f, rectFE.top);
            float fG3 = g(f4, rectFE.right);
            float fG4 = g(f3, rectFE.top);
            float fG5 = g(f8, rectFE.right);
            float fG6 = g(f7, rectFE.bottom);
            float fG7 = g(f6, rectFE.left);
            float fG8 = g(f5, rectFE.bottom);
            Path.Direction direction = Path.Direction.CW;
            this.e.addRoundRect(this.l, new float[]{fG, fG2, fG3, fG4, fG5, fG6, fG7, fG8}, direction);
            Path path = this.f;
            float f9 = rectFE.left;
            RectF rectF3 = this.l;
            path.addRoundRect(f9 > 0.0f ? rectF3.left - 0.8f : rectF3.left, rectFE.top > 0.0f ? rectF3.top - 0.8f : rectF3.top, rectFE.right > 0.0f ? rectF3.right + 0.8f : rectF3.right, rectFE.bottom > 0.0f ? rectF3.bottom + 0.8f : rectF3.bottom, new float[]{fG, fG2, fG3, fG4, fG5, fG6, fG7, fG8}, direction);
            this.g.addRoundRect(this.m, new float[]{q03VarA.a, q03VarA.b, q03VarA2.a, q03VarA2.b, q03VarA4.a, q03VarA4.b, q03VarA3.a, q03VarA3.b}, direction);
            coe coeVar = this.a;
            float fA = coeVar != null ? coeVar.a(8) / 2.0f : 0.0f;
            this.h.addRoundRect(this.n, new float[]{f2 + fA, f + fA, f4 + fA, f3 + fA, f8 + fA, f7 + fA, f6 + fA, fA + f5}, direction);
            Path path2 = this.k;
            RectF rectF4 = this.o;
            float f10 = rectFE.left * 0.5f;
            float f11 = rectFE.top * 0.5f;
            float f12 = rectFE.right * 0.5f;
            float f13 = rectFE.bottom * 0.5f;
            path2.addRoundRect(rectF4, new float[]{f2 - f10, f - f11, f4 - f12, f3 - f11, f8 - f12, f7 - f13, f6 - f10, f5 - f13}, direction);
            if (this.p == null) {
                this.p = new PointF();
            }
            PointF pointF = this.p;
            RectF rectF5 = this.l;
            float f14 = rectF5.left;
            pointF.x = f14;
            float f15 = rectF5.top;
            pointF.y = f15;
            double d = f14;
            double d2 = f15;
            double d3 = (fG2 * 2.0f) + f15;
            RectF rectF6 = this.m;
            f(d, d2, (fG * 2.0f) + f14, d3, rectF6.left, rectF6.top, d, d2, pointF);
            if (this.s == null) {
                this.s = new PointF();
            }
            PointF pointF2 = this.s;
            RectF rectF7 = this.l;
            float f16 = rectF7.left;
            pointF2.x = f16;
            float f17 = rectF7.bottom;
            pointF2.y = f17;
            double d4 = f16;
            double d5 = f17;
            RectF rectF8 = this.m;
            f(d4, f17 - (fG8 * 2.0f), (fG7 * 2.0f) + f16, d5, rectF8.left, rectF8.bottom, d4, d5, pointF2);
            if (this.q == null) {
                this.q = new PointF();
            }
            PointF pointF3 = this.q;
            RectF rectF9 = this.l;
            float f18 = rectF9.right;
            pointF3.x = f18;
            float f19 = rectF9.top;
            pointF3.y = f19;
            double d6 = f19;
            double d7 = f18;
            RectF rectF10 = this.m;
            f(f18 - (fG3 * 2.0f), d6, d7, (fG4 * 2.0f) + f19, rectF10.right, rectF10.top, d7, d6, pointF3);
            if (this.r == null) {
                this.r = new PointF();
            }
            PointF pointF4 = this.r;
            RectF rectF11 = this.l;
            float f20 = rectF11.right;
            pointF4.x = f20;
            float f21 = rectF11.bottom;
            pointF4.y = f21;
            double d8 = f21 - (fG6 * 2.0f);
            double d9 = f20;
            double d10 = f21;
            RectF rectF12 = this.m;
            f(f20 - (fG5 * 2.0f), d8, d9, d10, rectF12.right, rectF12.bottom, d9, d10, pointF4);
        }
    }

    public final void l(int i) {
        cj1 cj1Var = this.d;
        this.u.setPathEffect(cj1Var != null ? h(cj1Var, i) : null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.t = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.x) {
            this.x = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
