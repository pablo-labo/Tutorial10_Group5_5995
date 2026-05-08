package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {412}, m = "runCached")
public final class zv0 extends pu2 {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ yv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv0(yv0 yv0Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = yv0Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, null, this);
    }
}
