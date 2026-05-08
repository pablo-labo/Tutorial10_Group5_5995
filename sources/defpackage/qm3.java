package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import defpackage.n82;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qm3 implements ibb {
    public static final byte[] d = {-1, -39};
    public final ah1 a;
    public final PreverificationHelper b = new PreverificationHelper();
    public final ngb<ByteBuffer> c;

    public qm3(ah1 ah1Var, ngb<ByteBuffer> ngbVar, ojh ojhVar) {
        this.a = ah1Var;
        if (ah1Var instanceof td4) {
            ojhVar.getClass();
        }
        this.c = ngbVar;
    }

    public static BitmapFactory.Options e(vs4 vs4Var, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = vs4Var.V;
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z = config == Bitmap.Config.HARDWARE;
        if (!z) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        BitmapFactory.decodeStream(vs4Var.v(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            o6.h();
            return null;
        }
        if (z) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    @Override // defpackage.ibb
    public final n82 a(vs4 vs4Var, Bitmap.Config config) {
        BitmapFactory.Options optionsE = e(vs4Var, config);
        boolean z = optionsE.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            InputStream inputStreamV = vs4Var.v();
            inputStreamV.getClass();
            return c(inputStreamV, optionsE, null);
        } catch (RuntimeException e) {
            if (z) {
                return this.a(vs4Var, Bitmap.Config.ARGB_8888);
            }
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    @Override // defpackage.ibb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.n82 b(defpackage.vs4 r6, android.graphics.Bitmap.Config r7, int r8, android.graphics.ColorSpace r9) {
        /*
            r5 = this;
            n82<com.facebook.common.memory.PooledByteBuffer> r0 = r6.a
            z07 r1 = r6.b
            z07 r2 = defpackage.jo3.a
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L10
            z07 r2 = defpackage.jo3.l
            if (r1 == r2) goto L10
        Le:
            r0 = r4
            goto L32
        L10:
            r0.getClass()
            java.lang.Object r0 = r0.P()
            com.facebook.common.memory.PooledByteBuffer r0 = (com.facebook.common.memory.PooledByteBuffer) r0
            r1 = 2
            if (r8 >= r1) goto L1e
        L1c:
            r0 = r3
            goto L32
        L1e:
            int r1 = r8 + (-2)
            byte r1 = r0.o(r1)
            r2 = -1
            if (r1 != r2) goto L1c
            int r1 = r8 + (-1)
            byte r0 = r0.o(r1)
            r1 = -39
            if (r0 != r1) goto L1c
            goto Le
        L32:
            android.graphics.BitmapFactory$Options r7 = e(r6, r7)
            java.io.InputStream r1 = r6.v()
            r1.getClass()
            int r2 = r6.G()
            if (r2 <= r8) goto L49
            sw8 r2 = new sw8
            r2.<init>(r1, r8)
            r1 = r2
        L49:
            if (r0 != 0) goto L53
            e8f r0 = new e8f
            byte[] r2 = defpackage.qm3.d
            r0.<init>(r1, r2)
            r1 = r0
        L53:
            android.graphics.Bitmap$Config r0 = r7.inPreferredConfig
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 == r2) goto L5a
            r3 = r4
        L5a:
            im3 r5 = r5.c(r1, r7, r9)     // Catch: java.lang.Throwable -> L67 java.lang.RuntimeException -> L69
            r1.close()     // Catch: java.io.IOException -> L62
            return r5
        L62:
            r6 = move-exception
            r6.printStackTrace()
            return r5
        L67:
            r5 = move-exception
            goto L7c
        L69:
            r7 = move-exception
            if (r3 == 0) goto L7b
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L67
            n82 r5 = r5.b(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L67
            r1.close()     // Catch: java.io.IOException -> L76
            goto L7a
        L76:
            r6 = move-exception
            r6.printStackTrace()
        L7a:
            return r5
        L7b:
            throw r7     // Catch: java.lang.Throwable -> L67
        L7c:
            r1.close()     // Catch: java.io.IOException -> L80
            goto L84
        L80:
            r6 = move-exception
            r6.printStackTrace()
        L84:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm3.b(vs4, android.graphics.Bitmap$Config, int, android.graphics.ColorSpace):n82");
    }

    public final im3 c(InputStream inputStream, BitmapFactory.Options options, ColorSpace colorSpace) {
        Bitmap bitmap;
        n82.b bVar = n82.f;
        int i = options.outWidth;
        int i2 = options.outHeight;
        ah1 ah1Var = this.a;
        PreverificationHelper preverificationHelper = this.b;
        if (preverificationHelper == null || !preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig)) {
            bitmap = ah1Var.get(d(i, i2, options));
            if (bitmap == null) {
                ja.k("BitmapPool.get returned null");
                return null;
            }
        } else {
            options.inMutable = false;
            bitmap = null;
        }
        options.inBitmap = bitmap;
        if (colorSpace == null) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        options.inPreferredColorSpace = colorSpace;
        ngb<ByteBuffer> ngbVar = this.c;
        ByteBuffer byteBufferAcquire = ngbVar.acquire();
        if (byteBufferAcquire == null) {
            int i3 = nj3.a;
            byteBufferAcquire = ByteBuffer.allocate(16384);
        }
        try {
            try {
                options.inTempStorage = byteBufferAcquire.array();
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                ngbVar.a(byteBufferAcquire);
                if (bitmap == null || bitmap == bitmapDecodeStream) {
                    return n82.d0(bitmapDecodeStream, ah1Var, bVar);
                }
                ah1Var.a(bitmap);
                if (bitmapDecodeStream != null) {
                    bitmapDecodeStream.recycle();
                }
                bg.h();
                return null;
            } catch (IllegalArgumentException e) {
                if (bitmap != null) {
                    ah1Var.a(bitmap);
                }
                try {
                    inputStream.reset();
                    Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStream);
                    if (bitmapDecodeStream2 == null) {
                        throw e;
                    }
                    if (msb.a == null) {
                        msb.a = new msb();
                    }
                    im3 im3VarD0 = n82.d0(bitmapDecodeStream2, msb.a, bVar);
                    ngbVar.a(byteBufferAcquire);
                    return im3VarD0;
                } catch (IOException unused) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                if (bitmap != null) {
                    ah1Var.a(bitmap);
                }
                throw e2;
            }
        } catch (Throwable th) {
            ngbVar.a(byteBufferAcquire);
            throw th;
        }
    }

    public abstract int d(int i, int i2, BitmapFactory.Options options);
}
