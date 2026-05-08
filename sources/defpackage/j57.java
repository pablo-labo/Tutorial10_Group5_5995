package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationWithDraft;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.inbox.InboxScreenKt$InboxScreen$3$1", f = "InboxScreen.kt", l = {}, m = "invokeSuspend")
public final class j57 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ kta $onlineStatusViewModel;
    final /* synthetic */ ese<t67> $uiState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j57(lu2 lu2Var, kta ktaVar, ese eseVar) {
        super(2, lu2Var);
        this.$onlineStatusViewModel = ktaVar;
        this.$uiState$delegate = eseVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new j57(lu2Var, this.$onlineStatusViewModel, this.$uiState$delegate);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((j57) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if (wl7.b(this.$uiState$delegate.getValue().a, Boolean.FALSE)) {
            kta ktaVar = this.$onlineStatusViewModel;
            List<ConversationWithDraft> list = this.$uiState$delegate.getValue().d;
            ArrayList arrayList = new ArrayList(t92.r0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ConversationWithDraft) it.next()).getConversation());
            }
            ktaVar.g(arrayList);
        }
        return j6g.a;
    }
}
