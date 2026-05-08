package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$onRetryFetchSuggestedMessages$1", f = "SelectedConversationViewModel.kt", l = {625}, m = "invokeSuspend")
public final class l2e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $draftForAiMessaging;
    int label;
    final /* synthetic */ y1e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2e(lu2 lu2Var, y1e y1eVar, String str) {
        super(2, lu2Var);
        this.this$0 = y1eVar;
        this.$draftForAiMessaging = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new l2e(lu2Var, this.this$0, this.$draftForAiMessaging);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((l2e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            gse gseVar = this.this$0.c0;
            do {
                value = gseVar.getValue();
            } while (!gseVar.h(value, x1e.a((x1e) value, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, true, 0, null, null, null, null, false, null, 66846719)));
            y1e y1eVar = this.this$0;
            String str = this.$draftForAiMessaging;
            this.label = 1;
            Object objG = y1e.g(y1eVar, str, this);
            g13 g13Var = g13.a;
            if (objG == g13Var) {
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
