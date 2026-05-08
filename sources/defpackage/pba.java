package defpackage;

import androidx.navigation.d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1", f = "NavHost.kt", l = {643, 647}, m = "invokeSuspend")
public final class pba extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ d $backStackEntry;
    final /* synthetic */ cyd<d> $transitionState;
    final /* synthetic */ float $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pba(float f, cyd<d> cydVar, d dVar, lu2<? super pba> lu2Var) {
        super(2, lu2Var);
        this.$value = f;
        this.$transitionState = cydVar;
        this.$backStackEntry = dVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new pba(this.$value, this.$transitionState, this.$backStackEntry, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((pba) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if (r6 == r5) goto L30;
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
            r1 = 0
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L19
            if (r0 != r3) goto L13
            defpackage.r7d.b(r7)
            goto L7e
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r1
        L19:
            defpackage.r7d.b(r7)
            goto L39
        L1d:
            defpackage.r7d.b(r7)
            float r7 = r6.$value
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L39
            cyd<androidx.navigation.d> r0 = r6.$transitionState
            r6.label = r4
            g4a r4 = r0.b
            gme r4 = (defpackage.gme) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Object r7 = r0.m(r7, r4, r6)
            if (r7 != r5) goto L39
            goto L7d
        L39:
            float r7 = r6.$value
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 != 0) goto L7e
            cyd<androidx.navigation.d> r7 = r6.$transitionState
            androidx.navigation.d r0 = r6.$backStackEntry
            r6.label = r3
            csf<S> r2 = r7.e
            if (r2 != 0) goto L4c
            j6g r6 = defpackage.j6g.a
            goto L7b
        L4c:
            g4a r3 = r7.c
            gme r3 = (defpackage.gme) r3
            java.lang.Object r3 = r3.getValue()
            boolean r3 = defpackage.wl7.b(r3, r0)
            if (r3 == 0) goto L6b
            g4a r3 = r7.b
            gme r3 = (defpackage.gme) r3
            java.lang.Object r3 = r3.getValue()
            boolean r3 = defpackage.wl7.b(r3, r0)
            if (r3 == 0) goto L6b
            j6g r6 = defpackage.j6g.a
            goto L7b
        L6b:
            u4a r3 = r7.k
            gyd r4 = new gyd
            r4.<init>(r7, r0, r2, r1)
            java.lang.Object r6 = defpackage.u4a.a(r3, r4, r6)
            if (r6 != r5) goto L79
            goto L7b
        L79:
            j6g r6 = defpackage.j6g.a
        L7b:
            if (r6 != r5) goto L7e
        L7d:
            return r5
        L7e:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pba.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
