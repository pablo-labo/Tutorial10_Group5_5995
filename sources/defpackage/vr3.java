package defpackage;

import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public final class vr3 implements fwg {
    public final d2f a;

    public vr3(OkHttpClient okHttpClient) {
        this.a = new d2f(new dd(new j30(okHttpClient, 11), 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fwg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, java.util.List r6, defpackage.pu2 r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.sr3
            if (r0 == 0) goto L13
            r0 = r7
            sr3 r0 = (defpackage.sr3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            sr3 r0 = new sr3
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            java.lang.Object r4 = r0.L$1
            okhttp3.WebSocket r4 = (okhttp3.WebSocket) r4
            java.lang.Object r5 = r0.L$0
            u12 r5 = (defpackage.u12) r5
            defpackage.r7d.b(r7)
            goto L7a
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r3
        L34:
            defpackage.r7d.b(r7)
            r7 = 2147483647(0x7fffffff, float:NaN)
            r1 = 6
            go1 r7 = defpackage.h22.a(r7, r1, r3)
            yd2 r1 = defpackage.hh1.e()
            okhttp3.Request$Builder r3 = new okhttp3.Request$Builder
            r3.<init>()
            r3.g(r5)
            okhttp3.Headers r5 = defpackage.hpa.a(r6)
            okhttp3.Headers$Builder r5 = r5.d()
            r3.c = r5
            okhttp3.Request r5 = r3.b()
            d2f r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            okhttp3.WebSocket$Factory r4 = (okhttp3.WebSocket.Factory) r4
            ur3 r6 = new ur3
            r6.<init>(r1, r7)
            okhttp3.internal.ws.RealWebSocket r4 = r4.d(r5, r6)
            r0.L$0 = r7
            r0.L$1 = r4
            r0.label = r2
            java.lang.Object r5 = r1.o(r0)
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L79
            return r6
        L79:
            r5 = r7
        L7a:
            cd r6 = new cd
            r7 = 4
            r6.<init>(r4, r7)
            r5.e(r6)
            tr3 r6 = new tr3
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr3.a(java.lang.String, java.util.List, pu2):java.lang.Object");
    }
}
