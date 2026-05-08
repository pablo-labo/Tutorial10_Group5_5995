package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
public final class hfe extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ife<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfe(ife<Object> ifeVar, lu2<? super hfe> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ifeVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new hfe(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((hfe) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r0.invoke(r6, r5) != r4) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[PHI: r0 r6
  0x0048: PHI (r0v1 kotlin.jvm.functions.Function2) = (r0v2 kotlin.jvm.functions.Function2), (r0v4 kotlin.jvm.functions.Function2) binds: [B:13:0x0045, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r6v4 java.lang.Object) = (r6v11 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x0045, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0050 -> B:18:0x0053). Please report as a decompilation issue!!! */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
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
            goto L53
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r1
        L17:
            java.lang.Object r0 = r5.L$0
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            defpackage.r7d.b(r6)
            goto L48
        L1f:
            defpackage.r7d.b(r6)
            ife<java.lang.Object> r6 = r5.this$0
            java.util.concurrent.atomic.AtomicInteger r6 = r6.d
            int r6 = r6.get()
            if (r6 <= 0) goto L60
        L2c:
            ife<java.lang.Object> r6 = r5.this$0
            e13 r6 = r6.a
            v03 r6 = r6.getCoroutineContext()
            defpackage.u63.u(r6)
            ife<java.lang.Object> r6 = r5.this$0
            bhe r0 = r6.b
            go1 r6 = r6.c
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r6 = r6.c(r5)
            if (r6 != r4) goto L48
            goto L52
        L48:
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r6 = r0.invoke(r6, r5)
            if (r6 != r4) goto L53
        L52:
            return r4
        L53:
            ife<java.lang.Object> r6 = r5.this$0
            java.util.concurrent.atomic.AtomicInteger r6 = r6.d
            int r6 = r6.decrementAndGet()
            if (r6 != 0) goto L2c
            j6g r5 = defpackage.j6g.a
            return r5
        L60:
            java.lang.String r5 = "Check failed."
            defpackage.r6.g(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfe.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
