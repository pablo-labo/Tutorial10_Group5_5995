package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import defpackage.g94;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h94 {
    public static final fva<oj3> f = fva.a(oj3.c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final fva<llb> g = new fva<>("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, fva.e);
    public static final fva<Boolean> h;
    public static final fva<Boolean> i;
    public static final Set<String> j;
    public static final a k;
    public static final Set<ImageHeaderParser.ImageType> l;
    public static final ArrayDeque m;
    public final bh1 a;
    public final DisplayMetrics b;
    public final kt0 c;
    public final ArrayList d;
    public final gg6 e = gg6.a();

    public class a implements b {
        @Override // h94.b
        public final void a() {
        }

        @Override // h94.b
        public final void b(bh1 bh1Var, Bitmap bitmap) {
        }
    }

    public interface b {
        void a();

        void b(bh1 bh1Var, Bitmap bitmap);
    }

    static {
        g94.e eVar = g94.a;
        Boolean bool = Boolean.FALSE;
        h = fva.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = fva.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        k = new a();
        l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = xjg.a;
        m = new ArrayDeque(0);
    }

    public h94(ArrayList arrayList, DisplayMetrics displayMetrics, bh1 bh1Var, kt0 kt0Var) {
        this.d = arrayList;
        beb.e(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        beb.e(bh1Var, "Argument must not be null");
        this.a = bh1Var;
        beb.e(kt0Var, "Argument must not be null");
        this.c = kt0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(defpackage.t27 r9, android.graphics.BitmapFactory.Options r10, h94.b r11, defpackage.bh1 r12) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r11.a()
            r9.b()
        Lc:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = defpackage.rrf.b
            r4.lock()
            android.graphics.Bitmap r9 = r9.a(r10)     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.Throwable -> L66
            r4.unlock()
            return r9
        L1f:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L66
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = defpackage.uz.f(r6, r1, r7, r2, r8)     // Catch: java.lang.Throwable -> L66
            r1.append(r3)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = ", inBitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L66
            android.graphics.Bitmap r2 = r10.inBitmap     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = d(r2)     // Catch: java.lang.Throwable -> L66
            r1.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L66
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L66
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L50
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r5)     // Catch: java.lang.Throwable -> L66
        L50:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L65
            r12.d(r0)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L66
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L66
            android.graphics.Bitmap r9 = c(r9, r10, r11, r12)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L66
            java.util.concurrent.locks.Lock r10 = defpackage.rrf.b
            r10.unlock()
            return r9
        L64:
            throw r5     // Catch: java.lang.Throwable -> L66
        L65:
            throw r5     // Catch: java.lang.Throwable -> L66
        L66:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = defpackage.rrf.b
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h94.c(t27, android.graphics.BitmapFactory$Options, h94$b, bh1):android.graphics.Bitmap");
    }

    @TargetApi(BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final dh1 a(t27 t27Var, int i2, int i3, ova ovaVar, b bVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.c.c(65536, byte[].class);
        synchronized (h94.class) {
            arrayDeque = m;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        oj3 oj3Var = (oj3) ovaVar.c(f);
        llb llbVar = (llb) ovaVar.c(g);
        g94 g94Var = (g94) ovaVar.c(g94.d);
        boolean zBooleanValue = ((Boolean) ovaVar.c(h)).booleanValue();
        fva<Boolean> fvaVar = i;
        try {
            Bitmap bitmapB = b(t27Var, options, g94Var, oj3Var, llbVar, ovaVar.c(fvaVar) != null && ((Boolean) ovaVar.c(fvaVar)).booleanValue(), i2, i3, zBooleanValue, bVar);
            dh1 dh1Var = bitmapB == null ? null : new dh1(this.a, bitmapB);
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.c.put(bArr);
            return dh1Var;
        } catch (Throwable th) {
            e(options);
            ArrayDeque arrayDeque2 = m;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.c.put(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(defpackage.t27 r43, android.graphics.BitmapFactory.Options r44, defpackage.g94 r45, defpackage.oj3 r46, defpackage.llb r47, boolean r48, int r49, int r50, boolean r51, h94.b r52) {
        /*
            Method dump skipped, instruction units count: 1372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h94.b(t27, android.graphics.BitmapFactory$Options, g94, oj3, llb, boolean, int, int, boolean, h94$b):android.graphics.Bitmap");
    }
}
