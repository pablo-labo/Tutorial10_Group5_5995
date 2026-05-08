package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class td4 implements ah1 {
    @Override // defpackage.a6d
    public final void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        bitmap.recycle();
    }

    @Override // defpackage.sfb
    public final Bitmap get(int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
        bitmapCreateBitmap.getClass();
        return bitmapCreateBitmap;
    }
}
