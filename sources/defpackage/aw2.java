package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.conversation.details.ConversationDetailsScreenKt$ConversationDetailsScreen$3$1", f = "ConversationDetailsScreen.kt", l = {}, m = "invokeSuspend")
public final class aw2 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ ConversationRecord $conversation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw2(ConversationRecord conversationRecord, lu2<? super aw2> lu2Var) {
        super(2, lu2Var);
        this.$conversation = conversationRecord;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new aw2(this.$conversation, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((aw2) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        final boolean z = this.$conversation.getJob().getJobKey() != null;
        final int size = this.$conversation.getParticipants().size();
        ((tp7) cr8.p(tp7.class)).b(new sp7.f(2, "messagingConversationDetails", null, new Function1() { // from class: yq9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                hr7 hr7Var = (hr7) obj2;
                hr7Var.getClass();
                hr7Var.d("hasJobCard", Boolean.valueOf(z));
                hr7Var.c(Integer.valueOf(size), "nbParticipants");
                return j6g.a;
            }
        }));
        return j6g.a;
    }
}
