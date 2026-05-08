package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class k75 extends ob5 {
    public float V;
    public float W;
    public sb5 a0;
    public String c;
    public String d;
    public float e;
    public float f;

    @Override // defpackage.ob5
    public final Bitmap g(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmapH = ob5.h(map, bitmap, this.c);
        Bitmap bitmapH2 = ob5.h(map, bitmap, this.d);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapH.getWidth(), bitmapH.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapH, 0.0f, 0.0f, paint);
        int iOrdinal = this.a0.ordinal();
        if (iOrdinal == 0) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (iOrdinal == 1) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        } else if (iOrdinal == 2) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else if (iOrdinal == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
        } else if (iOrdinal == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
        } else if (iOrdinal == 5) {
            int height = bitmapCreateBitmap.getHeight() * bitmapCreateBitmap.getWidth();
            int[] iArr = new int[height];
            bitmapCreateBitmap.getPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
            int width = bitmapCreateBitmap.getWidth();
            int width2 = bitmapCreateBitmap.getWidth();
            int height2 = bitmapCreateBitmap.getHeight();
            int[] iArr2 = new int[height];
            bitmapH2.getPixels(iArr2, 0, width, 0, 0, width2, height2);
            int i = 0;
            while (i < height) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                int i4 = height;
                int[] iArr3 = iArr2;
                float f = this.e;
                float f2 = (i2 >> 16) & 255;
                float f3 = (i3 >> 16) & 255;
                float f4 = f * f2 * f3;
                float f5 = this.f;
                float f6 = (f2 * f5) + f4;
                float f7 = this.V;
                float f8 = (f3 * f7) + f6;
                float f9 = this.W;
                int i5 = (int) (f8 + f9);
                float f10 = (i2 >> 8) & 255;
                float f11 = (i3 >> 8) & 255;
                int i6 = (int) ((f11 * f7) + (f10 * f5) + (f * f10 * f11) + f9);
                float f12 = i2 & 255;
                float f13 = i3 & 255;
                int i7 = (int) ((f13 * f7) + (f12 * f5) + (f * f12 * f13) + f9);
                float f14 = i2 >>> 24;
                float f15 = i3 >>> 24;
                int i8 = (int) ((f7 * f15) + (f14 * f5) + (f * f14 * f15) + f9);
                iArr[i] = (Math.min(255, Math.max(0, i5)) << 16) | (Math.min(255, Math.max(0, i8)) << 24) | (Math.min(255, Math.max(0, i6)) << 8) | Math.min(255, Math.max(0, i7));
                i++;
                height = i4;
                iArr2 = iArr3;
            }
            int width3 = bitmapCreateBitmap.getWidth();
            int width4 = bitmapCreateBitmap.getWidth();
            bitmapCreateBitmap = bitmapCreateBitmap;
            bitmapCreateBitmap.setPixels(iArr, 0, width3, 0, 0, width4, bitmapCreateBitmap.getHeight());
        }
        if (this.a0 != sb5.ARITHMETIC) {
            canvas.drawBitmap(bitmapH2, 0.0f, 0.0f, paint);
        }
        return bitmapCreateBitmap;
    }
}
