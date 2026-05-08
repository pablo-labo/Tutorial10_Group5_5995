package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", l = {132, 135}, m = "onScrollCaptureImageRequest")
public final class yk2 extends pu2 {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ xk2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk2(xk2 xk2Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = xk2Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return xk2.a(this.this$0, null, null, this);
    }
}
