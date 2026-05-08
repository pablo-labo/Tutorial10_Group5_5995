package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfilePreferencesViewModel$updateJobTypePreferences$1", f = "ProfilePreferencesViewModel.kt", l = {703, 710}, m = "invokeSuspend")
public final class otb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ List<sjb> $jobTypePreferences;
    final /* synthetic */ Function1<js7, j6g> $onComplete;
    boolean Z$0;
    int label;
    final /* synthetic */ aub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public otb(aub aubVar, List<sjb> list, Function1<? super js7, j6g> function1, lu2<? super otb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = aubVar;
        this.$jobTypePreferences = list;
        this.$onComplete = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new otb(this.this$0, this.$jobTypePreferences, this.$onComplete, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((otb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (r0.k(r7) == r3) goto L18;
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
            r2 = 1
            g13 r3 = defpackage.g13.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.r7d.b(r8)
            goto L5d
        L10:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            r7 = 0
            return r7
        L17:
            defpackage.r7d.b(r8)
            goto L3e
        L1b:
            defpackage.r7d.b(r8)
            aub r8 = r7.this$0
            g4a r8 = r8.e
            gme r8 = (defpackage.gme) r8
            b5g r0 = defpackage.b5g.b
            r8.setValue(r0)
            aub r8 = r7.this$0
            xkb r0 = r8.b
            java.util.List<sjb> r4 = r7.$jobTypePreferences
            vsb r8 = r8.l()
            java.util.List<sjb> r8 = r8.c
            r7.label = r2
            java.lang.Object r8 = r0.y(r4, r8, r7)
            if (r8 != r3) goto L3e
            goto L5c
        L3e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            aub r0 = r7.this$0
            if (r8 != 0) goto L52
            g4a r7 = r0.e
            gme r7 = (defpackage.gme) r7
            b5g r8 = defpackage.b5g.c
            r7.setValue(r8)
            goto Lac
        L52:
            r7.Z$0 = r8
            r7.label = r1
            java.lang.Object r8 = r0.k(r7)
            if (r8 != r3) goto L5d
        L5c:
            return r3
        L5d:
            aub r8 = r7.this$0
            g4a r8 = r8.e
            gme r8 = (defpackage.gme) r8
            b5g r0 = defpackage.b5g.a
            r8.setValue(r0)
            js7 r8 = new js7
            java.util.List<sjb> r0 = r7.$jobTypePreferences
            r0.getClass()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L78:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La4
            java.lang.Object r2 = r0.next()
            sjb r2 = (defpackage.sjb) r2
            js7$a r2 = defpackage.wjb.b(r2)     // Catch: java.lang.Exception -> L8c
            r1.add(r2)     // Catch: java.lang.Exception -> L8c
            goto L78
        L8c:
            r2 = move-exception
            java.lang.Class<np7> r3 = defpackage.np7.class
            java.lang.Object r3 = defpackage.cr8.p(r3)
            np7 r3 = (defpackage.np7) r3
            java.lang.String r4 = r2.getMessage()
            if (r4 != 0) goto L9d
            java.lang.String r4 = "Unknown error"
        L9d:
            r5 = 0
            java.lang.String r6 = "PreferencesOnegraphExtensions"
            r3.c(r6, r4, r5, r2)
            goto L78
        La4:
            r8.<init>(r1)
            kotlin.jvm.functions.Function1<js7, j6g> r7 = r7.$onComplete
            r7.invoke(r8)
        Lac:
            j6g r7 = defpackage.j6g.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
