package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import defpackage.ece;
import defpackage.fce;
import defpackage.uce;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class ze9 extends Drawable implements cde {
    public static final Paint l0;
    public final Path V;
    public final Path W;
    public final RectF X;
    public final RectF Y;
    public final Region Z;
    public b a;
    public final Region a0;
    public final uce.f[] b;
    public ece b0;
    public final uce.f[] c;
    public final Paint c0;
    public final BitSet d;
    public final Paint d0;
    public boolean e;
    public final zbe e0;
    public final Matrix f;
    public final a f0;
    public final fce g0;
    public PorterDuffColorFilter h0;
    public PorterDuffColorFilter i0;
    public final RectF j0;
    public final boolean k0;

    public class a {
        public a() {
        }
    }

    public static final class b extends Drawable.ConstantState {
        public ece a;
        public op4 b;
        public ColorStateList c;
        public ColorStateList d;
        public ColorStateList e;
        public PorterDuff.Mode f;
        public Rect g;
        public float h;
        public float i;
        public float j;
        public int k;
        public float l;
        public float m;
        public int n;
        public int o;
        public Paint.Style p;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            ze9 ze9Var = new ze9(this);
            ze9Var.e = true;
            return ze9Var;
        }
    }

    static {
        Paint paint = new Paint(1);
        l0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public ze9(b bVar) {
        this.b = new uce.f[4];
        this.c = new uce.f[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.V = new Path();
        this.W = new Path();
        this.X = new RectF();
        this.Y = new RectF();
        this.Z = new Region();
        this.a0 = new Region();
        Paint paint = new Paint(1);
        this.c0 = paint;
        Paint paint2 = new Paint(1);
        this.d0 = paint2;
        this.e0 = new zbe();
        this.g0 = Looper.getMainLooper().getThread() == Thread.currentThread() ? fce.a.a : new fce();
        this.j0 = new RectF();
        this.k0 = true;
        this.a = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        this.f0 = new a();
    }

    public final void b(Path path, RectF rectF) {
        b bVar = this.a;
        this.g0.a(bVar.a, bVar.i, rectF, this.f0, path);
        if (this.a.h != 1.0f) {
            Matrix matrix = this.f;
            matrix.reset();
            float f = this.a.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.j0, true);
    }

    public final int c(int i) {
        int i2;
        b bVar = this.a;
        float f = bVar.m + 0.0f + bVar.l;
        op4 op4Var = bVar.b;
        if (op4Var == null || !op4Var.a || eb2.e(i, 255) != op4Var.d) {
            return i;
        }
        float fMin = (op4Var.e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iG = hh1.G(eb2.e(i, 255), fMin, op4Var.b);
        if (fMin > 0.0f && (i2 = op4Var.c) != 0) {
            iG = eb2.c(eb2.e(i2, op4.f), iG);
        }
        return eb2.e(iG, iAlpha);
    }

    public final void d(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("ze9", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.a.o;
        Path path = this.V;
        zbe zbeVar = this.e0;
        if (i != 0) {
            canvas.drawPath(path, zbeVar.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            uce.f fVar = this.b[i2];
            int i3 = this.a.n;
            Matrix matrix = uce.f.a;
            fVar.a(matrix, zbeVar, i3, canvas);
            this.c[i2].a(matrix, zbeVar, this.a.n, canvas);
        }
        if (this.k0) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.a.o));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.a.o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, l0);
            canvas.translate(iSin, iCos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.h0;
        Paint paint = this.c0;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.a.k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.i0;
        Paint paint2 = this.d0;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.a.j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.a.k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.e;
        Path path = this.V;
        if (z) {
            float f = -(h() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            ece eceVar = this.a.a;
            ece.a aVarE = eceVar.e();
            s03 rzVar = eceVar.e;
            if (!(rzVar instanceof tyc)) {
                rzVar = new rz(f, rzVar);
            }
            aVarE.e = rzVar;
            s03 rzVar2 = eceVar.f;
            if (!(rzVar2 instanceof tyc)) {
                rzVar2 = new rz(f, rzVar2);
            }
            aVarE.f = rzVar2;
            s03 rzVar3 = eceVar.h;
            if (!(rzVar3 instanceof tyc)) {
                rzVar3 = new rz(f, rzVar3);
            }
            aVarE.h = rzVar3;
            s03 rzVar4 = eceVar.g;
            if (!(rzVar4 instanceof tyc)) {
                rzVar4 = new rz(f, rzVar4);
            }
            aVarE.g = rzVar4;
            ece eceVarA = aVarE.a();
            this.b0 = eceVarA;
            float f2 = this.a.i;
            RectF rectFG = g();
            RectF rectF = this.Y;
            rectF.set(rectFG);
            float strokeWidth = h() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.g0.a(eceVarA, f2, rectF, null, this.W);
            b(path, g());
            this.e = false;
        }
        b bVar = this.a;
        bVar.getClass();
        if (bVar.n > 0 && !this.a.a.d(g()) && !path.isConvex() && Build.VERSION.SDK_INT < 29) {
            canvas.save();
            canvas.translate((int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.a.o)), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.a.o)));
            if (this.k0) {
                RectF rectF2 = this.j0;
                int iWidth = (int) (rectF2.width() - getBounds().width());
                int iHeight = (int) (rectF2.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    r6.g("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    return;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.a.n * 2) + ((int) rectF2.width()) + iWidth, (this.a.n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f3 = (getBounds().left - this.a.n) - iWidth;
                float f4 = (getBounds().top - this.a.n) - iHeight;
                canvas2.translate(-f3, -f4);
                d(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                bitmapCreateBitmap.recycle();
                canvas.restore();
            } else {
                d(canvas);
                canvas.restore();
            }
        }
        b bVar2 = this.a;
        Paint.Style style = bVar2.p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, bVar2.a, g());
        }
        if (h()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, ece eceVar, RectF rectF) {
        if (!eceVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = eceVar.f.a(rectF) * this.a.i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void f(Canvas canvas) {
        ece eceVar = this.b0;
        RectF rectFG = g();
        RectF rectF = this.Y;
        rectF.set(rectFG);
        boolean zH = h();
        Paint paint = this.d0;
        float strokeWidth = zH ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, this.W, eceVar, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.X;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        this.a.getClass();
        if (this.a.a.d(g())) {
            outline.setRoundRect(getBounds(), this.a.a.e.a(g()) * this.a.i);
            return;
        }
        RectF rectFG = g();
        Path path = this.V;
        b(path, rectFG);
        if (path.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.Z;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.V;
        b(path, rectFG);
        Region region2 = this.a0;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h() {
        Paint.Style style = this.a.p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.d0.getStrokeWidth() > 0.0f;
    }

    public final void i(Context context) {
        this.a.b = new op4(context);
        n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.a.e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.a.getClass();
        ColorStateList colorStateList2 = this.a.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.a.c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(float f) {
        b bVar = this.a;
        if (bVar.m != f) {
            bVar.m = f;
            n();
        }
    }

    public final void k(ColorStateList colorStateList) {
        b bVar = this.a;
        if (bVar.c != colorStateList) {
            bVar.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean l(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.a.c == null || color2 == (colorForState2 = this.a.c.getColorForState(iArr, (color2 = (paint2 = this.c0).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.a.d == null || color == (colorForState = this.a.d.getColorForState(iArr, (color = (paint = this.d0).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.h0;
        PorterDuffColorFilter porterDuffColorFilter3 = this.i0;
        b bVar = this.a;
        ColorStateList colorStateList = bVar.e;
        PorterDuff.Mode mode = bVar.f;
        if (colorStateList == null || mode == null) {
            int color = this.c0.getColor();
            int iC = c(color);
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.h0 = porterDuffColorFilter;
        this.a.getClass();
        this.i0 = null;
        this.a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.h0) && Objects.equals(porterDuffColorFilter3, this.i0)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        b bVar = this.a;
        b bVar2 = new b();
        bVar2.c = null;
        bVar2.d = null;
        bVar2.e = null;
        bVar2.f = PorterDuff.Mode.SRC_IN;
        bVar2.g = null;
        bVar2.h = 1.0f;
        bVar2.i = 1.0f;
        bVar2.k = 255;
        bVar2.l = 0.0f;
        bVar2.m = 0.0f;
        bVar2.n = 0;
        bVar2.o = 0;
        bVar2.p = Paint.Style.FILL_AND_STROKE;
        bVar2.a = bVar.a;
        bVar2.b = bVar.b;
        bVar2.j = bVar.j;
        bVar2.c = bVar.c;
        bVar2.d = bVar.d;
        bVar2.f = bVar.f;
        bVar2.e = bVar.e;
        bVar2.k = bVar.k;
        bVar2.h = bVar.h;
        bVar2.o = bVar.o;
        bVar2.i = bVar.i;
        bVar2.l = bVar.l;
        bVar2.m = bVar.m;
        bVar2.n = bVar.n;
        bVar2.p = bVar.p;
        if (bVar.g != null) {
            bVar2.g = new Rect(bVar.g);
        }
        this.a = bVar2;
        return this;
    }

    public final void n() {
        b bVar = this.a;
        float f = bVar.m + 0.0f;
        bVar.n = (int) Math.ceil(0.75f * f);
        this.a.o = (int) Math.ceil(f * 0.25f);
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, vdf.b
    public boolean onStateChange(int[] iArr) {
        boolean z = l(iArr) || m();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        b bVar = this.a;
        if (bVar.k != i) {
            bVar.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.cde
    public final void setShapeAppearanceModel(ece eceVar) {
        this.a.a = eceVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.a.e = colorStateList;
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.a;
        if (bVar.f != mode) {
            bVar.f = mode;
            m();
            super.invalidateSelf();
        }
    }

    public ze9(Context context, AttributeSet attributeSet, int i, int i2) {
        this(ece.b(context, attributeSet, i, i2).a());
    }

    public ze9(ece eceVar) {
        b bVar = new b();
        bVar.c = null;
        bVar.d = null;
        bVar.e = null;
        bVar.f = PorterDuff.Mode.SRC_IN;
        bVar.g = null;
        bVar.h = 1.0f;
        bVar.i = 1.0f;
        bVar.k = 255;
        bVar.l = 0.0f;
        bVar.m = 0.0f;
        bVar.n = 0;
        bVar.o = 0;
        bVar.p = Paint.Style.FILL_AND_STROKE;
        bVar.a = eceVar;
        bVar.b = null;
        this(bVar);
    }

    public ze9() {
        this(new ece());
    }
}
