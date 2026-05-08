package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class g7b implements f7b {
    public final Context a;

    public g7b(Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    @Override // defpackage.f7b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList a(int r8, android.net.Uri r9) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = "Unable to open file descriptor for URI: "
            r9.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            android.content.Context r7 = r7.a     // Catch: java.lang.Throwable -> L6d
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = "r"
            android.os.ParcelFileDescriptor r7 = r7.openFileDescriptor(r9, r3)     // Catch: java.lang.Throwable -> L6d
            if (r7 == 0) goto L5b
            android.graphics.pdf.PdfRenderer r9 = new android.graphics.pdf.PdfRenderer     // Catch: java.lang.Throwable -> L58
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L58
            int r0 = r9.getPageCount()     // Catch: java.lang.Throwable -> L4e
            r3 = 0
        L23:
            if (r3 >= r0) goto L51
            android.graphics.pdf.PdfRenderer$Page r4 = r9.openPage(r3)     // Catch: java.lang.Throwable -> L4e
            int r5 = r4.getHeight()     // Catch: java.lang.Throwable -> L4e
            int r5 = r5 * r8
            int r6 = r4.getWidth()     // Catch: java.lang.Throwable -> L4e
            int r5 = r5 / r6
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L4e
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r8, r5, r6)     // Catch: java.lang.Throwable -> L4e
            r5.getClass()     // Catch: java.lang.Throwable -> L4e
            r6 = 1
            r4.render(r5, r2, r2, r6)     // Catch: java.lang.Throwable -> L4e
            v70 r6 = new v70     // Catch: java.lang.Throwable -> L4e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L4e
            r1.add(r6)     // Catch: java.lang.Throwable -> L4e
            r4.close()     // Catch: java.lang.Throwable -> L4e
            int r3 = r3 + 1
            goto L23
        L4e:
            r8 = move-exception
        L4f:
            r2 = r7
            goto L6f
        L51:
            r7.close()
            r9.close()
            return r1
        L58:
            r8 = move-exception
            r9 = r2
            goto L4f
        L5b:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L6d
            r8.append(r9)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6d
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L6d
            throw r7     // Catch: java.lang.Throwable -> L6d
        L6d:
            r8 = move-exception
            r9 = r2
        L6f:
            if (r2 == 0) goto L74
            r2.close()
        L74:
            if (r9 == 0) goto L79
            r9.close()
        L79:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g7b.a(int, android.net.Uri):java.util.ArrayList");
    }
}
