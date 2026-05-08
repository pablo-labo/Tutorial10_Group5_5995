package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(26)
public final class wva extends qm3 {
    @Override // defpackage.qm3
    public final int d(int i, int i2, BitmapFactory.Options options) {
        Bitmap.Config config = options.outConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return eh1.c(i, i2, config);
    }
}
