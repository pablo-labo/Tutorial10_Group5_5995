package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vza implements vi5<tw5> {
    public final /* synthetic */ sj5 a;
    public final /* synthetic */ int b;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ wi5 a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: vza$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2", f = "PageFetcherSnapshot.kt", l = {223}, m = "emit")
        public static final class C0463a extends pu2 {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public C0463a(lu2 lu2Var) {
                super(lu2Var);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(wi5 wi5Var, int i) {
            this.a = wi5Var;
            this.b = i;
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
                boolean r0 = r6 instanceof vza.a.C0463a
                if (r0 == 0) goto L13
                r0 = r6
                vza$a$a r0 = (vza.a.C0463a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                vza$a$a r0 = new vza$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                int r1 = r0.label
                r2 = 1
                if (r1 == 0) goto L2c
                if (r1 != r2) goto L25
                defpackage.r7d.b(r6)
                goto L45
            L25:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r4)
                r4 = 0
                return r4
            L2c:
                defpackage.r7d.b(r6)
                qsg r5 = (defpackage.qsg) r5
                tw5 r6 = new tw5
                int r1 = r4.b
                r6.<init>(r1, r5)
                r0.label = r2
                wi5 r4 = r4.a
                java.lang.Object r4 = r4.a(r6, r0)
                g13 r5 = defpackage.g13.a
                if (r4 != r5) goto L45
                return r5
            L45:
                j6g r4 = defpackage.j6g.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: vza.a.a(java.lang.Object, lu2):java.lang.Object");
        }
    }

    public vza(sj5 sj5Var, int i) {
        this.a = sj5Var;
        this.b = i;
    }

    @Override // defpackage.vi5
    public final Object e(wi5<? super tw5> wi5Var, lu2 lu2Var) {
        Object objE = this.a.e(new a(wi5Var, this.b), lu2Var);
        return objE == g13.a ? objE : j6g.a;
    }
}
