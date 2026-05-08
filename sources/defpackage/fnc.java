package defpackage;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes2.dex */
public final class fnc extends CharacterStyle implements UpdateAppearance, moc {
    public final float a;

    public fnc(float f) {
        this.a = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        float fAlpha = Color.alpha(textPaint.getColor());
        float f = this.a;
        textPaint.setAlpha(gf9.b(fAlpha * f));
        if (textPaint.bgColor != 0) {
            textPaint.bgColor = Color.argb(gf9.b(Color.alpha(r0) * f), Color.red(textPaint.bgColor), Color.green(textPaint.bgColor), Color.blue(textPaint.bgColor));
        }
    }
}
