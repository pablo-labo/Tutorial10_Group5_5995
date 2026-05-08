package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class sbc extends tpc {
    public Bitmap a;
    public boolean b;
    public Paint c;
    public PorterDuffXfermode d;
    public int e;

    @Override // defpackage.tpc, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Bitmap bitmapCreateBitmap;
        Paint paint = this.c;
        super.dispatchDraw(canvas);
        if (this.b) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                childAt.setVisibility(0);
                Bitmap bitmap = this.a;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                if (childAt.getMeasuredWidth() <= 0 || childAt.getMeasuredHeight() <= 0) {
                    bitmapCreateBitmap = null;
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    childAt.draw(new Canvas(bitmapCreateBitmap));
                }
                this.a = bitmapCreateBitmap;
                childAt.setVisibility(4);
            }
            this.b = false;
        }
        if (this.a != null) {
            setLayerType(this.e, paint);
            paint.setXfermode(this.d);
            canvas.drawBitmap(this.a, 0.0f, 0.0f, paint);
            paint.setXfermode(null);
        }
    }

    @Override // defpackage.tpc, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        View childAt;
        super.onDescendantInvalidated(view, view2);
        if (!this.b && (childAt = getChildAt(0)) != null && childAt.equals(view)) {
            this.b = true;
        }
        invalidate();
    }

    @Override // defpackage.tpc, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.b = true;
        }
    }

    public void setRenderingMode(String str) {
        this.e = str.equals("software") ? 1 : 2;
    }
}
