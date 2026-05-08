package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager", f = "TextFieldSelectionManager.kt", l = {783}, m = "notifyPlatformSelectionBehaviorsOnShowContextMenu")
public final class sgf extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ rgf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgf(rgf rgfVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = rgfVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return rgf.b(this.this$0, this);
    }
}
