package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.linecorp.linesdk.openchat.ui.OpenChatInfoViewModel", f = "OpenChatInfoViewModel.kt", l = {93}, m = "checkAgreementStatusAsync")
public final class bua extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ gua this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bua(gua guaVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = guaVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return gua.g(this.this$0, this);
    }
}
