package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c0g {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.pu2 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.a0g
            if (r0 == 0) goto L13
            r0 = r7
            a0g r0 = (defpackage.a0g) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            a0g r0 = new a0g
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r6 = r0.result
            int r7 = r0.label
            java.lang.String r1 = "UDPInteractionService"
            r2 = 1
            r3 = 0
            r4 = 0
            if (r7 == 0) goto L35
            if (r7 != r2) goto L2f
            java.lang.Object r7 = r0.L$0
            sx r7 = (defpackage.sx) r7
            defpackage.r7d.b(r6)     // Catch: java.lang.Exception -> L2d
            goto L6c
        L2d:
            r6 = move-exception
            goto L91
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r4
        L35:
            defpackage.r7d.b(r6)
            sx r6 = new sx     // Catch: java.lang.Exception -> L2d
            e0g r7 = new e0g     // Catch: java.lang.Exception -> L2d
            r7.<init>(r3)     // Catch: java.lang.Exception -> L2d
            java.time.Instant r5 = java.time.Instant.now()     // Catch: java.lang.Exception -> L2d
            r5.getClass()     // Catch: java.lang.Exception -> L2d
            r6.<init>(r7, r5)     // Catch: java.lang.Exception -> L2d
            java.lang.Class<fq7> r7 = defpackage.fq7.class
            java.lang.Object r7 = defpackage.cr8.p(r7)     // Catch: java.lang.Exception -> L2d
            fq7 r7 = (defpackage.fq7) r7     // Catch: java.lang.Exception -> L2d
            lh0 r7 = r7.a()     // Catch: java.lang.Exception -> L2d
            ux r5 = new ux     // Catch: java.lang.Exception -> L2d
            r5.<init>(r6)     // Catch: java.lang.Exception -> L2d
            kh0 r6 = new kh0     // Catch: java.lang.Exception -> L2d
            r6.<init>(r7, r5)     // Catch: java.lang.Exception -> L2d
            r0.L$0 = r4     // Catch: java.lang.Exception -> L2d
            r0.label = r2     // Catch: java.lang.Exception -> L2d
            java.lang.Object r6 = r6.b(r0)     // Catch: java.lang.Exception -> L2d
            g13 r7 = defpackage.g13.a
            if (r6 != r7) goto L6c
            return r7
        L6c:
            sh0 r6 = (defpackage.sh0) r6     // Catch: java.lang.Exception -> L2d
            pua$a r6 = r6.a()     // Catch: java.lang.Exception -> L2d
            ux$b r6 = (ux.b) r6     // Catch: java.lang.Exception -> L2d
            ux$f r6 = r6.a     // Catch: java.lang.Exception -> L2d
            if (r6 != 0) goto L88
            java.util.ArrayList r6 = defpackage.lz2.a     // Catch: java.lang.Exception -> L2d
            java.lang.String r6 = "Error: null 'userDisplayPreferenceMutations' property"
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L2d
            java.lang.String r0 = "response.userDisplayPreferenceMutations"
            r7.<init>(r0)     // Catch: java.lang.Exception -> L2d
            defpackage.lz2.b(r1, r6, r3, r7)     // Catch: java.lang.Exception -> L2d
            r2 = r3
            goto L8f
        L88:
            java.util.ArrayList r6 = defpackage.lz2.a     // Catch: java.lang.Exception -> L2d
            java.lang.String r6 = "Successfully dismissed skills suggestions via UDP API"
            android.util.Log.d(r1, r6, r4)     // Catch: java.lang.Exception -> L2d
        L8f:
            r3 = r2
            goto L98
        L91:
            java.util.ArrayList r7 = defpackage.lz2.a
            java.lang.String r7 = "Error adding UDP interaction: "
            defpackage.o6.l(r7, r6, r1, r3, r6)
        L98:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c0g.a(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.pu2 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.b0g
            if (r0 == 0) goto L13
            r0 = r5
            b0g r0 = (defpackage.b0g) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            b0g r0 = new b0g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r4 = r0.result
            int r5 = r0.label
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L2c
            if (r5 != r2) goto L26
            defpackage.r7d.b(r4)     // Catch: java.lang.Exception -> L95
            goto L50
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r1
        L2c:
            defpackage.r7d.b(r4)
            java.lang.Class<fq7> r4 = defpackage.fq7.class
            java.lang.Object r4 = defpackage.cr8.p(r4)     // Catch: java.lang.Exception -> L95
            fq7 r4 = (defpackage.fq7) r4     // Catch: java.lang.Exception -> L95
            lh0 r4 = r4.a()     // Catch: java.lang.Exception -> L95
            y56 r5 = new y56     // Catch: java.lang.Exception -> L95
            r5.<init>()     // Catch: java.lang.Exception -> L95
            kh0 r3 = new kh0     // Catch: java.lang.Exception -> L95
            r3.<init>(r4, r5)     // Catch: java.lang.Exception -> L95
            r0.label = r2     // Catch: java.lang.Exception -> L95
            java.lang.Object r4 = r3.b(r0)     // Catch: java.lang.Exception -> L95
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L50
            return r5
        L50:
            sh0 r4 = (defpackage.sh0) r4     // Catch: java.lang.Exception -> L95
            pua$a r4 = r4.a()     // Catch: java.lang.Exception -> L95
            y56$a r4 = (y56.a) r4     // Catch: java.lang.Exception -> L95
            y56$b r4 = r4.a     // Catch: java.lang.Exception -> L95
            if (r4 == 0) goto L80
            y56$d r4 = r4.a     // Catch: java.lang.Exception -> L95
            java.util.ArrayList r4 = r4.a     // Catch: java.lang.Exception -> L95
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L95
        L64:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Exception -> L95
            if (r5 == 0) goto L7e
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Exception -> L95
            r0 = r5
            y56$c r0 = (y56.c) r0     // Catch: java.lang.Exception -> L95
            y56$e r0 = r0.a     // Catch: java.lang.Exception -> L95
            java.lang.String r0 = r0.a     // Catch: java.lang.Exception -> L95
            java.lang.String r2 = "INLINE_SKILLS_SUGGESTIONS_DISMISSED"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L64
            r1 = r5
        L7e:
            y56$c r1 = (y56.c) r1     // Catch: java.lang.Exception -> L95
        L80:
            if (r1 == 0) goto L92
            int r4 = r1.b     // Catch: java.lang.Exception -> L95
            if (r4 <= 0) goto L92
            wje$a r4 = new wje$a     // Catch: java.lang.Exception -> L95
            java.time.Instant r5 = r1.d     // Catch: java.lang.Exception -> L95
            long r0 = r5.toEpochMilli()     // Catch: java.lang.Exception -> L95
            r4.<init>(r0)     // Catch: java.lang.Exception -> L95
            return r4
        L92:
            wje$c r4 = wje.c.a     // Catch: java.lang.Exception -> L95
            return r4
        L95:
            r4 = move-exception
            java.util.ArrayList r5 = defpackage.lz2.a
            java.lang.String r5 = "Error fetching UDP interactions: "
            r0 = 0
            java.lang.String r1 = "UDPInteractionService"
            defpackage.o6.l(r5, r4, r1, r0, r4)
            wje$b r4 = wje.b.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c0g.b(pu2):java.lang.Object");
    }
}
