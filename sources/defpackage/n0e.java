package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationNavGraphKt$SelectedConversationNavGraph$4$1", f = "SelectedConversationNavGraph.kt", l = {}, m = "invokeSuspend")
public final class n0e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $initiateToken;
    final /* synthetic */ Function1<String, j6g> $onNavigateToConversation;
    final /* synthetic */ ese<x1e> $uiState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n0e(ese<x1e> eseVar, String str, Function1<? super String, j6g> function1, lu2<? super n0e> lu2Var) {
        super(2, lu2Var);
        this.$uiState$delegate = eseVar;
        this.$initiateToken = str;
        this.$onNavigateToConversation = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new n0e(this.$uiState$delegate, this.$initiateToken, this.$onNavigateToConversation, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((n0e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
            String str = this.$initiateToken;
            Function1<String, j6g> function1 = this.$onNavigateToConversation;
            if (conversationRecord.isExisting() && str != null) {
                function1.invoke(conversationRecord.getId());
            }
        }
        return j6g.a;
    }
}
