package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fj5 implements vi5<Object> {
    public final /* synthetic */ Object[] a;

    @uh3(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", l = {110}, m = "collect")
    public static final class a extends pu2 {
        int I$0;
        int I$1;
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
            return fj5.this.e(null, this);
        }
    }

    public fj5(Object[] objArr) {
        this.a = objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005d -> B:20:0x005f). Please report as a decompilation issue!!! */
    @Override // defpackage.vi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.wi5<? super java.lang.Object> r7, defpackage.lu2<? super defpackage.j6g> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof fj5.a
            if (r0 == 0) goto L13
            r0 = r8
            fj5$a r0 = (fj5.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            fj5$a r0 = new fj5$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L32
            int r6 = r0.I$1
            int r7 = r0.I$0
            java.lang.Object r1 = r0.L$1
            wi5 r1 = (defpackage.wi5) r1
            java.lang.Object r3 = r0.L$0
            fj5 r3 = (defpackage.fj5) r3
            defpackage.r7d.b(r8)
            r8 = r1
            goto L5f
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            r6 = 0
            return r6
        L39:
            defpackage.r7d.b(r8)
            java.lang.Object[] r8 = r6.a
            int r8 = r8.length
            r1 = 0
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L44:
            if (r1 >= r6) goto L63
            java.lang.Object[] r3 = r7.a
            r3 = r3[r1]
            r0.L$0 = r7
            r0.L$1 = r8
            r0.I$0 = r1
            r0.I$1 = r6
            r0.label = r2
            java.lang.Object r3 = r8.a(r3, r0)
            g13 r4 = defpackage.g13.a
            if (r3 != r4) goto L5d
            return r4
        L5d:
            r3 = r7
            r7 = r1
        L5f:
            int r1 = r7 + 1
            r7 = r3
            goto L44
        L63:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj5.e(wi5, lu2):java.lang.Object");
    }
}
