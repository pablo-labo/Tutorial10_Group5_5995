package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class egd extends Drawable implements agd {
    public final int V;
    public final float[] a = new float[8];
    public final float[] b = new float[8];
    public final Paint c = new Paint(1);
    public boolean d = false;
    public final Path e = new Path();
    public final Path f = new Path();
    public final RectF W = new RectF();
    public int X = 255;

    public egd(int i) {
        this.V = 0;
        if (this.V != i) {
            this.V = i;
            invalidateSelf();
        }
    }

    public final void a() {
        Path path = this.e;
        path.reset();
        Path path2 = this.f;
        path2.reset();
        Rect bounds = getBounds();
        RectF rectF = this.W;
        rectF.set(bounds);
        rectF.inset(0.0f, 0.0f);
        int i = 0;
        while (true) {
            float[] fArr = this.b;
            int length = fArr.length;
            float[] fArr2 = this.a;
            if (i >= length) {
                Path.Direction direction = Path.Direction.CW;
                path2.addRoundRect(rectF, fArr, direction);
                rectF.inset(-0.0f, -0.0f);
                rectF.inset(0.0f, 0.0f);
                path.addRoundRect(rectF, fArr2, direction);
                rectF.inset(-0.0f, -0.0f);
                return;
            }
            fArr[i] = (fArr2[i] + 0.0f) - 0.0f;
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iB = cc4.b(this.V, this.X);
        Paint paint = this.c;
        paint.setColor(iB);
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(this.d);
        canvas.drawPath(this.e, paint);
    }

    @Override // defpackage.agd
    public final void g() {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.X;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int iB = cc4.b(this.V, this.X) >>> 24;
        if (iB != 0) {
            return iB != 255 ? -3 : -1;
        }
        return -2;
    }

    @Override // defpackage.agd
    public final void h() {
    }

    @Override // defpackage.agd
    public final void i() {
        Arrays.fill(this.a, 0.0f);
        a();
        invalidateSelf();
    }

    @Override // defpackage.agd
    public final void k(boolean z) {
        if (this.d != z) {
            this.d = z;
            invalidateSelf();
        }
    }

    @Override // defpackage.agd
    public final void m() {
        a();
        invalidateSelf();
    }

    @Override // defpackage.agd
    public final void n() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
    }

    @Override // defpackage.agd
    public final void r() {
    }

    @Override // defpackage.agd
    public final void s(float[] fArr) {
        float[] fArr2 = this.a;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            web.f("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        a();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.X) {
            this.X = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
