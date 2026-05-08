package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {370}, m = "snapElevation")
public final class ji5 extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ki5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji5(ki5 ki5Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = ki5Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
