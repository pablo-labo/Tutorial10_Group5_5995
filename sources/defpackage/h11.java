package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class h11 extends up5 implements Runnable {
    public boolean V;
    public int d;
    public boolean e;
    public float f;

    @Override // defpackage.up5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.f;
        if (!this.e) {
            f = 360.0f - f;
        }
        canvas.rotate(f, (i / 2) + r3, (i2 / 2) + r1);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        if (this.V) {
            return;
        }
        this.V = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.V = false;
        this.f += (int) ((20.0f / this.d) * 360.0f);
        invalidateSelf();
    }
}
