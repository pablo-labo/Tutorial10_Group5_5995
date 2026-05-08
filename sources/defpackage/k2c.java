package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileViewModel$submitContactInformationForm$2$1", f = "ProfileViewModel.kt", l = {653, 656}, m = "invokeSuspend")
public final class k2c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $postSaveCallback;
    final /* synthetic */ x1c $this_run;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2c(x1c x1cVar, gu5<j6g> gu5Var, lu2<? super k2c> lu2Var) {
        super(2, lu2Var);
        this.$this_run = x1cVar;
        this.$postSaveCallback = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new k2c(this.$this_run, this.$postSaveCallback, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((k2c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r0.w(r7, r3, r5, r6) == r4) goto L17;
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
            r2 = 2
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L15
            java.lang.Object r6 = r6.L$0
            java.lang.String r6 = (java.lang.String) r6
            defpackage.r7d.b(r7)
            goto L63
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r1
        L1b:
            defpackage.r7d.b(r7)
            goto L2d
        L1f:
            defpackage.r7d.b(r7)
            x1c r7 = r6.$this_run
            r6.label = r3
            java.lang.Object r7 = r7.l(r6)
            if (r7 != r4) goto L2d
            goto L44
        L2d:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L45
            x1c r0 = r6.$this_run
            gu5<j6g> r3 = r6.$postSaveCallback
            nr2 r5 = new nr2
            r5.<init>(r0, r2)
            r6.L$0 = r1
            r6.label = r2
            java.lang.Object r6 = r0.w(r7, r3, r5, r6)
            if (r6 != r4) goto L63
        L44:
            return r4
        L45:
            java.util.ArrayList r7 = defpackage.lz2.a
            r7 = 0
            r0 = 12
            java.lang.String r2 = "ProfileViewModel"
            java.lang.String r3 = "No id to save jobSeeker rich profile contact info"
            defpackage.lz2.c(r2, r3, r7, r1, r0)
            x1c r7 = r6.$this_run
            g4a r7 = r7.Y
            gme r7 = (defpackage.gme) r7
            b5g r0 = defpackage.b5g.a
            r7.setValue(r0)
            x1c r6 = r6.$this_run
            qr2 r7 = defpackage.qr2.c
            r6.E(r7)
        L63:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k2c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
