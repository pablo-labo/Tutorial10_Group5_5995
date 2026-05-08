package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public interface tg1 {
    hz8<Bitmap> a(Uri uri);

    default hz8<Bitmap> b(oj9 oj9Var) {
        byte[] bArr = oj9Var.k;
        if (bArr != null) {
            return c(bArr);
        }
        Uri uri = oj9Var.m;
        if (uri != null) {
            return a(uri);
        }
        return null;
    }

    hz8<Bitmap> c(byte[] bArr);
}
