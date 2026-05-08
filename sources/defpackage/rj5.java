package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rj5 implements vi5<Object> {
    public final /* synthetic */ vi5 a;
    public final /* synthetic */ xu5 b;

    @uh3(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 115}, m = "collect")
    public static final class a extends pu2 {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public a(lu2 lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return rj5.this.e(null, this);
        }
    }

    public rj5(vi5 vi5Var, xu5 xu5Var) {
        this.a = vi5Var;
        this.b = xu5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0076 -> B:30:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0090 -> B:27:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.vi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.wi5<? super java.lang.Object> r14, defpackage.lu2<? super defpackage.j6g> r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof rj5.a
            if (r0 == 0) goto L13
            r0 = r15
            rj5$a r0 = (rj5.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            rj5$a r0 = new rj5$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L55
            if (r1 == r4) goto L3f
            if (r1 != r3) goto L39
            long r13 = r0.J$0
            java.lang.Object r1 = r0.L$2
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r6 = r0.L$1
            wi5 r6 = (defpackage.wi5) r6
            java.lang.Object r7 = r0.L$0
            rj5 r7 = (defpackage.rj5) r7
            defpackage.r7d.b(r15)
            goto L93
        L39:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r13)
            return r2
        L3f:
            int r13 = r0.I$0
            long r6 = r0.J$0
            java.lang.Object r14 = r0.L$1
            wi5 r14 = (defpackage.wi5) r14
            java.lang.Object r1 = r0.L$0
            rj5 r1 = (defpackage.rj5) r1
            defpackage.r7d.b(r15)
            r10 = r1
            r1 = r13
            r11 = r6
            r6 = r14
            r7 = r10
            r13 = r11
            goto L74
        L55:
            defpackage.r7d.b(r15)
            r6 = 0
        L5a:
            vi5 r15 = r13.a
            r0.L$0 = r13
            r0.L$1 = r14
            r0.L$2 = r2
            r0.J$0 = r6
            r1 = 0
            r0.I$0 = r1
            r0.label = r4
            java.io.Serializable r15 = defpackage.wg2.m(r15, r14, r0)
            if (r15 != r5) goto L70
            goto L8f
        L70:
            r10 = r6
            r7 = r13
            r6 = r14
            r13 = r10
        L74:
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            if (r15 == 0) goto L9f
            xu5 r1 = r7.b
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r13)
            r0.L$0 = r7
            r0.L$1 = r6
            r0.L$2 = r15
            r0.J$0 = r13
            r0.label = r3
            java.lang.Object r1 = r1.j(r6, r15, r8, r0)
            if (r1 != r5) goto L90
        L8f:
            return r5
        L90:
            r10 = r1
            r1 = r15
            r15 = r10
        L93:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto La4
            r8 = 1
            long r13 = r13 + r8
            r1 = r4
        L9f:
            r10 = r13
            r14 = r6
            r13 = r7
            r6 = r10
            goto La5
        La4:
            throw r1
        La5:
            if (r1 != 0) goto L5a
            j6g r13 = defpackage.j6g.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj5.e(wi5, lu2):java.lang.Object");
    }
}
