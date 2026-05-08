package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationNavGraphKt$SelectedConversationNavGraph$2$1", f = "SelectedConversationNavGraph.kt", l = {}, m = "invokeSuspend")
public final class l0e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $initiateToken;
    final /* synthetic */ Function1<String, j6g> $onNavigateToConversation;
    final /* synthetic */ Function1<w47, j6g> $onNavigateToInbox;
    final /* synthetic */ y1e $selectedConversationViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0e(String str, y1e y1eVar, Function1<? super String, j6g> function1, Function1<? super w47, j6g> function12, lu2<? super l0e> lu2Var) {
        super(2, lu2Var);
        this.$initiateToken = str;
        this.$selectedConversationViewModel = y1eVar;
        this.$onNavigateToConversation = function1;
        this.$onNavigateToInbox = function12;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new l0e(this.$initiateToken, this.$selectedConversationViewModel, this.$onNavigateToConversation, this.$onNavigateToInbox, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((l0e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        String str = this.$initiateToken;
        if (str != null) {
            y1e y1eVar = this.$selectedConversationViewModel;
            Function1<String, j6g> function1 = this.$onNavigateToConversation;
            td6 td6Var = new td6(this.$onNavigateToInbox, 1);
            y1eVar.getClass();
            function1.getClass();
            u63.Y(ee3.p(y1eVar), null, null, new z1e(y1eVar, str, function1, td6Var, null), 3);
        }
        return j6g.a;
    }
}
