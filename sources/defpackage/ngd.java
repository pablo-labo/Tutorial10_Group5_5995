package defpackage;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes2.dex */
public final class ngd extends mgd {
    @Override // defpackage.mgd, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        it5.a();
        if (!this.b) {
            super.draw(canvas);
            it5.a();
            return;
        }
        b();
        a();
        canvas.clipPath(this.c);
        super.draw(canvas);
        it5.a();
    }
}
