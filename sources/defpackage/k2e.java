package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.messaging.data.conversations.ConversationsRepository;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$onRetryClicked$1", f = "SelectedConversationViewModel.kt", l = {290}, m = "invokeSuspend")
public final class k2e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $messageId;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ y1e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2e(lu2 lu2Var, y1e y1eVar, String str) {
        super(2, lu2Var);
        this.this$0 = y1eVar;
        this.$messageId = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new k2e(lu2Var, this.this$0, this.$messageId);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((k2e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            ConversationRecord conversationRecord = ((x1e) this.this$0.d0.getValue()).a;
            if (conversationRecord != null) {
                y1e y1eVar = this.this$0;
                String str = this.$messageId;
                ConversationsRepository conversationsRepository = y1eVar.b;
                String id = conversationRecord.getId();
                aib aibVar = ((x1e) y1eVar.d0.getValue()).l;
                this.L$0 = null;
                this.I$0 = 0;
                this.label = 1;
                Object objRetryMessageSend = conversationsRepository.retryMessageSend(id, str, aibVar, this);
                g13 g13Var = g13.a;
                if (objRetryMessageSend == g13Var) {
                    return g13Var;
                }
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}
