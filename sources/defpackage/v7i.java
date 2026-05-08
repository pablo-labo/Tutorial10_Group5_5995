package defpackage;

import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public final class v7i implements Runnable {
    public final URL a;
    public final c1i b;
    public final /* synthetic */ q7i c;

    public v7i(q7i q7iVar, String str, URL url, c1i c1iVar) {
        this.c = q7iVar;
        fib.f(str);
        this.a = url;
        this.b = c1iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            r9 = this;
            q7i r1 = r9.c
            i0i r0 = r1.a
            a0i r0 = r0.Y
            defpackage.i0i.i(r0)
            r0.o()
            r5 = 0
            r2 = 0
            java.net.URL r0 = r9.a     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L59
            java.net.HttpURLConnection r3 = r1.j(r0)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L59
            int r4 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4d
            java.util.Map r7 = r3.getHeaderFields()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L41
            byte[] r6 = defpackage.q7i.k(r3)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L36
            r3.disconnect()
            a0i r0 = r1.zzq()
            t7i r2 = new t7i
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r0.m(r2)
            return
        L31:
            r0 = move-exception
            r8 = r3
            r3 = r9
            r9 = r8
            goto L5f
        L36:
            r0 = move-exception
            r8 = r3
            r3 = r9
            r9 = r8
            goto L72
        L3b:
            r0 = move-exception
            r8 = r3
            r3 = r9
            r9 = r8
        L3f:
            r7 = r5
            goto L5f
        L41:
            r0 = move-exception
            r8 = r3
            r3 = r9
            r9 = r8
        L45:
            r7 = r5
            goto L72
        L47:
            r0 = move-exception
            r8 = r3
            r3 = r9
            r9 = r8
            r4 = r2
            goto L3f
        L4d:
            r0 = move-exception
            r8 = r3
            r3 = r9
            r9 = r8
            r4 = r2
            goto L45
        L53:
            r0 = move-exception
            r3 = r9
            r4 = r2
            r9 = r5
            r7 = r9
            goto L5f
        L59:
            r0 = move-exception
            r3 = r9
            r4 = r2
            r9 = r5
            r7 = r9
            goto L72
        L5f:
            if (r9 == 0) goto L64
            r9.disconnect()
        L64:
            a0i r9 = r1.zzq()
            t7i r2 = new t7i
            r6 = r5
            r2.<init>(r3, r4, r5, r6, r7)
            r9.m(r2)
            throw r0
        L72:
            if (r9 == 0) goto L77
            r9.disconnect()
        L77:
            a0i r9 = r1.zzq()
            t7i r2 = new t7i
            r6 = r5
            r5 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            r9.m(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v7i.run():void");
    }
}
