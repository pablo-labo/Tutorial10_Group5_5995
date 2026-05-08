package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public final class vab extends ReplacementSpan {
    public Paint.FontMetricsInt V;
    public int W;
    public int X;
    public boolean Y;
    public final float a;
    public final int b;
    public final float c;
    public final int d;
    public final float e;
    public final int f;

    public vab(float f, int i, float f2, int i2, float f3, int i3) {
        this.a = f;
        this.b = i;
        this.c = f2;
        this.d = i2;
        this.e = f3;
        this.f = i3;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.V;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        wl7.g("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.Y) {
            be7.c("PlaceholderSpan is not laid out yet.");
        }
        return this.X;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        double dCeil;
        this.Y = true;
        float textSize = paint.getTextSize();
        this.V = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            be7.a("Invalid fontMetrics: line height can not be negative.");
        }
        float f2 = this.e;
        float f3 = this.a;
        int i3 = this.b;
        if (i3 == 0) {
            f = f3 * f2;
        } else {
            if (i3 != 1) {
                be7.b("Unsupported unit.");
                r40.e();
                return 0;
            }
            f = f3 * textSize;
        }
        this.W = (int) Math.ceil(f);
        float f4 = this.c;
        int i4 = this.d;
        if (i4 == 0) {
            dCeil = Math.ceil(f4 * f2);
        } else {
            if (i4 != 1) {
                be7.b("Unsupported unit.");
                r40.e();
                return 0;
            }
            dCeil = Math.ceil(f4 * textSize);
        }
        this.X = (int) dCeil;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                    }
                    break;
                case 1:
                case 4:
                    if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int iB = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iB;
                        fontMetricsInt.descent = b() + iB;
                    }
                    break;
                default:
                    be7.a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.Y) {
            be7.c("PlaceholderSpan is not laid out yet.");
        }
        return this.W;
    }
}
