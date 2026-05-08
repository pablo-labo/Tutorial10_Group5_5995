package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1", f = "TextContextMenuToolbarHandlerModifier.kt", l = {182, 183, 185, 185}, m = "invokeSuspend")
public final class mdf extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ hdf $provider;
    Object L$0;
    int label;
    final /* synthetic */ ndf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdf(ndf ndfVar, hdf hdfVar, lu2<? super mdf> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ndfVar;
        this.$provider = hdfVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new mdf(this.this$0, this.$provider, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((mdf) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r7.invoke(r6) == r5) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r0 == 0) goto L2f
            if (r0 == r4) goto L2b
            if (r0 == r3) goto L25
            if (r0 == r2) goto L21
            if (r0 == r1) goto L19
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            r6 = 0
            return r6
        L19:
            java.lang.Object r6 = r6.L$0
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            defpackage.r7d.b(r7)
            goto L72
        L21:
            defpackage.r7d.b(r7)
            goto L5d
        L25:
            defpackage.r7d.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L4e
        L29:
            r7 = move-exception
            goto L60
        L2b:
            defpackage.r7d.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L2f:
            defpackage.r7d.b(r7)
            ndf r7 = r6.this$0     // Catch: java.lang.Throwable -> L29
            kotlin.jvm.functions.Function1<? super lu2<? super j6g>, ? extends java.lang.Object> r7 = r7.g0     // Catch: java.lang.Throwable -> L29
            if (r7 == 0) goto L41
            r6.label = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L29
            if (r7 != r5) goto L41
            goto L70
        L41:
            hdf r7 = r6.$provider     // Catch: java.lang.Throwable -> L29
            ndf r0 = r6.this$0     // Catch: java.lang.Throwable -> L29
            r6.label = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r7.a(r0, r6)     // Catch: java.lang.Throwable -> L29
            if (r7 != r5) goto L4e
            goto L70
        L4e:
            ndf r7 = r6.this$0
            kotlin.jvm.functions.Function1<? super lu2<? super j6g>, ? extends java.lang.Object> r7 = r7.h0
            if (r7 == 0) goto L5d
            r6.label = r2
            java.lang.Object r6 = r7.invoke(r6)
            if (r6 != r5) goto L5d
            goto L70
        L5d:
            j6g r6 = defpackage.j6g.a
            return r6
        L60:
            ndf r0 = r6.this$0
            kotlin.jvm.functions.Function1<? super lu2<? super j6g>, ? extends java.lang.Object> r0 = r0.h0
            if (r0 == 0) goto L73
            r6.L$0 = r7
            r6.label = r1
            java.lang.Object r6 = r0.invoke(r6)
            if (r6 != r5) goto L71
        L70:
            return r5
        L71:
            r6 = r7
        L72:
            r7 = r6
        L73:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
