package defpackage;

import defpackage.a02;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", l = {230}, m = "startInputMethod")
public final class xz1 extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a02.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz1(a02.a aVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = aVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        this.this$0.c(null, this);
        return g13.a;
    }
}
