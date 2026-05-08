package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfilePreferencesViewModel$updatePreferredJobTitles$1", f = "ProfilePreferencesViewModel.kt", l = {370, 375}, m = "invokeSuspend")
public final class qtb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ List<String> $jobTitles;
    final /* synthetic */ Function1<is7, j6g> $onComplete;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ aub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qtb(aub aubVar, List<String> list, Function1<? super is7, j6g> function1, lu2<? super qtb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = aubVar;
        this.$jobTitles = list;
        this.$onComplete = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new qtb(this.this$0, this.$jobTitles, this.$onComplete, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((qtb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        if (defpackage.aub.h(r4, r0, r5, r8) == r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        if (defpackage.aub.g(r4, r0, r9, r5, r8) == r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        return r6;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L12
            if (r0 != r1) goto Lc
            goto L12
        Lc:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            return r3
        L12:
            java.lang.Object r0 = r8.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r8 = r8.L$0
            java.util.List r8 = (java.util.List) r8
            defpackage.r7d.b(r9)
            goto L87
        L1e:
            defpackage.r7d.b(r9)
            aub r9 = r8.this$0
            g4a r9 = r9.e
            gme r9 = (defpackage.gme) r9
            b5g r0 = defpackage.b5g.b
            r9.setValue(r0)
            java.util.List<java.lang.String> r9 = r8.$jobTitles
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.t92.r0(r9, r4)
            r0.<init>(r4)
            java.util.Iterator r9 = r9.iterator()
        L3f:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r9.next()
            java.lang.String r4 = (java.lang.String) r4
            h58 r5 = new h58
            h68$a r6 = defpackage.h68.a
            c58 r6 = defpackage.c58.c
            hva$c r7 = new hva$c
            r7.<init>(r6)
            r5.<init>(r7, r4)
            r0.add(r5)
            goto L3f
        L5d:
            aub r9 = r8.this$0
            vsb r9 = r9.l()
            java.lang.String r9 = r9.o
            aub r4 = r8.this$0
            kotlin.jvm.functions.Function1<is7, j6g> r5 = r8.$onComplete
            g13 r6 = defpackage.g13.a
            if (r9 != 0) goto L7a
            r8.L$0 = r3
            r8.L$1 = r3
            r8.label = r2
            java.lang.Object r8 = defpackage.aub.h(r4, r0, r5, r8)
            if (r8 != r6) goto L87
            goto L86
        L7a:
            r8.L$0 = r3
            r8.L$1 = r3
            r8.label = r1
            java.lang.Object r8 = defpackage.aub.g(r4, r0, r9, r5, r8)
            if (r8 != r6) goto L87
        L86:
            return r6
        L87:
            j6g r8 = defpackage.j6g.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
