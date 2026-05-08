package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {29, 29}, m = "invokeSuspend")
public final class uk5 extends c1f implements wu5<wi5<Object>, Object[], lu2<? super j6g>, Object> {
    final /* synthetic */ wu5<Object, Object, lu2<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uk5(wu5<Object, Object, ? super lu2<Object>, ? extends Object> wu5Var, lu2<? super uk5> lu2Var) {
        super(3, lu2Var);
        this.$transform = wu5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r0.a(r8, r7) == r4) goto L15;
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
            r1 = 0
            r2 = 2
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.r7d.b(r8)
            goto L48
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r1
        L17:
            java.lang.Object r0 = r7.L$0
            wi5 r0 = (defpackage.wi5) r0
            defpackage.r7d.b(r8)
            goto L3d
        L1f:
            defpackage.r7d.b(r8)
            java.lang.Object r8 = r7.L$0
            r0 = r8
            wi5 r0 = (defpackage.wi5) r0
            java.lang.Object r8 = r7.L$1
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            wu5<java.lang.Object, java.lang.Object, lu2<java.lang.Object>, java.lang.Object> r5 = r7.$transform
            r6 = 0
            r6 = r8[r6]
            r8 = r8[r3]
            r7.L$0 = r0
            r7.label = r3
            java.lang.Object r8 = r5.q(r6, r8, r7)
            if (r8 != r4) goto L3d
            goto L47
        L3d:
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r7 = r0.a(r8, r7)
            if (r7 != r4) goto L48
        L47:
            return r4
        L48:
            j6g r7 = defpackage.j6g.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.wu5
    public final Object q(wi5<Object> wi5Var, Object[] objArr, lu2<? super j6g> lu2Var) {
        uk5 uk5Var = new uk5(this.$transform, lu2Var);
        uk5Var.L$0 = wi5Var;
        uk5Var.L$1 = objArr;
        return uk5Var.invokeSuspend(j6g.a);
    }
}
