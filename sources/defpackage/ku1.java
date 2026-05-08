package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ku1 implements vi5<l2b<Object>> {
    public final /* synthetic */ kjd a;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ wi5 a;

        /* JADX INFO: renamed from: ku1$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", f = "CachedPagingData.kt", l = {223}, m = "emit")
        public static final class C0299a extends pu2 {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public C0299a(lu2 lu2Var) {
                super(lu2Var);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(wi5 wi5Var) {
            this.a = wi5Var;
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
                boolean r0 = r8 instanceof ku1.a.C0299a
                if (r0 == 0) goto L13
                r0 = r8
                ku1$a$a r0 = (ku1.a.C0299a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                ku1$a$a r0 = new ku1$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                int r1 = r0.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 != r3) goto L26
                defpackage.r7d.b(r8)
                goto L66
            L26:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r6)
                return r2
            L2c:
                defpackage.r7d.b(r8)
                c2a r7 = (defpackage.c2a) r7
                l2b r8 = new l2b
                ju1<T> r1 = r7.c
                kjd r1 = r1.e
                z1a r4 = new z1a
                r4.<init>(r7, r2)
                mj5 r5 = new mj5
                r5.<init>(r1, r4)
                a2a r1 = new a2a
                r1.<init>(r7, r2)
                lj5 r2 = new lj5
                r2.<init>(r5, r1)
                l2b<T> r1 = r7.b
                lza$c r4 = r1.b
                lza$b r1 = r1.c
                b2a r5 = new b2a
                r5.<init>(r7)
                r8.<init>(r2, r4, r1, r5)
                r0.label = r3
                wi5 r6 = r6.a
                java.lang.Object r6 = r6.a(r8, r0)
                g13 r7 = defpackage.g13.a
                if (r6 != r7) goto L66
                return r7
            L66:
                j6g r6 = defpackage.j6g.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ku1.a.a(java.lang.Object, lu2):java.lang.Object");
        }
    }

    public ku1(kjd kjdVar) {
        this.a = kjdVar;
    }

    @Override // defpackage.vi5
    public final Object e(wi5<? super l2b<Object>> wi5Var, lu2 lu2Var) throws Throwable {
        Object objE = this.a.e(new a(wi5Var), lu2Var);
        return objE == g13.a ? objE : j6g.a;
    }
}
