package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.domain.ChangeConversationFolderUseCase", f = "ChangeConversationFolderUseCase.kt", l = {80}, m = "invoke")
public final class i02 extends pu2 {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h02 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i02(h02 h02Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = h02Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, this);
    }
}
