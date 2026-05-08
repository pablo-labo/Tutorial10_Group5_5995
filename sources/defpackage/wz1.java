package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", l = {219}, m = "textInputSession")
public final class wz1 extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b02 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz1(b02 b02Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = b02Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        this.this$0.a(null, null, this);
        return g13.a;
    }
}
