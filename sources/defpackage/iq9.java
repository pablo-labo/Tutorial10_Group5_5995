package defpackage;

import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.rnmessaging.api.MessagingRetrofitApiResolver;
import defpackage.bad;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final class iq9 implements nq9 {
    public final MessagingRetrofitApiResolver a;

    public iq9() {
        ra8 ra8VarA = sa8.a(new lg(9));
        bad.b bVar = new bad.b();
        bVar.c((OkHttpClient) lq9.a.getValue());
        bVar.a(((v1g) cr8.p(v1g.class)).a());
        MediaType.e.getClass();
        bVar.d.add(ewa.q(ra8VarA, MediaType.Companion.a("application/json")));
        MessagingRetrofitApiResolver messagingRetrofitApiResolver = (MessagingRetrofitApiResolver) bVar.b().b(MessagingRetrofitApiResolver.class);
        messagingRetrofitApiResolver.getClass();
        this.a = messagingRetrofitApiResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(com.facebook.react.bridge.ReactApplicationContext r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, defpackage.pu2 r11) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r11 instanceof defpackage.eq9
            if (r0 == 0) goto L13
            r0 = r11
            eq9 r0 = (defpackage.eq9) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            eq9 r0 = new eq9
            r0.<init>(r4, r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L47
            if (r1 != r2) goto L41
            java.lang.Object r4 = r0.L$5
            r10 = r4
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r4 = r0.L$4
            r9 = r4
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r4 = r0.L$3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r0.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r0.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r0.L$0
            r5 = r4
            android.content.Context r5 = (android.content.Context) r5
            defpackage.r7d.b(r11)
            goto L7d
        L41:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r3
        L47:
            defpackage.r7d.b(r11)
            r6.getClass()
            java.lang.String r11 = "CONVERSATION_SERVICE_ENCRYPTED///"
            java.lang.String r6 = r11.concat(r6)
            java.nio.charset.Charset r11 = defpackage.a32.b
            byte[] r6 = r6.getBytes(r11)
            r6.getClass()
            r11 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r11)
            r6.getClass()
            r0.L$0 = r5
            r0.L$1 = r3
            r0.L$2 = r3
            r0.L$3 = r3
            r0.L$4 = r9
            r0.L$5 = r10
            r0.label = r2
            com.indeed.android.rnmessaging.api.MessagingRetrofitApiResolver r4 = r4.a
            java.lang.Object r11 = r4.downloadAttachment(r6, r7, r8, r0)
            g13 r4 = defpackage.g13.a
            if (r11 != r4) goto L7d
            return r4
        L7d:
            okhttp3.ResponseBody r11 = (okhttp3.ResponseBody) r11
            r5.getClass()
            r9.getClass()
            r10.getClass()
            java.io.File r4 = r5.getCacheDir()
            java.io.File r4 = java.io.File.createTempFile(r9, r10, r4)
            r4.createNewFile()
            java.io.InputStream r5 = r11.a()
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La6
            r6.<init>(r4)     // Catch: java.lang.Throwable -> La6
            defpackage.wg2.u(r5, r6)     // Catch: java.lang.Throwable -> La8
            r6.close()     // Catch: java.lang.Throwable -> La6
            r5.close()
            return r4
        La6:
            r4 = move-exception
            goto Laf
        La8:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> Laa
        Laa:
            r7 = move-exception
            defpackage.c0h.q(r6, r4)     // Catch: java.lang.Throwable -> La6
            throw r7     // Catch: java.lang.Throwable -> La6
        Laf:
            throw r4     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r6 = move-exception
            defpackage.c0h.q(r5, r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iq9.d(com.facebook.react.bridge.ReactApplicationContext, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, pu2):java.lang.Object");
    }

    @Override // com.indeed.android.backendservices.common.api.b
    public final <ResponseType> Object r(Function1<? super lu2<? super m6d<ResponseType>>, ? extends Object> function1, Function2<? super ApiError, ? super Request, j6g> function2, lu2<? super wg0<ResponseType>> lu2Var) {
        throw null;
    }
}
