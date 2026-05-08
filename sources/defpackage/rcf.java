package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rcf {
    public boolean a = true;
    public float b = Float.NaN;
    public float c = Float.NaN;
    public float d = Float.NaN;
    public float e = Float.NaN;
    public zjf f = zjf.f;
    public float g = Float.NaN;

    public final int a() {
        float f = !Float.isNaN(this.b) ? this.b : 14.0f;
        return (int) (this.a ? Math.ceil(nn2.H(f, d())) : Math.ceil(nn2.G(f)));
    }

    public final float b() {
        if (Float.isNaN(this.d)) {
            return Float.NaN;
        }
        boolean z = this.a;
        float f = this.d;
        return (z ? nn2.H(f, d()) : nn2.G(f)) / a();
    }

    public final float c() {
        if (Float.isNaN(this.c)) {
            return Float.NaN;
        }
        boolean z = this.a;
        float f = this.c;
        float fH = z ? nn2.H(f, d()) : nn2.G(f);
        if (!Float.isNaN(this.e)) {
            float f2 = this.e;
            if (f2 > fH) {
                return f2;
            }
        }
        return fH;
    }

    public final float d() {
        if (Float.isNaN(this.g)) {
            return 0.0f;
        }
        return this.g;
    }

    public final void e(float f) {
        if (f == 0.0f || f >= 1.0f || Float.isNaN(f)) {
            this.g = f;
        } else {
            s55.n("ReactNative", "maxFontSizeMultiplier must be NaN, 0, or >= 1");
            this.g = Float.NaN;
        }
    }

    public final String toString() {
        return sve.w("\n    TextAttributes {\n      getAllowFontScaling(): " + this.a + "\n      getFontSize(): " + this.b + "\n      getEffectiveFontSize(): " + a() + "\n      getHeightOfTallestInlineViewOrImage(): " + this.e + "\n      getLetterSpacing(): " + this.d + "\n      getEffectiveLetterSpacing(): " + b() + "\n      getLineHeight(): " + this.c + "\n      getEffectiveLineHeight(): " + c() + "\n      getTextTransform(): " + this.f + "\n      getMaxFontSizeMultiplier(): " + this.g + "\n      getEffectiveMaxFontSizeMultiplier(): " + d() + "\n    }\n  ");
    }
}
