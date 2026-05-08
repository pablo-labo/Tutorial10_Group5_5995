package defpackage;

import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.xz8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.components.EventListKt$EventList$4$1", f = "EventList.kt", l = {}, m = "invokeSuspend")
public final class ty4 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ at8<EventRecord> $lazyMessages;
    final /* synthetic */ gu5<j6g> $onReachingBottom;
    final /* synthetic */ x1e $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty4(at8<EventRecord> at8Var, x1e x1eVar, gu5<j6g> gu5Var, lu2<? super ty4> lu2Var) {
        super(2, lu2Var);
        this.$lazyMessages = at8Var;
        this.$uiState = x1eVar;
        this.$onReachingBottom = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ty4(this.$lazyMessages, this.$uiState, this.$onReachingBottom, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ty4) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if ((this.$lazyMessages.c().a instanceof xz8.c) && this.$uiState.a.isExisting()) {
            this.$onReachingBottom.invoke();
        }
        return j6g.a;
    }
}
