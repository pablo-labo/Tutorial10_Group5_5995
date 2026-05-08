package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", l = {141, 148}, m = "invokeSuspend")
public final class hq8 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ jf5<lh7> $spec;
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ eq8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq8(eq8 eq8Var, jf5<lh7> jf5Var, long j, lu2<? super hq8> lu2Var) {
        super(2, lu2Var);
        this.this$0 = eq8Var;
        this.$spec = jf5Var;
        this.$totalDelta = j;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new hq8(this.this$0, this.$spec, this.$totalDelta, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((hq8) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        if (defpackage.zb0.c(r5, r6, r0, r8, r9, 4) != r4) goto L30;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.label
            r1 = 0
            r2 = 2
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L21
            if (r0 == r3) goto L19
            if (r0 != r2) goto L13
            defpackage.r7d.b(r12)     // Catch: java.util.concurrent.CancellationException -> Lae
            r9 = r11
            goto La4
        L13:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r11)
            return r1
        L19:
            java.lang.Object r0 = r11.L$0
            jf5 r0 = (defpackage.jf5) r0
            defpackage.r7d.b(r12)     // Catch: java.util.concurrent.CancellationException -> Lae
            goto L6d
        L21:
            defpackage.r7d.b(r12)
            eq8 r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> Lae
            zb0<lh7, de0> r12 = r12.o     // Catch: java.util.concurrent.CancellationException -> Lae
            g4a r12 = r12.d     // Catch: java.util.concurrent.CancellationException -> Lae
            gme r12 = (defpackage.gme) r12     // Catch: java.util.concurrent.CancellationException -> Lae
            java.lang.Object r12 = r12.getValue()     // Catch: java.util.concurrent.CancellationException -> Lae
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.util.concurrent.CancellationException -> Lae
            boolean r12 = r12.booleanValue()     // Catch: java.util.concurrent.CancellationException -> Lae
            jf5<lh7> r0 = r11.$spec
            if (r12 == 0) goto L43
            boolean r12 = r0 instanceof defpackage.vpe     // Catch: java.util.concurrent.CancellationException -> Lae
            if (r12 == 0) goto L41
            vpe r0 = (defpackage.vpe) r0     // Catch: java.util.concurrent.CancellationException -> Lae
            goto L43
        L41:
            vpe<lh7> r0 = defpackage.jq8.a     // Catch: java.util.concurrent.CancellationException -> Lae
        L43:
            eq8 r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> Lae
            zb0<lh7, de0> r12 = r12.o     // Catch: java.util.concurrent.CancellationException -> Lae
            g4a r12 = r12.d     // Catch: java.util.concurrent.CancellationException -> Lae
            gme r12 = (defpackage.gme) r12     // Catch: java.util.concurrent.CancellationException -> Lae
            java.lang.Object r12 = r12.getValue()     // Catch: java.util.concurrent.CancellationException -> Lae
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.util.concurrent.CancellationException -> Lae
            boolean r12 = r12.booleanValue()     // Catch: java.util.concurrent.CancellationException -> Lae
            if (r12 != 0) goto L74
            eq8 r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> Lae
            zb0<lh7, de0> r12 = r12.o     // Catch: java.util.concurrent.CancellationException -> Lae
            long r5 = r11.$totalDelta     // Catch: java.util.concurrent.CancellationException -> Lae
            lh7 r7 = new lh7     // Catch: java.util.concurrent.CancellationException -> Lae
            r7.<init>(r5)     // Catch: java.util.concurrent.CancellationException -> Lae
            r11.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> Lae
            r11.label = r3     // Catch: java.util.concurrent.CancellationException -> Lae
            java.lang.Object r12 = r12.e(r11, r7)     // Catch: java.util.concurrent.CancellationException -> Lae
            if (r12 != r4) goto L6d
            goto La3
        L6d:
            eq8 r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> Lae
            qq r12 = r12.c     // Catch: java.util.concurrent.CancellationException -> Lae
            r12.invoke()     // Catch: java.util.concurrent.CancellationException -> Lae
        L74:
            r7 = r0
            eq8 r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> Lae
            zb0<lh7, de0> r12 = r12.o     // Catch: java.util.concurrent.CancellationException -> Lae
            java.lang.Object r12 = r12.d()     // Catch: java.util.concurrent.CancellationException -> Lae
            lh7 r12 = (defpackage.lh7) r12     // Catch: java.util.concurrent.CancellationException -> Lae
            long r5 = r12.a     // Catch: java.util.concurrent.CancellationException -> Lae
            long r8 = r11.$totalDelta     // Catch: java.util.concurrent.CancellationException -> Lae
            long r5 = defpackage.lh7.c(r5, r8)     // Catch: java.util.concurrent.CancellationException -> Lae
            eq8 r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> Lae
            r8 = r5
            zb0<lh7, de0> r5 = r12.o     // Catch: java.util.concurrent.CancellationException -> Lae
            lh7 r6 = new lh7     // Catch: java.util.concurrent.CancellationException -> Lae
            r6.<init>(r8)     // Catch: java.util.concurrent.CancellationException -> Lae
            r9 = r8
            gq8 r8 = new gq8     // Catch: java.util.concurrent.CancellationException -> Lae
            r8.<init>()     // Catch: java.util.concurrent.CancellationException -> Lae
            r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> Lae
            r11.label = r2     // Catch: java.util.concurrent.CancellationException -> Lae
            r10 = 4
            r9 = r11
            java.lang.Object r11 = defpackage.zb0.c(r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> Lae
            if (r11 != r4) goto La4
        La3:
            return r4
        La4:
            eq8 r11 = r9.this$0     // Catch: java.util.concurrent.CancellationException -> Lae
            r12 = 0
            r11.f(r12)     // Catch: java.util.concurrent.CancellationException -> Lae
            eq8 r11 = r9.this$0     // Catch: java.util.concurrent.CancellationException -> Lae
            r11.g = r12     // Catch: java.util.concurrent.CancellationException -> Lae
        Lae:
            j6g r11 = defpackage.j6g.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
