package defpackage;

import defpackage.yj3;

/* JADX INFO: loaded from: classes.dex */
public final class mg1 implements yj3 {
    public final g37 a;
    public final nva b;
    public final c6e c;
    public final l25 d;

    public static final class a extends fq5 {
        public Exception b;

        @Override // defpackage.fq5, defpackage.pne
        public final long f1(zn1 zn1Var, long j) throws Exception {
            try {
                return super.f1(zn1Var, j);
            } catch (Exception e) {
                this.b = e;
                throw e;
            }
        }
    }

    public static final class b implements yj3.a {
        public final c6e a;
        public final l25 b;

        public b(c6e c6eVar, l25 l25Var) {
            this.a = c6eVar;
            this.b = l25Var;
        }

        @Override // yj3.a
        public final yj3 a(rne rneVar, nva nvaVar) {
            return new mg1(rneVar.a, nvaVar, this.a, this.b);
        }
    }

    public mg1(g37 g37Var, nva nvaVar, c6e c6eVar, l25 l25Var) {
        this.a = g37Var;
        this.b = nvaVar;
        this.c = c6eVar;
        this.d = l25Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.yj3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.pu2 r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.jg1
            if (r0 == 0) goto L13
            r0 = r8
            jg1 r0 = (defpackage.jg1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            jg1 r0 = new jg1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 0
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L45
            if (r1 == r4) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r7 = r0.L$0
            z5e r7 = (defpackage.z5e) r7
            defpackage.r7d.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L6c
        L2f:
            r8 = move-exception
            goto L76
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r3
        L37:
            java.lang.Object r7 = r0.L$1
            z5e r7 = (defpackage.z5e) r7
            java.lang.Object r1 = r0.L$0
            mg1 r1 = (defpackage.mg1) r1
            defpackage.r7d.b(r8)
            r8 = r7
            r7 = r1
            goto L57
        L45:
            defpackage.r7d.b(r8)
            r0.L$0 = r7
            c6e r8 = r7.c
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r1 = r8.a(r0)
            if (r1 != r5) goto L57
            goto L68
        L57:
            o91 r1 = new o91     // Catch: java.lang.Throwable -> L72
            r1.<init>(r7, r4)     // Catch: java.lang.Throwable -> L72
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L72
            r0.L$1 = r3     // Catch: java.lang.Throwable -> L72
            r0.label = r2     // Catch: java.lang.Throwable -> L72
            java.lang.Object r7 = defpackage.ypd.S(r1, r0)     // Catch: java.lang.Throwable -> L72
            if (r7 != r5) goto L69
        L68:
            return r5
        L69:
            r6 = r8
            r8 = r7
            r7 = r6
        L6c:
            uj3 r8 = (defpackage.uj3) r8     // Catch: java.lang.Throwable -> L2f
            r7.release()
            return r8
        L72:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L76:
            r7.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mg1.a(pu2):java.lang.Object");
    }
}
