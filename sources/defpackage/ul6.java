package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ul6<T> implements wi5 {
    public final /* synthetic */ wi5 a;
    public final /* synthetic */ tl6 b;
    public final /* synthetic */ rh0 c;
    public final /* synthetic */ bm6 d;

    @uh3(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$execute$1$invokeSuspend$$inlined$map$1$2", f = "HttpNetworkTransport.kt", l = {50}, m = "emit", v = 1)
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
            return ul6.this.a(null, this);
        }
    }

    public ul6(wi5 wi5Var, tl6 tl6Var, rh0 rh0Var, bm6 bm6Var, long j) {
        this.a = wi5Var;
        this.b = tl6Var;
        this.c = rh0Var;
        this.d = bm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.wi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r5, defpackage.lu2 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ul6.a
            if (r0 == 0) goto L13
            r0 = r6
            ul6$a r0 = (ul6.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ul6$a r0 = new ul6$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.r7d.b(r6)
            goto L68
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.r7d.b(r6)
            sh0 r5 = (defpackage.sh0) r5
            rh0 r6 = r4.c
            java.util.UUID r6 = r6.b
            tl6 r1 = r4.b
            r1.getClass()
            sh0$a r5 = r5.c()
            r6.getClass()
            r5.b = r6
            bm6 r6 = r4.d
            if (r6 == 0) goto L57
            pl6 r1 = new pl6
            java.lang.System.currentTimeMillis()
            java.util.ArrayList r6 = r6.b
            r6.getClass()
            r1.<init>()
            r5.a(r1)
        L57:
            sh0 r5 = r5.b()
            r0.label = r2
            wi5 r4 = r4.a
            java.lang.Object r4 = r4.a(r5, r0)
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L68
            return r5
        L68:
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ul6.a(java.lang.Object, lu2):java.lang.Object");
    }
}
