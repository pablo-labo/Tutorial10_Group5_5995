package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel", f = "SelectedConversationViewModel.kt", l = {548}, m = "loadAiMessagingSuggestions")
public final class a2e extends pu2 {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ y1e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2e(y1e y1eVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = y1eVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return y1e.g(this.this$0, null, this);
    }
}
