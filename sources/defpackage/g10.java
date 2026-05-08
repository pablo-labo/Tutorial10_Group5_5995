package defpackage;

import com.indeed.android.messaging.data.conversations.model.SuggestedMessageModel;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.components.AiMessagingSuggestionBottomSheetKt$AiMessagingSuggestionBottomSheetMain$2$2$3$1", f = "AiMessagingSuggestionBottomSheet.kt", l = {}, m = "invokeSuspend")
public final class g10 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ SuggestedMessageModel $message;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g10(SuggestedMessageModel suggestedMessageModel, lu2<? super g10> lu2Var) {
        super(2, lu2Var);
        this.$message = suggestedMessageModel;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new g10(this.$message, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((g10) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        final String messageBody = this.$message.getMessageBody();
        final String trackingKey = this.$message.getTrackingKey();
        if (trackingKey == null) {
            trackingKey = "";
        }
        final int displayIndex = this.$message.getDisplayIndex();
        messageBody.getClass();
        ((tp7) cr8.p(tp7.class)).b(new sp7.c("messagingAssistedResultsSheet", "messagingAssistedSuggestion", sp7.c.a.b, null, new Function1() { // from class: tq9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                hr7 hr7Var = (hr7) obj2;
                hr7Var.getClass();
                hr7Var.a("messagingSuggestionContent", messageBody);
                hr7Var.a("messagingAssistedMessageTrackingKey", trackingKey);
                hr7Var.c(Integer.valueOf(displayIndex), "messagingAssistedMessageDisplayIndex");
                return j6g.a;
            }
        }, 8));
        return j6g.a;
    }
}
