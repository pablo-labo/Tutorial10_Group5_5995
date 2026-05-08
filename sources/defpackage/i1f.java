package defpackage;

import defpackage.k1f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {882, 883}, m = "invokeSuspend")
public final class i1f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ long $timeMillis;
    int label;
    final /* synthetic */ k1f.a<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1f(long j, k1f.a<Object> aVar, lu2<? super i1f> lu2Var) {
        super(2, lu2Var);
        this.$timeMillis = j;
        this.this$0 = aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new i1f(this.$timeMillis, this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((i1f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (defpackage.ls3.b(8, r8) == r5) goto L15;
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
            r1 = 8
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L19
            if (r0 != r3) goto L12
            defpackage.r7d.b(r9)
            goto L35
        L12:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            r8 = 0
            return r8
        L19:
            defpackage.r7d.b(r9)
            goto L2c
        L1d:
            defpackage.r7d.b(r9)
            long r6 = r8.$timeMillis
            long r6 = r6 - r1
            r8.label = r4
            java.lang.Object r9 = defpackage.ls3.b(r6, r8)
            if (r9 != r5) goto L2c
            goto L34
        L2c:
            r8.label = r3
            java.lang.Object r9 = defpackage.ls3.b(r1, r8)
            if (r9 != r5) goto L35
        L34:
            return r5
        L35:
            k1f$a<java.lang.Object> r9 = r8.this$0
            qw1 r9 = r9.c
            if (r9 == 0) goto L4a
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            long r1 = r8.$timeMillis
            r0.<init>(r1)
            o7d$a r8 = new o7d$a
            r8.<init>(r0)
            r9.resumeWith(r8)
        L4a:
            j6g r8 = defpackage.j6g.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i1f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
