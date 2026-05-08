package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes2.dex */
public final class bce extends CharacterStyle implements moc {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public bce(float f, float f2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setShadowLayer(this.c, this.a, this.b, this.d);
    }
}
