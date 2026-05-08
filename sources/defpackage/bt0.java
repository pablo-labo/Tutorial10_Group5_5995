package defpackage;

import android.annotation.TargetApi;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public class bt0 extends Drawable implements Drawable.Callback, krf, jrf {
    public krf a;
    public final Drawable[] c;
    public final ub4[] d;
    public final vb4 b = new vb4();
    public final Rect e = new Rect();
    public boolean f = false;
    public boolean V = false;
    public boolean W = false;

    public bt0(Drawable[] drawableArr) {
        int i = 0;
        this.c = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.c;
            if (i >= drawableArr2.length) {
                this.d = new ub4[drawableArr2.length];
                return;
            } else {
                cc4.c(drawableArr2[i], this, this);
                i++;
            }
        }
    }

    public final Drawable a(int i) {
        web.e(Boolean.valueOf(i >= 0));
        Drawable[] drawableArr = this.c;
        web.e(Boolean.valueOf(i < drawableArr.length));
        return drawableArr[i];
    }

    @Override // defpackage.krf
    public final void b(Matrix matrix) {
        krf krfVar = this.a;
        if (krfVar != null) {
            krfVar.b(matrix);
        } else {
            matrix.reset();
        }
    }

    public final Drawable c(int i, Drawable drawable) {
        web.e(Boolean.valueOf(i >= 0));
        Drawable[] drawableArr = this.c;
        web.e(Boolean.valueOf(i < drawableArr.length));
        Drawable drawable2 = drawableArr[i];
        if (drawable != drawable2) {
            if (drawable != null && this.W) {
                drawable.mutate();
            }
            cc4.c(drawableArr[i], null, null);
            cc4.c(drawable, null, null);
            cc4.d(drawable, this.b);
            cc4.a(drawable, this);
            cc4.c(drawable, this, this);
            this.V = false;
            drawableArr[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // defpackage.jrf
    public final void f(krf krfVar) {
        this.a = krfVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable[] drawableArr = this.c;
        if (drawableArr.length == 0) {
            return -2;
        }
        int iResolveOpacity = -1;
        for (int i = 1; i < drawableArr.length; i++) {
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
            }
        }
        return iResolveOpacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                Rect rect2 = this.e;
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (!this.V) {
            this.f = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.c;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.f;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f = z2 | z;
                i++;
            }
            this.V = true;
        }
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                this.W = true;
                return this;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.mutate();
            }
            i++;
        }
    }

    @Override // defpackage.krf
    public final void o(RectF rectF) {
        krf krfVar = this.a;
        if (krfVar != null) {
            krfVar.o(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        vb4 vb4Var = this.b;
        vb4Var.c = colorFilter;
        int i = 0;
        vb4Var.b = colorFilter != null;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.b.d = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setDither(z);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.b.e = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setFilterBitmap(z);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setHotspot(f, f2);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.c;
            if (i >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
