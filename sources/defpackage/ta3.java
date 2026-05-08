package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class ta3 implements LineHeightSpan, moc {
    public final int a;

    public ta3(float f) {
        this.a = (int) Math.ceil(f);
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        charSequence.getClass();
        fontMetricsInt.getClass();
        double d = (this.a - ((-r8) + fontMetricsInt.descent)) / 2.0f;
        fontMetricsInt.ascent = fontMetricsInt.ascent - ((int) Math.ceil(d));
        fontMetricsInt.descent += (int) Math.floor(d);
        if (i == 0) {
            fontMetricsInt.top = fontMetricsInt.ascent;
        }
        if (i2 == charSequence.length()) {
            fontMetricsInt.bottom = fontMetricsInt.descent;
        }
    }
}
