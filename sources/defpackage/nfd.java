package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class nfd extends up5 {
    public Drawable d;
    public dtg e;

    @Override // defpackage.up5, android.graphics.drawable.Drawable
    @SuppressLint({"WrongCall"})
    public final void draw(Canvas canvas) {
        if (isVisible()) {
            dtg dtgVar = this.e;
            if (dtgVar != null) {
                dtgVar.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.d.draw(canvas);
            }
        }
    }

    @Override // defpackage.up5, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // defpackage.up5, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // defpackage.up5, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        dtg dtgVar = this.e;
        if (dtgVar != null) {
            dtgVar.a(z);
        }
        return super.setVisible(z, z2);
    }

    public final void v(dtg dtgVar) {
        this.e = dtgVar;
    }
}
