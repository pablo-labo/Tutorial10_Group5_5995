package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.inbox.InboxScreenKt$InternalInboxScreen$onConversationLongPressed$1$1$1", f = "InboxScreen.kt", l = {191}, m = "invokeSuspend")
public final class t57 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ hee $bottomSheetState;
    final /* synthetic */ g4a<v47> $bottomSheetType$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t57(hee heeVar, g4a<v47> g4aVar, lu2<? super t57> lu2Var) {
        super(2, lu2Var);
        this.$bottomSheetState = heeVar;
        this.$bottomSheetType$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new t57(this.$bottomSheetState, this.$bottomSheetType$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((t57) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            this.$bottomSheetType$delegate.setValue(v47.b);
            hee heeVar = this.$bottomSheetState;
            this.label = 1;
            Object objE = heeVar.e(this);
            g13 g13Var = g13.a;
            if (objE == g13Var) {
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
