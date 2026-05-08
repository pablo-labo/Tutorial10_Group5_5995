package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gh0<T> implements wi5 {
    public final /* synthetic */ wi5 a;
    public final /* synthetic */ long b;

    @uh3(c = "com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$$inlined$map$1$2", f = "ApolloCacheInterceptor.kt", l = {50}, m = "emit", v = 1)
    public static final class a extends pu2 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(lu2 lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return gh0.this.a(null, this);
        }
    }

    public gh0(wi5 wi5Var, long j) {
        this.a = wi5Var;
        this.b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.wi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r6, defpackage.lu2 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof gh0.a
            if (r0 == 0) goto L13
            r0 = r7
            gh0$a r0 = (gh0.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            gh0$a r0 = new gh0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.r7d.b(r7)
            goto L60
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            r5 = 0
            return r5
        L2c:
            defpackage.r7d.b(r7)
            sh0 r6 = (defpackage.sh0) r6
            sh0$a r7 = r6.c()
            nt1$a r1 = new nt1$a
            r1.<init>()
            long r3 = r5.b
            r1.c = r3
            long r3 = java.lang.System.currentTimeMillis()
            r1.d = r3
            com.apollographql.apollo.exception.ApolloException r6 = r6.e
            r1.f = r6
            nt1 r6 = r1.a()
            r7.a(r6)
            sh0 r6 = r7.b()
            r0.label = r2
            wi5 r5 = r5.a
            java.lang.Object r5 = r5.a(r6, r0)
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L60
            return r6
        L60:
            j6g r5 = defpackage.j6g.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh0.a(java.lang.Object, lu2):java.lang.Object");
    }
}
