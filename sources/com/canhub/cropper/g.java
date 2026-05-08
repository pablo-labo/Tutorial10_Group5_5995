package com.canhub.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.util.Pair;
import com.canhub.cropper.CropException;
import com.canhub.cropper.CropImageView;
import defpackage.c0h;
import defpackage.gf9;
import defpackage.j6g;
import defpackage.k66;
import defpackage.l6;
import defpackage.p6;
import defpackage.wl7;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final Rect a = new Rect();
    public static final RectF b = new RectF();
    public static final RectF c = new RectF();
    public static final float[] d = new float[6];
    public static final float[] e = new float[6];
    public static int f;
    public static Pair<String, WeakReference<Bitmap>> g;

    public static final class a {
        public final Bitmap a;
        public final int b;

        public a(Bitmap bitmap, int i) {
            this.a = bitmap;
            this.b = i;
        }
    }

    public static final class b {
        public final Bitmap a;
        public final int b;
        public final boolean c;
        public final boolean d;

        public b(Bitmap bitmap, int i, boolean z, boolean z2) {
            this.a = bitmap;
            this.b = i;
            this.c = z;
            this.d = z2;
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static int a(int i, int i2) {
        int i3 = 1;
        if (f == 0) {
            int iMax = 2048;
            try {
                EGL egl = EGLContext.getEGL();
                egl.getClass();
                EGL10 egl10 = (EGL10) egl;
                EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
                int[] iArr = new int[1];
                egl10.eglGetConfigs(eGLDisplayEglGetDisplay, null, 0, iArr);
                int i4 = iArr[0];
                EGLConfig[] eGLConfigArr = new EGLConfig[i4];
                egl10.eglGetConfigs(eGLDisplayEglGetDisplay, eGLConfigArr, i4, iArr);
                int[] iArr2 = new int[1];
                int i5 = iArr[0];
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    egl10.eglGetConfigAttrib(eGLDisplayEglGetDisplay, eGLConfigArr[i7], 12332, iArr2);
                    int i8 = iArr2[0];
                    if (i6 < i8) {
                        i6 = i8;
                    }
                }
                egl10.eglTerminate(eGLDisplayEglGetDisplay);
                iMax = Math.max(i6, 2048);
            } catch (Exception unused) {
            }
            f = iMax;
        }
        if (f > 0) {
            while (true) {
                int i9 = i2 / i3;
                int i10 = f;
                if (i9 <= i10 && i / i3 <= i10) {
                    break;
                }
                i3 *= 2;
            }
        }
        return i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 <= i4 && i <= i3) {
            return 1;
        }
        while ((i2 / 2) / i5 > i4 && (i / 2) / i5 > i3) {
            i5 *= 2;
        }
        return i5;
    }

    public static a c(Context context, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3) {
        fArr.getClass();
        int i8 = 1;
        do {
            try {
                uri.getClass();
                return d(context, uri, fArr, i, i2, i3, z, i4, i5, i6, i7, z2, z3, i8);
            } catch (OutOfMemoryError e2) {
                i8 *= 2;
            }
        } while (i8 <= 16);
        throw new RuntimeException("Failed to handle OOM by sampling (" + i8 + "): " + uri + "\r\n" + e2.getMessage(), e2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088 A[Catch: OutOfMemoryError -> 0x0097, TRY_LEAVE, TryCatch #3 {OutOfMemoryError -> 0x0097, blocks: (B:37:0x0084, B:39:0x0088), top: B:83:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.canhub.cropper.g.a d(android.content.Context r19, android.net.Uri r20, float[] r21, int r22, int r23, int r24, boolean r25, int r26, int r27, int r28, int r29, boolean r30, boolean r31, int r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.g.d(android.content.Context, android.net.Uri, float[], int, int, int, boolean, int, int, int, int, boolean, boolean, int):com.canhub.cropper.g$a");
    }

    public static a e(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, boolean z2, boolean z3) {
        fArr.getClass();
        int i4 = 1;
        do {
            try {
                bitmap.getClass();
                return new a(f(bitmap, fArr, i, z, i2, i3, 1.0f / i4, z2, z3), i4);
            } catch (OutOfMemoryError e2) {
                i4 *= 2;
            }
        } while (i4 <= 8);
        throw e2;
    }

    public static Bitmap f(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, float f2, boolean z2, boolean z3) {
        Rect rectM = m(fArr, bitmap.getWidth(), bitmap.getHeight(), z, i2, i3);
        Matrix matrix = new Matrix();
        matrix.setRotate(i, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(z2 ? -f2 : f2, z3 ? -f2 : f2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rectM.left, rectM.top, rectM.width(), rectM.height(), matrix, true);
        bitmapCreateBitmap.getClass();
        if (bitmapCreateBitmap.equals(bitmap)) {
            bitmapCreateBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        Bitmap bitmap2 = bitmapCreateBitmap;
        return i % 90 != 0 ? g(bitmap2, fArr, rectM, i, z, i2, i3) : bitmap2;
    }

    public static Bitmap g(Bitmap bitmap, float[] fArr, Rect rect, int i, boolean z, int i2, int i3) {
        int iAbs;
        int iAbs2;
        int iAbs3;
        if (i % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians(i);
        int i4 = (i < 90 || (181 <= i && i < 270)) ? rect.left : rect.right;
        int iAbs4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= fArr.length) {
                iAbs = 0;
                iAbs2 = 0;
                iAbs3 = 0;
                break;
            }
            float f2 = fArr[i5];
            if (f2 >= i4 - 1 && f2 <= i4 + 1) {
                int i6 = i5 + 1;
                iAbs4 = (int) Math.abs(Math.sin(radians) * ((double) (rect.bottom - fArr[i6])));
                iAbs2 = (int) Math.abs(Math.cos(radians) * ((double) (fArr[i6] - rect.top)));
                iAbs3 = (int) Math.abs(((double) (fArr[i6] - rect.top)) / Math.sin(radians));
                iAbs = (int) Math.abs(((double) (rect.bottom - fArr[i6])) / Math.cos(radians));
                break;
            }
            i5 += 2;
        }
        rect.set(iAbs4, iAbs2, iAbs3 + iAbs4, iAbs + iAbs2);
        if (z) {
            k(rect, i2, i3);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (!wl7.b(bitmap, bitmapCreateBitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap h(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) throws CropException.FailedToDecodeImage, FileNotFoundException {
        do {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            try {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, a, options);
                    c0h.q(inputStreamOpenInputStream, null);
                    return bitmapDecodeStream;
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    j6g j6gVar = j6g.a;
                    c0h.q(inputStreamOpenInputStream, null);
                }
            } finally {
            }
        } while (options.inSampleSize <= 512);
        uri.getClass();
        throw new CropException.FailedToDecodeImage(p6.d(uri, "crop: Failed to decode image: "));
    }

    public static a i(Context context, Uri uri, int i, int i2) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            contentResolver.getClass();
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStreamOpenInputStream, a, options);
                options.inJustDecodeBounds = false;
                c0h.q(inputStreamOpenInputStream, null);
                int i3 = options.outWidth;
                if (i3 == -1 && options.outHeight == -1) {
                    throw new RuntimeException("File is not a picture");
                }
                options.inSampleSize = Math.max(b(i3, options.outHeight, i, i2), a(options.outWidth, options.outHeight));
                return new a(h(contentResolver, uri, options), options.inSampleSize);
            } finally {
            }
        } catch (Exception e2) {
            throw new CropException.FailedToLoadBitmap(uri, e2.getMessage());
        }
    }

    public static a j(Context context, Uri uri, Rect rect, int i, int i2, int i3) throws CropException.FailedToLoadBitmap {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        int i4;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i3 * b(rect.width(), rect.height(), i, i2);
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    inputStreamOpenInputStream.getClass();
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream);
                } else {
                    inputStreamOpenInputStream.getClass();
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
                }
                do {
                    try {
                        try {
                            bitmapRegionDecoderNewInstance.getClass();
                            a aVar = new a(bitmapRegionDecoderNewInstance.decodeRegion(rect, options), options.inSampleSize);
                            bitmapRegionDecoderNewInstance.recycle();
                            c0h.q(inputStreamOpenInputStream, null);
                            return aVar;
                        } finally {
                            if (bitmapRegionDecoderNewInstance != null) {
                                bitmapRegionDecoderNewInstance.recycle();
                            }
                        }
                    } catch (OutOfMemoryError unused) {
                        i4 = options.inSampleSize * 2;
                        options.inSampleSize = i4;
                    }
                } while (i4 <= 512);
                j6g j6gVar = j6g.a;
                c0h.q(inputStreamOpenInputStream, null);
                return new a(null, 1);
            } finally {
            }
        } catch (Exception e2) {
            throw new CropException.FailedToLoadBitmap(uri, e2.getMessage());
        }
    }

    public static void k(Rect rect, int i, int i2) {
        if (i != i2 || rect.width() == rect.height()) {
            return;
        }
        if (rect.height() > rect.width()) {
            rect.bottom -= rect.height() - rect.width();
        } else {
            rect.right -= rect.width() - rect.height();
        }
    }

    public static float l(float[] fArr) {
        fArr.getClass();
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    public static Rect m(float[] fArr, int i, int i2, boolean z, int i3, int i4) {
        fArr.getClass();
        Rect rect = new Rect(gf9.b(Math.max(0.0f, n(fArr))), gf9.b(Math.max(0.0f, p(fArr))), gf9.b(Math.min(i, o(fArr))), gf9.b(Math.min(i2, l(fArr))));
        if (z) {
            k(rect, i3, i4);
        }
        return rect;
    }

    public static float n(float[] fArr) {
        fArr.getClass();
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    public static float o(float[] fArr) {
        fArr.getClass();
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    public static float p(float[] fArr) {
        fArr.getClass();
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    public static Bitmap q(Bitmap bitmap, int i, int i2, CropImageView.j jVar) {
        Bitmap bitmapCreateScaledBitmap;
        jVar.getClass();
        if (i > 0 && i2 > 0) {
            try {
                CropImageView.j jVar2 = CropImageView.j.d;
                CropImageView.j jVar3 = CropImageView.j.e;
                if (jVar == jVar2 || jVar == CropImageView.j.c || jVar == jVar3) {
                    if (jVar == jVar3) {
                        bitmap.getClass();
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, false);
                    } else {
                        bitmap.getClass();
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float fMax = Math.max(width / i, height / i2);
                        bitmapCreateScaledBitmap = (fMax > 1.0f || jVar == jVar2) ? Bitmap.createScaledBitmap(bitmap, (int) (width / fMax), (int) (height / fMax), false) : null;
                    }
                    if (bitmapCreateScaledBitmap != null) {
                        if (!bitmapCreateScaledBitmap.equals(bitmap)) {
                            bitmap.recycle();
                        }
                        return bitmapCreateScaledBitmap;
                    }
                }
            } catch (Exception e2) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e2);
            }
        }
        bitmap.getClass();
        return bitmap;
    }

    public static Uri r(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, Uri uri) throws IOException {
        bitmap.getClass();
        compressFormat.getClass();
        if (uri == null) {
            try {
                int i2 = c.a[compressFormat.ordinal()];
                String str = i2 != 1 ? i2 != 2 ? ".webp" : ".png" : ".jpg";
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        File fileCreateTempFile = File.createTempFile("cropped", str, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                        fileCreateTempFile.getClass();
                        uri = k66.a(context, fileCreateTempFile);
                    } catch (Exception e2) {
                        Log.e("AIC", String.valueOf(e2.getMessage()));
                        File fileCreateTempFile2 = File.createTempFile("cropped", str, context.getCacheDir());
                        fileCreateTempFile2.getClass();
                        uri = k66.a(context, fileCreateTempFile2);
                    }
                } else {
                    uri = Uri.fromFile(File.createTempFile("cropped", str, context.getCacheDir()));
                }
            } catch (IOException e3) {
                l6.p("Failed to create temp file for output image", e3);
                return null;
            }
        }
        OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri, "wt");
        outputStreamOpenOutputStream.getClass();
        try {
            bitmap.compress(compressFormat, i, outputStreamOpenOutputStream);
            outputStreamOpenOutputStream.close();
            return uri;
        } finally {
        }
    }
}
