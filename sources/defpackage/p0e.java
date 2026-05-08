package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationNavGraphKt$SelectedConversationNavGraph$6$1$9$1$1$1", f = "SelectedConversationNavGraph.kt", l = {}, m = "invokeSuspend")
public final class p0e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ ConversationRecord $it;
    final /* synthetic */ i3d $reportSpamViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0e(i3d i3dVar, ConversationRecord conversationRecord, lu2<? super p0e> lu2Var) {
        super(2, lu2Var);
        this.$reportSpamViewModel = i3dVar;
        this.$it = conversationRecord;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new p0e(this.$reportSpamViewModel, this.$it, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((p0e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        i3d i3dVar = this.$reportSpamViewModel;
        ConversationRecord conversationRecord = this.$it;
        i3dVar.getClass();
        conversationRecord.getClass();
        gse gseVar = i3dVar.d;
        f3d f3dVar = new f3d(conversationRecord, null, "", null, null, false, false);
        gseVar.getClass();
        gseVar.m(null, f3dVar);
        return j6g.a;
    }
}
