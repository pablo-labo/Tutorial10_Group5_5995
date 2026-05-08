package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationNavGraphKt$SelectedConversationNavGraph$3$1", f = "SelectedConversationNavGraph.kt", l = {}, m = "invokeSuspend")
public final class m0e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ kta $onlineStatusViewModel;
    final /* synthetic */ ese<x1e> $uiState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0e(lu2 lu2Var, kta ktaVar, ese eseVar) {
        super(2, lu2Var);
        this.$uiState$delegate = eseVar;
        this.$onlineStatusViewModel = ktaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new m0e(lu2Var, this.$onlineStatusViewModel, this.$uiState$delegate);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((m0e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        ConversationRecord conversationRecord = this.$uiState$delegate.getValue().a;
        if (conversationRecord != null) {
            this.$onlineStatusViewModel.g(u63.Z(conversationRecord));
        }
        return j6g.a;
    }
}
