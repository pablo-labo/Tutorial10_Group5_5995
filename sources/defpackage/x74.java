package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x74<T> implements vi5<T> {
    public final vi5<T> a;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ luc<Object> a;
        public final /* synthetic */ wi5<T> b;

        /* JADX INFO: renamed from: x74$a$a, reason: collision with other inner class name */
        @uh3(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {73}, m = "emit")
        public static final class C0475a extends pu2 {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0475a(a<? super T> aVar, lu2<? super C0475a> lu2Var) {
                super(lu2Var);
                this.this$0 = aVar;
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(x74<T> x74Var, luc<Object> lucVar, wi5<? super T> wi5Var) {
            this.a = lucVar;
            this.b = wi5Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // defpackage.wi5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(T r5, defpackage.lu2<? super defpackage.j6g> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof x74.a.C0475a
                if (r0 == 0) goto L13
                r0 = r6
                x74$a$a r0 = (x74.a.C0475a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                x74$a$a r0 = new x74$a$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                int r1 = r0.label
                r2 = 1
                if (r1 == 0) goto L2c
                if (r1 != r2) goto L25
                defpackage.r7d.b(r6)
                goto L50
            L25:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r4)
                r4 = 0
                return r4
            L2c:
                defpackage.r7d.b(r6)
                luc<java.lang.Object> r6 = r4.a
                T r1 = r6.element
                ux0 r3 = defpackage.ewa.W
                if (r1 == r3) goto L41
                boolean r1 = defpackage.wl7.b(r1, r5)
                if (r1 != 0) goto L3e
                goto L41
            L3e:
                j6g r4 = defpackage.j6g.a
                return r4
            L41:
                r6.element = r5
                r0.label = r2
                wi5<T> r4 = r4.b
                java.lang.Object r4 = r4.a(r5, r0)
                g13 r5 = defpackage.g13.a
                if (r4 != r5) goto L50
                return r5
            L50:
                j6g r4 = defpackage.j6g.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: x74.a.a(java.lang.Object, lu2):java.lang.Object");
        }
    }

    public x74(vi5 vi5Var) {
        this.a = vi5Var;
    }

    @Override // defpackage.vi5
    public final Object e(wi5<? super T> wi5Var, lu2<? super j6g> lu2Var) {
        luc lucVar = new luc();
        lucVar.element = (T) ewa.W;
        Object objE = this.a.e(new a(this, lucVar, wi5Var), lu2Var);
        return objE == g13.a ? objE : j6g.a;
    }
}
