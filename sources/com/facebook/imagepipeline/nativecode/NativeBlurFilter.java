package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import defpackage.h84;
import defpackage.u9a;
import defpackage.web;

/* JADX INFO: loaded from: classes2.dex */
@h84
public class NativeBlurFilter {
    static {
        u9a.b("native-filters");
    }

    public static void a(Bitmap bitmap, int i, int i2) {
        web.e(Boolean.valueOf(i > 0));
        web.e(Boolean.valueOf(i2 > 0));
        nativeIterativeBoxBlur(bitmap, i, i2);
    }

    @h84
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
