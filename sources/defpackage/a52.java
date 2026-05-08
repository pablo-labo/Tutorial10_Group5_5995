package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class a52 extends Drawable implements Animatable {
    public static final LinearInterpolator V = new LinearInterpolator();
    public static final s65 W = new s65();
    public static final int[] X = {-16777216};
    public final a a;
    public float b;
    public final Resources c;
    public final ValueAnimator d;
    public float e;
    public boolean f;

    public static class a {
        public final RectF a = new RectF();
        public final Paint b;
        public final Paint c;
        public final Paint d;
        public float e;
        public float f;
        public float g;
        public float h;
        public int[] i;
        public int j;
        public float k;
        public float l;
        public float m;
        public boolean n;
        public Path o;
        public float p;
        public float q;
        public int r;
        public int s;
        public int t;
        public int u;

        public a() {
            Paint paint = new Paint();
            this.b = paint;
            Paint paint2 = new Paint();
            this.c = paint2;
            Paint paint3 = new Paint();
            this.d = paint3;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 5.0f;
            this.p = 1.0f;
            this.t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public final void a(int i) {
            this.j = i;
            this.u = this.i[i];
        }
    }

    public a52(Context context) {
        context.getClass();
        this.c = context.getResources();
        a aVar = new a();
        this.a = aVar;
        aVar.i = X;
        aVar.a(0);
        aVar.h = 2.5f;
        aVar.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new y42(this, aVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(V);
        valueAnimatorOfFloat.addListener(new z42(this, aVar));
        this.d = valueAnimatorOfFloat;
    }

    public static void d(float f, a aVar) {
        if (f <= 0.75f) {
            aVar.u = aVar.i[aVar.j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = aVar.i;
        int i = aVar.j;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        aVar.u = ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r1) * f2))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r3) * f2))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r4) * f2))) << 8) | ((i2 & 255) + ((int) (f2 * ((i3 & 255) - r2))));
    }

    public final void a(float f, a aVar, boolean z) {
        float interpolation;
        if (this.f) {
            d(f, aVar);
            float fFloor = (float) (Math.floor(aVar.m / 0.8f) + 1.0d);
            float f2 = aVar.k;
            float f3 = aVar.l;
            aVar.e = (((f3 - 0.01f) - f2) * f) + f2;
            aVar.f = f3;
            float f4 = aVar.m;
            aVar.g = k6.b(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = aVar.m;
            float interpolation2 = aVar.k;
            s65 s65Var = W;
            if (f < 0.5f) {
                interpolation = (s65Var.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation2;
            } else {
                float f6 = interpolation2 + 0.79f;
                interpolation2 = f6 - (((1.0f - s65Var.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.e) * 216.0f;
            aVar.e = interpolation2;
            aVar.f = interpolation;
            aVar.g = f7;
            this.b = f8;
        }
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = this.c.getDisplayMetrics().density;
        float f6 = f2 * f5;
        a aVar = this.a;
        aVar.h = f6;
        aVar.b.setStrokeWidth(f6);
        aVar.q = f * f5;
        aVar.a(0);
        aVar.r = (int) (f3 * f5);
        aVar.s = (int) (f4 * f5);
    }

    public final void c(int i) {
        if (i == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.b, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.a;
        Paint paint = aVar.b;
        RectF rectF = aVar.a;
        float f = aVar.q;
        float fMin = (aVar.h / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((aVar.r * aVar.p) / 2.0f, aVar.h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = aVar.e;
        float f3 = aVar.g;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((aVar.f + f3) * 360.0f) - f4;
        paint.setColor(aVar.u);
        paint.setAlpha(aVar.t);
        float f6 = aVar.h / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.d);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        Paint paint2 = aVar.c;
        if (aVar.n) {
            Path path = aVar.o;
            if (path == null) {
                Path path2 = new Path();
                aVar.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (aVar.r * aVar.p) / 2.0f;
            aVar.o.moveTo(0.0f, 0.0f);
            aVar.o.lineTo(aVar.r * aVar.p, 0.0f);
            Path path3 = aVar.o;
            float f9 = aVar.r;
            float f10 = aVar.p;
            path3.lineTo((f9 * f10) / 2.0f, aVar.s * f10);
            aVar.o.offset((rectF.centerX() + fMin2) - f8, (aVar.h / 2.0f) + rectF.centerY());
            aVar.o.close();
            paint2.setColor(aVar.u);
            paint2.setAlpha(aVar.t);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.d;
        valueAnimator.cancel();
        a aVar = this.a;
        float f = aVar.e;
        aVar.k = f;
        float f2 = aVar.f;
        aVar.l = f2;
        aVar.m = aVar.g;
        if (f2 != f) {
            this.f = true;
            valueAnimator.setDuration(666L);
            valueAnimator.start();
            return;
        }
        aVar.a(0);
        aVar.k = 0.0f;
        aVar.l = 0.0f;
        aVar.m = 0.0f;
        aVar.e = 0.0f;
        aVar.f = 0.0f;
        aVar.g = 0.0f;
        valueAnimator.setDuration(1332L);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d.cancel();
        this.b = 0.0f;
        a aVar = this.a;
        if (aVar.n) {
            aVar.n = false;
        }
        aVar.a(0);
        aVar.k = 0.0f;
        aVar.l = 0.0f;
        aVar.m = 0.0f;
        aVar.e = 0.0f;
        aVar.f = 0.0f;
        aVar.g = 0.0f;
        invalidateSelf();
    }
}
