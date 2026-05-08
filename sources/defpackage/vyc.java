package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", l = {296}, m = "scrollBy")
public final class vyc extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ wyc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyc(wyc wycVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = wycVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0.0f, this);
    }
}
