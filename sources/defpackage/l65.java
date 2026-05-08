package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class l65 extends bt0 {
    public final Drawable[] X;
    public final int Y;
    public int Z;
    public int a0;
    public long b0;
    public final int[] c0;
    public final int[] d0;
    public int e0;
    public final boolean[] f0;
    public int g0;
    public boolean h0;
    public final boolean i0;

    public l65(Drawable[] drawableArr) {
        super(drawableArr);
        this.i0 = true;
        if (!(drawableArr.length >= 1)) {
            r6.g("At least one layer required!");
            throw null;
        }
        this.X = drawableArr;
        int[] iArr = new int[drawableArr.length];
        this.c0 = iArr;
        int[] iArr2 = new int[drawableArr.length];
        this.d0 = iArr2;
        this.e0 = 255;
        boolean[] zArr = new boolean[drawableArr.length];
        this.f0 = zArr;
        this.g0 = 0;
        this.Y = 2;
        this.Z = 2;
        Arrays.fill(iArr, 0);
        iArr[0] = 255;
        Arrays.fill(iArr2, 0);
        iArr2[0] = 255;
        Arrays.fill(zArr, false);
        zArr[0] = true;
    }

    public final void d() {
        this.g0--;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean zG;
        int i;
        int i2 = this.Z;
        Drawable[] drawableArr = this.X;
        int[] iArr = this.d0;
        if (i2 == 0) {
            System.arraycopy(iArr, 0, this.c0, 0, drawableArr.length);
            this.b0 = SystemClock.uptimeMillis();
            zG = g(this.a0 == 0 ? 1.0f : 0.0f);
            if (!this.h0 && (i = this.Y) >= 0) {
                boolean[] zArr = this.f0;
                if (i < zArr.length && zArr[i]) {
                    this.h0 = true;
                }
            }
            this.Z = zG ? 2 : 1;
        } else if (i2 != 1) {
            zG = true;
        } else {
            web.i(this.a0 > 0);
            zG = g((SystemClock.uptimeMillis() - this.b0) / this.a0);
            this.Z = zG ? 2 : 1;
        }
        for (int i3 = 0; i3 < drawableArr.length; i3++) {
            Drawable drawable = drawableArr[i3];
            int iCeil = (int) Math.ceil(((double) (iArr[i3] * this.e0)) / 255.0d);
            if (drawable != null && iCeil > 0) {
                this.g0++;
                if (this.i0) {
                    drawable.mutate();
                }
                drawable.setAlpha(iCeil);
                this.g0--;
                drawable.draw(canvas);
            }
        }
        if (!zG) {
            invalidateSelf();
        } else if (this.h0) {
            this.h0 = false;
        }
    }

    public final void e() {
        this.Z = 2;
        for (int i = 0; i < this.X.length; i++) {
            this.d0[i] = this.f0[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    public final boolean g(float f) {
        boolean z = true;
        for (int i = 0; i < this.X.length; i++) {
            boolean z2 = this.f0[i];
            int i2 = (int) (((z2 ? 1 : -1) * 255 * f) + this.c0[i]);
            int[] iArr = this.d0;
            iArr[i] = i2;
            if (i2 < 0) {
                iArr[i] = 0;
            }
            if (iArr[i] > 255) {
                iArr[i] = 255;
            }
            if (z2 && iArr[i] < 255) {
                z = false;
            }
            if (!z2 && iArr[i] > 0) {
                z = false;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.e0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.g0 == 0) {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.e0 != i) {
            this.e0 = i;
            invalidateSelf();
        }
    }
}
