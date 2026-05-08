package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import defpackage.bf9;
import defpackage.d84;
import defpackage.dg1;
import defpackage.eg1;
import defpackage.eh1;
import defpackage.h84;
import defpackage.ibb;
import defpackage.im3;
import defpackage.j6g;
import defpackage.n82;
import defpackage.r27;
import defpackage.u9a;
import defpackage.uz;
import defpackage.vs4;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
@h84
public abstract class DalvikPurgeableDecoder implements ibb {
    public static final byte[] b;
    public final dg1 a;

    @d84
    public static class OreoUtils {
        private OreoUtils() {
        }
    }

    static {
        List<String> list = r27.a;
        u9a.b("imagepipeline");
        b = new byte[]{-1, -39};
    }

    public DalvikPurgeableDecoder() {
        if (eg1.c == null) {
            synchronized (eg1.class) {
                try {
                    if (eg1.c == null) {
                        eg1.c = new dg1(eg1.b, eg1.a);
                    }
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        dg1 dg1Var = eg1.c;
        dg1Var.getClass();
        this.a = dg1Var;
    }

    public static boolean e(n82<PooledByteBuffer> n82Var, int i) {
        PooledByteBuffer pooledByteBufferP = n82Var.P();
        return i >= 2 && pooledByteBufferP.o(i + (-2)) == -1 && pooledByteBufferP.o(i - 1) == -39;
    }

    @h84
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // defpackage.ibb
    public final n82 a(vs4 vs4Var, Bitmap.Config config) {
        int i = vs4Var.V;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        n82<PooledByteBuffer> n82VarV = n82.v(vs4Var.a);
        n82VarV.getClass();
        try {
            return f(c(n82VarV, options));
        } finally {
            n82VarV.close();
        }
    }

    @Override // defpackage.ibb
    public final n82 b(vs4 vs4Var, Bitmap.Config config, int i, ColorSpace colorSpace) {
        int i2 = vs4Var.V;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i2;
        options.inMutable = true;
        if (colorSpace == null) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        options.inPreferredColorSpace = colorSpace;
        n82<PooledByteBuffer> n82VarV = n82.v(vs4Var.a);
        n82VarV.getClass();
        try {
            return f(d(n82VarV, i, options));
        } finally {
            n82VarV.close();
        }
    }

    public abstract Bitmap c(n82<PooledByteBuffer> n82Var, BitmapFactory.Options options);

    public abstract Bitmap d(n82<PooledByteBuffer> n82Var, int i, BitmapFactory.Options options);

    public final im3 f(Bitmap bitmap) {
        int i;
        long j;
        int i2;
        bitmap.getClass();
        try {
            nativePinBitmap(bitmap);
            dg1 dg1Var = this.a;
            synchronized (dg1Var) {
                int iD = eh1.d(bitmap);
                int i3 = dg1Var.a;
                if (i3 < dg1Var.c) {
                    long j2 = dg1Var.b + ((long) iD);
                    if (j2 <= dg1Var.d) {
                        dg1Var.a = i3 + 1;
                        dg1Var.b = j2;
                        return n82.d0(bitmap, this.a.e, n82.f);
                    }
                }
                int iD2 = eh1.d(bitmap);
                bitmap.recycle();
                Locale locale = Locale.US;
                dg1 dg1Var2 = this.a;
                synchronized (dg1Var2) {
                    i = dg1Var2.a;
                }
                dg1 dg1Var3 = this.a;
                synchronized (dg1Var3) {
                    j = dg1Var3.b;
                }
                dg1 dg1Var4 = this.a;
                synchronized (dg1Var4) {
                    i2 = dg1Var4.c;
                }
                int iB = this.a.b();
                StringBuilder sbF = uz.f("Attempted to pin a bitmap of size ", iD2, " bytes. The current pool count is ", i, ", the current pool size is ");
                sbF.append(j);
                sbF.append(" bytes. The current pool max count is ");
                sbF.append(i2);
                sbF.append(", the current pool max size is ");
                sbF.append(iB);
                sbF.append(" bytes.");
                throw new TooManyBitmapsException(sbF.toString());
            }
        } catch (Exception e) {
            bitmap.recycle();
            bf9.f(e);
            throw null;
        }
    }
}
