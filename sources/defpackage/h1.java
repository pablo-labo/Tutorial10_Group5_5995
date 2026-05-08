package defpackage;

import defpackage.hmb;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$1", f = "Clickable.kt", l = {1661, 1662}, m = "invokeSuspend")
public final class h1 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ d3a $interactionSource;
    final /* synthetic */ hmb.b $press;
    int label;
    final /* synthetic */ b1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(d3a d3aVar, hmb.b bVar, b1 b1Var, lu2<? super h1> lu2Var) {
        super(2, lu2Var);
        this.$interactionSource = d3aVar;
        this.$press = bVar;
        this.this$0 = b1Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new h1(this.$interactionSource, this.$press, this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((h1) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r7.a(r0, r6) == r3) goto L15;
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
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.r7d.b(r7)
            goto L36
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            r6 = 0
            return r6
        L17:
            defpackage.r7d.b(r7)
            goto L29
        L1b:
            defpackage.r7d.b(r7)
            long r4 = defpackage.q72.a
            r6.label = r2
            java.lang.Object r7 = defpackage.ls3.b(r4, r6)
            if (r7 != r3) goto L29
            goto L35
        L29:
            d3a r7 = r6.$interactionSource
            hmb$b r0 = r6.$press
            r6.label = r1
            java.lang.Object r7 = r7.a(r0, r6)
            if (r7 != r3) goto L36
        L35:
            return r3
        L36:
            b1 r7 = r6.this$0
            hmb$b r6 = r6.$press
            r7.q0 = r6
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
