package defpackage;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class exa extends Drawable {
    public final Context a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public aj1 f;
    public final Paint g;

    public exa(Context context, int i, float f, float f2, float f3, float f4, aj1 aj1Var) {
        this.a = context;
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = f4;
        this.f = aj1Var;
        Paint paint = new Paint();
        paint.setColor(i);
        float fG = nn2.G(f3 * 0.5f);
        float f5 = fG > 0.5f ? (fG - 0.5f) / 0.57735f : 0.0f;
        if (f5 > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(f5, BlurMaskFilter.Blur.NORMAL));
        }
        this.g = paint;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0166  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r24) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exa.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    @sy3
    public final int getOpacity() {
        int alpha = this.g.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.g.setAlpha(gf9.b((Color.alpha(this.b) / 255.0f) * (i / 255.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
