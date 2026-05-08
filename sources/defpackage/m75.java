package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class m75 extends ob5 {
    public ReadableArray c;

    @Override // defpackage.ob5
    public final Bitmap g(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            String string = this.c.getString(i);
            Bitmap bitmap2 = string.isEmpty() ? bitmap : map.get(string);
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint());
            }
        }
        return bitmapCreateBitmap;
    }
}
