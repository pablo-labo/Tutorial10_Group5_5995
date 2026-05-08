package defpackage;

import defpackage.cga;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class dv1 implements ofa {
    public final OkHttpClient a;

    public /* synthetic */ dv1(OkHttpClient okHttpClient) {
        this.a = okHttpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(okhttp3.OkHttpClient r8, defpackage.uga r9, defpackage.dga r10, defpackage.pu2 r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof defpackage.cv1
            if (r0 == 0) goto L13
            r0 = r11
            cv1 r0 = (defpackage.cv1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            cv1 r0 = new cv1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            g13 r6 = defpackage.g13.a
            if (r1 == 0) goto L51
            if (r1 == r4) goto L44
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L36
            java.lang.Object r8 = r0.L$0
            java.io.Closeable r8 = (java.io.Closeable) r8
            defpackage.r7d.b(r11)     // Catch: java.lang.Throwable -> L33
            goto La2
        L33:
            r9 = move-exception
            goto Laa
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            return r5
        L3c:
            java.lang.Object r8 = r0.L$0
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            defpackage.r7d.b(r11)
            goto L8c
        L44:
            java.lang.Object r8 = r0.L$1
            okhttp3.Call$Factory r8 = (okhttp3.Call.Factory) r8
            java.lang.Object r9 = r0.L$0
            r10 = r9
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            defpackage.r7d.b(r11)
            goto L61
        L51:
            defpackage.r7d.b(r11)
            r0.L$0 = r10
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r11 = defpackage.pkg.b(r9, r0)
            if (r11 != r6) goto L61
            goto La0
        L61:
            okhttp3.Request r11 = (okhttp3.Request) r11
            okhttp3.internal.connection.RealCall r8 = r8.c(r11)
            r0.L$0 = r10
            r0.L$1 = r5
            r0.label = r3
            qw1 r9 = new qw1
            lu2 r11 = defpackage.ewa.v(r0)
            r9.<init>(r4, r11)
            r9.q()
            nu2 r11 = new nu2
            r11.<init>(r8, r9)
            r8.R0(r11)
            r9.t(r11)
            java.lang.Object r11 = r9.p()
            if (r11 != r6) goto L8b
            goto La0
        L8b:
            r8 = r10
        L8c:
            r9 = r11
            java.io.Closeable r9 = (java.io.Closeable) r9
            r10 = r9
            okhttp3.Response r10 = (okhttp3.Response) r10     // Catch: java.lang.Throwable -> La6
            xga r10 = defpackage.pkg.a(r10)     // Catch: java.lang.Throwable -> La6
            r0.L$0 = r9     // Catch: java.lang.Throwable -> La6
            r0.label = r2     // Catch: java.lang.Throwable -> La6
            java.lang.Object r11 = r8.invoke(r10, r0)     // Catch: java.lang.Throwable -> La6
            if (r11 != r6) goto La1
        La0:
            return r6
        La1:
            r8 = r9
        La2:
            defpackage.c0h.q(r8, r5)
            return r11
        La6:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        Laa:
            throw r9     // Catch: java.lang.Throwable -> Lab
        Lab:
            r10 = move-exception
            defpackage.c0h.q(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dv1.b(okhttp3.OkHttpClient, uga, dga, pu2):java.lang.Object");
    }

    @Override // defpackage.ofa
    public final Object a(uga ugaVar, dga dgaVar, cga.b bVar) {
        return b(this.a, ugaVar, dgaVar, bVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dv1) {
            return this.a == ((dv1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.a + ')';
    }
}
