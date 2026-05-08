package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabViewModel$markInvitationAsViewed$1", f = "InvitationTabViewModel.kt", l = {285, 290}, m = "invokeSuspend")
public final class hn7 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $inviteId;
    int label;
    final /* synthetic */ bn7 this$0;

    public static final class a<T> implements wi5 {
        public static final a<T> a = new a<>();

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn7(bn7 bn7Var, String str, lu2<? super hn7> lu2Var) {
        super(2, lu2Var);
        this.this$0 = bn7Var;
        this.$inviteId = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new hn7(this.this$0, this.$inviteId, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((hn7) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (((defpackage.vi5) r9).e(hn7.a.a, r8) == r4) goto L15;
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
            r1 = 0
            r2 = 2
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.r7d.b(r9)
            goto L4c
        L11:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            return r1
        L17:
            defpackage.r7d.b(r9)
            goto L3f
        L1b:
            defpackage.r7d.b(r9)
            bn7 r9 = r8.this$0
            xjd r9 = r9.c0
            xjd$a r0 = new xjd$a
            java.lang.String r5 = r8.$inviteId
            long r6 = java.lang.System.currentTimeMillis()
            r0.<init>(r5, r6)
            r8.label = r3
            r9.getClass()
            yjd r3 = new yjd
            r3.<init>(r9, r0, r1)
            kjd r9 = new kjd
            r9.<init>(r3)
            if (r9 != r4) goto L3f
            goto L4b
        L3f:
            vi5 r9 = (defpackage.vi5) r9
            r8.label = r2
            hn7$a<T> r0 = hn7.a.a
            java.lang.Object r8 = r9.e(r0, r8)
            if (r8 != r4) goto L4c
        L4b:
            return r4
        L4c:
            j6g r8 = defpackage.j6g.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
