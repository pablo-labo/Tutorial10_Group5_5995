package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1", f = "Clickable.kt", l = {1676, 1681, 1682}, m = "invokeSuspend")
public final class f1 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ d3a $interactionSource;
    final /* synthetic */ long $offset;
    Object L$0;
    int label;
    final /* synthetic */ b1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(b1 b1Var, long j, d3a d3aVar, lu2<? super f1> lu2Var) {
        super(2, lu2Var);
        this.this$0 = b1Var;
        this.$offset = j;
        this.$interactionSource = d3aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new f1(this.this$0, this.$offset, this.$interactionSource, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((f1) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r9.a(r0, r8) != r5) goto L23;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r0 == 0) goto L26
            if (r0 == r4) goto L22
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L14
            defpackage.r7d.b(r9)
            goto L5e
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            return r1
        L1a:
            java.lang.Object r0 = r8.L$0
            hmb$c r0 = (hmb.c) r0
            defpackage.r7d.b(r9)
            goto L51
        L22:
            defpackage.r7d.b(r9)
            goto L38
        L26:
            defpackage.r7d.b(r9)
            b1 r9 = r8.this$0
            uqe r9 = r9.w0
            if (r9 == 0) goto L38
            r8.label = r4
            java.lang.Object r9 = defpackage.u63.p(r9, r8)
            if (r9 != r5) goto L38
            goto L5d
        L38:
            hmb$b r9 = new hmb$b
            long r6 = r8.$offset
            r9.<init>(r6)
            hmb$c r0 = new hmb$c
            r0.<init>(r9)
            d3a r4 = r8.$interactionSource
            r8.L$0 = r0
            r8.label = r3
            java.lang.Object r9 = r4.a(r9, r8)
            if (r9 != r5) goto L51
            goto L5d
        L51:
            d3a r9 = r8.$interactionSource
            r8.L$0 = r1
            r8.label = r2
            java.lang.Object r8 = r9.a(r0, r8)
            if (r8 != r5) goto L5e
        L5d:
            return r5
        L5e:
            j6g r8 = defpackage.j6g.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
