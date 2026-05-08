package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", l = {73, 78}, m = "invokeSuspend")
public final class yc0 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ float $actualSpeed;
    final /* synthetic */ h69 $animatable;
    final /* synthetic */ q69 $cancellationBehavior;
    final /* synthetic */ r69 $clipSpec;
    final /* synthetic */ s69 $composition;
    final /* synthetic */ boolean $isPlaying;
    final /* synthetic */ int $iterations;
    final /* synthetic */ boolean $restartOnPlay;
    final /* synthetic */ boolean $reverseOnRepeat;
    final /* synthetic */ boolean $useCompositionFrameRate;
    final /* synthetic */ g4a<Boolean> $wasPlaying$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc0(boolean z, boolean z2, h69 h69Var, s69 s69Var, int i, boolean z3, float f, r69 r69Var, q69 q69Var, boolean z4, g4a<Boolean> g4aVar, lu2<? super yc0> lu2Var) {
        super(2, lu2Var);
        this.$isPlaying = z;
        this.$restartOnPlay = z2;
        this.$animatable = h69Var;
        this.$composition = s69Var;
        this.$iterations = i;
        this.$reverseOnRepeat = z3;
        this.$actualSpeed = f;
        this.$clipSpec = r69Var;
        this.$cancellationBehavior = q69Var;
        this.$useCompositionFrameRate = z4;
        this.$wasPlaying$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new yc0(this.$isPlaying, this.$restartOnPlay, this.$animatable, this.$composition, this.$iterations, this.$reverseOnRepeat, this.$actualSpeed, this.$clipSpec, this.$cancellationBehavior, this.$useCompositionFrameRate, this.$wasPlaying$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((yc0) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
    
        if (r0.x(r2, r0.r(), r3, r4, r5, r6, r7, r8, r9, r12) == r11) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.label
            r1 = 2
            r2 = 1
            g13 r11 = defpackage.g13.a
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L18
            if (r0 != r1) goto L11
            defpackage.r7d.b(r13)
            goto Lb4
        L11:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            r0 = 0
            return r0
        L18:
            defpackage.r7d.b(r13)
            goto L7f
        L1d:
            defpackage.r7d.b(r13)
            boolean r0 = r12.$isPlaying
            if (r0 == 0) goto L7f
            g4a<java.lang.Boolean> r0 = r12.$wasPlaying$delegate
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L7f
            boolean r0 = r12.$restartOnPlay
            if (r0 == 0) goto L7f
            h69 r0 = r12.$animatable
            r12.label = r2
            s69 r3 = r0.t()
            r69 r4 = r0.u()
            float r5 = r0.p()
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L4e
            if (r3 != 0) goto L4e
            goto L5a
        L4e:
            if (r3 != 0) goto L51
            goto L63
        L51:
            if (r5 >= 0) goto L5d
            if (r4 == 0) goto L5a
            float r6 = r4.a()
            goto L63
        L5a:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L63
        L5d:
            if (r4 == 0) goto L63
            float r6 = r4.b()
        L63:
            s69 r3 = r0.t()
            float r4 = r0.b()
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 != 0) goto L71
            r4 = r2
            goto L72
        L71:
            r4 = 0
        L72:
            r2 = r2 ^ r4
            java.lang.Object r0 = r0.s(r3, r6, r2, r12)
            if (r0 != r11) goto L7a
            goto L7c
        L7a:
            j6g r0 = defpackage.j6g.a
        L7c:
            if (r0 != r11) goto L7f
            goto Lb3
        L7f:
            g4a<java.lang.Boolean> r0 = r12.$wasPlaying$delegate
            boolean r2 = r12.$isPlaying
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.setValue(r2)
            boolean r0 = r12.$isPlaying
            if (r0 != 0) goto L91
            j6g r0 = defpackage.j6g.a
            return r0
        L91:
            h69 r0 = r12.$animatable
            s69 r2 = r12.$composition
            int r3 = r12.$iterations
            boolean r4 = r12.$reverseOnRepeat
            float r5 = r12.$actualSpeed
            r69 r6 = r12.$clipSpec
            float r7 = r0.b()
            q69 r8 = r12.$cancellationBehavior
            boolean r9 = r12.$useCompositionFrameRate
            r12.label = r1
            r1 = r2
            int r2 = r0.r()
            r10 = r12
            java.lang.Object r0 = r0.x(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 != r11) goto Lb4
        Lb3:
            return r11
        Lb4:
            j6g r0 = defpackage.j6g.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
