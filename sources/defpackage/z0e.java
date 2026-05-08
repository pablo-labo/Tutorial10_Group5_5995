package defpackage;

import defpackage.sp7;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationScreenKt$InternalSelectedConversationScreen$10$4$2$1$1", f = "SelectedConversationScreen.kt", l = {}, m = "invokeSuspend")
public final class z0e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new z0e(2, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((z0e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        ((tp7) cr8.p(tp7.class)).b(new sp7.f(2, "messagingFailedToLoad", null, new tr(10)));
        return j6g.a;
    }
}
