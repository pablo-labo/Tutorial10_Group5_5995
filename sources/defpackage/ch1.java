package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class ch1 implements bh1 {
    @Override // defpackage.bh1
    public final void a(int i) {
    }

    @Override // defpackage.bh1
    public final void b() {
    }

    @Override // defpackage.bh1
    public final Bitmap c(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.bh1
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.bh1
    public final Bitmap e(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }
}
