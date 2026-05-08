package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class is2 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.h48 r6, defpackage.pu2 r7) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.hs2
            if (r0 == 0) goto L13
            r0 = r7
            hs2 r0 = (defpackage.hs2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            hs2 r0 = new hs2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.result
            int r7 = r0.label
            r1 = 0
            r2 = 1
            r3 = 0
            if (r7 == 0) goto L34
            if (r7 != r2) goto L2e
            java.lang.Object r6 = r0.L$0
            h48 r6 = (defpackage.h48) r6
            defpackage.r7d.b(r5)     // Catch: java.lang.Exception -> L2b
            goto L5f
        L2b:
            r5 = move-exception
            goto Lad
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r3
        L34:
            defpackage.r7d.b(r5)
            java.lang.Class<fq7> r5 = defpackage.fq7.class
            java.lang.Object r5 = defpackage.cr8.p(r5)     // Catch: java.lang.Exception -> L2b
            fq7 r5 = (defpackage.fq7) r5     // Catch: java.lang.Exception -> L2b
            lh0 r5 = r5.a()     // Catch: java.lang.Exception -> L2b
            sfg r7 = new sfg     // Catch: java.lang.Exception -> L2b
            kcg r4 = new kcg     // Catch: java.lang.Exception -> L2b
            r4.<init>(r6)     // Catch: java.lang.Exception -> L2b
            r7.<init>(r4)     // Catch: java.lang.Exception -> L2b
            kh0 r6 = new kh0     // Catch: java.lang.Exception -> L2b
            r6.<init>(r5, r7)     // Catch: java.lang.Exception -> L2b
            r0.L$0 = r3     // Catch: java.lang.Exception -> L2b
            r0.label = r2     // Catch: java.lang.Exception -> L2b
            java.lang.Object r5 = r6.b(r0)     // Catch: java.lang.Exception -> L2b
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L5f
            return r6
        L5f:
            sh0 r5 = (defpackage.sh0) r5     // Catch: java.lang.Exception -> L2b
            java.util.List<iw4> r6 = r5.d     // Catch: java.lang.Exception -> L2b
            if (r6 == 0) goto L9a
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Exception -> L2b
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L2b
            java.lang.String r7 = ""
        L6d:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Exception -> L2b
            iw4 r0 = (defpackage.iw4) r0     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = r0.a     // Catch: java.lang.Exception -> L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b
            r2.<init>()     // Catch: java.lang.Exception -> L2b
            r2.append(r7)     // Catch: java.lang.Exception -> L2b
            r2.append(r0)     // Catch: java.lang.Exception -> L2b
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Exception -> L2b
            goto L6d
        L8b:
            java.lang.String r6 = "PGAPI_E-017: Invalid postal code in location"
            boolean r6 = defpackage.zve.L(r7, r6, r1)     // Catch: java.lang.Exception -> L2b
            if (r6 != 0) goto L94
            goto L9a
        L94:
            com.indeed.android.profile.services.InvalidPostalCodeException r5 = new com.indeed.android.profile.services.InvalidPostalCodeException     // Catch: java.lang.Exception -> L2b
            r5.<init>(r7)     // Catch: java.lang.Exception -> L2b
            throw r5     // Catch: java.lang.Exception -> L2b
        L9a:
            pua$a r5 = r5.a()     // Catch: java.lang.Exception -> L2b
            sfg$a r5 = (sfg.a) r5     // Catch: java.lang.Exception -> L2b
            sfg$e r6 = r5.a     // Catch: java.lang.Exception -> L2b
            if (r6 == 0) goto La5
            return r5
        La5:
            com.indeed.android.profile.services.GraphqlException r5 = new com.indeed.android.profile.services.GraphqlException     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = "Invalid response"
            r5.<init>(r6)     // Catch: java.lang.Exception -> L2b
            throw r5     // Catch: java.lang.Exception -> L2b
        Lad:
            java.util.ArrayList r6 = defpackage.lz2.a
            java.lang.String r6 = "ContactInformationService"
            java.lang.String r7 = "Error finding Employer Logo Image URL: "
            defpackage.o6.l(r7, r5, r6, r1, r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is2.a(h48, pu2):java.lang.Object");
    }
}
