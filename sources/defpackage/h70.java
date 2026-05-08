package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", l = {688, 720}, m = "applyToFling-BMRW4eQ")
public final class h70 extends pu2 {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h70(i70 i70Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = i70Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0L, null, this);
    }
}
