package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class kwa extends Drawable {
    public final Context a;
    public aj1 b;
    public final float c = 0.8f;
    public float d = 0.0f;
    public mwa e;
    public int f;
    public float g;
    public final Paint h;
    public cn2 i;
    public final RectF j;
    public final Path k;

    public kwa(Context context, aj1 aj1Var) {
        this.a = context;
        this.b = aj1Var;
        mwa mwaVar = mwa.b;
        this.e = mwaVar;
        this.f = -16777216;
        this.g = 0.0f;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-16777216);
        paint.setStrokeWidth(0.0f);
        paint.setPathEffect(b(mwaVar, 0.0f));
        this.h = paint;
        this.j = new RectF();
        this.k = new Path();
    }

    public static float a(float f, float f2, float f3) {
        if (f == 0.0f) {
            return 0.0f;
        }
        return (f2 * 0.5f) + f + f3;
    }

    public static DashPathEffect b(mwa mwaVar, float f) {
        int iOrdinal = mwaVar.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            float f2 = f * 3.0f;
            return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
        }
        if (iOrdinal == 2) {
            return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
        }
        l.g();
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        q03 q03Var;
        q03 q03Var2;
        q03 q03Var3;
        q03 q03Var4;
        canvas.getClass();
        if (this.g == 0.0f) {
            return;
        }
        Path path = this.k;
        path.reset();
        aj1 aj1Var = this.b;
        this.i = aj1Var != null ? aj1Var.c(getLayoutDirection(), this.a, nn2.C(getBounds().width()), nn2.C(getBounds().height())) : null;
        Rect bounds = getBounds();
        RectF rectF = this.j;
        rectF.set(bounds);
        float f = rectF.top;
        float f2 = ((this.g * 0.5f) + this.d) - this.c;
        rectF.top = f - f2;
        rectF.bottom += f2;
        rectF.left -= f2;
        rectF.right = f2 + rectF.right;
        cn2 cn2Var = this.i;
        Paint paint = this.h;
        if (cn2Var == null || !cn2Var.a()) {
            path.addRect(rectF, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        cn2 cn2Var2 = this.i;
        q03 q03Var5 = (cn2Var2 == null || (q03Var4 = cn2Var2.a) == null) ? new q03(0.0f, 0.0f) : q03Var4.a();
        cn2 cn2Var3 = this.i;
        q03 q03Var6 = (cn2Var3 == null || (q03Var3 = cn2Var3.b) == null) ? new q03(0.0f, 0.0f) : q03Var3.a();
        cn2 cn2Var4 = this.i;
        q03 q03Var7 = (cn2Var4 == null || (q03Var2 = cn2Var4.c) == null) ? new q03(0.0f, 0.0f) : q03Var2.a();
        cn2 cn2Var5 = this.i;
        q03 q03Var8 = (cn2Var5 == null || (q03Var = cn2Var5.d) == null) ? new q03(0.0f, 0.0f) : q03Var.a();
        path.addRoundRect(rectF, new float[]{a(q03Var5.a, this.g, this.d), a(q03Var5.b, this.g, this.d), a(q03Var6.a, this.g, this.d), a(q03Var6.b, this.g, this.d), a(q03Var8.a, this.g, this.d), a(q03Var8.b, this.g, this.d), a(q03Var7.a, this.g, this.d), a(q03Var7.b, this.g, this.d)}, Path.Direction.CW);
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.drawable.Drawable
    @sy3
    public final int getOpacity() {
        int alpha = this.h.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.h.setAlpha(gf9.b((Color.alpha(this.f) / 255.0f) * (i / 255.0f) * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.h.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
