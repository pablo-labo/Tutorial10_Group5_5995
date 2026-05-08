package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qig implements nig {
    public final mig a;
    public final aig b;
    public final String c;

    public qig(mig migVar, aig aigVar, String str) {
        aigVar.getClass();
        this.a = migVar;
        this.b = aigVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.nig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r7, defpackage.lea r8, defpackage.bj2 r9, defpackage.zw r10, defpackage.lz r11, defpackage.pu2 r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof defpackage.pig
            if (r0 == 0) goto L13
            r0 = r12
            pig r0 = (defpackage.pig) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            pig r0 = new pig
            r0.<init>(r6, r12)
        L18:
            java.lang.Object r12 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L47
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            java.lang.Object r6 = r0.L$0
            gu5 r6 = (defpackage.gu5) r6
            defpackage.r7d.b(r12)
            goto L75
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r2
        L35:
            java.lang.Object r7 = r0.L$2
            r11 = r7
            gu5 r11 = (defpackage.gu5) r11
            java.lang.Object r7 = r0.L$1
            r10 = r7
            gu5 r10 = (defpackage.gu5) r10
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            defpackage.r7d.b(r12)
            goto L5d
        L47:
            defpackage.r7d.b(r12)
            r0.L$0 = r7
            r0.L$1 = r10
            r0.L$2 = r11
            r0.label = r4
            mig r12 = r6.a
            gsa r12 = r12.a
            java.lang.Object r12 = r12.l(r8, r9, r0)
            if (r12 != r5) goto L5d
            goto L73
        L5d:
            rig r12 = (defpackage.rig) r12
            if (r12 != 0) goto L65
            r11.invoke()
            goto L78
        L65:
            r0.L$0 = r10
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r6.c(r12, r7, r0)
            if (r6 != r5) goto L74
        L73:
            return r5
        L74:
            r6 = r10
        L75:
            r6.invoke()
        L78:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qig.a(java.lang.String, lea, bj2, zw, lz, pu2):java.lang.Object");
    }

    @Override // defpackage.nig
    public final Object b(yo6 yo6Var) {
        return this.b.c(this.c, yo6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        if (r11.a(r12, r0) == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.rig r12, java.lang.String r13, defpackage.pu2 r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.oig
            if (r0 == 0) goto L13
            r0 = r14
            oig r0 = (defpackage.oig) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            oig r0 = new oig
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.result
            int r1 = r0.label
            r2 = 0
            aig r11 = r11.b
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            defpackage.r7d.b(r14)
            goto La4
        L2e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r11)
            return r2
        L34:
            java.lang.Object r12 = r0.L$0
            java.util.List r12 = (java.util.List) r12
            defpackage.r7d.b(r14)
            goto L99
        L3c:
            defpackage.r7d.b(r14)
            java.util.List<fig> r14 = r12.b
            java.util.Collection r14 = (java.util.Collection) r14
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto La7
            java.util.List<fig> r14 = r12.b
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r1 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.t92.r0(r14, r6)
            r1.<init>(r6)
            java.util.Iterator r14 = r14.iterator()
        L5c:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L79
            java.lang.Object r6 = r14.next()
            fig r6 = (defpackage.fig) r6
            java.lang.String r7 = r12.a
            fig r8 = new fig
            java.lang.String r9 = r6.a
            java.lang.String r10 = r6.c
            java.lang.String r6 = r6.d
            r8.<init>(r9, r7, r10, r6)
            r1.add(r8)
            goto L5c
        L79:
            java.util.ArrayList r12 = defpackage.lz2.a
            int r12 = r1.size()
            java.lang.String r14 = "Inserting "
            java.lang.String r6 = " URL registry items into DB for locale: "
            java.lang.String r12 = defpackage.v40.c(r12, r14, r6, r13)
            r14 = 0
            java.lang.String r6 = "UrlRegistryRepository"
            defpackage.lz2.d(r6, r12, r14, r2)
            r0.L$0 = r1
            r0.label = r4
            java.lang.Object r12 = r11.b(r13, r0)
            if (r12 != r5) goto L98
            goto La3
        L98:
            r12 = r1
        L99:
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r11 = r11.a(r12, r0)
            if (r11 != r5) goto La4
        La3:
            return r5
        La4:
            j6g r11 = defpackage.j6g.a
            return r11
        La7:
            j6g r11 = defpackage.j6g.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qig.c(rig, java.lang.String, pu2):java.lang.Object");
    }
}
