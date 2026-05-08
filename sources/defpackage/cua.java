package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.linecorp.linesdk.openchat.ui.OpenChatInfoViewModel$checkAgreementStatusAsync$2", f = "OpenChatInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class cua extends c1f implements Function2<e13, lu2<? super ww8<Boolean>>, Object> {
    int label;
    final /* synthetic */ gua this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cua(gua guaVar, lu2<? super cua> lu2Var) {
        super(2, lu2Var);
        this.this$0 = guaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new cua(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super ww8<Boolean>> lu2Var) {
        return ((cua) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            r7d.b(obj);
            return this.this$0.c.a();
        }
        r6.g("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
