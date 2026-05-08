package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationScreenKt$InternalSelectedConversationScreen$10$4$2$4$1", f = "SelectedConversationScreen.kt", l = {}, m = "invokeSuspend")
public final class b1e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ x1e $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1e(x1e x1eVar, lu2<? super b1e> lu2Var) {
        super(2, lu2Var);
        this.$uiState = x1eVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new b1e(this.$uiState, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((b1e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        ConversationRecord conversationRecord = this.$uiState.a;
        if (conversationRecord != null) {
            final int unreadCount = conversationRecord.getUnreadCount();
            ((tp7) cr8.p(tp7.class)).b(new sp7.f(2, "messagingConversation", null, new Function1() { // from class: rq9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    hr7 hr7Var = (hr7) obj2;
                    hr7Var.getClass();
                    hr7Var.c(0, "nbReadMessages");
                    hr7Var.c(Integer.valueOf(unreadCount), "nbUnreadMessages");
                    return j6g.a;
                }
            }));
        }
        return j6g.a;
    }
}
