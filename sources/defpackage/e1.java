package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", l = {1725, 1727, 1734, 1735, 1745}, m = "invokeSuspend")
public final class e1 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ d3a $interactionSource;
    final /* synthetic */ long $offset;
    final /* synthetic */ dmb $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ b1 this$0;

    @uh3(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", l = {1719, 1722}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ d3a $interactionSource;
        final /* synthetic */ long $offset;
        Object L$0;
        int label;
        final /* synthetic */ b1 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b1 b1Var, long j, d3a d3aVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = b1Var;
            this.$offset = j;
            this.$interactionSource = d3aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.this$0, this.$offset, this.$interactionSource, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        
            if (r7.a(r0, r6) == r3) goto L17;
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
                r1 = 2
                r2 = 1
                g13 r3 = defpackage.g13.a
                if (r0 == 0) goto L1f
                if (r0 == r2) goto L1b
                if (r0 != r1) goto L14
                java.lang.Object r0 = r6.L$0
                hmb$b r0 = (hmb.b) r0
                defpackage.r7d.b(r7)
                goto L49
            L14:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r6)
                r6 = 0
                return r6
            L1b:
                defpackage.r7d.b(r7)
                goto L35
            L1f:
                defpackage.r7d.b(r7)
                b1 r7 = r6.this$0
                boolean r7 = r7.h2()
                if (r7 == 0) goto L35
                long r4 = defpackage.q72.a
                r6.label = r2
                java.lang.Object r7 = defpackage.ls3.b(r4, r6)
                if (r7 != r3) goto L35
                goto L48
            L35:
                hmb$b r0 = new hmb$b
                long r4 = r6.$offset
                r0.<init>(r4)
                d3a r7 = r6.$interactionSource
                r6.L$0 = r0
                r6.label = r1
                java.lang.Object r7 = r7.a(r0, r6)
                if (r7 != r3) goto L49
            L48:
                return r3
            L49:
                b1 r6 = r6.this$0
                r6.q0 = r0
                j6g r6 = defpackage.j6g.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(dmb dmbVar, long j, d3a d3aVar, b1 b1Var, lu2<? super e1> lu2Var) {
        super(2, lu2Var);
        this.$this_handlePressInteraction = dmbVar;
        this.$offset = j;
        this.$interactionSource = d3aVar;
        this.this$0 = b1Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        e1 e1Var = new e1(this.$this_handlePressInteraction, this.$offset, this.$interactionSource, this.this$0, lu2Var);
        e1Var.L$0 = obj;
        return e1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((e1) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        if (r15.a(r0, r14) != r7) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        if (r2.a(r15, r14) == r7) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.label
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            g13 r7 = defpackage.g13.a
            if (r0 == 0) goto L38
            if (r0 == r5) goto L30
            if (r0 == r4) goto L2a
            if (r0 == r3) goto L22
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L17
            goto L1d
        L17:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r14)
            return r6
        L1d:
            defpackage.r7d.b(r15)
            goto Lbe
        L22:
            java.lang.Object r0 = r14.L$0
            hmb$c r0 = (hmb.c) r0
            defpackage.r7d.b(r15)
            goto L91
        L2a:
            boolean r0 = r14.Z$0
            defpackage.r7d.b(r15)
            goto L76
        L30:
            java.lang.Object r0 = r14.L$0
            ex7 r0 = (defpackage.ex7) r0
            defpackage.r7d.b(r15)
            goto L5c
        L38:
            defpackage.r7d.b(r15)
            java.lang.Object r15 = r14.L$0
            e13 r15 = (defpackage.e13) r15
            e1$a r8 = new e1$a
            b1 r9 = r14.this$0
            long r10 = r14.$offset
            d3a r12 = r14.$interactionSource
            r13 = 0
            r8.<init>(r9, r10, r12, r13)
            uqe r0 = defpackage.u63.Y(r15, r6, r6, r8, r3)
            dmb r15 = r14.$this_handlePressInteraction
            r14.L$0 = r0
            r14.label = r5
            java.lang.Object r15 = r15.T(r14)
            if (r15 != r7) goto L5c
            goto Lbd
        L5c:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            boolean r5 = r0.isActive()
            if (r5 == 0) goto L9e
            r14.L$0 = r6
            r14.Z$0 = r15
            r14.label = r4
            java.lang.Object r0 = defpackage.u63.p(r0, r14)
            if (r0 != r7) goto L75
            goto Lbd
        L75:
            r0 = r15
        L76:
            if (r0 == 0) goto Lbe
            hmb$b r15 = new hmb$b
            long r0 = r14.$offset
            r15.<init>(r0)
            hmb$c r0 = new hmb$c
            r0.<init>(r15)
            d3a r1 = r14.$interactionSource
            r14.L$0 = r0
            r14.label = r3
            java.lang.Object r15 = r1.a(r15, r14)
            if (r15 != r7) goto L91
            goto Lbd
        L91:
            d3a r15 = r14.$interactionSource
            r14.L$0 = r6
            r14.label = r2
            java.lang.Object r15 = r15.a(r0, r14)
            if (r15 != r7) goto Lbe
            goto Lbd
        L9e:
            b1 r0 = r14.this$0
            hmb$b r0 = r0.q0
            if (r0 == 0) goto Lbe
            d3a r2 = r14.$interactionSource
            if (r15 == 0) goto Lae
            hmb$c r15 = new hmb$c
            r15.<init>(r0)
            goto Lb3
        Lae:
            hmb$a r15 = new hmb$a
            r15.<init>(r0)
        Lb3:
            r14.L$0 = r6
            r14.label = r1
            java.lang.Object r15 = r2.a(r15, r14)
            if (r15 != r7) goto Lbe
        Lbd:
            return r7
        Lbe:
            b1 r14 = r14.this$0
            r14.q0 = r6
            j6g r14 = defpackage.j6g.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
