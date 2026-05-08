package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class xj5 implements wi5<Object> {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ wi5 b;

    @uh3(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", l = {132, 133}, m = "emit")
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
            return xj5.this.a(null, this);
        }
    }

    public xj5(wi5 wi5Var, Function2 function2) {
        this.a = function2;
        this.b = wi5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r8.a(r7, r0) == r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.wi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, defpackage.lu2<? super defpackage.j6g> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof xj5.a
            if (r0 == 0) goto L13
            r0 = r8
            xj5$a r0 = (xj5.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            xj5$a r0 = new xj5$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            java.lang.Object r6 = r0.L$0
            xj5 r6 = (defpackage.xj5) r6
            defpackage.r7d.b(r8)
            goto L69
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r2
        L35:
            java.lang.Object r7 = r0.L$1
            java.lang.Object r6 = r0.L$0
            xj5 r6 = (defpackage.xj5) r6
            defpackage.r7d.b(r8)
            goto L51
        L3f:
            defpackage.r7d.b(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            kotlin.jvm.functions.Function2 r8 = r6.a
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r5) goto L51
            goto L67
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L68
            wi5 r8 = r6.b
            r0.L$0 = r6
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r5) goto L69
        L67:
            return r5
        L68:
            r4 = 0
        L69:
            if (r4 == 0) goto L6e
            j6g r6 = defpackage.j6g.a
            return r6
        L6e:
            kotlinx.coroutines.flow.internal.AbortFlowException r7 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xj5.a(java.lang.Object, lu2):java.lang.Object");
    }
}
