package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class gwa extends up5 {
    public final Matrix V;
    public final RectF W;
    public final Matrix d;
    public final int e;
    public final int f;

    public gwa(BitmapDrawable bitmapDrawable, int i, int i2) {
        super(bitmapDrawable);
        this.d = new Matrix();
        this.e = i - (i % 90);
        this.f = (i2 < 0 || i2 > 8) ? 0 : i2;
        this.V = new Matrix();
        this.W = new RectF();
    }

    @Override // defpackage.up5, defpackage.krf
    public final void b(Matrix matrix) {
        matrix.getClass();
        t(matrix);
        Matrix matrix2 = this.d;
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    @Override // defpackage.up5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        canvas.getClass();
        if (this.e <= 0 && ((i = this.f) == 0 || i == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.d);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.up5, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.f;
        return (i == 5 || i == 7 || this.e % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // defpackage.up5, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.f;
        return (i == 5 || i == 7 || this.e % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // defpackage.up5, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        rect.getClass();
        Drawable drawable = this.a;
        if (drawable == null) {
            return;
        }
        int i = this.f;
        int i2 = this.e;
        if (i2 <= 0 && (i == 0 || i == 1)) {
            drawable.setBounds(rect);
            return;
        }
        Matrix matrix = this.d;
        if (i == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i == 7) {
            matrix.setRotate(270.0f, rect.centerX(), rect.centerY());
            matrix.postScale(-1.0f, 1.0f);
        } else if (i == 4) {
            matrix.setScale(1.0f, -1.0f);
        } else if (i != 5) {
            matrix.setRotate(i2, rect.centerX(), rect.centerY());
        } else {
            matrix.setRotate(270.0f, rect.centerX(), rect.centerY());
            matrix.postScale(1.0f, -1.0f);
        }
        Matrix matrix2 = this.V;
        matrix2.reset();
        matrix.invert(matrix2);
        RectF rectF = this.W;
        rectF.set(rect);
        matrix2.mapRect(rectF);
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
