package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.inbox.InboxScreenKt$InternalInboxScreen$hideBottomSheet$1", f = "InboxScreen.kt", l = {196}, m = "invokeSuspend")
public final class s57 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ hee $bottomSheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s57(hee heeVar, lu2<? super s57> lu2Var) {
        super(2, lu2Var);
        this.$bottomSheetState = heeVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new s57(this.$bottomSheetState, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((s57) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            hee heeVar = this.$bottomSheetState;
            this.label = 1;
            Object objB = heeVar.b(this);
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
        return j6g.a;
    }
}
