package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$onSendClicked$1", f = "SelectedConversationViewModel.kt", l = {277, 278}, m = "invokeSuspend")
public final class m2e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ y1e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2e(lu2 lu2Var, y1e y1eVar) {
        super(2, lu2Var);
        this.this$0 = y1eVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new m2e(lu2Var, this.this$0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((m2e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01da, code lost:
    
        if (r4.sendMessage(r1, r2, r3, r0, r5) == r6) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e0 A[LOOP:1: B:60:0x0159->B:71:0x01e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a0 A[EDGE_INSN: B:77:0x01a0->B:62:0x01a0 BREAK  A[LOOP:1: B:60:0x0159->B:71:0x01e0], SYNTHETIC] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m2e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
