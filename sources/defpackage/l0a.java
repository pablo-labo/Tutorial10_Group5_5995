package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1", f = "MouseWheelScrollable.kt", l = {179}, m = "invokeSuspend")
public final class l0a extends n7d implements Function2<t6e<Object>, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<Object> $builderAction;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0a(gu5<Object> gu5Var, lu2<? super l0a> lu2Var) {
        super(2, lu2Var);
        this.$builderAction = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        l0a l0aVar = new l0a(this.$builderAction, lu2Var);
        l0aVar.L$0 = obj;
        return l0aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(t6e<Object> t6eVar, lu2<? super j6g> lu2Var) {
        return ((l0a) create(t6eVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0034 -> B:14:0x0035). Please report as a decompilation issue!!! */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            if (r0 != r2) goto L12
            java.lang.Object r0 = r4.L$1
            java.lang.Object r3 = r4.L$0
            t6e r3 = (defpackage.t6e) r3
            defpackage.r7d.b(r5)
            goto L35
        L12:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r1
        L18:
            defpackage.r7d.b(r5)
            java.lang.Object r5 = r4.L$0
            t6e r5 = (defpackage.t6e) r5
            r3 = r5
        L20:
            gu5<java.lang.Object> r5 = r4.$builderAction
            java.lang.Object r5 = r5.invoke()
            if (r5 == 0) goto L34
            r4.L$0 = r3
            r4.L$1 = r5
            r4.label = r2
            r3.a(r4, r5)
            g13 r4 = defpackage.g13.a
            return r4
        L34:
            r0 = r1
        L35:
            if (r0 != 0) goto L20
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
