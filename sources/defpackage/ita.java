package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ita {

    @uh3(c = "com.indeed.android.sharedui.onlinestatus.OnlineStatusService", f = "OnlineStatusService.kt", l = {18}, m = "getOnlineStatusPreference")
    public static final class a extends pu2 {
        int label;
        /* synthetic */ Object result;

        public a(lu2<? super a> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ita.this.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.lu2<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Online status preference fetched: "
            boolean r1 = r8 instanceof ita.a
            if (r1 == 0) goto L15
            r1 = r8
            ita$a r1 = (ita.a) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            ita$a r1 = new ita$a
            r1.<init>(r8)
        L1a:
            java.lang.Object r7 = r1.result
            int r8 = r1.label
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.String r5 = "OnlineStatusService"
            if (r8 == 0) goto L35
            if (r8 != r3) goto L2f
            defpackage.r7d.b(r7)     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            goto L60
        L2b:
            r7 = move-exception
            goto L88
        L2d:
            r7 = move-exception
            goto L92
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r2
        L35:
            defpackage.r7d.b(r7)
            java.util.ArrayList r7 = defpackage.lz2.a     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            java.lang.String r7 = "Fetching online status preference"
            android.util.Log.d(r5, r7, r2)     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            java.lang.Class<fq7> r7 = defpackage.fq7.class
            java.lang.Object r7 = defpackage.cr8.p(r7)     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            fq7 r7 = (defpackage.fq7) r7     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            lh0 r7 = r7.a()     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            h26 r8 = new h26     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r8.<init>()     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            kh0 r6 = new kh0     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r6.<init>(r7, r8)     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r1.label = r3     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            java.lang.Object r7 = r6.b(r1)     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            g13 r8 = defpackage.g13.a
            if (r7 != r8) goto L60
            return r8
        L60:
            sh0 r7 = (defpackage.sh0) r7     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            D extends pua$a r7 = r7.c     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            h26$a r7 = (h26.a) r7     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            if (r7 == 0) goto L71
            h26$b r7 = r7.a     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            if (r7 == 0) goto L71
            h26$c r7 = r7.a     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            boolean r7 = r7.a     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            goto L72
        L71:
            r7 = r4
        L72:
            java.util.ArrayList r8 = defpackage.lz2.a     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r8.<init>(r0)     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            r8.append(r7)     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            android.util.Log.d(r5, r8, r2)     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Exception -> L2b com.apollographql.apollo.exception.ApolloException -> L2d
            return r7
        L88:
            java.util.ArrayList r8 = defpackage.lz2.a
            java.lang.String r8 = "Unexpected error fetching online status preference"
            defpackage.lz2.b(r5, r8, r4, r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L92:
            java.util.ArrayList r8 = defpackage.lz2.a
            java.lang.String r8 = "Failed to fetch online status preference"
            defpackage.lz2.b(r5, r8, r4, r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ita.a(lu2):java.lang.Object");
    }
}
