package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import expo.modules.imagemanipulator.FlipType;

/* JADX INFO: loaded from: classes3.dex */
public final class rh5 implements n37 {
    public final FlipType a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FlipType.values().length];
            try {
                iArr[FlipType.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlipType.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public rh5(FlipType flipType) {
        flipType.getClass();
        this.a = flipType;
    }

    @Override // defpackage.n37
    public final Bitmap a(Bitmap bitmap) {
        bitmap.getClass();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            matrix.postScale(1.0f, -1.0f);
        } else {
            if (i != 2) {
                l.g();
                return null;
            }
            matrix.postScale(-1.0f, 1.0f);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        bitmapCreateBitmap.getClass();
        return bitmapCreateBitmap;
    }
}
