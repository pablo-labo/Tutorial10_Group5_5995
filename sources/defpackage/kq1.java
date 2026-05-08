package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", l = {989, 998}, m = "invokeSuspend")
public final class kq1 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ zb0<j94, ce0> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ ci7 $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ lq1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq1(zb0<j94, ce0> zb0Var, float f, boolean z, lq1 lq1Var, ci7 ci7Var, lu2<? super kq1> lu2Var) {
        super(2, lu2Var);
        this.$animatable = zb0Var;
        this.$target = f;
        this.$enabled = z;
        this.this$0 = lq1Var;
        this.$interaction = ci7Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new kq1(this.$animatable, this.$target, this.$enabled, this.this$0, this.$interaction, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((kq1) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r0.e(r7, r1) == r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        if (defpackage.kp4.a(r8, r0, r1, r3, r7) == r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        return r4;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L17
            if (r0 == r3) goto L12
            if (r0 != r2) goto Lc
            goto L12
        Lc:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r1
        L12:
            defpackage.r7d.b(r8)
            goto L94
        L17:
            defpackage.r7d.b(r8)
            zb0<j94, ce0> r8 = r7.$animatable
            g4a r8 = r8.e
            gme r8 = (defpackage.gme) r8
            java.lang.Object r8 = r8.getValue()
            j94 r8 = (defpackage.j94) r8
            float r8 = r8.a
            float r0 = r7.$target
            boolean r8 = defpackage.j94.c(r8, r0)
            if (r8 != 0) goto L94
            boolean r8 = r7.$enabled
            zb0<j94, ce0> r0 = r7.$animatable
            g13 r4 = defpackage.g13.a
            if (r8 != 0) goto L48
            float r8 = r7.$target
            j94 r1 = new j94
            r1.<init>(r8)
            r7.label = r3
            java.lang.Object r7 = r0.e(r7, r1)
            if (r7 != r4) goto L94
            goto L93
        L48:
            g4a r8 = r0.e
            gme r8 = (defpackage.gme) r8
            java.lang.Object r8 = r8.getValue()
            j94 r8 = (defpackage.j94) r8
            float r8 = r8.a
            lq1 r0 = r7.this$0
            float r0 = r0.b
            boolean r0 = defpackage.j94.c(r8, r0)
            if (r0 == 0) goto L66
            hmb$b r1 = new hmb$b
            r5 = 0
            r1.<init>(r5)
            goto L85
        L66:
            lq1 r0 = r7.this$0
            float r0 = r0.d
            boolean r0 = defpackage.j94.c(r8, r0)
            if (r0 == 0) goto L76
            hk6 r1 = new hk6
            r1.<init>()
            goto L85
        L76:
            lq1 r0 = r7.this$0
            float r0 = r0.c
            boolean r8 = defpackage.j94.c(r8, r0)
            if (r8 == 0) goto L85
            zl5 r1 = new zl5
            r1.<init>()
        L85:
            zb0<j94, ce0> r8 = r7.$animatable
            float r0 = r7.$target
            ci7 r3 = r7.$interaction
            r7.label = r2
            java.lang.Object r7 = defpackage.kp4.a(r8, r0, r1, r3, r7)
            if (r7 != r4) goto L94
        L93:
            return r4
        L94:
            j6g r7 = defpackage.j6g.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
