package defpackage;

import com.indeed.android.messaging.data.conversations.model.SuggestedMessageModel;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.components.AiMessagingSuggestionBottomSheetKt$AssistedMessageAnimationItem$1$1", f = "AiMessagingSuggestionBottomSheet.kt", l = {376}, m = "invokeSuspend")
public final class h10 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ int $animationDurationInMillis;
    final /* synthetic */ int $index;
    final /* synthetic */ g4a<Boolean> $startAnimation$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h10(int i, int i2, g4a<Boolean> g4aVar, lu2<? super h10> lu2Var) {
        super(2, lu2Var);
        this.$index = i;
        this.$animationDurationInMillis = i2;
        this.$startAnimation$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new h10(this.$index, this.$animationDurationInMillis, this.$startAnimation$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((h10) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            long j = ((long) this.$index) * ((long) this.$animationDurationInMillis);
            this.label = 1;
            Object objB = ls3.b(j, this);
            g13 g13Var = g13.a;
            if (objB == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        g4a<Boolean> g4aVar = this.$startAnimation$delegate;
        List<SuggestedMessageModel> list = i10.a;
        g4aVar.setValue(Boolean.TRUE);
        return j6g.a;
    }
}
