package defpackage;

import defpackage.aga;
import defpackage.km6;

/* JADX INFO: loaded from: classes2.dex */
public final class im6 implements Runnable {
    public final /* synthetic */ km6.a a;
    public final /* synthetic */ aga.a b;
    public final /* synthetic */ km6 c;

    public im6(km6 km6Var, km6.a aVar, aga.a aVar2) {
        this.c = km6Var;
        this.a = aVar;
        this.b = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            r6 = this;
            km6 r0 = r6.c
            km6$a r1 = r6.a
            aga$a r6 = r6.b
            r2 = 0
            ppb r3 = r1.b     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L39
            com.facebook.imagepipeline.request.a r3 = r3.Q()     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L39
            android.net.Uri r3 = r3.b     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L39
            r4 = 5
            java.net.HttpURLConnection r3 = r0.J1(r4, r3)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L39
            com.facebook.common.time.RealtimeSinceBootClock r0 = r0.f     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            long r4 = r0.now()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r1.g = r4     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            if (r3 == 0) goto L2b
            java.io.InputStream r2 = r3.getInputStream()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r0 = -1
            r6.c(r2, r0)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            goto L2b
        L27:
            r6 = move-exception
            goto L47
        L29:
            r0 = move-exception
            goto L3b
        L2b:
            if (r2 == 0) goto L30
            r2.close()     // Catch: java.io.IOException -> L30
        L30:
            if (r3 == 0) goto L46
        L32:
            r3.disconnect()
            goto L46
        L36:
            r6 = move-exception
            r3 = r2
            goto L47
        L39:
            r0 = move-exception
            r3 = r2
        L3b:
            r6.b(r0)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L43
            r2.close()     // Catch: java.io.IOException -> L43
        L43:
            if (r3 == 0) goto L46
            goto L32
        L46:
            return
        L47:
            if (r2 == 0) goto L4c
            r2.close()     // Catch: java.io.IOException -> L4c
        L4c:
            if (r3 == 0) goto L51
            r3.disconnect()
        L51:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im6.run():void");
    }
}
