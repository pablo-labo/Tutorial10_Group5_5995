package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {540}, m = "tryAwaitRelease")
public final class fmb extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ gmb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmb(gmb gmbVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = gmbVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.T(this);
    }
}
