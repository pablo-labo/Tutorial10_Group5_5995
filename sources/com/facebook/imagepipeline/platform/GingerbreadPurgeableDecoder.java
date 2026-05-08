package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import defpackage.agb;
import defpackage.bf9;
import defpackage.h84;
import defpackage.jxg;
import defpackage.lxg;
import defpackage.n82;
import defpackage.r82;
import defpackage.sw8;
import java.io.FileDescriptor;
import java.io.OutputStream;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@h84
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {
    public static Method d;
    public final jxg c;

    @h84
    public GingerbreadPurgeableDecoder() {
        jxg jxgVar = null;
        if (!lxg.a) {
            try {
                jxgVar = (jxg) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
            } catch (Throwable unused) {
            }
            lxg.a = true;
        }
        this.c = jxgVar;
    }

    public static MemoryFile g(n82<PooledByteBuffer> n82Var, int i, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        sw8 sw8Var;
        agb agbVar = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            agb agbVar2 = new agb(n82Var.P());
            try {
                sw8Var = new sw8(agbVar2, i);
            } catch (Throwable th) {
                th = th;
                outputStream = null;
                sw8Var = null;
            }
            try {
                outputStream2 = memoryFile.getOutputStream();
                outputStream2.getClass();
                byte[] bArr2 = new byte[4096];
                while (true) {
                    int i2 = sw8Var.read(bArr2);
                    if (i2 == -1) {
                        break;
                    }
                    outputStream2.write(bArr2, 0, i2);
                }
                if (bArr != null) {
                    memoryFile.writeBytes(bArr, 0, i, bArr.length);
                }
                n82Var.close();
                r82.b(agbVar2);
                r82.b(sw8Var);
                r82.a(outputStream2);
                return memoryFile;
            } catch (Throwable th2) {
                th = th2;
                outputStream = outputStream2;
                agbVar = agbVar2;
                n82Var.close();
                r82.b(agbVar);
                r82.b(sw8Var);
                r82.a(outputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            sw8Var = null;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap c(n82<PooledByteBuffer> n82Var, BitmapFactory.Options options) {
        return h(n82Var, n82Var.P().size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap d(n82<PooledByteBuffer> n82Var, int i, BitmapFactory.Options options) {
        return h(n82Var, i, DalvikPurgeableDecoder.e(n82Var, i) ? null : DalvikPurgeableDecoder.b, options);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap h(defpackage.n82<com.facebook.common.memory.PooledByteBuffer> r1, int r2, byte[] r3, android.graphics.BitmapFactory.Options r4) throws java.lang.Throwable {
        /*
            r0 = this;
            r4 = 0
            android.os.MemoryFile r1 = g(r1, r2, r3)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            r0.i(r1)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            jxg r0 = r0.c     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            if (r0 == 0) goto L1e
            android.graphics.Bitmap r0 = r0.a()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            java.lang.String r2 = "BitmapFactory returned null"
            defpackage.web.h(r0, r2)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            r1.close()
            return r0
        L19:
            r0 = move-exception
            r4 = r1
            goto L2e
        L1c:
            r0 = move-exception
            goto L2a
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            java.lang.String r2 = "WebpBitmapFactory is null"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            throw r0     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
        L26:
            r0 = move-exception
            goto L2e
        L28:
            r0 = move-exception
            r1 = r4
        L2a:
            defpackage.bf9.f(r0)     // Catch: java.lang.Throwable -> L19
            throw r4     // Catch: java.lang.Throwable -> L19
        L2e:
            if (r4 == 0) goto L33
            r4.close()
        L33:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder.h(n82, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public final FileDescriptor i(MemoryFile memoryFile) {
        Method method;
        try {
            synchronized (this) {
                if (d == null) {
                    try {
                        d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", null);
                    } catch (Exception e) {
                        bf9.f(e);
                        throw null;
                    }
                }
                method = d;
            }
            Object objInvoke = method.invoke(memoryFile, null);
            objInvoke.getClass();
            return (FileDescriptor) objInvoke;
        } catch (Exception e2) {
            bf9.f(e2);
            throw null;
        }
    }
}
