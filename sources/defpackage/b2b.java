package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {621}, m = "invokeSuspend")
public final class b2b extends c1f implements Function2<xrd, lu2<? super j6g>, Object> {
    final /* synthetic */ yd0<Float> $animationSpec;
    final /* synthetic */ int $targetPage;
    final /* synthetic */ float $targetPageOffsetToSnappedPosition;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e2b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2b(e2b e2bVar, int i, float f, yd0<Float> yd0Var, lu2<? super b2b> lu2Var) {
        super(2, lu2Var);
        this.this$0 = e2bVar;
        this.$targetPage = i;
        this.$targetPageOffsetToSnappedPosition = f;
        this.$animationSpec = yd0Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        b2b b2bVar = new b2b(this.this$0, this.$targetPage, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, lu2Var);
        b2bVar.L$0 = obj;
        return b2bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xrd xrdVar, lu2<? super j6g> lu2Var) {
        return ((b2b) create(xrdVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[PHI: r0
  0x0072: PHI (r0v4 int) = (r0v3 int), (r0v5 int) binds: [B:26:0x0077, B:23:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            r1 = 1
            if (r0 == 0) goto L13
            if (r0 != r1) goto Lc
            defpackage.r7d.b(r11)
            goto La1
        Lc:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r10)
            r10 = 0
            return r10
        L13:
            defpackage.r7d.b(r11)
            java.lang.Object r11 = r10.L$0
            xrd r11 = (defpackage.xrd) r11
            e2b r0 = r10.this$0
            x1b r2 = new x1b
            r2.<init>(r11, r0)
            int r11 = r10.$targetPage
            float r3 = r10.$targetPageOffsetToSnappedPosition
            yd0<java.lang.Float> r6 = r10.$animationSpec
            r10.label = r1
            t1b r4 = defpackage.h2b.a
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r11)
            int r4 = r4.intValue()
            int r4 = r0.j(r4)
            c3a r5 = r0.s
            dme r5 = (defpackage.dme) r5
            r5.h(r4)
            j6g r4 = defpackage.j6g.a
            int r4 = r0.e
            r5 = 0
            if (r11 <= r4) goto L48
            r4 = r1
            goto L49
        L48:
            r4 = r5
        L49:
            int r7 = r2.b()
            int r8 = r0.e
            int r7 = r7 - r8
            int r7 = r7 + r1
            if (r4 == 0) goto L59
            int r1 = r2.b()
            if (r11 > r1) goto L5f
        L59:
            if (r4 != 0) goto L7e
            int r1 = r0.e
            if (r11 >= r1) goto L7e
        L5f:
            int r1 = r0.e
            int r1 = r11 - r1
            int r1 = java.lang.Math.abs(r1)
            r8 = 3
            if (r1 < r8) goto L7e
            if (r4 == 0) goto L74
            int r1 = r11 - r7
            int r0 = r0.e
            if (r1 >= r0) goto L7b
        L72:
            r1 = r0
            goto L7b
        L74:
            int r7 = r7 + r11
            int r0 = r0.e
            if (r7 <= r0) goto L7a
            goto L72
        L7a:
            r1 = r7
        L7b:
            r2.c(r1, r5)
        L7e:
            int r11 = r2.d(r11)
            float r11 = (float) r11
            float r5 = r11 + r3
            iuc r11 = new iuc
            r11.<init>()
            td r7 = new td
            r0 = 2
            r7.<init>(r0, r11, r2)
            r9 = 4
            r4 = 0
            r8 = r10
            java.lang.Object r10 = defpackage.x0f.c(r4, r5, r6, r7, r8, r9)
            g13 r11 = defpackage.g13.a
            if (r10 != r11) goto L9c
            goto L9e
        L9c:
            j6g r10 = defpackage.j6g.a
        L9e:
            if (r10 != r11) goto La1
            return r11
        La1:
            j6g r10 = defpackage.j6g.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b2b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
