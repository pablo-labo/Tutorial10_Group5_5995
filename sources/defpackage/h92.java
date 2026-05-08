package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class h92 {
    public float A;
    public float B;
    public int[] C;
    public boolean D;
    public final TextPaint E;
    public final TextPaint F;
    public TimeInterpolator G;
    public TimeInterpolator H;
    public float I;
    public float J;
    public float K;
    public ColorStateList L;
    public float M;
    public StaticLayout N;
    public float O;
    public CharSequence P;
    public final TextInputLayout a;
    public boolean b;
    public float c;
    public final Rect d;
    public final Rect e;
    public final RectF f;
    public int g = 16;
    public int h = 16;
    public float i = 15.0f;
    public float j = 15.0f;
    public ColorStateList k;
    public ColorStateList l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public nw1 v;
    public CharSequence w;
    public CharSequence x;
    public boolean y;
    public Bitmap z;

    public h92(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.E = textPaint;
        this.F = new TextPaint(textPaint);
        this.e = new Rect();
        this.d = new Rect();
        this.f = new RectF();
    }

    public static int a(int i, float f, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float f(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return be0.a(f, f2, f3);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap<View, prg> weakHashMap = epg.a;
        return (this.a.getLayoutDirection() == 1 ? tdf.d : tdf.c).b(charSequence, charSequence.length());
    }

    public final void c(float f) {
        boolean z;
        float f2;
        boolean z2;
        if (this.w == null) {
            return;
        }
        float fWidth = this.e.width();
        float fWidth2 = this.d.width();
        if (Math.abs(f - this.j) < 0.001f) {
            f2 = this.j;
            this.A = 1.0f;
            Typeface typeface = this.u;
            Typeface typeface2 = this.s;
            if (typeface != typeface2) {
                this.u = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f3 = this.i;
            Typeface typeface3 = this.u;
            Typeface typeface4 = this.t;
            if (typeface3 != typeface4) {
                this.u = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (Math.abs(f - f3) < 0.001f) {
                this.A = 1.0f;
            } else {
                this.A = f / this.i;
            }
            float f4 = this.j / this.i;
            fWidth = fWidth2 * f4 > fWidth ? Math.min(fWidth / f4, fWidth2) : fWidth2;
            f2 = f3;
            z2 = z;
        }
        if (fWidth > 0.0f) {
            z2 = this.B != f2 || this.D || z2;
            this.B = f2;
            this.D = false;
        }
        if (this.x == null || z2) {
            float f5 = this.B;
            TextPaint textPaint = this.E;
            textPaint.setTextSize(f5);
            textPaint.setTypeface(this.u);
            textPaint.setLinearText(this.A != 1.0f);
            boolean zB = b(this.w);
            this.y = zB;
            CharSequence charSequence = this.w;
            int i = (int) fWidth;
            int length = charSequence.length();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
            if (charSequence == null) {
                charSequence = "";
            }
            int iMax = Math.max(0, i);
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(charSequence, textPaint, iMax, truncateAt);
            int iMin = Math.min(charSequenceEllipsize.length(), length);
            if (zB) {
                alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
            builderObtain.setAlignment(alignment2);
            builderObtain.setIncludePad(false);
            builderObtain.setTextDirection(zB ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            if (truncateAt != null) {
                builderObtain.setEllipsize(truncateAt);
            }
            builderObtain.setMaxLines(1);
            if (1.0f != 1.0f) {
                builderObtain.setLineSpacing(0.0f, 1.0f);
            }
            StaticLayout staticLayoutBuild = builderObtain.build();
            staticLayoutBuild.getClass();
            this.N = staticLayoutBuild;
            this.x = staticLayoutBuild.getText();
        }
    }

    public final float d() {
        float f = this.j;
        TextPaint textPaint = this.F;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.s);
        textPaint.setLetterSpacing(this.M);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.C;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r2 = this;
            android.graphics.Rect r0 = r2.e
            int r1 = r0.width()
            if (r1 <= 0) goto L1e
            int r0 = r0.height()
            if (r0 <= 0) goto L1e
            android.graphics.Rect r0 = r2.d
            int r1 = r0.width()
            if (r1 <= 0) goto L1e
            int r0 = r0.height()
            if (r0 <= 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r2.b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h92.g():void");
    }

    public final void h() {
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) {
            return;
        }
        float f = this.B;
        c(this.j);
        CharSequence charSequence = this.x;
        TextPaint textPaint = this.E;
        if (charSequence != null && (staticLayout = this.N) != null) {
            this.P = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        if (this.P != null) {
            TextPaint textPaint2 = new TextPaint(textPaint);
            textPaint2.setLetterSpacing(this.M);
            CharSequence charSequence2 = this.P;
            this.O = textPaint2.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.O = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.h, this.y ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.e;
        if (i == 48) {
            this.n = rect.top;
        } else if (i != 80) {
            this.n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.n = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.p = rect.centerX() - (this.O / 2.0f);
        } else if (i2 != 5) {
            this.p = rect.left;
        } else {
            this.p = rect.right - this.O;
        }
        c(this.i);
        float height = this.N != null ? r3.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.N;
        if (staticLayout2 != null) {
            staticLayout2.getLineCount();
        }
        CharSequence charSequence3 = this.x;
        float fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout3 = this.N;
        if (staticLayout3 != null) {
            staticLayout3.getLineLeft(0);
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.g, this.y ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.d;
        if (i3 == 48) {
            this.m = rect2.top;
        } else if (i3 != 80) {
            this.m = rect2.centerY() - (height / 2.0f);
        } else {
            this.m = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.o = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.o = rect2.left;
        } else {
            this.o = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.z;
        if (bitmap != null) {
            bitmap.recycle();
            this.z = null;
        }
        k(f);
        float f2 = this.c;
        float f3 = f(rect2.left, rect.left, f2, this.G);
        RectF rectF = this.f;
        rectF.left = f3;
        rectF.top = f(this.m, this.n, f2, this.G);
        rectF.right = f(rect2.right, rect.right, f2, this.G);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.G);
        this.q = f(this.o, this.p, f2, this.G);
        this.r = f(this.m, this.n, f2, this.G);
        k(f(this.i, this.j, f2, this.H));
        s65 s65Var = be0.b;
        f(0.0f, 1.0f, 1.0f - f2, s65Var);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        textInputLayout.postInvalidateOnAnimation();
        f(1.0f, 0.0f, f2, s65Var);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.l;
        ColorStateList colorStateList2 = this.k;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), f2, e(this.l)));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.M;
        if (f4 != 0.0f) {
            textPaint.setLetterSpacing(f(0.0f, f4, f2, s65Var));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        textPaint.setShadowLayer(be0.a(0.0f, this.I, f2), be0.a(0.0f, this.J, f2), be0.a(0.0f, this.K, f2), a(0, f2, e(this.L)));
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            h();
        }
    }

    public final void j(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.c) {
            this.c = f;
            float f2 = this.d.left;
            Rect rect = this.e;
            float f3 = f(f2, rect.left, f, this.G);
            RectF rectF = this.f;
            rectF.left = f3;
            rectF.top = f(this.m, this.n, f, this.G);
            rectF.right = f(r1.right, rect.right, f, this.G);
            rectF.bottom = f(r1.bottom, rect.bottom, f, this.G);
            this.q = f(this.o, this.p, f, this.G);
            this.r = f(this.m, this.n, f, this.G);
            k(f(this.i, this.j, f, this.H));
            s65 s65Var = be0.b;
            f(0.0f, 1.0f, 1.0f - f, s65Var);
            WeakHashMap<View, prg> weakHashMap = epg.a;
            TextInputLayout textInputLayout = this.a;
            textInputLayout.postInvalidateOnAnimation();
            f(1.0f, 0.0f, f, s65Var);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.l;
            ColorStateList colorStateList2 = this.k;
            TextPaint textPaint = this.E;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), f, e(this.l)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f4 = this.M;
            if (f4 != 0.0f) {
                textPaint.setLetterSpacing(f(0.0f, f4, f, s65Var));
            } else {
                textPaint.setLetterSpacing(f4);
            }
            textPaint.setShadowLayer(be0.a(0.0f, this.I, f), be0.a(0.0f, this.J, f), be0.a(0.0f, this.K, f), a(0, f, e(this.L)));
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void k(float f) {
        c(f);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        this.a.postInvalidateOnAnimation();
    }
}
