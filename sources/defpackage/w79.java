package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class w79 implements bh1 {
    public static final Bitmap.Config j = Bitmap.Config.ARGB_8888;
    public final nie a;
    public final Set<Bitmap.Config> b;
    public final a c;
    public final long d;
    public long e;
    public int f;
    public int g;
    public int h;
    public int i;

    public static final class a {
    }

    public w79(long j2) {
        nie nieVar = new nie();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set<Bitmap.Config> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j2;
        this.a = nieVar;
        this.b = setUnmodifiableSet;
        this.c = new a();
    }

    @Override // defpackage.bh1
    @SuppressLint({"InlinedApi"})
    public final void a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            b();
        } else if (i >= 20 || i == 15) {
            h(this.d / 2);
        }
    }

    @Override // defpackage.bh1
    public final void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        h(0L);
    }

    @Override // defpackage.bh1
    public final Bitmap c(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapG = g(i, i2, config);
        if (bitmapG != null) {
            return bitmapG;
        }
        if (config == null) {
            config = j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.bh1
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.a.getClass();
                if (xjg.c(bitmap) <= this.d && this.b.contains(bitmap.getConfig())) {
                    this.a.getClass();
                    int iC = xjg.c(bitmap);
                    this.a.e(bitmap);
                    this.c.getClass();
                    this.h++;
                    this.e += (long) iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.a.getClass();
                        Log.v("LruBitmapPool", "Put bitmap in pool=".concat(nie.c(xjg.c(bitmap), bitmap.getConfig())));
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        f();
                    }
                    h(this.d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.a.getClass();
                sb.append(nie.c(xjg.c(bitmap), bitmap.getConfig()));
                sb.append(", is mutable: ");
                sb.append(bitmap.isMutable());
                sb.append(", is allowed config: ");
                sb.append(this.b.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.bh1
    public final Bitmap e(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapG = g(i, i2, config);
        if (bitmapG != null) {
            bitmapG.eraseColor(0);
            return bitmapG;
        }
        if (config == null) {
            config = j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public final void f() {
        Log.v("LruBitmapPool", "Hits=" + this.f + ", misses=" + this.g + ", puts=" + this.h + ", evictions=" + this.i + ", currentSize=" + this.e + ", maxSize=" + this.d + "\nStrategy=" + this.a);
    }

    public final synchronized Bitmap g(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.a.b(i, i2, config != null ? config : j);
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.a.getClass();
                    Log.d("LruBitmapPool", "Missing bitmap=".concat(nie.c(xjg.d(config) * i * i2, config)));
                }
                this.g++;
            } else {
                this.f++;
                long j2 = this.e;
                this.a.getClass();
                this.e = j2 - ((long) xjg.c(bitmapB));
                this.c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.a.getClass();
                Log.v("LruBitmapPool", "Get bitmap=".concat(nie.c(xjg.d(config) * i * i2, config)));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public final synchronized void h(long j2) {
        while (this.e > j2) {
            try {
                nie nieVar = this.a;
                Bitmap bitmapC = nieVar.b.c();
                if (bitmapC != null) {
                    nieVar.a(Integer.valueOf(xjg.c(bitmapC)), bitmapC);
                }
                if (bitmapC == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        f();
                    }
                    this.e = 0L;
                    return;
                }
                this.c.getClass();
                long j3 = this.e;
                this.a.getClass();
                this.e = j3 - ((long) xjg.c(bitmapC));
                this.i++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.a.getClass();
                    sb.append(nie.c(xjg.c(bitmapC), bitmapC.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    f();
                }
                bitmapC.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
