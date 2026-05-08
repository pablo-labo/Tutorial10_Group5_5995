package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lpb {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.upb r4, defpackage.gu5 r5, defpackage.pu2 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.kpb
            if (r0 == 0) goto L13
            r0 = r6
            kpb r0 = (defpackage.kpb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kpb r0 = new kpb
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 != r3) goto L31
            java.lang.Object r4 = r0.L$1
            r5 = r4
            gu5 r5 = (defpackage.gu5) r5
            java.lang.Object r4 = r0.L$0
            upb r4 = (defpackage.upb) r4
            defpackage.r7d.b(r6)     // Catch: java.lang.Throwable -> L2f
            goto L6a
        L2f:
            r4 = move-exception
            goto L70
        L31:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L37:
            defpackage.r7d.b(r6)
            v03 r6 = r0.getContext()
            ex7$a r1 = ex7.a.a
            v03$a r6 = r6.h1(r1)
            if (r6 != r4) goto L74
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2f
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L2f
            r0.label = r3     // Catch: java.lang.Throwable -> L2f
            qw1 r6 = new qw1     // Catch: java.lang.Throwable -> L2f
            lu2 r0 = defpackage.ewa.v(r0)     // Catch: java.lang.Throwable -> L2f
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2f
            r6.q()     // Catch: java.lang.Throwable -> L2f
            q52 r0 = new q52     // Catch: java.lang.Throwable -> L2f
            r1 = 3
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L2f
            r4.e(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r4 = r6.p()     // Catch: java.lang.Throwable -> L2f
            g13 r6 = defpackage.g13.a
            if (r4 != r6) goto L6a
            return r6
        L6a:
            r5.invoke()
            j6g r4 = defpackage.j6g.a
            return r4
        L70:
            r5.invoke()
            throw r4
        L74:
            java.lang.String r4 = "awaitClose() can only be invoked from the producer context"
            defpackage.r6.g(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpb.a(upb, gu5, pu2):java.lang.Object");
    }
}
