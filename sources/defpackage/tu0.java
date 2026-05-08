package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {314}, m = "loadWithTimeoutOrNull$ui_text")
public final class tu0 extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ vu0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu0(vu0 vu0Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = vu0Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.n(null, this);
    }
}
