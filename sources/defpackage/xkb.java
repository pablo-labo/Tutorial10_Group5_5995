package defpackage;

import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class xkb implements xh8 {
    public final Lazy a = boa.E(qt8.a, new a(this));
    public final dm0 b = new dm0(12, 0);

    public static final class a extends mj8 implements gu5<gsa> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xkb xkbVar) {
            super(0);
            this.$this_inject = xkbVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gsa, java.lang.Object] */
        @Override // defpackage.gu5
        public final gsa invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gsa.class), a9cVar);
        }
    }

    public static lh0 k() {
        return ((fq7) cr8.p(fq7.class)).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(defpackage.ueg r6, defpackage.pu2 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.alb
            if (r0 == 0) goto L13
            r0 = r7
            alb r0 = (defpackage.alb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            alb r0 = new alb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.result
            int r7 = r0.label
            r1 = 0
            java.lang.String r2 = "PreferencesService"
            r3 = 1
            r4 = 0
            if (r7 == 0) goto L35
            if (r7 != r3) goto L2f
            java.lang.Object r6 = r0.L$0
            ueg r6 = (defpackage.ueg) r6
            defpackage.r7d.b(r5)     // Catch: java.lang.Exception -> L2d
            goto L53
        L2d:
            r5 = move-exception
            goto L76
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r4
        L35:
            defpackage.r7d.b(r5)
            lh0 r5 = k()     // Catch: java.lang.Exception -> L2d
            z9g r7 = new z9g     // Catch: java.lang.Exception -> L2d
            r7.<init>(r6)     // Catch: java.lang.Exception -> L2d
            kh0 r6 = new kh0     // Catch: java.lang.Exception -> L2d
            r6.<init>(r5, r7)     // Catch: java.lang.Exception -> L2d
            r0.L$0 = r4     // Catch: java.lang.Exception -> L2d
            r0.label = r3     // Catch: java.lang.Exception -> L2d
            java.lang.Object r5 = r6.b(r0)     // Catch: java.lang.Exception -> L2d
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L53
            return r6
        L53:
            sh0 r5 = (defpackage.sh0) r5     // Catch: java.lang.Exception -> L2d
            pua$a r5 = r5.a()     // Catch: java.lang.Exception -> L2d
            z9g$a r5 = (z9g.a) r5     // Catch: java.lang.Exception -> L2d
            z9g$d r5 = r5.a     // Catch: java.lang.Exception -> L2d
            if (r5 != 0) goto L6e
            java.util.ArrayList r5 = defpackage.lz2.a     // Catch: java.lang.Exception -> L2d
            java.lang.String r5 = "Error: null 'updateJobSeekerProfileStructuredDataPreference' property"
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L2d
            java.lang.String r7 = "res.updateJobSeekerProfileStructuredDataPreference"
            r6.<init>(r7)     // Catch: java.lang.Exception -> L2d
            defpackage.lz2.b(r2, r5, r1, r6)     // Catch: java.lang.Exception -> L2d
            return r4
        L6e:
            z9g$c r5 = r5.a     // Catch: java.lang.Exception -> L2d
            if (r5 == 0) goto L75
            java.util.ArrayList r5 = r5.b     // Catch: java.lang.Exception -> L2d
            return r5
        L75:
            return r4
        L76:
            java.util.ArrayList r6 = defpackage.lz2.a
            java.lang.String r6 = "Error updating job title preference: "
            defpackage.o6.l(r6, r5, r2, r1, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.A(ueg, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object B(defpackage.ueg r6, defpackage.pu2 r7) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.blb
            if (r0 == 0) goto L13
            r0 = r7
            blb r0 = (defpackage.blb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            blb r0 = new blb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.result
            int r7 = r0.label
            java.lang.String r1 = "PreferencesService"
            r2 = 1
            r3 = 0
            r4 = 0
            if (r7 == 0) goto L36
            if (r7 != r2) goto L30
            java.lang.Object r6 = r0.L$0
            ueg r6 = (defpackage.ueg) r6
            defpackage.r7d.b(r5)     // Catch: java.lang.Exception -> L2d
            goto L54
        L2d:
            r5 = move-exception
            goto Lbe
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r4
        L36:
            defpackage.r7d.b(r5)
            lh0 r5 = k()     // Catch: java.lang.Exception -> L2d
            lag r7 = new lag     // Catch: java.lang.Exception -> L2d
            r7.<init>(r6)     // Catch: java.lang.Exception -> L2d
            kh0 r6 = new kh0     // Catch: java.lang.Exception -> L2d
            r6.<init>(r5, r7)     // Catch: java.lang.Exception -> L2d
            r0.L$0 = r4     // Catch: java.lang.Exception -> L2d
            r0.label = r2     // Catch: java.lang.Exception -> L2d
            java.lang.Object r5 = r6.b(r0)     // Catch: java.lang.Exception -> L2d
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L54
            return r6
        L54:
            sh0 r5 = (defpackage.sh0) r5     // Catch: java.lang.Exception -> L2d
            java.util.List<iw4> r6 = r5.d     // Catch: java.lang.Exception -> L2d
            if (r6 == 0) goto L9d
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Exception -> L2d
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L2d
            java.lang.String r7 = ""
        L62:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Exception -> L2d
            if (r0 == 0) goto L80
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Exception -> L2d
            iw4 r0 = (defpackage.iw4) r0     // Catch: java.lang.Exception -> L2d
            java.lang.String r0 = r0.a     // Catch: java.lang.Exception -> L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2d
            r2.<init>()     // Catch: java.lang.Exception -> L2d
            r2.append(r7)     // Catch: java.lang.Exception -> L2d
            r2.append(r0)     // Catch: java.lang.Exception -> L2d
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Exception -> L2d
            goto L62
        L80:
            java.lang.String r6 = "SDATA_E-424: The salary amount is too large"
            boolean r6 = defpackage.zve.L(r7, r6, r3)     // Catch: java.lang.Exception -> L2d
            if (r6 != 0) goto L97
            java.lang.String r6 = "SDATA_E-416: The salary amount is too small"
            boolean r6 = defpackage.zve.L(r7, r6, r3)     // Catch: java.lang.Exception -> L2d
            if (r6 != 0) goto L91
            goto L9d
        L91:
            com.indeed.android.profile.services.LowSalaryException r5 = new com.indeed.android.profile.services.LowSalaryException     // Catch: java.lang.Exception -> L2d
            r5.<init>(r7)     // Catch: java.lang.Exception -> L2d
            throw r5     // Catch: java.lang.Exception -> L2d
        L97:
            com.indeed.android.profile.services.HighSalaryException r5 = new com.indeed.android.profile.services.HighSalaryException     // Catch: java.lang.Exception -> L2d
            r5.<init>(r7)     // Catch: java.lang.Exception -> L2d
            throw r5     // Catch: java.lang.Exception -> L2d
        L9d:
            pua$a r5 = r5.a()     // Catch: java.lang.Exception -> L2d
            lag$a r5 = (lag.a) r5     // Catch: java.lang.Exception -> L2d
            lag$d r5 = r5.a     // Catch: java.lang.Exception -> L2d
            if (r5 != 0) goto Lb6
            java.util.ArrayList r5 = defpackage.lz2.a     // Catch: java.lang.Exception -> L2d
            java.lang.String r5 = "Error: null 'updateJobSeekerProfileStructuredDataPreference' property"
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L2d
            java.lang.String r7 = "res.updateJobSeekerProfileStructuredDataPreference"
            r6.<init>(r7)     // Catch: java.lang.Exception -> L2d
            defpackage.lz2.b(r1, r5, r3, r6)     // Catch: java.lang.Exception -> L2d
            return r4
        Lb6:
            lag$c r5 = r5.a     // Catch: java.lang.Exception -> L2d
            if (r5 == 0) goto Lbd
            lag$b r5 = r5.a     // Catch: java.lang.Exception -> L2d
            return r5
        Lbd:
            return r4
        Lbe:
            java.util.ArrayList r6 = defpackage.lz2.a
            java.lang.String r6 = "Error updating preferred minimum pay: "
            defpackage.o6.l(r6, r5, r1, r3, r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.B(ueg, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object C(defpackage.ueg r6, defpackage.pu2 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.clb
            if (r0 == 0) goto L13
            r0 = r7
            clb r0 = (defpackage.clb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            clb r0 = new clb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.result
            int r7 = r0.label
            r1 = 0
            java.lang.String r2 = "PreferencesService"
            r3 = 1
            r4 = 0
            if (r7 == 0) goto L35
            if (r7 != r3) goto L2f
            java.lang.Object r6 = r0.L$0
            ueg r6 = (defpackage.ueg) r6
            defpackage.r7d.b(r5)     // Catch: java.lang.Exception -> L2d
            goto L53
        L2d:
            r5 = move-exception
            goto L71
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r4
        L35:
            defpackage.r7d.b(r5)
            lh0 r5 = k()     // Catch: java.lang.Exception -> L2d
            vag r7 = new vag     // Catch: java.lang.Exception -> L2d
            r7.<init>(r6)     // Catch: java.lang.Exception -> L2d
            kh0 r6 = new kh0     // Catch: java.lang.Exception -> L2d
            r6.<init>(r5, r7)     // Catch: java.lang.Exception -> L2d
            r0.L$0 = r4     // Catch: java.lang.Exception -> L2d
            r0.label = r3     // Catch: java.lang.Exception -> L2d
            java.lang.Object r5 = r6.b(r0)     // Catch: java.lang.Exception -> L2d
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L53
            return r6
        L53:
            sh0 r5 = (defpackage.sh0) r5     // Catch: java.lang.Exception -> L2d
            pua$a r5 = r5.a()     // Catch: java.lang.Exception -> L2d
            vag$a r5 = (vag.a) r5     // Catch: java.lang.Exception -> L2d
            vag$e r5 = r5.a     // Catch: java.lang.Exception -> L2d
            if (r5 != 0) goto L6e
            java.util.ArrayList r5 = defpackage.lz2.a     // Catch: java.lang.Exception -> L2d
            java.lang.String r5 = "Error: null 'updateJobSeekerProfileStructuredDataPreference' property"
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L2d
            java.lang.String r7 = "res.updateJobSeekerProfileStructuredDataPreference"
            r6.<init>(r7)     // Catch: java.lang.Exception -> L2d
            defpackage.lz2.b(r2, r5, r1, r6)     // Catch: java.lang.Exception -> L2d
            return r4
        L6e:
            vag$c r5 = r5.a     // Catch: java.lang.Exception -> L2d
            return r5
        L71:
            java.util.ArrayList r6 = defpackage.lz2.a
            java.lang.String r6 = "Error updating relocation preference: "
            defpackage.o6.l(r6, r5, r2, r1, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.C(ueg, pu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        if (r12 == r8) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D(java.util.List r10, java.util.List r11, defpackage.pu2 r12) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.D(java.util.List, java.util.List, pu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b7, code lost:
    
        if (r0 == r9) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(java.util.List r13, java.util.List r14, java.util.List r15, java.util.List r16, java.util.List r17, java.util.List r18, defpackage.pu2 r19) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.E(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, pu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        if (r12 == r8) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object F(java.util.List r10, java.util.List r11, defpackage.pu2 r12) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.F(java.util.List, java.util.List, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r8, defpackage.pu2 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ckb
            if (r0 == 0) goto L13
            r0 = r9
            ckb r0 = (defpackage.ckb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ckb r0 = new ckb
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            java.lang.Object r7 = r0.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            defpackage.r7d.b(r9)
            goto L7d
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r2
        L34:
            defpackage.r7d.b(r9)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.t92.r0(r8, r1)
            r9.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L48:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r8.next()
            sjb r1 = (defpackage.sjb) r1
            up r4 = new up
            java.lang.String r1 = r1.a
            i68$a r5 = defpackage.i68.a
            d58 r5 = defpackage.d58.b
            hva$c r6 = new hva$c
            r6.<init>(r5)
            r4.<init>(r6, r1)
            r9.add(r4)
            goto L48
        L68:
            gsa r8 = r7.n()
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            dm0 r7 = r7.b
            java.lang.Object r9 = r8.q(r9, r7, r0)
            g13 r7 = defpackage.g13.a
            if (r9 != r7) goto L7d
            return r7
        L7d:
            wg0 r9 = (defpackage.wg0) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.a(java.util.List, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.List r8, defpackage.pu2 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dkb
            if (r0 == 0) goto L13
            r0 = r9
            dkb r0 = (defpackage.dkb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            dkb r0 = new dkb
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            java.lang.Object r7 = r0.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            defpackage.r7d.b(r9)
            goto L7d
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r2
        L34:
            defpackage.r7d.b(r9)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.t92.r0(r8, r1)
            r9.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L48:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r8.next()
            sjb r1 = (defpackage.sjb) r1
            up r4 = new up
            java.lang.String r1 = r1.a
            i68$a r5 = defpackage.i68.a
            d58 r5 = defpackage.d58.b
            hva$c r6 = new hva$c
            r6.<init>(r5)
            r4.<init>(r6, r1)
            r9.add(r4)
            goto L48
        L68:
            gsa r8 = r7.n()
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            dm0 r7 = r7.b
            java.lang.Object r9 = r8.q(r9, r7, r0)
            g13 r7 = defpackage.g13.a
            if (r9 != r7) goto L7d
            return r7
        L7d:
            wg0 r9 = (defpackage.wg0) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.b(java.util.List, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.zp r6, defpackage.pu2 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ekb
            if (r0 == 0) goto L13
            r0 = r7
            ekb r0 = (defpackage.ekb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ekb r0 = new ekb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.result
            int r7 = r0.label
            r1 = 0
            java.lang.String r2 = "PreferencesService"
            r3 = 1
            r4 = 0
            if (r7 == 0) goto L35
            if (r7 != r3) goto L2f
            java.lang.Object r6 = r0.L$0
            zp r6 = (defpackage.zp) r6
            defpackage.r7d.b(r5)     // Catch: java.lang.Exception -> L2d
            goto L53
        L2d:
            r5 = move-exception
            goto L76
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r4
        L35:
            defpackage.r7d.b(r5)
            lh0 r5 = k()     // Catch: java.lang.Exception -> L2d
            mk r7 = new mk     // Catch: java.lang.Exception -> L2d
            r7.<init>(r6)     // Catch: java.lang.Exception -> L2d
            kh0 r6 = new kh0     // Catch: java.lang.Exception -> L2d
            r6.<init>(r5, r7)     // Catch: java.lang.Exception -> L2d
            r0.L$0 = r4     // Catch: java.lang.Exception -> L2d
            r0.label = r3     // Catch: java.lang.Exception -> L2d
            java.lang.Object r5 = r6.b(r0)     // Catch: java.lang.Exception -> L2d
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L53
            return r6
        L53:
            sh0 r5 = (defpackage.sh0) r5     // Catch: java.lang.Exception -> L2d
            pua$a r5 = r5.a()     // Catch: java.lang.Exception -> L2d
            mk$b r5 = (mk.b) r5     // Catch: java.lang.Exception -> L2d
            mk$a r5 = r5.a     // Catch: java.lang.Exception -> L2d
            if (r5 != 0) goto L6e
            java.util.ArrayList r5 = defpackage.lz2.a     // Catch: java.lang.Exception -> L2d
            java.lang.String r5 = "Error: null 'addJobSeekerProfileStructuredDataPreference' property"
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L2d
            java.lang.String r7 = "res.addJobSeekerProfileStructuredDataPreference"
            r6.<init>(r7)     // Catch: java.lang.Exception -> L2d
            defpackage.lz2.b(r2, r5, r1, r6)     // Catch: java.lang.Exception -> L2d
            return r4
        L6e:
            mk$d r5 = r5.a     // Catch: java.lang.Exception -> L2d
            if (r5 == 0) goto L75
            java.util.ArrayList r5 = r5.b     // Catch: java.lang.Exception -> L2d
            return r5
        L75:
            return r4
        L76:
            java.util.ArrayList r6 = defpackage.lz2.a
            java.lang.String r6 = "Error adding job title preference: "
            defpackage.o6.l(r6, r5, r2, r1, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.c(zp, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.zp r6, defpackage.pu2 r7) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.e(zp, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.zp r6, defpackage.pu2 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.gkb
            if (r0 == 0) goto L13
            r0 = r7
            gkb r0 = (defpackage.gkb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            gkb r0 = new gkb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.result
            int r7 = r0.label
            r1 = 0
            java.lang.String r2 = "PreferencesService"
            r3 = 1
            r4 = 0
            if (r7 == 0) goto L35
            if (r7 != r3) goto L2f
            java.lang.Object r6 = r0.L$0
            zp r6 = (defpackage.zp) r6
            defpackage.r7d.b(r5)     // Catch: java.lang.Exception -> L2d
            goto L53
        L2d:
            r5 = move-exception
            goto L71
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r4
        L35:
            defpackage.r7d.b(r5)
            lh0 r5 = k()     // Catch: java.lang.Exception -> L2d
            bl r7 = new bl     // Catch: java.lang.Exception -> L2d
            r7.<init>(r6)     // Catch: java.lang.Exception -> L2d
            kh0 r6 = new kh0     // Catch: java.lang.Exception -> L2d
            r6.<init>(r5, r7)     // Catch: java.lang.Exception -> L2d
            r0.L$0 = r4     // Catch: java.lang.Exception -> L2d
            r0.label = r3     // Catch: java.lang.Exception -> L2d
            java.lang.Object r5 = r6.b(r0)     // Catch: java.lang.Exception -> L2d
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L53
            return r6
        L53:
            sh0 r5 = (defpackage.sh0) r5     // Catch: java.lang.Exception -> L2d
            pua$a r5 = r5.a()     // Catch: java.lang.Exception -> L2d
            bl$b r5 = (bl.b) r5     // Catch: java.lang.Exception -> L2d
            bl$a r5 = r5.a     // Catch: java.lang.Exception -> L2d
            if (r5 != 0) goto L6e
            java.util.ArrayList r5 = defpackage.lz2.a     // Catch: java.lang.Exception -> L2d
            java.lang.String r5 = "Error: null 'addJobSeekerProfileStructuredDataPreference' property"
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L2d
            java.lang.String r7 = "res.addJobSeekerProfileStructuredDataPreference"
            r6.<init>(r7)     // Catch: java.lang.Exception -> L2d
            defpackage.lz2.b(r2, r5, r1, r6)     // Catch: java.lang.Exception -> L2d
            return r4
        L6e:
            bl$d r5 = r5.a     // Catch: java.lang.Exception -> L2d
            return r5
        L71:
            java.util.ArrayList r6 = defpackage.lz2.a
            java.lang.String r6 = "Error adding relocation preference: "
            defpackage.o6.l(r6, r5, r2, r1, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.f(zp, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.util.List r8, defpackage.pu2 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.hkb
            if (r0 == 0) goto L13
            r0 = r9
            hkb r0 = (defpackage.hkb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            hkb r0 = new hkb
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            java.lang.Object r7 = r0.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            defpackage.r7d.b(r9)
            goto L7d
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r2
        L34:
            defpackage.r7d.b(r9)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.t92.r0(r8, r1)
            r9.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L48:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r8.next()
            sjb r1 = (defpackage.sjb) r1
            up r4 = new up
            java.lang.String r1 = r1.a
            i68$a r5 = defpackage.i68.a
            d58 r5 = defpackage.d58.b
            hva$c r6 = new hva$c
            r6.<init>(r5)
            r4.<init>(r6, r1)
            r9.add(r4)
            goto L48
        L68:
            gsa r8 = r7.n()
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            dm0 r7 = r7.b
            java.lang.Object r9 = r8.q(r9, r7, r0)
            g13 r7 = defpackage.g13.a
            if (r9 != r7) goto L7d
            return r7
        L7d:
            wg0 r9 = (defpackage.wg0) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.g(java.util.List, pu2):java.lang.Object");
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.util.ArrayList r8, defpackage.pu2 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ikb
            if (r0 == 0) goto L13
            r0 = r9
            ikb r0 = (defpackage.ikb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ikb r0 = new ikb
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            java.lang.Object r7 = r0.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            defpackage.r7d.b(r9)
            goto L79
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r2
        L34:
            defpackage.r7d.b(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.t92.r0(r8, r1)
            r9.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L46:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            up r4 = new up
            i68$a r5 = defpackage.i68.a
            d58 r5 = defpackage.d58.b
            hva$c r6 = new hva$c
            r6.<init>(r5)
            r4.<init>(r6, r1)
            r9.add(r4)
            goto L46
        L64:
            gsa r8 = r7.n()
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            dm0 r7 = r7.b
            java.lang.Object r9 = r8.q(r9, r7, r0)
            g13 r7 = defpackage.g13.a
            if (r9 != r7) goto L79
            return r7
        L79:
            wg0 r9 = (defpackage.wg0) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.h(java.util.ArrayList, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.util.List r8, defpackage.pu2 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.jkb
            if (r0 == 0) goto L13
            r0 = r9
            jkb r0 = (defpackage.jkb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            jkb r0 = new jkb
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            java.lang.Object r7 = r0.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            defpackage.r7d.b(r9)
            goto L7d
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r2
        L34:
            defpackage.r7d.b(r9)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.t92.r0(r8, r1)
            r9.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L48:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r8.next()
            sjb r1 = (defpackage.sjb) r1
            up r4 = new up
            java.lang.String r1 = r1.a
            i68$a r5 = defpackage.i68.a
            d58 r5 = defpackage.d58.b
            hva$c r6 = new hva$c
            r6.<init>(r5)
            r4.<init>(r6, r1)
            r9.add(r4)
            goto L48
        L68:
            gsa r8 = r7.n()
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            dm0 r7 = r7.b
            java.lang.Object r9 = r8.q(r9, r7, r0)
            g13 r7 = defpackage.g13.a
            if (r9 != r7) goto L7d
            return r7
        L7d:
            wg0 r9 = (defpackage.wg0) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.i(java.util.List, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.util.ArrayList r5, defpackage.pu2 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.kkb
            if (r0 == 0) goto L13
            r0 = r6
            kkb r0 = (defpackage.kkb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kkb r0 = new kkb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            java.lang.Object r4 = r0.L$0
            java.util.List r4 = (java.util.List) r4
            defpackage.r7d.b(r6)
            goto L46
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L30:
            defpackage.r7d.b(r6)
            gsa r6 = r4.n()
            r0.L$0 = r2
            r0.label = r3
            dm0 r4 = r4.b
            java.lang.Object r6 = r6.N(r5, r4, r0)
            g13 r4 = defpackage.g13.a
            if (r6 != r4) goto L46
            return r4
        L46:
            wg0 r6 = (defpackage.wg0) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.j(java.util.ArrayList, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.pu2 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.lkb
            if (r0 == 0) goto L13
            r0 = r5
            lkb r0 = (defpackage.lkb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            lkb r0 = new lkb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.r7d.b(r5)
            goto L46
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.r7d.b(r5)
            gsa r5 = r4.n()
            java.lang.String r1 = "BM62A"
            java.util.List r1 = defpackage.u63.Z(r1)
            r0.label = r2
            dm0 r4 = r4.b
            java.lang.Object r5 = r5.Q(r1, r4, r0)
            g13 r4 = defpackage.g13.a
            if (r5 != r4) goto L46
            return r4
        L46:
            wg0 r5 = (defpackage.wg0) r5
            java.lang.Object r4 = r5.b()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.l(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(defpackage.pu2 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.mkb
            if (r0 == 0) goto L13
            r0 = r6
            mkb r0 = (defpackage.mkb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            mkb r0 = new mkb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.r7d.b(r6)
            goto L50
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            r5 = 0
            return r5
        L2c:
            defpackage.r7d.b(r6)
            gsa r6 = r5.n()
            u58 r1 = new u58
            java.lang.String r3 = "BM62A"
            java.util.List r3 = defpackage.u63.Z(r3)
            hva$c r4 = new hva$c
            r4.<init>(r3)
            r1.<init>(r4)
            r0.label = r2
            dm0 r5 = r5.b
            java.lang.Object r6 = r6.t(r1, r5, r0)
            g13 r5 = defpackage.g13.a
            if (r6 != r5) goto L50
            return r5
        L50:
            wg0 r6 = (defpackage.wg0) r6
            java.lang.Object r5 = r6.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.m(pu2):java.lang.Object");
    }

    public final gsa n() {
        return (gsa) this.a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(defpackage.pu2 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "SDC response: "
            boolean r1 = r8 instanceof defpackage.nkb
            if (r1 == 0) goto L15
            r1 = r8
            nkb r1 = (defpackage.nkb) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            nkb r1 = new nkb
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r7 = r1.result
            int r8 = r1.label
            r2 = 0
            r3 = 1
            java.lang.String r4 = "PreferencesService"
            r5 = 0
            if (r8 == 0) goto L33
            if (r8 != r3) goto L2d
            defpackage.r7d.b(r7)     // Catch: java.lang.Exception -> L2b
            goto L4f
        L2b:
            r7 = move-exception
            goto L7c
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r5
        L33:
            defpackage.r7d.b(r7)
            lh0 r7 = k()     // Catch: java.lang.Exception -> L2b
            y46 r8 = new y46     // Catch: java.lang.Exception -> L2b
            r8.<init>()     // Catch: java.lang.Exception -> L2b
            kh0 r6 = new kh0     // Catch: java.lang.Exception -> L2b
            r6.<init>(r7, r8)     // Catch: java.lang.Exception -> L2b
            r1.label = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = r6.b(r1)     // Catch: java.lang.Exception -> L2b
            g13 r8 = defpackage.g13.a
            if (r7 != r8) goto L4f
            return r8
        L4f:
            sh0 r7 = (defpackage.sh0) r7     // Catch: java.lang.Exception -> L2b
            pua$a r7 = r7.a()     // Catch: java.lang.Exception -> L2b
            y46$a r7 = (y46.a) r7     // Catch: java.lang.Exception -> L2b
            java.util.ArrayList r8 = defpackage.lz2.a     // Catch: java.lang.Exception -> L2b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b
            r8.<init>(r0)     // Catch: java.lang.Exception -> L2b
            r8.append(r7)     // Catch: java.lang.Exception -> L2b
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L2b
            android.util.Log.d(r4, r8, r5)     // Catch: java.lang.Exception -> L2b
            y46$b r7 = r7.a     // Catch: java.lang.Exception -> L2b
            if (r7 != 0) goto L79
            java.lang.String r7 = "Error: null 'jobSeekerProfileStructuredData' property"
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = "res.jobSeekerProfileStructuredData"
            r8.<init>(r0)     // Catch: java.lang.Exception -> L2b
            defpackage.lz2.b(r4, r7, r2, r8)     // Catch: java.lang.Exception -> L2b
            return r5
        L79:
            java.util.ArrayList r7 = r7.a     // Catch: java.lang.Exception -> L2b
            return r7
        L7c:
            java.util.ArrayList r8 = defpackage.lz2.a
            java.lang.String r8 = "Error getting SDC Preferences: "
            defpackage.o6.l(r8, r7, r4, r2, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.o(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(defpackage.pu2 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.okb
            if (r0 == 0) goto L13
            r0 = r6
            okb r0 = (defpackage.okb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            okb r0 = new okb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.r7d.b(r6)
            goto L50
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            r5 = 0
            return r5
        L2c:
            defpackage.r7d.b(r6)
            gsa r6 = r5.n()
            u58 r1 = new u58
            java.lang.String r3 = "7BH92"
            java.util.List r3 = defpackage.u63.Z(r3)
            hva$c r4 = new hva$c
            r4.<init>(r3)
            r1.<init>(r4)
            r0.label = r2
            dm0 r5 = r5.b
            java.lang.Object r6 = r6.t(r1, r5, r0)
            g13 r5 = defpackage.g13.a
            if (r6 != r5) goto L50
            return r5
        L50:
            wg0 r6 = (defpackage.wg0) r6
            java.lang.Object r5 = r6.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.p(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(defpackage.pu2 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Work Areas preferences response: "
            boolean r1 = r8 instanceof defpackage.pkb
            if (r1 == 0) goto L15
            r1 = r8
            pkb r1 = (defpackage.pkb) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            pkb r1 = new pkb
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r7 = r1.result
            int r8 = r1.label
            r2 = 0
            r3 = 1
            java.lang.String r4 = "PreferencesService"
            r5 = 0
            if (r8 == 0) goto L33
            if (r8 != r3) goto L2d
            defpackage.r7d.b(r7)     // Catch: java.lang.Exception -> L2b
            goto L4f
        L2b:
            r7 = move-exception
            goto L80
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r5
        L33:
            defpackage.r7d.b(r7)
            lh0 r7 = k()     // Catch: java.lang.Exception -> L2b
            cf5 r8 = defpackage.v1c.f     // Catch: java.lang.Exception -> L2b
            r8.getClass()     // Catch: java.lang.Exception -> L2b
            kh0 r6 = new kh0     // Catch: java.lang.Exception -> L2b
            r6.<init>(r7, r8)     // Catch: java.lang.Exception -> L2b
            r1.label = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = r6.b(r1)     // Catch: java.lang.Exception -> L2b
            g13 r8 = defpackage.g13.a
            if (r7 != r8) goto L4f
            return r8
        L4f:
            sh0 r7 = (defpackage.sh0) r7     // Catch: java.lang.Exception -> L2b
            pua$a r7 = r7.a()     // Catch: java.lang.Exception -> L2b
            cf5$a r7 = (cf5.a) r7     // Catch: java.lang.Exception -> L2b
            java.util.ArrayList r8 = defpackage.lz2.a     // Catch: java.lang.Exception -> L2b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b
            r8.<init>(r0)     // Catch: java.lang.Exception -> L2b
            r8.append(r7)     // Catch: java.lang.Exception -> L2b
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L2b
            android.util.Log.d(r4, r8, r5)     // Catch: java.lang.Exception -> L2b
            cf5$b r7 = r7.a     // Catch: java.lang.Exception -> L2b
            if (r7 != 0) goto L79
            java.lang.String r7 = "Error: null 'findSegmentationTargetedLeverExperiments' property"
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = "res.findSegmentationTargetedLeverExperiments"
            r8.<init>(r0)     // Catch: java.lang.Exception -> L2b
            defpackage.lz2.b(r4, r7, r2, r8)     // Catch: java.lang.Exception -> L2b
            return r5
        L79:
            java.util.ArrayList r7 = r7.a     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = defpackage.z92.O0(r7)     // Catch: java.lang.Exception -> L2b
            return r7
        L80:
            java.util.ArrayList r8 = defpackage.lz2.a
            java.lang.String r8 = "Error getting Work Areas preferences: "
            defpackage.o6.l(r8, r7, r4, r2, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.q(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable r(defpackage.pu2 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.qkb
            if (r0 == 0) goto L13
            r0 = r9
            qkb r0 = (defpackage.qkb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            qkb r0 = new qkb
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 3
            r3 = 2
            r4 = 1
            dm0 r5 = r8.b
            g13 r6 = defpackage.g13.a
            if (r1 == 0) goto L4a
            if (r1 == r4) goto L46
            if (r1 == r3) goto L3e
            if (r1 != r2) goto L37
            java.lang.Object r8 = r0.L$1
            wg0 r8 = (defpackage.wg0) r8
            java.lang.Object r0 = r0.L$0
            wg0 r0 = (defpackage.wg0) r0
            defpackage.r7d.b(r9)
            goto L97
        L37:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            r8 = 0
            return r8
        L3e:
            java.lang.Object r1 = r0.L$0
            wg0 r1 = (defpackage.wg0) r1
            defpackage.r7d.b(r9)
            goto L7a
        L46:
            defpackage.r7d.b(r9)
            goto L60
        L4a:
            defpackage.r7d.b(r9)
            gsa r9 = r8.n()
            java.lang.String r1 = "SZ6CD"
            java.util.List r1 = defpackage.u63.Z(r1)
            r0.label = r4
            java.lang.Object r9 = r9.Q(r1, r5, r0)
            if (r9 != r6) goto L60
            goto L92
        L60:
            wg0 r9 = (defpackage.wg0) r9
            gsa r1 = r8.n()
            java.lang.String r4 = "2YJP9"
            java.util.List r4 = defpackage.u63.Z(r4)
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r1 = r1.Q(r4, r5, r0)
            if (r1 != r6) goto L77
            goto L92
        L77:
            r7 = r1
            r1 = r9
            r9 = r7
        L7a:
            wg0 r9 = (defpackage.wg0) r9
            gsa r8 = r8.n()
            java.lang.String r3 = "BTSWR"
            java.util.List r3 = defpackage.u63.Z(r3)
            r0.L$0 = r1
            r0.L$1 = r9
            r0.label = r2
            java.lang.Object r8 = r8.Q(r3, r5, r0)
            if (r8 != r6) goto L93
        L92:
            return r6
        L93:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r1
        L97:
            wg0 r9 = (defpackage.wg0) r9
            muf r1 = new muf
            java.lang.Object r0 = r0.b()
            java.lang.Object r8 = r8.b()
            java.lang.Object r9 = r9.b()
            r1.<init>(r0, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.r(pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable s(defpackage.pu2 r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.s(pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(defpackage.pu2 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.skb
            if (r0 == 0) goto L13
            r0 = r5
            skb r0 = (defpackage.skb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            skb r0 = new skb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.r7d.b(r5)
            goto L46
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.r7d.b(r5)
            gsa r5 = r4.n()
            java.lang.String r1 = "SVU2N"
            java.util.List r1 = defpackage.u63.Z(r1)
            r0.label = r2
            dm0 r4 = r4.b
            java.lang.Object r5 = r5.Q(r1, r4, r0)
            g13 r4 = defpackage.g13.a
            if (r5 != r4) goto L46
            return r4
        L46:
            wg0 r5 = (defpackage.wg0) r5
            java.lang.Object r4 = r5.b()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.t(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(defpackage.pu2 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.tkb
            if (r0 == 0) goto L13
            r0 = r6
            tkb r0 = (defpackage.tkb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            tkb r0 = new tkb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.r7d.b(r6)
            goto L50
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            r5 = 0
            return r5
        L2c:
            defpackage.r7d.b(r6)
            gsa r6 = r5.n()
            u58 r1 = new u58
            java.lang.String r3 = "SVU2N"
            java.util.List r3 = defpackage.u63.Z(r3)
            hva$c r4 = new hva$c
            r4.<init>(r3)
            r1.<init>(r4)
            r0.label = r2
            dm0 r5 = r5.b
            java.lang.Object r6 = r6.t(r1, r5, r0)
            g13 r5 = defpackage.g13.a
            if (r6 != r5) goto L50
            return r5
        L50:
            wg0 r6 = (defpackage.wg0) r6
            java.lang.Object r5 = r6.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.u(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(defpackage.pu2 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ukb
            if (r0 == 0) goto L13
            r0 = r6
            ukb r0 = (defpackage.ukb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ukb r0 = new ukb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.r7d.b(r6)
            goto L50
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            r5 = 0
            return r5
        L2c:
            defpackage.r7d.b(r6)
            gsa r6 = r5.n()
            u58 r1 = new u58
            java.lang.String r3 = "7DUSC"
            java.util.List r3 = defpackage.u63.Z(r3)
            hva$c r4 = new hva$c
            r4.<init>(r3)
            r1.<init>(r4)
            r0.label = r2
            dm0 r5 = r5.b
            java.lang.Object r6 = r6.t(r1, r5, r0)
            g13 r5 = defpackage.g13.a
            if (r6 != r5) goto L50
            return r5
        L50:
            wg0 r6 = (defpackage.wg0) r6
            java.lang.Object r5 = r6.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.v(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(defpackage.pu2 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Work wellbeing response: "
            boolean r1 = r8 instanceof defpackage.vkb
            if (r1 == 0) goto L15
            r1 = r8
            vkb r1 = (defpackage.vkb) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            vkb r1 = new vkb
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r7 = r1.result
            int r8 = r1.label
            r2 = 0
            r3 = 1
            java.lang.String r4 = "PreferencesService"
            r5 = 0
            if (r8 == 0) goto L33
            if (r8 != r3) goto L2d
            defpackage.r7d.b(r7)     // Catch: java.lang.Exception -> L2b
            goto L4f
        L2b:
            r7 = move-exception
            goto L80
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r5
        L33:
            defpackage.r7d.b(r7)
            lh0 r7 = k()     // Catch: java.lang.Exception -> L2b
            te5 r8 = defpackage.v1c.g     // Catch: java.lang.Exception -> L2b
            r8.getClass()     // Catch: java.lang.Exception -> L2b
            kh0 r6 = new kh0     // Catch: java.lang.Exception -> L2b
            r6.<init>(r7, r8)     // Catch: java.lang.Exception -> L2b
            r1.label = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = r6.b(r1)     // Catch: java.lang.Exception -> L2b
            g13 r8 = defpackage.g13.a
            if (r7 != r8) goto L4f
            return r8
        L4f:
            sh0 r7 = (defpackage.sh0) r7     // Catch: java.lang.Exception -> L2b
            pua$a r7 = r7.a()     // Catch: java.lang.Exception -> L2b
            te5$b r7 = (te5.b) r7     // Catch: java.lang.Exception -> L2b
            java.util.ArrayList r8 = defpackage.lz2.a     // Catch: java.lang.Exception -> L2b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b
            r8.<init>(r0)     // Catch: java.lang.Exception -> L2b
            r8.append(r7)     // Catch: java.lang.Exception -> L2b
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L2b
            android.util.Log.d(r4, r8, r5)     // Catch: java.lang.Exception -> L2b
            te5$c r7 = r7.a     // Catch: java.lang.Exception -> L2b
            if (r7 != 0) goto L79
            java.lang.String r7 = "Error: null 'findSegmentationTargetedLeverExperiments' property"
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = "res.findSegmentationTargetedLeverExperiments"
            r8.<init>(r0)     // Catch: java.lang.Exception -> L2b
            defpackage.lz2.b(r4, r7, r2, r8)     // Catch: java.lang.Exception -> L2b
            return r5
        L79:
            java.util.ArrayList r7 = r7.a     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = defpackage.z92.Q0(r7)     // Catch: java.lang.Exception -> L2b
            return r7
        L80:
            java.util.ArrayList r8 = defpackage.lz2.a
            java.lang.String r8 = "Error getting Work wellbeing preferences: "
            defpackage.o6.l(r8, r7, r4, r2, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.w(pu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        if (r12 == r8) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(java.util.List r10, java.util.List r11, defpackage.pu2 r12) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.x(java.util.List, java.util.List, pu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        if (r11 == r7) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(java.util.List r9, java.util.List r10, defpackage.pu2 r11) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.y(java.util.List, java.util.List, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(int r19, java.lang.String r20, defpackage.pu2 r21) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.z(int, java.lang.String, pu2):java.lang.Object");
    }
}
