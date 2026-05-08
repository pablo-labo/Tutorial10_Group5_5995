package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class w70 {
    public static final Bitmap a(m07 m07Var) {
        if (m07Var instanceof v70) {
            return ((v70) m07Var).a;
        }
        b0.u("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final Bitmap.Config b(int i) {
        return i == 0 ? Bitmap.Config.ARGB_8888 : i == 1 ? Bitmap.Config.ALPHA_8 : i == 2 ? Bitmap.Config.RGB_565 : i == 3 ? Bitmap.Config.RGBA_F16 : i == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }
}
