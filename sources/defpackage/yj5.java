package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {213, 213}, m = "invokeSuspend")
public final class yj5 extends c1f implements wu5<wi5<Object>, Object, lu2<? super j6g>, Object> {
    final /* synthetic */ Function2<Object, lu2<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yj5(Function2<Object, ? super lu2<Object>, ? extends Object> function2, lu2<? super yj5> lu2Var) {
        super(3, lu2Var);
        this.$transform = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r0.a(r7, r6) == r4) goto L15;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 0
            r2 = 2
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.r7d.b(r7)
            goto L41
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r1
        L17:
            java.lang.Object r0 = r6.L$0
            wi5 r0 = (defpackage.wi5) r0
            defpackage.r7d.b(r7)
            goto L36
        L1f:
            defpackage.r7d.b(r7)
            java.lang.Object r7 = r6.L$0
            r0 = r7
            wi5 r0 = (defpackage.wi5) r0
            java.lang.Object r7 = r6.L$1
            kotlin.jvm.functions.Function2<java.lang.Object, lu2<java.lang.Object>, java.lang.Object> r5 = r6.$transform
            r6.L$0 = r0
            r6.label = r3
            java.lang.Object r7 = r5.invoke(r7, r6)
            if (r7 != r4) goto L36
            goto L40
        L36:
            r6.L$0 = r1
            r6.label = r2
            java.lang.Object r6 = r0.a(r7, r6)
            if (r6 != r4) goto L41
        L40:
            return r4
        L41:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.wu5
    public final Object q(wi5<Object> wi5Var, Object obj, lu2<? super j6g> lu2Var) {
        yj5 yj5Var = new yj5(this.$transform, lu2Var);
        yj5Var.L$0 = wi5Var;
        yj5Var.L$1 = obj;
        return yj5Var.invokeSuspend(j6g.a);
    }
}
