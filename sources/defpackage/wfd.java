package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public final class wfd implements n37 {
    public final float a;

    public wfd(float f) {
        this.a = f;
    }

    @Override // defpackage.n37
    public final Bitmap a(Bitmap bitmap) {
        bitmap.getClass();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postRotate(this.a);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        bitmapCreateBitmap.getClass();
        return bitmapCreateBitmap;
    }
}
