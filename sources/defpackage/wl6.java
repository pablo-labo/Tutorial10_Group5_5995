package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wl6 implements vi5<sh0<Object>> {
    public final /* synthetic */ lj5 a;
    public final /* synthetic */ pua b;
    public final /* synthetic */ lb3 c;
    public final /* synthetic */ tl6 d;
    public final /* synthetic */ luc e;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ wi5 a;
        public final /* synthetic */ pua b;
        public final /* synthetic */ lb3 c;
        public final /* synthetic */ luc d;

        /* JADX INFO: renamed from: wl6$a$a, reason: collision with other inner class name */
        @uh3(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2", f = "HttpNetworkTransport.kt", l = {112}, m = "emit", v = 1)
        public static final class C0470a extends pu2 {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public C0470a(lu2 lu2Var) {
                super(lu2Var);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(wi5 wi5Var, pua puaVar, lb3 lb3Var, tl6 tl6Var, luc lucVar) {
            this.a = wi5Var;
            this.b = puaVar;
            this.c = lb3Var;
            this.d = lucVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // defpackage.wi5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(java.lang.Object r7, defpackage.lu2 r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof wl6.a.C0470a
                if (r0 == 0) goto L13
                r0 = r8
                wl6$a$a r0 = (wl6.a.C0470a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                wl6$a$a r0 = new wl6$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                int r1 = r0.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 != r3) goto L26
                defpackage.r7d.b(r8)
                goto L8e
            L26:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r6)
                return r2
            L2c:
                defpackage.r7d.b(r8)
                to1 r7 = (defpackage.to1) r7
                luc r8 = r6.d
                T r1 = r8.element
                if (r1 != 0) goto L3e
                as3 r1 = new as3
                r1.<init>()
                r8.element = r1
            L3e:
                T r1 = r8.element
                as3 r1 = (defpackage.as3) r1
                r1.getClass()
                r7.getClass()
                uo1 r4 = new uo1
                r4.<init>(r7)
                java.lang.Object r7 = defpackage.e.a(r4)
                r7.getClass()
                java.util.Map r7 = (java.util.Map) r7
                java.util.LinkedHashMap r7 = r1.b(r7)
                T r8 = r8.element
                as3 r8 = (defpackage.as3) r8
                java.util.LinkedHashSet r1 = r8.d
                boolean r4 = r8.e
                r4 = r4 ^ r3
                boolean r8 = r8.f
                if (r8 == 0) goto L68
                goto L7f
            L68:
                tb9 r8 = new tb9
                r8.<init>(r7)
                pua r7 = r6.b
                lb3 r5 = r6.c
                sh0 r7 = defpackage.xua.c(r8, r7, r2, r5, r1)
                sh0$a r7 = r7.c()
                r7.h = r4
                sh0 r2 = r7.b()
            L7f:
                if (r2 == 0) goto L8e
                r0.label = r3
                wi5 r6 = r6.a
                java.lang.Object r6 = r6.a(r2, r0)
                g13 r7 = defpackage.g13.a
                if (r6 != r7) goto L8e
                return r7
            L8e:
                j6g r6 = defpackage.j6g.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: wl6.a.a(java.lang.Object, lu2):java.lang.Object");
        }
    }

    public wl6(lj5 lj5Var, pua puaVar, lb3 lb3Var, tl6 tl6Var, luc lucVar) {
        this.a = lj5Var;
        this.b = puaVar;
        this.c = lb3Var;
        this.d = tl6Var;
        this.e = lucVar;
    }

    @Override // defpackage.vi5
    public final Object e(wi5<? super sh0<Object>> wi5Var, lu2 lu2Var) throws Throwable {
        Object objE = this.a.e(new a(wi5Var, this.b, this.c, this.d, this.e), lu2Var);
        return objE == g13.a ? objE : j6g.a;
    }
}
