package defpackage;

import com.indeed.android.messaging.data.conversations.model.SuggestedMessageModel;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.components.AiMessagingSuggestionBottomSheetKt$AiMessagingSuggestionBottomSheetMain$1$1", f = "AiMessagingSuggestionBottomSheet.kt", l = {}, m = "invokeSuspend")
public final class f10 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ g4a<Boolean> $selectSuggestionButtonEnabled$delegate;
    final /* synthetic */ g4a<SuggestedMessageModel> $selectedSuggestedModel$delegate;
    final /* synthetic */ List<SuggestedMessageModel> $suggestedMessages;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f10(lu2 lu2Var, g4a g4aVar, g4a g4aVar2, List list) {
        super(2, lu2Var);
        this.$suggestedMessages = list;
        this.$selectedSuggestedModel$delegate = g4aVar;
        this.$selectSuggestionButtonEnabled$delegate = g4aVar2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new f10(lu2Var, this.$selectedSuggestedModel$delegate, this.$selectSuggestionButtonEnabled$delegate, this.$suggestedMessages);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((f10) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if (this.$suggestedMessages.size() == 1) {
            g4a<SuggestedMessageModel> g4aVar = this.$selectedSuggestedModel$delegate;
            List<SuggestedMessageModel> list = i10.a;
            if (g4aVar.getValue() == null) {
                this.$selectedSuggestedModel$delegate.setValue((SuggestedMessageModel) z92.O0(this.$suggestedMessages));
                this.$selectSuggestionButtonEnabled$delegate.setValue(Boolean.TRUE);
            }
        }
        return j6g.a;
    }
}
