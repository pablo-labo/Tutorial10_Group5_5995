package defpackage;

import defpackage.xj3;

/* JADX INFO: loaded from: classes.dex */
public final class ig1 implements xj3 {
    public final f37 a;
    public final qva b;
    public final z5e c;

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

    public static final class b implements xj3.a {
        public final c6e a;

        public b() {
            int i = d6e.a;
            this.a = new c6e(4, 0);
        }

        @Override // xj3.a
        public final ig1 a(zne zneVar, qva qvaVar) {
            return new ig1(zneVar.a, qvaVar, this.a);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return b.class.hashCode();
        }
    }

    public ig1(f37 f37Var, qva qvaVar, c6e c6eVar) {
        this.a = f37Var;
        this.b = qvaVar;
        this.c = c6eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.xj3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.pu2 r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.kg1
            if (r0 == 0) goto L13
            r0 = r8
            kg1 r0 = (defpackage.kg1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kg1 r0 = new kg1
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
            ig1 r1 = (defpackage.ig1) r1
            defpackage.r7d.b(r8)
            r8 = r7
            r7 = r1
            goto L57
        L45:
            defpackage.r7d.b(r8)
            r0.L$0 = r7
            z5e r8 = r7.c
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r1 = r8.a(r0)
            if (r1 != r5) goto L57
            goto L68
        L57:
            lg1 r1 = new lg1     // Catch: java.lang.Throwable -> L72
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L72
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
            vj3 r8 = (defpackage.vj3) r8     // Catch: java.lang.Throwable -> L2f
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig1.a(pu2):java.lang.Object");
    }
}
