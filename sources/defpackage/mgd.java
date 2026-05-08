package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mgd extends Drawable implements agd, jrf {
    public final Drawable a;
    public krf i0;
    public boolean b = false;
    public final Path c = new Path();
    public boolean d = true;
    public final Path e = new Path();
    public final float[] f = new float[8];
    public final float[] V = new float[8];
    public final RectF W = new RectF();
    public final RectF X = new RectF();
    public final RectF Y = new RectF();
    public final RectF Z = new RectF();
    public final Matrix a0 = new Matrix();
    public final Matrix b0 = new Matrix();
    public final Matrix c0 = new Matrix();
    public final Matrix d0 = new Matrix();
    public final Matrix e0 = new Matrix();
    public final Matrix f0 = new Matrix();
    public boolean g0 = false;
    public boolean h0 = true;

    public mgd(Drawable drawable) {
        this.a = drawable;
    }

    public final void a() {
        if (!this.h0) {
            return;
        }
        Path path = this.e;
        path.reset();
        RectF rectF = this.W;
        rectF.inset(0.0f, 0.0f);
        int i = 0;
        while (true) {
            float[] fArr = this.V;
            int length = fArr.length;
            float[] fArr2 = this.f;
            if (i >= length) {
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF, fArr, direction);
                rectF.inset(-0.0f, -0.0f);
                Path path2 = this.c;
                path2.reset();
                rectF.inset(0.0f, 0.0f);
                path2.addRoundRect(rectF, fArr2, direction);
                rectF.inset(-0.0f, -0.0f);
                path2.setFillType(Path.FillType.WINDING);
                this.h0 = false;
                return;
            }
            fArr[i] = (fArr2[i] + 0.0f) - 0.0f;
            i++;
        }
    }

    public void b() {
        krf krfVar = this.i0;
        RectF rectF = this.W;
        Matrix matrix = this.c0;
        if (krfVar != null) {
            krfVar.b(matrix);
            this.i0.o(rectF);
        } else {
            matrix.reset();
            rectF.set(getBounds());
        }
        Drawable drawable = this.a;
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF2 = this.Y;
        rectF2.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        Rect bounds = drawable.getBounds();
        RectF rectF3 = this.Z;
        rectF3.set(bounds);
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        Matrix matrix2 = this.a0;
        matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
        Matrix matrix3 = this.d0;
        boolean zEquals = matrix.equals(matrix3);
        Matrix matrix4 = this.b0;
        if (!zEquals || !matrix2.equals(matrix4)) {
            this.d = true;
            matrix.invert(this.e0);
            Matrix matrix5 = this.f0;
            matrix5.set(matrix);
            matrix5.preConcat(matrix2);
            matrix3.set(matrix);
            matrix4.set(matrix2);
        }
        RectF rectF4 = this.X;
        if (rectF.equals(rectF4)) {
            return;
        }
        this.h0 = true;
        rectF4.set(rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.a.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        it5.a();
        this.a.draw(canvas);
        it5.a();
    }

    @Override // defpackage.jrf
    public final void f(krf krfVar) {
        this.i0 = krfVar;
    }

    @Override // defpackage.agd
    public final void g() {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.getOpacity();
    }

    @Override // defpackage.agd
    public final void h() {
    }

    @Override // defpackage.agd
    public final void i() {
        Arrays.fill(this.f, 0.0f);
        this.b = false;
        this.h0 = true;
        invalidateSelf();
    }

    @Override // defpackage.agd
    public final void k(boolean z) {
        if (this.g0 != z) {
            this.g0 = z;
            invalidateSelf();
        }
    }

    @Override // defpackage.agd
    public final void m() {
        this.h0 = true;
        invalidateSelf();
    }

    public void n() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    @Override // defpackage.agd
    public final void r() {
    }

    @Override // defpackage.agd
    public final void s(float[] fArr) {
        float[] fArr2 = this.f;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
            this.b = false;
        } else {
            web.f("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
            this.b = false;
            for (int i = 0; i < 8; i++) {
                this.b |= fArr[i] > 0.0f;
            }
        }
        this.h0 = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        this.a.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
