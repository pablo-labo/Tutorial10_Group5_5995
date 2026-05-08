package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.FilterUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class j75 extends ob5 {
    public String c;
    public rb5 d;
    public ReadableArray e;

    @Override // defpackage.ob5
    public final Bitmap g(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmapH = ob5.h(map, bitmap, this.c);
        ColorMatrix colorMatrix = new ColorMatrix();
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 0) {
            if (this.e.size() >= 20) {
                float[] fArr = new float[this.e.size()];
                for (int i = 0; i < this.e.size(); i++) {
                    fArr[i] = ((float) this.e.getDouble(i)) * (i % 5 == 4 ? 255 : 1);
                }
                colorMatrix.set(fArr);
                return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapH);
            }
            return bitmapH;
        }
        if (iOrdinal == 1) {
            if (this.e.size() == 1) {
                colorMatrix.setSaturation((float) this.e.getDouble(0));
                return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapH);
            }
            return bitmapH;
        }
        if (iOrdinal == 2) {
            if (this.e.size() == 1) {
                double d = (((double) ((float) this.e.getDouble(0))) * 3.141592653589793d) / 180.0d;
                float fCos = (float) Math.cos(d);
                float fSin = (float) Math.sin(d);
                float f = 0.715f - (fCos * 0.715f);
                float f2 = fSin * 0.715f;
                float f3 = 0.072f - (fCos * 0.072f);
                float f4 = 0.213f - (fCos * 0.213f);
                colorMatrix.set(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f - f2, (fSin * 0.928f) + f3, 0.0f, 0.0f, (0.143f * fSin) + f4, (0.14f * fSin) + (0.285f * fCos) + 0.715f, f3 - (0.283f * fSin), 0.0f, 0.0f, f4 - (0.787f * fSin), f + f2, (fSin * 0.072f) + (fCos * 0.928f) + 0.072f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            }
            return bitmapH;
        }
        if (iOrdinal == 3) {
            colorMatrix.set(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f});
        }
        return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapH);
    }
}
