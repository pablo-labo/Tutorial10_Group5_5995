package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.o12;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.inbox.InboxViewModel$onUpdateConversationFolder$1", f = "InboxViewModel.kt", l = {149}, m = "invokeSuspend")
public final class x67 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ ConversationRecord $conversation;
    final /* synthetic */ gu5<j6g> $onError;
    final /* synthetic */ p12 $trigger;
    int label;
    final /* synthetic */ u67 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x67(u67 u67Var, ConversationRecord conversationRecord, p12 p12Var, gu5<j6g> gu5Var, lu2<? super x67> lu2Var) {
        super(2, lu2Var);
        this.this$0 = u67Var;
        this.$conversation = conversationRecord;
        this.$trigger = p12Var;
        this.$onError = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new x67(this.this$0, this.$conversation, this.$trigger, this.$onError, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((x67) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            h02 h02Var = this.this$0.c;
            ConversationRecord conversationRecord = this.$conversation;
            p12 p12Var = this.$trigger;
            this.label = 1;
            obj = h02Var.a(conversationRecord, p12Var, null, this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        if (((o12) obj) instanceof o12.a) {
            this.$onError.invoke();
        }
        return j6g.a;
    }
}
