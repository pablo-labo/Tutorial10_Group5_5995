package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class zmd extends up5 {
    public int V;
    public Matrix W;
    public final Matrix X;
    public dnd d;
    public Object e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmd(Drawable drawable, dnd dndVar) {
        super(drawable);
        dndVar.getClass();
        this.X = new Matrix();
        this.d = dndVar;
    }

    @Override // defpackage.up5, defpackage.krf
    public final void b(Matrix matrix) {
        matrix.getClass();
        t(matrix);
        w();
        Matrix matrix2 = this.W;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // defpackage.up5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        w();
        if (this.W == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.W);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.up5, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        rect.getClass();
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
            this.V = 0;
            this.f = 0;
            this.W = null;
            return;
        }
        Rect bounds = getBounds();
        bounds.getClass();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.V = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
            this.W = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            drawable.setBounds(bounds);
            this.W = null;
        } else {
            if (this.d == ind.b) {
                drawable.setBounds(bounds);
                this.W = null;
                return;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            Matrix matrix = this.X;
            matrix.reset();
            this.d.f(matrix, bounds, intrinsicWidth, intrinsicHeight, 0.5f, 0.5f);
            this.W = matrix;
        }
    }

    public final void w() {
        boolean z;
        dnd dndVar = this.d;
        if (dndVar instanceof jnd) {
            dndVar.getClass();
            Object state = ((jnd) dndVar).getState();
            state.getClass();
            z = !state.equals(this.e);
            this.e = state;
        } else {
            z = false;
        }
        Drawable drawable = this.a;
        if (drawable == null) {
            return;
        }
        if (this.f == drawable.getIntrinsicWidth() && this.V == drawable.getIntrinsicHeight() && !z) {
            return;
        }
        v();
    }
}
