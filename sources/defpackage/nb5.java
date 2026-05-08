package defpackage;

import android.annotation.TargetApi;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(31)
public final class nb5 {
    public static RenderEffect a(ColorMatrix colorMatrix, RenderEffect renderEffect) {
        if (renderEffect == null) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            renderEffectCreateColorFilterEffect.getClass();
            return renderEffectCreateColorFilterEffect;
        }
        RenderEffect renderEffectCreateColorFilterEffect2 = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), renderEffect);
        renderEffectCreateColorFilterEffect2.getClass();
        return renderEffectCreateColorFilterEffect2;
    }

    public static ColorMatrix b(float f) {
        float f2 = ((-(f / 2.0f)) + 0.5f) * 255.0f;
        return new ColorMatrix(new float[]{f, 0.0f, 0.0f, 0.0f, f2, 0.0f, f, 0.0f, 0.0f, f2, 0.0f, 0.0f, f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static ColorMatrix c(float f) {
        float f2 = 1.0f - f;
        float f3 = 0.7152f - (f2 * 0.7152f);
        float f4 = 0.0722f - (f2 * 0.0722f);
        float f5 = 0.2126f - (f2 * 0.2126f);
        return new ColorMatrix(new float[]{(0.7874f * f2) + 0.2126f, f3, f4, 0.0f, 0.0f, f5, (0.2848f * f2) + 0.7152f, f4, 0.0f, 0.0f, f5, f3, (f2 * 0.9278f) + 0.0722f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static ColorMatrix d(float f) {
        double radians = Math.toRadians(f);
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        float f2 = 0.715f - (fCos * 0.715f);
        float f3 = fSin * 0.715f;
        float f4 = 0.072f - (fCos * 0.072f);
        float f5 = 0.213f - (fCos * 0.213f);
        return new ColorMatrix(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f2 - f3, (fSin * 0.928f) + f4, 0.0f, 0.0f, (0.143f * fSin) + f5, (0.14f * fSin) + (0.285f * fCos) + 0.715f, f4 - (0.283f * fSin), 0.0f, 0.0f, f5 - (0.787f * fSin), f2 + f3, (fSin * 0.072f) + (fCos * 0.928f) + 0.072f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static ColorMatrix e(float f) {
        float f2 = 1.0f - (2.0f * f);
        float f3 = f * 255.0f;
        return new ColorMatrix(new float[]{f2, 0.0f, 0.0f, 0.0f, f3, 0.0f, f2, 0.0f, 0.0f, f3, 0.0f, 0.0f, f2, 0.0f, f3, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static ColorMatrix f(float f) {
        float f2 = 1.0f - f;
        return new ColorMatrix(new float[]{(0.607f * f2) + 0.393f, 0.769f - (f2 * 0.769f), 0.189f - (f2 * 0.189f), 0.0f, 0.0f, 0.349f - (f2 * 0.349f), (0.314f * f2) + 0.686f, 0.168f - (f2 * 0.168f), 0.0f, 0.0f, 0.272f - (f2 * 0.272f), 0.534f - (f2 * 0.534f), (f2 * 0.869f) + 0.131f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }
}
