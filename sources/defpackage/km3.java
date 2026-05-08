package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class km3 extends hm3 implements q82 {
    public Drawable d;
    public boolean e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d = null;
        this.e = true;
    }

    @Override // defpackage.l82, defpackage.b17
    public final int getHeight() {
        Drawable drawable = this.d;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicHeight());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.l82, defpackage.b17
    public final int getWidth() {
        Drawable drawable = this.d;
        if (drawable == null) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.q82
    public final Drawable i1() {
        Drawable.ConstantState constantState;
        Drawable drawable = this.d;
        if (drawable == null || (constantState = drawable.getConstantState()) == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    @Override // defpackage.l82
    public final int t0() {
        return getHeight() * getWidth() * 4;
    }
}
