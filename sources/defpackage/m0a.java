package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {122}, m = "userScroll")
public final class m0a extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d0a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0a(d0a d0aVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = d0aVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, null, this);
    }
}
