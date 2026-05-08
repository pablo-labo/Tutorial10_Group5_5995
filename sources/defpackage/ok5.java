package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ok5 implements vi5<Object> {
    public final /* synthetic */ rw1 a;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ wi5 a;

        /* JADX INFO: renamed from: ok5$a$a, reason: collision with other inner class name */
        @uh3(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50}, m = "emit")
        public static final class C0369a extends pu2 {
            int label;
            /* synthetic */ Object result;

            public C0369a(lu2 lu2Var) {
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
        public final java.lang.Object a(T r5, defpackage.lu2<? super defpackage.j6g> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof ok5.a.C0369a
                if (r0 == 0) goto L13
                r0 = r6
                ok5$a$a r0 = (ok5.a.C0369a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                ok5$a$a r0 = new ok5$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                int r1 = r0.label
                r2 = 1
                if (r1 == 0) goto L2c
                if (r1 != r2) goto L25
                defpackage.r7d.b(r6)
                goto L3e
            L25:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r4)
                r4 = 0
                return r4
            L2c:
                defpackage.r7d.b(r6)
                if (r5 == 0) goto L3e
                r0.label = r2
                wi5 r4 = r4.a
                java.lang.Object r4 = r4.a(r5, r0)
                g13 r5 = defpackage.g13.a
                if (r4 != r5) goto L3e
                return r5
            L3e:
                j6g r4 = defpackage.j6g.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ok5.a.a(java.lang.Object, lu2):java.lang.Object");
        }
    }

    public ok5(rw1 rw1Var) {
        this.a = rw1Var;
    }

    @Override // defpackage.vi5
    public final Object e(wi5<? super Object> wi5Var, lu2 lu2Var) {
        Object objE = this.a.e(new a(wi5Var), lu2Var);
        return objE == g13.a ? objE : j6g.a;
    }
}
