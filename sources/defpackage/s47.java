package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.inbox.components.InboxBottomSheetKt$InboxBottomSheet$2$1", f = "InboxBottomSheet.kt", l = {}, m = "invokeSuspend")
public final class s47 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ hee $bottomSheetState;
    final /* synthetic */ v47 $bottomSheetType;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s47(hee heeVar, v47 v47Var, lu2<? super s47> lu2Var) {
        super(2, lu2Var);
        this.$bottomSheetState = heeVar;
        this.$bottomSheetType = v47Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new s47(this.$bottomSheetState, this.$bottomSheetType, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((s47) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if (this.$bottomSheetState.c()) {
            int iOrdinal = this.$bottomSheetType.ordinal();
            if (iOrdinal == 0) {
                q6.n("messagingArchiveSpamFilterBanner", null, null, 6, (tp7) cr8.p(tp7.class));
            } else if (iOrdinal != 1) {
                l.g();
                return null;
            }
        }
        return j6g.a;
    }
}
