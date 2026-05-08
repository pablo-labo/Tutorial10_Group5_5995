package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pj5<T> implements wi5 {
    public final /* synthetic */ wi5<T> a;
    public final /* synthetic */ luc<Throwable> b;

    @uh3(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {154}, m = "emit")
    public static final class a extends pu2 {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ pj5<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(pj5<? super T> pj5Var, lu2<? super a> lu2Var) {
            super(lu2Var);
            this.this$0 = pj5Var;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pj5(wi5<? super T> wi5Var, luc<Throwable> lucVar) {
        this.a = wi5Var;
        this.b = lucVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Throwable] */
    @Override // defpackage.wi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(T r5, defpackage.lu2<? super defpackage.j6g> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof pj5.a
            if (r0 == 0) goto L13
            r0 = r6
            pj5$a r0 = (pj5.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            pj5$a r0 = new pj5$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            java.lang.Object r4 = r0.L$0
            pj5 r4 = (defpackage.pj5) r4
            defpackage.r7d.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L44
        L29:
            r5 = move-exception
            goto L47
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L32:
            defpackage.r7d.b(r6)
            wi5<T> r6 = r4.a     // Catch: java.lang.Throwable -> L29
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L29
            r0.label = r2     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.a(r5, r0)     // Catch: java.lang.Throwable -> L29
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L44
            return r5
        L44:
            j6g r4 = defpackage.j6g.a
            return r4
        L47:
            luc<java.lang.Throwable> r4 = r4.b
            r4.element = r5
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj5.a(java.lang.Object, lu2):java.lang.Object");
    }
}
