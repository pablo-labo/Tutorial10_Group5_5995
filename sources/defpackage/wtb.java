package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfilePreferencesViewModel$updateRemoteWorkPreferences$1", f = "ProfilePreferencesViewModel.kt", l = {135, 142}, m = "invokeSuspend")
public final class wtb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ List<sjb> $newPreferences;
    final /* synthetic */ gu5<j6g> $onComplete;
    boolean Z$0;
    int label;
    final /* synthetic */ aub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtb(aub aubVar, List<sjb> list, gu5<j6g> gu5Var, lu2<? super wtb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = aubVar;
        this.$newPreferences = list;
        this.$onComplete = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new wtb(this.this$0, this.$newPreferences, this.$onComplete, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((wtb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (r0.n(r5) == r3) goto L18;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 2
            r2 = 1
            g13 r3 = defpackage.g13.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.r7d.b(r6)
            goto L5d
        L10:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            r5 = 0
            return r5
        L17:
            defpackage.r7d.b(r6)
            goto L3e
        L1b:
            defpackage.r7d.b(r6)
            aub r6 = r5.this$0
            g4a r6 = r6.e
            gme r6 = (defpackage.gme) r6
            b5g r0 = defpackage.b5g.b
            r6.setValue(r0)
            aub r6 = r5.this$0
            xkb r0 = r6.b
            java.util.List<sjb> r4 = r5.$newPreferences
            vsb r6 = r6.l()
            java.util.List<sjb> r6 = r6.b
            r5.label = r2
            java.lang.Object r6 = r0.x(r4, r6, r5)
            if (r6 != r3) goto L3e
            goto L5c
        L3e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            aub r0 = r5.this$0
            if (r6 != 0) goto L52
            g4a r5 = r0.e
            gme r5 = (defpackage.gme) r5
            b5g r6 = defpackage.b5g.c
            r5.setValue(r6)
            goto L6d
        L52:
            r5.Z$0 = r6
            r5.label = r1
            java.lang.Object r6 = r0.n(r5)
            if (r6 != r3) goto L5d
        L5c:
            return r3
        L5d:
            aub r6 = r5.this$0
            g4a r6 = r6.e
            gme r6 = (defpackage.gme) r6
            b5g r0 = defpackage.b5g.a
            r6.setValue(r0)
            gu5<j6g> r5 = r5.$onComplete
            r5.invoke()
        L6d:
            j6g r5 = defpackage.j6g.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
