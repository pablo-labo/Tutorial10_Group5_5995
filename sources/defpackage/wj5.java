package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class wj5 implements vi5<Object> {
    public final /* synthetic */ vi5 a;
    public final /* synthetic */ Function2 b;

    @uh3(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {120}, m = "collect")
    public static final class a extends pu2 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(lu2 lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return wj5.this.e(null, this);
        }
    }

    public wj5(mde mdeVar, Function2 function2) {
        this.a = mdeVar;
        this.b = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.vi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.wi5<? super java.lang.Object> r5, defpackage.lu2<? super defpackage.j6g> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof wj5.a
            if (r0 == 0) goto L13
            r0 = r6
            wj5$a r0 = (wj5.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            wj5$a r0 = new wj5$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            java.lang.Object r4 = r0.L$0
            xj5 r4 = (defpackage.xj5) r4
            defpackage.r7d.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L29
            goto L58
        L29:
            r5 = move-exception
            goto L4d
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L32:
            defpackage.r7d.b(r6)
            vi5 r6 = r4.a
            xj5 r1 = new xj5
            kotlin.jvm.functions.Function2 r4 = r4.b
            r1.<init>(r5, r4)
            r0.L$0 = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4b
            r0.label = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4b
            java.lang.Object r4 = r6.e(r1, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4b
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L58
            return r5
        L4b:
            r5 = move-exception
            r4 = r1
        L4d:
            java.lang.Object r6 = r5.a
            if (r6 != r4) goto L5b
            v03 r4 = r0.getContext()
            defpackage.u63.u(r4)
        L58:
            j6g r4 = defpackage.j6g.a
            return r4
        L5b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj5.e(wi5, lu2):java.lang.Object");
    }
}
