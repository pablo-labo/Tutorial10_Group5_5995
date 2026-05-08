package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1", f = "PullToRefresh.kt", l = {333, 335}, m = "invokeSuspend")
public final class v7c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ t7c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7c(t7c t7cVar, lu2<? super v7c> lu2Var) {
        super(2, lu2Var);
        this.this$0 = t7cVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new v7c(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((v7c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r5.f2(r4) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r5.g2(r4) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        return r3;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 == r2) goto L12
            if (r0 != r1) goto Lb
            goto L12
        Lb:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L12:
            defpackage.r7d.b(r5)
            goto L33
        L16:
            defpackage.r7d.b(r5)
            t7c r5 = r4.this$0
            boolean r0 = r5.f0
            g13 r3 = defpackage.g13.a
            if (r0 != 0) goto L2a
            r4.label = r2
            java.lang.Object r4 = r5.f2(r4)
            if (r4 != r3) goto L33
            goto L32
        L2a:
            r4.label = r1
            java.lang.Object r4 = r5.g2(r4)
            if (r4 != r3) goto L33
        L32:
            return r3
        L33:
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v7c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
