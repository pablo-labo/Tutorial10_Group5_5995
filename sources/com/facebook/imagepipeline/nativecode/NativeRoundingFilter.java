package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import defpackage.h84;
import defpackage.u9a;

/* JADX INFO: loaded from: classes2.dex */
@h84
public class NativeRoundingFilter {
    static {
        u9a.b("native-filters");
    }

    @h84
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    @h84
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    @h84
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    @h84
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    @h84
    public static void toCircle(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z);
    }

    @h84
    public static void toCircleFast(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z);
    }
}
