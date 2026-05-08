package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {227}, m = "invokeSuspend")
public final class l8f extends n7d implements Function2<l61, lu2<? super yeb>, Object> {
    final /* synthetic */ yeb $firstUp;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8f(yeb yebVar, lu2<? super l8f> lu2Var) {
        super(2, lu2Var);
        this.$firstUp = yebVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        l8f l8fVar = new l8f(this.$firstUp, lu2Var);
        l8fVar.L$0 = obj;
        return l8fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(l61 l61Var, lu2<? super yeb> lu2Var) {
        return ((l8f) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:12:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
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
            r1 = 1
            if (r0 == 0) goto L18
            if (r0 != r1) goto L11
            long r2 = r6.J$0
            java.lang.Object r0 = r6.L$0
            l61 r0 = (defpackage.l61) r0
            defpackage.r7d.b(r7)
            goto L3f
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            r6 = 0
            return r6
        L18:
            defpackage.r7d.b(r7)
            java.lang.Object r7 = r6.L$0
            l61 r7 = (defpackage.l61) r7
            yeb r0 = r6.$firstUp
            long r2 = r0.b
            opg r0 = r7.getViewConfiguration()
            r0.getClass()
            r4 = 40
            long r4 = r4 + r2
            r0 = r7
            r2 = r4
        L2f:
            r6.L$0 = r0
            r6.J$0 = r2
            r6.label = r1
            r7 = 3
            java.lang.Object r7 = defpackage.i8f.c(r0, r6, r7)
            g13 r4 = defpackage.g13.a
            if (r7 != r4) goto L3f
            return r4
        L3f:
            yeb r7 = (defpackage.yeb) r7
            long r4 = r7.b
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 < 0) goto L2f
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l8f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
