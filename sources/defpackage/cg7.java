package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cg7 {
    public static final a c = new a();
    public final String a;
    public final String b;

    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
        
            if (r7 == r5) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5, types: [vf5] */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, vf5] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v13 */
        /* JADX WARN: Type inference failed for: r8v14 */
        /* JADX WARN: Type inference failed for: r8v15 */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v18 */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(defpackage.vf5 r8, defpackage.pu2 r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof defpackage.bg7
                if (r0 == 0) goto L13
                r0 = r9
                bg7 r0 = (defpackage.bg7) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                bg7 r0 = new bg7
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r7 = r0.result
                int r9 = r0.label
                java.lang.String r1 = ""
                java.lang.String r2 = "InstallationId"
                r3 = 2
                r4 = 1
                g13 r5 = defpackage.g13.a
                if (r9 == 0) goto L45
                if (r9 == r4) goto L3b
                if (r9 != r3) goto L34
                java.lang.Object r8 = r0.L$0
                java.lang.String r8 = (java.lang.String) r8
                defpackage.r7d.b(r7)     // Catch: java.lang.Exception -> L32
                goto L80
            L32:
                r7 = move-exception
                goto L84
            L34:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r7)
                r7 = 0
                return r7
            L3b:
                java.lang.Object r8 = r0.L$0
                vf5 r8 = (defpackage.vf5) r8
                defpackage.r7d.b(r7)     // Catch: java.lang.Exception -> L43
                goto L5a
            L43:
                r7 = move-exception
                goto L64
            L45:
                defpackage.r7d.b(r7)
                com.google.android.gms.tasks.Task r7 = r8.a()     // Catch: java.lang.Exception -> L43
                r7.getClass()     // Catch: java.lang.Exception -> L43
                r0.L$0 = r8     // Catch: java.lang.Exception -> L43
                r0.label = r4     // Catch: java.lang.Exception -> L43
                java.lang.Object r7 = defpackage.w74.g(r7, r0)     // Catch: java.lang.Exception -> L43
                if (r7 != r5) goto L5a
                goto L7f
            L5a:
                eg7 r7 = (defpackage.eg7) r7     // Catch: java.lang.Exception -> L43
                java.lang.String r7 = r7.a()     // Catch: java.lang.Exception -> L43
                r6 = r8
                r8 = r7
                r7 = r6
                goto L6b
            L64:
                java.lang.String r9 = "Error getting authentication token."
                android.util.Log.w(r2, r9, r7)
                r7 = r8
                r8 = r1
            L6b:
                r8.getClass()
                com.google.android.gms.tasks.Task r7 = r7.getId()     // Catch: java.lang.Exception -> L32
                r7.getClass()     // Catch: java.lang.Exception -> L32
                r0.L$0 = r8     // Catch: java.lang.Exception -> L32
                r0.label = r3     // Catch: java.lang.Exception -> L32
                java.lang.Object r7 = defpackage.w74.g(r7, r0)     // Catch: java.lang.Exception -> L32
                if (r7 != r5) goto L80
            L7f:
                return r5
            L80:
                java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L32
                r1 = r7
                goto L89
            L84:
                java.lang.String r9 = "Error getting Firebase installation id ."
                android.util.Log.w(r2, r9, r7)
            L89:
                cg7 r7 = new cg7
                r1.getClass()
                r7.<init>(r1, r8)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: cg7.a.a(vf5, pu2):java.lang.Object");
        }
    }

    public cg7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
