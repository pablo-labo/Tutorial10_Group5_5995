package defpackage;

import com.indeed.android.messaging.api.messaging.MessagingRetrofitApiResolver;

/* JADX INFO: loaded from: classes2.dex */
public interface gs9 extends oq9 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Object e(defpackage.gs9 r4, android.content.Context r5, java.lang.String r6, java.lang.String r7, com.indeed.android.messaging.data.events.EventRecord.Attachment r8, defpackage.pu2 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.bs9
            if (r0 == 0) goto L13
            r0 = r9
            bs9 r0 = (defpackage.bs9) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            bs9 r0 = new bs9
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L42
            if (r1 != r2) goto L3c
            java.lang.Object r4 = r0.L$4
            r8 = r4
            com.indeed.android.messaging.data.events.EventRecord$Attachment r8 = (com.indeed.android.messaging.data.events.EventRecord.Attachment) r8
            java.lang.Object r4 = r0.L$3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r0.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r0.L$1
            r5 = r4
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r4 = r0.L$0
            gs9 r4 = (defpackage.gs9) r4
            defpackage.r7d.b(r9)
            goto L7c
        L3c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r3
        L42:
            defpackage.r7d.b(r9)
            com.indeed.android.messaging.api.messaging.MessagingRetrofitApiResolver r4 = r4.c()
            r6.getClass()
            java.lang.String r9 = "CONVERSATION_SERVICE_ENCRYPTED///"
            java.lang.String r6 = r9.concat(r6)
            java.nio.charset.Charset r9 = defpackage.a32.b
            byte[] r6 = r6.getBytes(r9)
            r6.getClass()
            r9 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r9)
            r6.getClass()
            java.lang.String r9 = r8.getContentHash()
            r0.L$0 = r3
            r0.L$1 = r5
            r0.L$2 = r3
            r0.L$3 = r3
            r0.L$4 = r8
            r0.label = r2
            java.lang.Object r9 = r4.downloadAttachment(r6, r7, r9, r0)
            g13 r4 = defpackage.g13.a
            if (r9 != r4) goto L7c
            return r4
        L7c:
            okhttp3.ResponseBody r9 = (okhttp3.ResponseBody) r9
            java.lang.String r4 = r8.getFileName()
            java.lang.String r6 = r8.getFileExtension()
            r5.getClass()
            r4.getClass()
            r6.getClass()
            java.io.File r5 = r5.getCacheDir()
            java.io.File r4 = java.io.File.createTempFile(r4, r6, r5)
            r4.createNewFile()
            java.io.InputStream r5 = r9.a()
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lad
            r6.<init>(r4)     // Catch: java.lang.Throwable -> Lad
            defpackage.wg2.u(r5, r6)     // Catch: java.lang.Throwable -> Laf
            r6.close()     // Catch: java.lang.Throwable -> Lad
            r5.close()
            return r4
        Lad:
            r4 = move-exception
            goto Lb6
        Laf:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r7 = move-exception
            defpackage.c0h.q(r6, r4)     // Catch: java.lang.Throwable -> Lad
            throw r7     // Catch: java.lang.Throwable -> Lad
        Lb6:
            throw r4     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            r6 = move-exception
            defpackage.c0h.q(r5, r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gs9.e(gs9, android.content.Context, java.lang.String, java.lang.String, com.indeed.android.messaging.data.events.EventRecord$Attachment, pu2):java.lang.Object");
    }

    MessagingRetrofitApiResolver c();
}
