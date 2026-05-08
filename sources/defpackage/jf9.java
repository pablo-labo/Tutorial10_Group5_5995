package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class jf9 extends up5 {
    public int d;
    public int e;

    @Override // defpackage.up5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null && (this.d != drawable.getIntrinsicWidth() || this.e != drawable.getIntrinsicHeight())) {
            v();
        }
        super.draw(canvas);
    }

    @Override // defpackage.up5, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        v();
    }

    @Override // defpackage.up5
    public final Drawable u(Drawable drawable) {
        Drawable drawableU = super.u(drawable);
        v();
        return drawableU;
    }

    public final void v() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return;
        }
        Rect bounds = getBounds();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.d = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.e = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
        } else {
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
    }
}
