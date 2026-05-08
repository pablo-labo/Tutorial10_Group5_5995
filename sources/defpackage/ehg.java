package defpackage;

import com.indeed.android.profile.services.UploadResumeService;
import defpackage.bad;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class ehg implements chg {
    public final UploadResumeService a;

    public ehg(OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        OkHttpClient.Builder builderE = okHttpClient.e();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builderE.b(60L, timeUnit);
        builderE.z = Util.b(60L, timeUnit);
        builderE.A = Util.b(60L, timeUnit);
        OkHttpClient okHttpClient2 = new OkHttpClient(builderE);
        ra8 ra8VarA = sa8.a(new xi(16));
        bad.b bVar = new bad.b();
        bVar.b = okHttpClient2;
        bVar.a("https://www.indeed.com/");
        MediaType.e.getClass();
        bVar.d.add(ewa.q(ra8VarA, MediaType.Companion.a("application/json")));
        UploadResumeService uploadResumeService = (UploadResumeService) bVar.b().b(UploadResumeService.class);
        uploadResumeService.getClass();
        this.a = uploadResumeService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.chg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, okhttp3.RequestBody r6, defpackage.pu2 r7) throws com.indeed.android.profile.services.ResumeS3UploadHttpException {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.dhg
            if (r0 == 0) goto L13
            r0 = r7
            dhg r0 = (defpackage.dhg) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            dhg r0 = new dhg
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            java.lang.Object r4 = r0.L$1
            okhttp3.RequestBody r4 = (okhttp3.RequestBody) r4
            java.lang.Object r4 = r0.L$0
            java.lang.String r4 = (java.lang.String) r4
            defpackage.r7d.b(r7)
            goto L48
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L34:
            defpackage.r7d.b(r7)
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            com.indeed.android.profile.services.UploadResumeService r4 = r4.a
            java.lang.Object r7 = r4.putResume(r5, r6, r0)
            g13 r4 = defpackage.g13.a
            if (r7 != r4) goto L48
            return r4
        L48:
            m6d r7 = (defpackage.m6d) r7
            okhttp3.Response r4 = r7.a
            boolean r4 = r4.h()
            if (r4 == 0) goto L55
            j6g r4 = defpackage.j6g.a
            return r4
        L55:
            com.indeed.android.profile.services.ResumeS3UploadHttpException r4 = new com.indeed.android.profile.services.ResumeS3UploadHttpException
            okhttp3.Response r5 = r7.a
            int r6 = r5.d
            java.lang.String r5 = r5.c
            r4.<init>(r6, r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehg.a(java.lang.String, okhttp3.RequestBody, pu2):java.lang.Object");
    }
}
