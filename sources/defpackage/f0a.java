package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {244, 295}, m = "dispatchMouseWheelScroll")
public final class f0a extends pu2 {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d0a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0a(d0a d0aVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = d0aVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d0a.a(this.this$0, null, null, 0.0f, 0.0f, this);
    }
}
