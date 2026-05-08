package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.o12;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$onArchiveRestoreClicked$1", f = "SelectedConversationViewModel.kt", l = {465}, m = "invokeSuspend")
public final class d2e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $onNavigateToInbox;
    final /* synthetic */ gu5<j6g> $onNavigateToSelectedConversation;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ y1e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2e(y1e y1eVar, gu5<j6g> gu5Var, gu5<j6g> gu5Var2, lu2<? super d2e> lu2Var) {
        super(2, lu2Var);
        this.this$0 = y1eVar;
        this.$onNavigateToInbox = gu5Var;
        this.$onNavigateToSelectedConversation = gu5Var2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new d2e(this.this$0, this.$onNavigateToInbox, this.$onNavigateToSelectedConversation, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((d2e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        gu5<j6g> gu5Var;
        gu5<j6g> gu5Var2;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            ConversationRecord conversationRecord = ((x1e) this.this$0.d0.getValue()).a;
            if (conversationRecord != null) {
                y1e y1eVar = this.this$0;
                gu5<j6g> gu5Var3 = this.$onNavigateToInbox;
                gu5<j6g> gu5Var4 = this.$onNavigateToSelectedConversation;
                h02 h02Var = y1eVar.d;
                this.L$0 = gu5Var3;
                this.L$1 = gu5Var4;
                this.L$2 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = h02Var.a(conversationRecord, p12.c, null, this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
                gu5Var = gu5Var3;
                gu5Var2 = gu5Var4;
            }
            return j6g.a;
        }
        if (i != 1) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        gu5Var2 = (gu5) this.L$1;
        gu5Var = (gu5) this.L$0;
        r7d.b(obj);
        o12 o12Var = (o12) obj;
        if (o12Var instanceof o12.b) {
            if (((o12.b) o12Var).a != w47.INBOX) {
                gu5Var.invoke();
            } else {
                gu5Var2.invoke();
            }
        }
        return j6g.a;
    }
}
