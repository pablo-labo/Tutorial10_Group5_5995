package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", l = {56}, m = "waitForFirstLayout")
public final class h61 extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i61 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h61(i61 i61Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = i61Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
