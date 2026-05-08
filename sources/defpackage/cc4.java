package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class cc4 {
    public static final void a(Drawable drawable, Drawable drawable2) {
        if (drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static final int b(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(Drawable drawable, Drawable.Callback callback, krf krfVar) {
        if (drawable == 0) {
            return;
        }
        drawable.setCallback(callback);
        jrf jrfVar = drawable instanceof jrf ? (jrf) drawable : null;
        if (jrfVar != null) {
            jrfVar.f(krfVar);
        }
    }

    public static final void d(Drawable drawable, vb4 vb4Var) {
        if (drawable == null || vb4Var == null) {
            return;
        }
        int i = vb4Var.a;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (vb4Var.b) {
            drawable.setColorFilter(vb4Var.c);
        }
        int i2 = vb4Var.d;
        if (i2 != -1) {
            drawable.setDither(i2 != 0);
        }
        int i3 = vb4Var.e;
        if (i3 != -1) {
            drawable.setFilterBitmap(i3 != 0);
        }
    }
}
