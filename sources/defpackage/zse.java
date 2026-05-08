package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import defpackage.yj3;

/* JADX INFO: loaded from: classes.dex */
public final class zse implements yj3 {
    public final ImageDecoder.Source a;
    public final AutoCloseable b;
    public final nva c;
    public final c6e d;

    public static final class a implements yj3.a {
        public final c6e a;

        public a(c6e c6eVar) {
            this.a = c6eVar;
        }

        @Override // yj3.a
        public final yj3 a(rne rneVar, nva nvaVar) {
            ImageDecoder.Source sourceA;
            Bitmap.Config configA = z27.a(nvaVar);
            if ((configA == Bitmap.Config.ARGB_8888 || configA == Bitmap.Config.HARDWARE) && (sourceA = dte.a(rneVar.a, nvaVar)) != null) {
                return new zse(sourceA, rneVar.a, nvaVar, this.a);
            }
            return null;
        }
    }

    public zse(ImageDecoder.Source source, AutoCloseable autoCloseable, nva nvaVar, c6e c6eVar) {
        this.a = source;
        this.b = autoCloseable;
        this.c = nvaVar;
        this.d = c6eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.yj3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.pu2 r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ate
            if (r0 == 0) goto L13
            r0 = r6
            ate r0 = (defpackage.ate) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ate r0 = new ate
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L36
            if (r1 != r3) goto L30
            java.lang.Object r5 = r0.L$1
            z5e r5 = (defpackage.z5e) r5
            java.lang.Object r0 = r0.L$0
            zse r0 = (defpackage.zse) r0
            defpackage.r7d.b(r6)
            r6 = r5
            r5 = r0
            goto L4a
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r2
        L36:
            defpackage.r7d.b(r6)
            r0.L$0 = r5
            c6e r6 = r5.d
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r0 = r6.a(r0)
            g13 r1 = defpackage.g13.a
            if (r0 != r1) goto L4a
            return r1
        L4a:
            java.lang.AutoCloseable r0 = r5.b     // Catch: java.lang.Throwable -> L6f
            huc r1 = new huc     // Catch: java.lang.Throwable -> L71
            r1.<init>()     // Catch: java.lang.Throwable -> L71
            android.graphics.ImageDecoder$Source r3 = r5.a     // Catch: java.lang.Throwable -> L71
            bte r4 = new bte     // Catch: java.lang.Throwable -> L71
            r4.<init>(r5, r1)     // Catch: java.lang.Throwable -> L71
            android.graphics.Bitmap r5 = android.graphics.ImageDecoder.decodeBitmap(r3, r4)     // Catch: java.lang.Throwable -> L71
            uj3 r3 = new uj3     // Catch: java.lang.Throwable -> L71
            rg1 r4 = new rg1     // Catch: java.lang.Throwable -> L71
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L71
            boolean r5 = r1.element     // Catch: java.lang.Throwable -> L71
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L71
            defpackage.pi3.d(r0, r2)     // Catch: java.lang.Throwable -> L6f
            r6.release()
            return r3
        L6f:
            r5 = move-exception
            goto L78
        L71:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L73
        L73:
            r1 = move-exception
            defpackage.pi3.d(r0, r5)     // Catch: java.lang.Throwable -> L6f
            throw r1     // Catch: java.lang.Throwable -> L6f
        L78:
            r6.release()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zse.a(pu2):java.lang.Object");
    }
}
