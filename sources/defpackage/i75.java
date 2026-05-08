package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.horcrux.svg.CustomFilter;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class i75 extends ob5 {
    public String c;
    public String d;
    public qb5 e;

    @Override // defpackage.ob5
    public final Bitmap g(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmapH = ob5.h(map, bitmap, this.c);
        Bitmap bitmapH2 = ob5.h(map, bitmap, this.d);
        if (this.e == qb5.MULTIPLY) {
            return CustomFilter.apply(bitmapH, bitmapH2, new m6(9));
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapH.getWidth(), bitmapH.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapH, 0.0f, 0.0f, paint);
        int iOrdinal = this.e.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (iOrdinal == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        } else if (iOrdinal == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
        } else if (iOrdinal == 5) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        }
        canvas.drawBitmap(bitmapH2, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }
}
