package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", l = {765, 768, 771}, m = "invokeSuspend")
public final class vsd extends c1f implements Function2<vmg, lu2<? super vmg>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ xsd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsd(xsd xsdVar, lu2<? super vsd> lu2Var) {
        super(2, lu2Var);
        this.this$0 = xsdVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        vsd vsdVar = new vsd(this.this$0, lu2Var);
        vsdVar.J$0 = ((vmg) obj).a;
        return vsdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vmg vmgVar, lu2<? super vmg> lu2Var) {
        long j = vmgVar.a;
        vsd vsdVar = new vsd(this.this$0, lu2Var);
        vsdVar.J$0 = j;
        return vsdVar.invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.label
            r1 = 3
            r2 = 2
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L2c
            if (r0 == r3) goto L26
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L17
            long r0 = r13.J$1
            long r2 = r13.J$0
            defpackage.r7d.b(r14)
            goto L74
        L17:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r13)
            r13 = 0
            return r13
        L1e:
            long r2 = r13.J$1
            long r5 = r13.J$0
            defpackage.r7d.b(r14)
            goto L58
        L26:
            long r5 = r13.J$0
            defpackage.r7d.b(r14)
            goto L40
        L2c:
            defpackage.r7d.b(r14)
            long r5 = r13.J$0
            xsd r14 = r13.this$0
            tea r14 = r14.f
            r13.J$0 = r5
            r13.label = r3
            java.lang.Object r14 = r14.b(r5, r13)
            if (r14 != r4) goto L40
            goto L71
        L40:
            vmg r14 = (defpackage.vmg) r14
            long r7 = r14.a
            long r7 = defpackage.vmg.d(r5, r7)
            xsd r14 = r13.this$0
            r13.J$0 = r5
            r13.J$1 = r7
            r13.label = r2
            java.lang.Object r14 = r14.a(r7, r13)
            if (r14 != r4) goto L57
            goto L71
        L57:
            r2 = r7
        L58:
            vmg r14 = (defpackage.vmg) r14
            long r10 = r14.a
            xsd r14 = r13.this$0
            tea r7 = r14.f
            long r8 = defpackage.vmg.d(r2, r10)
            r13.J$0 = r5
            r13.J$1 = r10
            r13.label = r1
            r12 = r13
            java.lang.Object r14 = r7.a(r8, r10, r12)
            if (r14 != r4) goto L72
        L71:
            return r4
        L72:
            r2 = r5
            r0 = r10
        L74:
            vmg r14 = (defpackage.vmg) r14
            long r13 = r14.a
            long r13 = defpackage.vmg.d(r0, r13)
            long r13 = defpackage.vmg.d(r2, r13)
            vmg r0 = new vmg
            r0.<init>(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vsd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
