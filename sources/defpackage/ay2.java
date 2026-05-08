package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.inbox.components.ConversationListKt$LazyLoadSpinner$2$1", f = "ConversationList.kt", l = {}, m = "invokeSuspend")
public final class ay2 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $onLastItemLoadNextPage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay2(gu5<j6g> gu5Var, lu2<? super ay2> lu2Var) {
        super(2, lu2Var);
        this.$onLastItemLoadNextPage = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ay2(this.$onLastItemLoadNextPage, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ay2) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.$onLastItemLoadNextPage.invoke();
        return j6g.a;
    }
}
