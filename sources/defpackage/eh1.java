package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class eh1 {
    public static final d2f a = new d2f(new zr0(2));

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Bitmap.Config.RGBA_1010102.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Bitmap.Config.HARDWARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public static final jb6 a(InputStream inputStream) {
        if (inputStream == null) {
            r6.g("Required value was null.");
            return null;
        }
        d2f d2fVar = a;
        ByteBuffer byteBufferAllocate = (ByteBuffer) ((pgb) d2fVar.getValue()).acquire();
        if (byteBufferAllocate == null) {
            int i = nj3.a;
            byteBufferAllocate = ByteBuffer.allocate(16384);
            byteBufferAllocate.getClass();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferAllocate.array();
            BitmapFactory.decodeStream(inputStream, null, options);
            return new jb6(options.outWidth, options.outHeight, options.outColorSpace);
        } finally {
            ((pgb) d2fVar.getValue()).a(byteBufferAllocate);
        }
    }

    @SuppressLint({"NewApi"})
    public static final int b(Bitmap.Config config) {
        switch (config == null ? -1 : a.a[config.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
            case 7:
                return 4;
            default:
                b0.u("The provided Bitmap.Config is not supported");
                return 0;
        }
    }

    public static final int c(int i, int i2, Bitmap.Config config) {
        if (i <= 0) {
            h5.k(p6.c(i, "width must be > 0, width is: "));
            return 0;
        }
        if (i2 <= 0) {
            h5.k(p6.c(i2, "height must be > 0, height is: "));
            return 0;
        }
        int iB = b(config);
        int i3 = i * i2 * iB;
        if (i3 > 0) {
            return i3;
        }
        StringBuilder sbF = uz.f("size must be > 0: size: ", i3, ", width: ", i, ", height: ");
        sbF.append(i2);
        sbF.append(", pixelSize: ");
        sbF.append(iB);
        throw new IllegalStateException(sbF.toString().toString());
    }

    @SuppressLint({"NewApi"})
    public static final int d(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }
}
