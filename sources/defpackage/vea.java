package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {199}, m = "dispatchPreFling-QWom1Mo")
public final class vea extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ tea this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vea(tea teaVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = teaVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(0L, this);
    }
}
