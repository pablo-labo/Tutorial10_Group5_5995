package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kue implements j5d<InputStream, v86> {
    public final ArrayList a;
    public final lr1 b;
    public final kt0 c;

    public kue(ArrayList arrayList, lr1 lr1Var, kt0 kt0Var) {
        this.a = arrayList;
        this.b = lr1Var;
        this.c = kt0Var;
    }

    @Override // defpackage.j5d
    public final boolean a(InputStream inputStream, ova ovaVar) {
        return !((Boolean) ovaVar.c(d96.b)).booleanValue() && a.b(this.a, inputStream, this.c) == ImageHeaderParser.ImageType.GIF;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.j5d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.f5d<defpackage.v86> b(java.io.InputStream r6, int r7, int r8, defpackage.ova r9) {
        /*
            r5 = this;
            java.io.InputStream r6 = (java.io.InputStream) r6
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r1)
            r2 = 0
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L18
        Lc:
            int r3 = r6.read(r1)     // Catch: java.io.IOException -> L18
            r4 = -1
            if (r3 == r4) goto L1a
            r4 = 0
            r0.write(r1, r4, r3)     // Catch: java.io.IOException -> L18
            goto Lc
        L18:
            r6 = move-exception
            goto L22
        L1a:
            r0.flush()     // Catch: java.io.IOException -> L18
            byte[] r6 = r0.toByteArray()
            goto L31
        L22:
            r0 = 5
            java.lang.String r1 = "StreamGifDecoder"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L30
            java.lang.String r0 = "Error reading data from stream"
            android.util.Log.w(r1, r0, r6)
        L30:
            r6 = r2
        L31:
            if (r6 != 0) goto L34
            goto L3e
        L34:
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            lr1 r5 = r5.b
            f5d r2 = r5.b(r6, r7, r8, r9)
        L3e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kue.b(java.lang.Object, int, int, ova):f5d");
    }
}
