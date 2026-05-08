package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class ri1 extends Drawable {
    public static final /* synthetic */ qf8<Object>[] z = {fwc.a.e(new w3a(ri1.class, "borderStyle", "getBorderStyle()Lcom/facebook/react/uimanager/style/BorderStyle;", 0))};
    public final Context a;
    public final coe b;
    public aj1 c;
    public r7i d;
    public Integer[] f;
    public cn2 h;
    public Path k;
    public Path n;
    public Path o;
    public Path p;
    public Path q;
    public Path r;
    public PointF s;
    public PointF t;
    public PointF u;
    public PointF v;
    public RectF w;
    public RectF x;
    public RectF y;
    public final qi1 e = new qi1(this);
    public fa2 g = new fa2(-16777216, -16777216, -16777216, -16777216);
    public int i = 255;
    public final float j = 0.8f;
    public final Paint l = new Paint(1);
    public boolean m = true;

    public ri1(Context context, coe coeVar, aj1 aj1Var, r7i r7iVar) {
        this.a = context;
        this.b = coeVar;
        this.c = aj1Var;
        this.d = r7iVar;
    }

    public static void d(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
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
        double d17 = 2.0d * dAbs * dAbs * d14 * d13;
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

    public static float e(float f, float f2) {
        float f3 = f - f2;
        if (f3 < 0.0f) {
            return 0.0f;
        }
        return f3;
    }

    public static DashPathEffect f(cj1 cj1Var, float f) {
        int iOrdinal = cj1Var.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            float f2 = f * 3.0f;
            return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
        }
        if (iOrdinal == 2) {
            return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
        }
        l.g();
        return null;
    }

    public static int g(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * ((i2 + (i2 >> 7)) >> 7)) >> 8) << 24);
    }

    public final RectF a() {
        r7i r7iVar = this.d;
        if (r7iVar == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        RectF rectFJ = r7iVar.j(this.a, getLayoutDirection());
        return new RectF(Float.isNaN(rectFJ.left) ? 0.0f : nn2.G(rectFJ.left), Float.isNaN(rectFJ.top) ? 0.0f : nn2.G(rectFJ.top), Float.isNaN(rectFJ.right) ? 0.0f : nn2.G(rectFJ.right), Float.isNaN(rectFJ.bottom) ? 0.0f : nn2.G(rectFJ.bottom));
    }

    public final void b(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i == 0) {
            return;
        }
        if (this.k == null) {
            this.k = new Path();
        }
        int iG = g(i, this.i);
        Paint paint = this.l;
        paint.setColor(iG);
        Path path = this.k;
        if (path != null) {
            path.reset();
        }
        Path path2 = this.k;
        if (path2 != null) {
            path2.moveTo(f, f2);
        }
        Path path3 = this.k;
        if (path3 != null) {
            path3.lineTo(f3, f4);
        }
        Path path4 = this.k;
        if (path4 != null) {
            path4.lineTo(f5, f6);
        }
        Path path5 = this.k;
        if (path5 != null) {
            path5.lineTo(f7, f8);
        }
        Path path6 = this.k;
        if (path6 != null) {
            path6.lineTo(f, f2);
        }
        Path path7 = this.k;
        if (path7 != null) {
            canvas.drawPath(path7, paint);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final cj1 c() {
        qf8<Object> qf8Var = z[0];
        qi1 qi1Var = this.e;
        qi1Var.getClass();
        qf8Var.getClass();
        return (cj1) qi1Var.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:510:0x086a  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r63) {
        /*
            Method dump skipped, instruction units count: 2554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri1.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    @sy3
    public final int getOpacity() {
        if (ak2.u(Color.alpha(g(this.g.a, this.i)), Color.alpha(g(this.g.b, this.i)), Color.alpha(g(this.g.c, this.i)), Color.alpha(g(this.g.d, this.i))) == 0) {
            return -2;
        }
        int iAlpha = Color.alpha(g(this.g.a, this.i));
        int[] iArr = {Color.alpha(g(this.g.b, this.i)), Color.alpha(g(this.g.c, this.i)), Color.alpha(g(this.g.d, this.i))};
        for (int i = 0; i < 3; i++) {
            iAlpha = Math.min(iAlpha, iArr[i]);
        }
        return iAlpha == 255 ? -1 : -3;
    }

    public final void h(int i) {
        cj1 cj1VarC = c();
        if (cj1VarC != null) {
            this.l.setPathEffect(c() != null ? f(cj1VarC, i) : null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.m = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        rect.getClass();
        super.onBoundsChange(rect);
        this.m = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.i = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
