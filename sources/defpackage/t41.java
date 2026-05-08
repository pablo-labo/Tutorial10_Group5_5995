package defpackage;

import com.indeed.android.backendservices.autocomplete.network.AutoCompleteApiService;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class t41 implements xh8 {
    public final AutoCompleteApiService a;
    public final Lazy b = boa.E(qt8.a, new a(this));
    public final String c;
    public final String d;
    public final String e;

    public static final class a extends mj8 implements gu5<s9e> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t41 t41Var) {
            super(0);
            this.$this_inject = t41Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, s9e] */
        @Override // defpackage.gu5
        public final s9e invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(s9e.class), a9cVar);
        }
    }

    public t41(AutoCompleteApiService autoCompleteApiService) {
        this.a = autoCompleteApiService;
        String strE = ((pp7) cr8.p(pp7.class)).e();
        this.c = strE == null ? "" : strE;
        this.d = ((ep7) cr8.p(ep7.class)).b().a;
        this.e = ((ep7) cr8.p(ep7.class)).b().b;
    }

    public static ArrayList w(List list) {
        ArrayList<qz0> arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((qz0) obj).a.isEmpty()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        for (qz0 qz0Var : arrayList) {
            nz0 nz0Var = (nz0) z92.O0(qz0Var.a);
            arrayList2.add(new g51(Integer.valueOf(nz0Var.a), Integer.valueOf(nz0Var.b), qz0Var.c, qz0Var.b.g, 16));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable a(java.lang.String r21, defpackage.pu2 r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof defpackage.z31
            if (r2 == 0) goto L17
            r2 = r1
            z31 r2 = (defpackage.z31) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            z31 r2 = new z31
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            int r3 = r2.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L38
            if (r3 != r5) goto L32
            java.lang.Object r0 = r2.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.L$0
            java.lang.String r0 = (java.lang.String) r0
            defpackage.r7d.b(r1)
            goto L6d
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            return r4
        L38:
            defpackage.r7d.b(r1)
            s9e r1 = r0.u()
            java.lang.String r1 = r1.e
            r2.L$0 = r4
            r2.L$1 = r4
            r2.label = r5
            r17 = 0
            r18 = 1
            com.indeed.android.backendservices.autocomplete.network.AutoCompleteApiService r3 = r0.a
            java.lang.String r6 = r0.c
            java.lang.String r8 = r0.d
            java.lang.String r9 = r0.e
            r10 = 10
            r11 = 10
            r12 = 1
            r13 = 0
            r14 = 20
            r15 = 0
            r16 = 1
            r7 = r6
            r4 = r21
            r5 = r1
            r19 = r2
            java.lang.Object r1 = r3.getUSAirForceRankSuggestions(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            g13 r0 = defpackage.g13.a
            if (r1 != r0) goto L6d
            return r0
        L6d:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r0 = w(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.a(java.lang.String, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable b(java.lang.String r21, defpackage.pu2 r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof defpackage.a41
            if (r2 == 0) goto L17
            r2 = r1
            a41 r2 = (defpackage.a41) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            a41 r2 = new a41
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            int r3 = r2.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L38
            if (r3 != r5) goto L32
            java.lang.Object r0 = r2.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.L$0
            java.lang.String r0 = (java.lang.String) r0
            defpackage.r7d.b(r1)
            goto L6d
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            return r4
        L38:
            defpackage.r7d.b(r1)
            s9e r1 = r0.u()
            java.lang.String r1 = r1.e
            r2.L$0 = r4
            r2.L$1 = r4
            r2.label = r5
            r17 = 0
            r18 = 1
            com.indeed.android.backendservices.autocomplete.network.AutoCompleteApiService r3 = r0.a
            java.lang.String r6 = r0.c
            java.lang.String r8 = r0.d
            java.lang.String r9 = r0.e
            r10 = 10
            r11 = 10
            r12 = 1
            r13 = 0
            r14 = 20
            r15 = 0
            r16 = 1
            r7 = r6
            r4 = r21
            r5 = r1
            r19 = r2
            java.lang.Object r1 = r3.getUSArmyRankSuggestions(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            g13 r0 = defpackage.g13.a
            if (r1 != r0) goto L6d
            return r0
        L6d:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r0 = w(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.b(java.lang.String, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable c(java.lang.String r21, defpackage.pu2 r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof defpackage.b41
            if (r2 == 0) goto L17
            r2 = r1
            b41 r2 = (defpackage.b41) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            b41 r2 = new b41
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            int r3 = r2.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L38
            if (r3 != r5) goto L32
            java.lang.Object r0 = r2.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.L$0
            java.lang.String r0 = (java.lang.String) r0
            defpackage.r7d.b(r1)
            goto L6d
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            return r4
        L38:
            defpackage.r7d.b(r1)
            s9e r1 = r0.u()
            java.lang.String r1 = r1.e
            r2.L$0 = r4
            r2.L$1 = r4
            r2.label = r5
            r17 = 0
            r18 = 1
            com.indeed.android.backendservices.autocomplete.network.AutoCompleteApiService r3 = r0.a
            java.lang.String r6 = r0.c
            java.lang.String r8 = r0.d
            java.lang.String r9 = r0.e
            r10 = 10
            r11 = 10
            r12 = 1
            r13 = 0
            r14 = 20
            r15 = 0
            r16 = 1
            r7 = r6
            r4 = r21
            r5 = r1
            r19 = r2
            java.lang.Object r1 = r3.getUSCoastGuardRankSuggestions(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            g13 r0 = defpackage.g13.a
            if (r1 != r0) goto L6d
            return r0
        L6d:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r0 = w(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.c(java.lang.String, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable e(java.lang.String r21, defpackage.pu2 r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof defpackage.c41
            if (r2 == 0) goto L17
            r2 = r1
            c41 r2 = (defpackage.c41) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            c41 r2 = new c41
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            int r3 = r2.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L34
            if (r3 != r5) goto L2e
            java.lang.Object r0 = r2.L$0
            java.lang.String r0 = (java.lang.String) r0
            defpackage.r7d.b(r1)
            goto L67
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            return r4
        L34:
            defpackage.r7d.b(r1)
            s9e r1 = r0.u()
            java.lang.String r1 = r1.e
            r2.L$0 = r4
            r2.label = r5
            r17 = 0
            r18 = 1
            com.indeed.android.backendservices.autocomplete.network.AutoCompleteApiService r3 = r0.a
            java.lang.String r6 = r0.c
            java.lang.String r8 = r0.d
            java.lang.String r9 = r0.e
            java.lang.String r10 = "taxonomy/certifications,taxonomy/licenses"
            java.lang.String r11 = "10,10"
            r12 = 1
            r13 = 1
            r14 = 0
            r15 = 20
            r16 = 0
            r7 = r6
            r4 = r21
            r5 = r1
            r19 = r2
            java.lang.Object r1 = r3.getCombinedCertificationLicenseSuggestions(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            g13 r0 = defpackage.g13.a
            if (r1 != r0) goto L67
            return r0
        L67:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r0 = w(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.e(java.lang.String, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable f(java.lang.String r21, defpackage.pu2 r22) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.f(java.lang.String, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable g(java.lang.String r21, defpackage.pu2 r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof defpackage.e41
            if (r2 == 0) goto L17
            r2 = r1
            e41 r2 = (defpackage.e41) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            e41 r2 = new e41
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            int r3 = r2.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L34
            if (r3 != r5) goto L2e
            java.lang.Object r0 = r2.L$0
            java.lang.String r0 = (java.lang.String) r0
            defpackage.r7d.b(r1)
            goto L67
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            return r4
        L34:
            defpackage.r7d.b(r1)
            s9e r1 = r0.u()
            java.lang.String r1 = r1.e
            r2.L$0 = r4
            r2.label = r5
            r17 = 0
            r18 = 1
            com.indeed.android.backendservices.autocomplete.network.AutoCompleteApiService r3 = r0.a
            java.lang.String r6 = r0.c
            java.lang.String r8 = r0.d
            java.lang.String r9 = r0.e
            java.lang.String r10 = "taxonomy/crowtaxo-certifications,taxonomy/crowtaxo-licenses"
            java.lang.String r11 = "10,10"
            r12 = 1
            r13 = 1
            r14 = 0
            r15 = 20
            r16 = 0
            r7 = r6
            r4 = r21
            r5 = r1
            r19 = r2
            java.lang.Object r1 = r3.getCrowTaxoCombinedCertificationLicenseSuggestions(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            g13 r0 = defpackage.g13.a
            if (r1 != r0) goto L67
            return r0
        L67:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r0 = w(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.g(java.lang.String, pu2):java.io.Serializable");
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable h(java.lang.String r21, defpackage.pu2 r22) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.h(java.lang.String, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable i(java.lang.String r21, defpackage.pu2 r22) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.i(java.lang.String, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable j(java.lang.String r21, defpackage.pu2 r22) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.j(java.lang.String, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable k(java.lang.String r21, defpackage.pu2 r22) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.k(java.lang.String, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable l(java.lang.String r21, defpackage.pu2 r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof defpackage.j41
            if (r2 == 0) goto L17
            r2 = r1
            j41 r2 = (defpackage.j41) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            j41 r2 = new j41
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            int r3 = r2.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L38
            if (r3 != r5) goto L32
            java.lang.Object r0 = r2.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.L$0
            java.lang.String r0 = (java.lang.String) r0
            defpackage.r7d.b(r1)
            goto L6d
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            return r4
        L38:
            defpackage.r7d.b(r1)
            s9e r1 = r0.u()
            java.lang.String r1 = r1.e
            r2.L$0 = r4
            r2.L$1 = r4
            r2.label = r5
            r17 = 0
            r18 = 1
            com.indeed.android.backendservices.autocomplete.network.AutoCompleteApiService r3 = r0.a
            java.lang.String r6 = r0.c
            java.lang.String r8 = r0.d
            java.lang.String r9 = r0.e
            r10 = 10
            r11 = 10
            r12 = 1
            r13 = 0
            r14 = 20
            r15 = 0
            r16 = 1
            r7 = r6
            r4 = r21
            r5 = r1
            r19 = r2
            java.lang.Object r1 = r3.getGeneralUSMilitaryRankSuggestions(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            g13 r0 = defpackage.g13.a
            if (r1 != r0) goto L6d
            return r0
        L6d:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r0 = w(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.l(java.lang.String, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable m(java.lang.String r21, defpackage.pu2 r22) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.m(java.lang.String, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable n(java.lang.String r21, defpackage.pu2 r22) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.n(java.lang.String, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable o(java.lang.String r21, defpackage.pu2 r22) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.o(java.lang.String, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable p(java.lang.String r10, java.lang.String r11, defpackage.pu2 r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.p(java.lang.String, java.lang.String, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable q(java.lang.String r21, defpackage.pu2 r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof defpackage.o41
            if (r2 == 0) goto L17
            r2 = r1
            o41 r2 = (defpackage.o41) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            o41 r2 = new o41
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            int r3 = r2.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L38
            if (r3 != r5) goto L32
            java.lang.Object r0 = r2.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.L$0
            java.lang.String r0 = (java.lang.String) r0
            defpackage.r7d.b(r1)
            goto L6d
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            return r4
        L38:
            defpackage.r7d.b(r1)
            s9e r1 = r0.u()
            java.lang.String r1 = r1.e
            r2.L$0 = r4
            r2.L$1 = r4
            r2.label = r5
            r17 = 0
            r18 = 1
            com.indeed.android.backendservices.autocomplete.network.AutoCompleteApiService r3 = r0.a
            java.lang.String r6 = r0.c
            java.lang.String r8 = r0.d
            java.lang.String r9 = r0.e
            r10 = 10
            r11 = 10
            r12 = 1
            r13 = 0
            r14 = 20
            r15 = 0
            r16 = 1
            r7 = r6
            r4 = r21
            r5 = r1
            r19 = r2
            java.lang.Object r1 = r3.getUSMarineCorpRankSuggestions(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            g13 r0 = defpackage.g13.a
            if (r1 != r0) goto L6d
            return r0
        L6d:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r0 = w(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.q(java.lang.String, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable r(java.lang.String r21, defpackage.pu2 r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof defpackage.p41
            if (r2 == 0) goto L17
            r2 = r1
            p41 r2 = (defpackage.p41) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            p41 r2 = new p41
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            int r3 = r2.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L34
            if (r3 != r5) goto L2e
            java.lang.Object r0 = r2.L$0
            java.lang.String r0 = (java.lang.String) r0
            defpackage.r7d.b(r1)
            goto L67
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            return r4
        L34:
            defpackage.r7d.b(r1)
            s9e r1 = r0.u()
            java.lang.String r1 = r1.e
            r2.L$0 = r4
            r2.label = r5
            r17 = 0
            r18 = 1
            com.indeed.android.backendservices.autocomplete.network.AutoCompleteApiService r3 = r0.a
            java.lang.String r6 = r0.c
            java.lang.String r8 = r0.d
            java.lang.String r9 = r0.e
            r10 = 10
            r11 = 10
            r12 = 1
            r13 = 0
            r14 = 20
            r15 = 0
            r16 = 1
            r7 = r6
            r4 = r21
            r5 = r1
            r19 = r2
            java.lang.Object r1 = r3.getUSMilitaryBranchSuggestions(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            g13 r0 = defpackage.g13.a
            if (r1 != r0) goto L67
            return r0
        L67:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r0 = w(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.r(java.lang.String, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable s(java.lang.String r21, defpackage.pu2 r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof defpackage.q41
            if (r2 == 0) goto L17
            r2 = r1
            q41 r2 = (defpackage.q41) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            q41 r2 = new q41
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            int r3 = r2.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L38
            if (r3 != r5) goto L32
            java.lang.Object r0 = r2.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.L$0
            java.lang.String r0 = (java.lang.String) r0
            defpackage.r7d.b(r1)
            goto L6d
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            return r4
        L38:
            defpackage.r7d.b(r1)
            s9e r1 = r0.u()
            java.lang.String r1 = r1.e
            r2.L$0 = r4
            r2.L$1 = r4
            r2.label = r5
            r17 = 0
            r18 = 1
            com.indeed.android.backendservices.autocomplete.network.AutoCompleteApiService r3 = r0.a
            java.lang.String r6 = r0.c
            java.lang.String r8 = r0.d
            java.lang.String r9 = r0.e
            r10 = 10
            r11 = 10
            r12 = 1
            r13 = 0
            r14 = 20
            r15 = 0
            r16 = 1
            r7 = r6
            r4 = r21
            r5 = r1
            r19 = r2
            java.lang.Object r1 = r3.getUSNavyRankSuggestions(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            g13 r0 = defpackage.g13.a
            if (r1 != r0) goto L6d
            return r0
        L6d:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r0 = w(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.s(java.lang.String, pu2):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable t(java.lang.String r21, defpackage.pu2 r22) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.t(java.lang.String, pu2):java.io.Serializable");
    }

    public final s9e u() {
        return (s9e) this.b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable v(java.lang.String r21, defpackage.pu2 r22) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.v(java.lang.String, pu2):java.io.Serializable");
    }
}
