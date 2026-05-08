package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", l = {71}, m = "startInputMethod")
public final class q80 extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ u80 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q80(u80 u80Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = u80Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        this.this$0.c(null, this);
        return g13.a;
    }
}
