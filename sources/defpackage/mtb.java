package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfilePreferencesViewModel$setWillingToRelocateAnywhere$1", f = "ProfilePreferencesViewModel.kt", l = {520, 527}, m = "invokeSuspend")
public final class mtb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $onComplete;
    Object L$0;
    int label;
    final /* synthetic */ aub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtb(aub aubVar, gu5<j6g> gu5Var, lu2<? super mtb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = aubVar;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new mtb(this.this$0, this.$onComplete, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((mtb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (defpackage.aub.j(r4, true, r7, r8, r10) == r11) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (defpackage.aub.i(r4, r5, true, r7, r8, r10) == r11) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        return r11;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L1a
            if (r0 == r3) goto L12
            if (r0 != r2) goto Lc
            goto L12
        Lc:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r10)
            return r1
        L12:
            java.lang.Object r10 = r10.L$0
            java.lang.String r10 = (java.lang.String) r10
            defpackage.r7d.b(r11)
            goto L52
        L1a:
            defpackage.r7d.b(r11)
            aub r11 = r10.this$0
            g4a r11 = r11.e
            gme r11 = (defpackage.gme) r11
            b5g r0 = defpackage.b5g.b
            r11.setValue(r0)
            aub r11 = r10.this$0
            vsb r11 = r11.l()
            java.lang.String r5 = r11.o
            aub r4 = r10.this$0
            gu5<j6g> r8 = r10.$onComplete
            zr4 r7 = defpackage.zr4.a
            g13 r11 = defpackage.g13.a
            if (r5 != 0) goto L45
            r10.L$0 = r1
            r10.label = r3
            java.lang.Object r10 = defpackage.aub.j(r4, r3, r7, r8, r10)
            if (r10 != r11) goto L52
            goto L51
        L45:
            r10.L$0 = r1
            r10.label = r2
            r6 = 1
            r9 = r10
            java.lang.Object r10 = defpackage.aub.i(r4, r5, r6, r7, r8, r9)
            if (r10 != r11) goto L52
        L51:
            return r11
        L52:
            j6g r10 = defpackage.j6g.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
