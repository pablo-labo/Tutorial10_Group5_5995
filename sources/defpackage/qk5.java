package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qk5<T> implements wi5 {
    public final /* synthetic */ wi5<ma7<? extends T>> a;
    public final /* synthetic */ juc b;

    @uh3(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", l = {67}, m = "emit")
    public static final class a extends pu2 {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ qk5<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(qk5<? super T> qk5Var, lu2<? super a> lu2Var) {
            super(lu2Var);
            this.this$0 = qk5Var;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qk5(wi5<? super ma7<? extends T>> wi5Var, juc jucVar) {
        this.a = wi5Var;
        this.b = jucVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.wi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(T r6, defpackage.lu2<? super defpackage.j6g> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qk5.a
            if (r0 == 0) goto L13
            r0 = r7
            qk5$a r0 = (qk5.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            qk5$a r0 = new qk5$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.r7d.b(r7)
            goto L4b
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            r5 = 0
            return r5
        L2c:
            defpackage.r7d.b(r7)
            ma7 r7 = new ma7
            juc r1 = r5.b
            int r3 = r1.element
            int r4 = r3 + 1
            r1.element = r4
            if (r3 < 0) goto L4e
            r7.<init>(r3, r6)
            r0.label = r2
            wi5<ma7<? extends T>> r5 = r5.a
            java.lang.Object r5 = r5.a(r7, r0)
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L4b
            return r6
        L4b:
            j6g r5 = defpackage.j6g.a
            return r5
        L4e:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "Index overflow has happened"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qk5.a(java.lang.Object, lu2):java.lang.Object");
    }
}
