package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.r;

/* JADX INFO: loaded from: classes.dex */
public final class ube extends CharacterStyle implements UpdateAppearance {
    public final tbe a;
    public final float b;
    public final g4a c = r.f(new kie(9205357640488583168L));
    public final az3 d = r.c(new qr(this, 21));

    public ube(tbe tbeVar, float f) {
        this.a = tbeVar;
        this.b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        ie7.y(textPaint, this.b);
        textPaint.setShader((Shader) this.d.getValue());
    }
}
