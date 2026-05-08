package defpackage;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class sb3 extends MetricAffectingSpan implements moc {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final AssetManager e;

    public static final class a {
    }

    public sb3(int i, int i2, String str, String str2, AssetManager assetManager) {
        assetManager.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = assetManager;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        Typeface typefaceA = qpc.a(textPaint.getTypeface(), this.a, this.b, this.d, this.e);
        textPaint.setFontFeatureSettings(this.c);
        textPaint.setTypeface(typefaceA);
        textPaint.setSubpixelText(true);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.getClass();
        Typeface typefaceA = qpc.a(textPaint.getTypeface(), this.a, this.b, this.d, this.e);
        textPaint.setFontFeatureSettings(this.c);
        textPaint.setTypeface(typefaceA);
        textPaint.setSubpixelText(true);
    }
}
