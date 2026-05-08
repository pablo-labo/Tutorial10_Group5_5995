package defpackage;

import defpackage.sp7;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.inbox.InboxScreenTareKt$InternalInboxScreenTare$1$5$4$1", f = "InboxScreenTare.kt", l = {}, m = "invokeSuspend")
public final class o67 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ t67 $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o67(t67 t67Var, lu2<? super o67> lu2Var) {
        super(2, lu2Var);
        this.$uiState = t67Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new o67(this.$uiState, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((o67) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        String str;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        w47 w47Var = this.$uiState.e;
        w47Var.getClass();
        tp7 tp7Var = (tp7) cr8.p(tp7.class);
        int iOrdinal = w47Var.ordinal();
        if (iOrdinal == 0) {
            str = "messagingEmptyInbox";
        } else if (iOrdinal == 1) {
            str = "messagingEmptyArchive";
        } else if (iOrdinal == 2) {
            str = "messagingEmptySpam";
        } else {
            if (iOrdinal != 3) {
                l.g();
                return null;
            }
            str = "messagingEmptyDrafts";
        }
        tp7Var.b(new sp7.f(6, str, null, null));
        return j6g.a;
    }
}
