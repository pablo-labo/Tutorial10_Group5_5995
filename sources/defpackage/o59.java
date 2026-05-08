package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {87, 91}, m = "invokeSuspend")
public final class o59 extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
    final /* synthetic */ udf $observer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o59(udf udfVar, lu2<? super o59> lu2Var) {
        super(2, lu2Var);
        this.$observer = udfVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        o59 o59Var = new o59(this.$observer, lu2Var);
        o59Var.L$0 = obj;
        return o59Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
        return ((o59) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r12 == r3) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r12 != r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        return r3;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0051 -> B:17:0x0054). Please report as a decompilation issue!!! */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.label
            r1 = 2
            r2 = 1
            g13 r3 = defpackage.g13.a
            if (r0 == 0) goto L27
            if (r0 == r2) goto L1f
            if (r0 != r1) goto L18
            java.lang.Object r0 = r11.L$1
            yeb r0 = (defpackage.yeb) r0
            java.lang.Object r2 = r11.L$0
            l61 r2 = (defpackage.l61) r2
            defpackage.r7d.b(r12)
            goto L54
        L18:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r11)
            r11 = 0
            return r11
        L1f:
            java.lang.Object r0 = r11.L$0
            l61 r0 = (defpackage.l61) r0
            defpackage.r7d.b(r12)
            goto L3a
        L27:
            defpackage.r7d.b(r12)
            java.lang.Object r12 = r11.L$0
            r0 = r12
            l61 r0 = (defpackage.l61) r0
            r11.L$0 = r0
            r11.label = r2
            java.lang.Object r12 = defpackage.i8f.c(r0, r11, r1)
            if (r12 != r3) goto L3a
            goto L53
        L3a:
            yeb r12 = (defpackage.yeb) r12
            udf r2 = r11.$observer
            long r4 = r12.c
            r2.a()
            r2 = r0
            r0 = r12
        L45:
            r11.L$0 = r2
            r11.L$1 = r0
            r11.label = r1
            peb r12 = defpackage.peb.b
            java.lang.Object r12 = r2.B1(r12, r11)
            if (r12 != r3) goto L54
        L53:
            return r3
        L54:
            neb r12 = (defpackage.neb) r12
            java.util.List<yeb> r12 = r12.a
            r4 = r12
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L60:
            if (r5 >= r4) goto L7a
            java.lang.Object r6 = r12.get(r5)
            yeb r6 = (defpackage.yeb) r6
            long r7 = r6.a
            long r9 = r0.a
            boolean r7 = defpackage.web.m(r7, r9)
            if (r7 == 0) goto L77
            boolean r6 = r6.d
            if (r6 == 0) goto L77
            goto L45
        L77:
            int r5 = r5 + 1
            goto L60
        L7a:
            udf r11 = r11.$observer
            r11.c()
            j6g r11 = defpackage.j6g.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o59.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
