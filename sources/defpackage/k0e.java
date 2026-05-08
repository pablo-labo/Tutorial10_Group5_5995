package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationNavGraphKt$SelectedConversationNavGraph$1$1", f = "SelectedConversationNavGraph.kt", l = {}, m = "invokeSuspend")
public final class k0e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $conversationId;
    final /* synthetic */ boolean $isFromDeepLink;
    final /* synthetic */ y1e $selectedConversationViewModel;
    final /* synthetic */ String $sessionSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0e(lu2 lu2Var, y1e y1eVar, String str, String str2, boolean z) {
        super(2, lu2Var);
        this.$conversationId = str;
        this.$selectedConversationViewModel = y1eVar;
        this.$isFromDeepLink = z;
        this.$sessionSource = str2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        String str = this.$conversationId;
        return new k0e(lu2Var, this.$selectedConversationViewModel, str, this.$sessionSource, this.$isFromDeepLink);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((k0e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        String str = this.$conversationId;
        if (str != null) {
            this.$selectedConversationViewModel.i(str, this.$sessionSource, this.$isFromDeepLink);
        }
        return j6g.a;
    }
}
