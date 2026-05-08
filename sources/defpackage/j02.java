package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.domain.ChangeConversationFolderUseCase$invoke$2$1", f = "ChangeConversationFolderUseCase.kt", l = {118}, m = "invokeSuspend")
public final class j02 extends c1f implements Function2<h4a<dnf>, lu2<? super j6g>, Object> {
    final /* synthetic */ ConversationRecord $conversation;
    final /* synthetic */ w47 $toFolder;
    final /* synthetic */ p12 $trigger;
    int label;
    final /* synthetic */ h02 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j02(h02 h02Var, ConversationRecord conversationRecord, p12 p12Var, w47 w47Var, lu2<? super j02> lu2Var) {
        super(2, lu2Var);
        this.this$0 = h02Var;
        this.$conversation = conversationRecord;
        this.$trigger = p12Var;
        this.$toFolder = w47Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new j02(this.this$0, this.$conversation, this.$trigger, this.$toFolder, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(h4a<dnf> h4aVar, lu2<? super j6g> lu2Var) {
        return ((j02) create(h4aVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            h02 h02Var = this.this$0;
            ConversationRecord conversationRecord = this.$conversation;
            p12 p12Var = this.$trigger;
            w47 w47Var = this.$toFolder;
            this.label = 1;
            Object objA = h02Var.a(conversationRecord, p12Var, w47Var, this);
            g13 g13Var = g13.a;
            if (objA == g13Var) {
                return g13Var;
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
