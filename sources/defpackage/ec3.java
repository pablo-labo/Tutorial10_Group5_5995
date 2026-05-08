package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ec3 extends ze9 {
    public final Paint m0;
    public final RectF n0;
    public int o0;

    public ec3(ece eceVar) {
        super(eceVar == null ? new ece() : eceVar);
        Paint paint = new Paint(1);
        this.m0 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.n0 = new RectF();
    }

    @Override // defpackage.ze9, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            this.o0 = canvas2.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }
        super.draw(canvas2);
        if (getCallback() instanceof View) {
            return;
        }
        canvas2.restoreToCount(this.o0);
    }

    @Override // defpackage.ze9
    public final void f(Canvas canvas) {
        RectF rectF = this.n0;
        if (rectF.isEmpty()) {
            super.f(canvas);
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        super.f(canvas2);
        canvas2.drawRect(rectF, this.m0);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
    }

    public final void o(float f, float f2, float f3, float f4) {
        RectF rectF = this.n0;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public ec3() {
        this(null);
    }
}
