package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", f = "TapGestureDetector.kt", l = {498, 500}, m = "invokeSuspend")
public final class p8f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Function2<e13, lu2<? super j6g>, Object> $block;
    final /* synthetic */ ex7 $resetJob;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p8f(ex7 ex7Var, Function2<? super e13, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super p8f> lu2Var) {
        super(2, lu2Var);
        this.$resetJob = ex7Var;
        this.$block = function2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        p8f p8fVar = new p8f(this.$resetJob, this.$block, lu2Var);
        p8fVar.L$0 = obj;
        return p8fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((p8f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r6.invoke(r0, r5) == r4) goto L15;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 0
            r2 = 2
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.r7d.b(r6)
            goto L41
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r1
        L17:
            java.lang.Object r0 = r5.L$0
            e13 r0 = (defpackage.e13) r0
            defpackage.r7d.b(r6)
            goto L34
        L1f:
            defpackage.r7d.b(r6)
            java.lang.Object r6 = r5.L$0
            r0 = r6
            e13 r0 = (defpackage.e13) r0
            ex7 r6 = r5.$resetJob
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r6 = r6.s0(r5)
            if (r6 != r4) goto L34
            goto L40
        L34:
            kotlin.jvm.functions.Function2<e13, lu2<? super j6g>, java.lang.Object> r6 = r5.$block
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r5 = r6.invoke(r0, r5)
            if (r5 != r4) goto L41
        L40:
            return r4
        L41:
            j6g r5 = defpackage.j6g.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p8f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
