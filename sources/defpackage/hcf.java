package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import defpackage.g6d;

/* JADX INFO: loaded from: classes2.dex */
public final class hcf {
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public final ColorStateList j;
    public float k;
    public final int l;
    public boolean m = false;
    public Typeface n;

    public class a extends g6d.c {
        public final /* synthetic */ v1 a;

        public a(v1 v1Var) {
            this.a = v1Var;
        }

        @Override // g6d.c
        public final void b(int i) {
            hcf.this.m = true;
            this.a.k0(i);
        }

        @Override // g6d.c
        public final void c(Typeface typeface) {
            hcf hcfVar = hcf.this;
            Typeface typefaceCreate = Typeface.create(typeface, hcfVar.c);
            hcfVar.n = typefaceCreate;
            hcfVar.m = true;
            this.a.l0(typefaceCreate, false);
        }
    }

    public hcf(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, lac.G);
        this.k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.j = ye9.b(context, typedArrayObtainStyledAttributes, 3);
        ye9.b(context, typedArrayObtainStyledAttributes, 4);
        ye9.b(context, typedArrayObtainStyledAttributes, 5);
        this.c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.l = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.a = ye9.b(context, typedArrayObtainStyledAttributes, 6);
        this.e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, lac.w);
        this.h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.n;
        int i = this.c;
        if (typeface == null && (str = this.b) != null) {
            this.n = Typeface.create(str, i);
        }
        if (this.n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.n = Typeface.DEFAULT;
            } else {
                this.n = Typeface.MONOSPACE;
            }
            this.n = Typeface.create(this.n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceA = g6d.a(context, this.l);
                this.n = typefaceA;
                if (typefaceA != null) {
                    this.n = Typeface.create(typefaceA, this.c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.b, e);
            }
        }
        a();
        this.m = true;
        return this.n;
    }

    public final void c(Context context, v1 v1Var) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.l;
        if (i == 0) {
            this.m = true;
        }
        if (this.m) {
            v1Var.l0(this.n, true);
            return;
        }
        try {
            a aVar = new a(v1Var);
            ThreadLocal<TypedValue> threadLocal = g6d.a;
            if (context.isRestricted()) {
                aVar.a(-4);
            } else {
                g6d.b(context, i, new TypedValue(), 0, aVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            v1Var.k0(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.b, e);
            this.m = true;
            v1Var.k0(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typefaceB = null;
        int i = this.l;
        if (i != 0) {
            ThreadLocal<TypedValue> threadLocal = g6d.a;
            if (!context.isRestricted()) {
                typefaceB = g6d.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceB != null;
    }

    public final void e(Context context, TextPaint textPaint, v1 v1Var) {
        f(context, textPaint, v1Var);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(this.g, this.e, this.f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, v1 v1Var) {
        if (d(context)) {
            g(textPaint, b(context));
            return;
        }
        a();
        g(textPaint, this.n);
        c(context, new icf(this, textPaint, v1Var));
    }

    public final void g(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
