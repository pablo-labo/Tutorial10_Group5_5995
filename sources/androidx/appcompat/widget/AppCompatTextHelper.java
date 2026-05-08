package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import defpackage.bg;
import defpackage.bk0;
import defpackage.ck0;
import defpackage.g6d;
import defpackage.l5;
import defpackage.p6;
import defpackage.pj0;
import defpackage.smf;
import defpackage.umf;
import defpackage.wac;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class AppCompatTextHelper {
    public final TextView a;
    public smf b;
    public smf c;
    public smf d;
    public smf e;
    public smf f;
    public smf g;
    public smf h;
    public final ck0 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public class a extends g6d.c {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ WeakReference c;

        public a(int i, int i2, WeakReference weakReference) {
            this.a = i;
            this.b = i2;
            this.c = weakReference;
        }

        @Override // g6d.c
        public final void b(int i) {
        }

        @Override // g6d.c
        public final void c(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
                typeface = d.a(typeface, i, (this.b & 2) != 0);
            }
            AppCompatTextHelper appCompatTextHelper = AppCompatTextHelper.this;
            if (appCompatTextHelper.m) {
                appCompatTextHelper.l = typeface;
                TextView textView = (TextView) this.c.get();
                if (textView != null) {
                    boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                    int i2 = appCompatTextHelper.j;
                    if (zIsAttachedToWindow) {
                        textView.post(new bk0(textView, typeface, i2));
                    } else {
                        textView.setTypeface(typeface, i2);
                    }
                }
            }
        }
    }

    public static class b {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    public static class c {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        public static void c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    public static class d {
        public static Typeface a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public AppCompatTextHelper(TextView textView) {
        this.a = textView;
        this.i = new ck0(textView);
    }

    public static smf c(Context context, pj0 pj0Var, int i) {
        ColorStateList colorStateListF;
        synchronized (pj0Var) {
            colorStateListF = pj0Var.a.f(context, i);
        }
        if (colorStateListF == null) {
            return null;
        }
        smf smfVar = new smf();
        smfVar.d = true;
        smfVar.a = colorStateListF;
        return smfVar;
    }

    public final void a(Drawable drawable, smf smfVar) {
        if (drawable == null || smfVar == null) {
            return;
        }
        pj0.e(drawable, smfVar, this.a.getDrawableState());
    }

    public final void b() {
        smf smfVar = this.b;
        TextView textView = this.a;
        if (smfVar != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        smf smfVar = this.h;
        if (smfVar != null) {
            return smfVar.a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        smf smfVar = this.h;
        if (smfVar != null) {
            return smfVar.b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:226:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.util.AttributeSet r25, int r26) {
        /*
            Method dump skipped, instruction units count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextHelper.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, wac.x);
        umf umfVar = new umf(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, umfVar);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            c.d(textView, string);
        }
        umfVar.f();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i, int i2, int i3, int i4) {
        ck0 ck0Var = this.i;
        if (ck0Var.j()) {
            DisplayMetrics displayMetrics = ck0Var.j.getResources().getDisplayMetrics();
            ck0Var.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (ck0Var.h()) {
                ck0Var.a();
            }
        }
    }

    public final void i(int[] iArr, int i) {
        ck0 ck0Var = this.i;
        if (ck0Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = ck0Var.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                ck0Var.f = ck0.b(iArrCopyOf);
                if (!ck0Var.i()) {
                    bg.m(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                ck0Var.g = false;
            }
            if (ck0Var.h()) {
                ck0Var.a();
            }
        }
    }

    public final void j(int i) {
        ck0 ck0Var = this.i;
        if (ck0Var.j()) {
            if (i == 0) {
                ck0Var.a = 0;
                ck0Var.d = -1.0f;
                ck0Var.e = -1.0f;
                ck0Var.c = -1.0f;
                ck0Var.f = new int[0];
                ck0Var.b = false;
                return;
            }
            if (i != 1) {
                l5.q(p6.c(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = ck0Var.j.getResources().getDisplayMetrics();
            ck0Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (ck0Var.h()) {
                ck0Var.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new smf();
        }
        smf smfVar = this.h;
        smfVar.a = colorStateList;
        smfVar.d = colorStateList != null;
        this.b = smfVar;
        this.c = smfVar;
        this.d = smfVar;
        this.e = smfVar;
        this.f = smfVar;
        this.g = smfVar;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new smf();
        }
        smf smfVar = this.h;
        smfVar.b = mode;
        smfVar.c = mode != null;
        this.b = smfVar;
        this.c = smfVar;
        this.d = smfVar;
        this.e = smfVar;
        this.f = smfVar;
        this.g = smfVar;
    }

    public final void m(Context context, umf umfVar) {
        String string;
        int i = this.j;
        TypedArray typedArray = umfVar.b;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceD = umfVar.d(i5, this.j, new a(i6, i7, new WeakReference(this.a)));
                if (typefaceD != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = typefaceD;
                    } else {
                        this.l = d.a(Typeface.create(typefaceD, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = d.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
