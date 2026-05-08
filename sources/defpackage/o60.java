package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", l = {187, 196}, m = "boundsUpdatesEventLoop$ui_release")
public final class o60 extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m60 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o60(m60 m60Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = m60Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
