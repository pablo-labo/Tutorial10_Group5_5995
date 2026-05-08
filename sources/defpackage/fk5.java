package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class fk5 implements wi5<Object> {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ luc b;

    @uh3(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", l = {132}, m = "emit")
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
            return fk5.this.a(null, this);
        }
    }

    public fk5(Function2 function2, luc lucVar) {
        this.a = function2;
        this.b = lucVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.wi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r5, defpackage.lu2<? super defpackage.j6g> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof fk5.a
            if (r0 == 0) goto L13
            r0 = r6
            fk5$a r0 = (fk5.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            fk5$a r0 = new fk5$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            java.lang.Object r5 = r0.L$1
            java.lang.Object r4 = r0.L$0
            fk5 r4 = (defpackage.fk5) r4
            defpackage.r7d.b(r6)
            goto L46
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L32:
            defpackage.r7d.b(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r2
            kotlin.jvm.functions.Function2 r6 = r4.a
            java.lang.Object r6 = r6.invoke(r5, r0)
            g13 r0 = defpackage.g13.a
            if (r6 != r0) goto L46
            return r0
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L51
            j6g r4 = defpackage.j6g.a
            return r4
        L51:
            luc r6 = r4.b
            r6.element = r5
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fk5.a(java.lang.Object, lu2):java.lang.Object");
    }
}
