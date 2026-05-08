package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class t9c implements y95 {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public r9c b;

    public static class a {
        public final byte[] a;
        public final int b;

        public a(byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }
    }

    public t9c(File file) {
        this.a = file;
    }

    @Override // defpackage.y95
    public final void a() {
        wc2.b(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // defpackage.y95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            r6 = this;
            java.io.File r0 = r6.a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r6 = r2
            goto L38
        Lc:
            r6.d()
            r9c r0 = r6.b
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r1}
            int r0 = r0.W()
            byte[] r0 = new byte[r0]
            r9c r6 = r6.b     // Catch: java.io.IOException -> L29
            s9c r4 = new s9c     // Catch: java.io.IOException -> L29
            r4.<init>(r0, r3)     // Catch: java.io.IOException -> L29
            r6.p(r4)     // Catch: java.io.IOException -> L29
            goto L31
        L29:
            r6 = move-exception
            java.lang.String r4 = "A problem occurred while reading the Crashlytics log file."
            java.lang.String r5 = "FirebaseCrashlytics"
            android.util.Log.e(r5, r4, r6)
        L31:
            t9c$a r6 = new t9c$a
            r3 = r3[r1]
            r6.<init>(r0, r3)
        L38:
            if (r6 != 0) goto L3c
            r3 = r2
            goto L45
        L3c:
            int r0 = r6.b
            byte[] r3 = new byte[r0]
            byte[] r6 = r6.a
            java.lang.System.arraycopy(r6, r1, r3, r1, r0)
        L45:
            if (r3 == 0) goto L4f
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r0 = defpackage.t9c.c
            r6.<init>(r3, r0)
            return r6
        L4f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9c.b():java.lang.String");
    }

    @Override // defpackage.y95
    public final void c(long j, String str) {
        d();
        if (this.b == null) {
            return;
        }
        try {
            if (str.length() > 16384) {
                str = "...".concat(str.substring(str.length() - 16384));
            }
            this.b.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(c));
            while (!this.b.s() && this.b.W() > 65536) {
                this.b.N();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }

    public final void d() {
        File file = this.a;
        if (this.b == null) {
            try {
                this.b = new r9c(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }
}
