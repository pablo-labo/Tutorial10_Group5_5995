package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lj5 implements vi5<Object> {
    public final /* synthetic */ vi5 a;
    public final /* synthetic */ wu5 b;

    @uh3(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {110, 117, 124}, m = "collect")
    public static final class a extends pu2 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public a(lu2 lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return lj5.this.e(null, this);
        }
    }

    public lj5(vi5 vi5Var, wu5 wu5Var) {
        this.a = vi5Var;
        this.b = wu5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.vi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.wi5<? super java.lang.Object> r9, defpackage.lu2<? super defpackage.j6g> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof lj5.a
            if (r0 == 0) goto L13
            r0 = r10
            lj5$a r0 = (lj5.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            lj5$a r0 = new lj5$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            g13 r6 = defpackage.g13.a
            if (r1 == 0) goto L54
            if (r1 == r4) goto L42
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L34
            java.lang.Object r8 = r0.L$0
            hjd r8 = (defpackage.hjd) r8
            defpackage.r7d.b(r10)     // Catch: java.lang.Throwable -> L32
            goto L7f
        L32:
            r9 = move-exception
            goto L87
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            return r5
        L3a:
            java.lang.Object r8 = r0.L$0
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            defpackage.r7d.b(r10)
            goto L9f
        L42:
            java.lang.Object r8 = r0.L$1
            r9 = r8
            wi5 r9 = (defpackage.wi5) r9
            java.lang.Object r8 = r0.L$0
            lj5 r8 = (defpackage.lj5) r8
            defpackage.r7d.b(r10)     // Catch: java.lang.Throwable -> L4f
            goto L66
        L4f:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L8b
        L54:
            defpackage.r7d.b(r10)
            vi5 r10 = r8.a     // Catch: java.lang.Throwable -> L4f
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L4f
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L4f
            r0.label = r4     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r10 = r10.e(r9, r0)     // Catch: java.lang.Throwable -> L4f
            if (r10 != r6) goto L66
            goto L9e
        L66:
            hjd r10 = new hjd
            v03 r1 = r0.getContext()
            r10.<init>(r9, r1)
            wu5 r8 = r8.b     // Catch: java.lang.Throwable -> L85
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L85
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L85
            r0.label = r2     // Catch: java.lang.Throwable -> L85
            java.lang.Object r8 = r8.q(r10, r5, r0)     // Catch: java.lang.Throwable -> L85
            if (r8 != r6) goto L7e
            goto L9e
        L7e:
            r8 = r10
        L7f:
            r8.releaseIntercepted()
            j6g r8 = defpackage.j6g.a
            return r8
        L85:
            r9 = move-exception
            r8 = r10
        L87:
            r8.releaseIntercepted()
            throw r9
        L8b:
            jlf r10 = new jlf
            r10.<init>(r8)
            wu5 r9 = r9.b
            r0.L$0 = r8
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r9 = defpackage.r03.f(r10, r9, r8, r0)
            if (r9 != r6) goto L9f
        L9e:
            return r6
        L9f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj5.e(wi5, lu2):java.lang.Object");
    }
}
