package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import defpackage.h84;
import defpackage.r27;
import defpackage.u9a;
import defpackage.web;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@h84
public class Bitmaps {
    public static final /* synthetic */ int a = 0;

    static {
        List<String> list = r27.a;
        u9a.b("imagepipeline");
    }

    @h84
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        web.e(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        web.e(Boolean.valueOf(bitmap.isMutable()));
        web.e(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        web.e(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @h84
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
