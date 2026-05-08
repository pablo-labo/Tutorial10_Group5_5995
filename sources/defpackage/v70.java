package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class v70 implements m07 {
    public final Bitmap a;

    public v70(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final int a() {
        Bitmap.Config config = this.a.getConfig();
        config.getClass();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }

    public final void b() {
        this.a.prepareToDraw();
    }

    @Override // defpackage.m07
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // defpackage.m07
    public final int getWidth() {
        return this.a.getWidth();
    }
}
