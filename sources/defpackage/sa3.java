package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class sa3 extends MetricAffectingSpan implements moc {
    public final float a;

    public sa3(float f) {
        this.a = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        float f = this.a;
        if (Float.isNaN(f)) {
            return;
        }
        textPaint.setLetterSpacing(f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.getClass();
        float f = this.a;
        if (Float.isNaN(f)) {
            return;
        }
        textPaint.setLetterSpacing(f);
    }
}
