package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tj5<T> implements wi5 {
    public final /* synthetic */ juc a;
    public final /* synthetic */ int b;
    public final /* synthetic */ wi5<T> c;

    @uh3(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", l = {22}, m = "emit")
    public static final class a extends pu2 {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ tj5<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(tj5<? super T> tj5Var, lu2<? super a> lu2Var) {
            super(lu2Var);
            this.this$0 = tj5Var;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tj5(juc jucVar, int i, wi5<? super T> wi5Var) {
        this.a = jucVar;
        this.b = i;
        this.c = wi5Var;
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
            boolean r0 = r6 instanceof tj5.a
            if (r0 == 0) goto L13
            r0 = r6
            tj5$a r0 = (tj5.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            tj5$a r0 = new tj5$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.r7d.b(r6)
            goto L44
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.r7d.b(r6)
            juc r6 = r4.a
            int r1 = r6.element
            int r3 = r4.b
            if (r1 < r3) goto L47
            r0.label = r2
            wi5<T> r4 = r4.c
            java.lang.Object r4 = r4.a(r5, r0)
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L44
            return r5
        L44:
            j6g r4 = defpackage.j6g.a
            return r4
        L47:
            int r1 = r1 + r2
            r6.element = r1
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj5.a(java.lang.Object, lu2):java.lang.Object");
    }
}
