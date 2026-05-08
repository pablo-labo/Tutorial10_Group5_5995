package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.inbox.components.ConversationListKt$ConversationListItem$3$1", f = "ConversationList.kt", l = {275}, m = "invokeSuspend")
public final class yx2 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ v1f $dismissState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx2(v1f v1fVar, lu2<? super yx2> lu2Var) {
        super(2, lu2Var);
        this.$dismissState = v1fVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new yx2(this.$dismissState, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((yx2) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            v1f v1fVar = this.$dismissState;
            this.label = 1;
            Object objA = v1fVar.a(this);
            g13 g13Var = g13.a;
            if (objA == g13Var) {
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
