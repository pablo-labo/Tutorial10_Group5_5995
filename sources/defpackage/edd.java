package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2", f = "RightClickGestures.kt", l = {32, 35}, m = "invokeSuspend")
public final class edd extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
    final /* synthetic */ Function1<ooa, j6g> $onDown;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public edd(Function1<? super ooa, j6g> function1, lu2<? super edd> lu2Var) {
        super(2, lu2Var);
        this.$onDown = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        edd eddVar = new edd(this.$onDown, lu2Var);
        eddVar.L$0 = obj;
        return eddVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
        return ((edd) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r8 == r4) goto L15;
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
            r1 = 2
            r2 = 0
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L17
            if (r0 != r1) goto L11
            defpackage.r7d.b(r8)
            goto L50
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r2
        L17:
            java.lang.Object r0 = r7.L$0
            l61 r0 = (defpackage.l61) r0
            defpackage.r7d.b(r8)
            goto L32
        L1f:
            defpackage.r7d.b(r8)
            java.lang.Object r8 = r7.L$0
            r0 = r8
            l61 r0 = (defpackage.l61) r0
            r7.L$0 = r0
            r7.label = r3
            java.lang.Object r8 = defpackage.w74.c(r0, r7)
            if (r8 != r4) goto L32
            goto L4f
        L32:
            yeb r8 = (defpackage.yeb) r8
            r8.a()
            kotlin.jvm.functions.Function1<ooa, j6g> r3 = r7.$onDown
            long r5 = r8.c
            ooa r8 = new ooa
            r8.<init>(r5)
            r3.invoke(r8)
            r7.L$0 = r2
            r7.label = r1
            peb r8 = defpackage.peb.b
            java.lang.Object r8 = defpackage.i8f.i(r0, r8, r7)
            if (r8 != r4) goto L50
        L4f:
            return r4
        L50:
            yeb r8 = (defpackage.yeb) r8
            if (r8 == 0) goto L57
            r8.a()
        L57:
            j6g r7 = defpackage.j6g.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
