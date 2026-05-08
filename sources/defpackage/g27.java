package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.imagepicker.ImagePickerModule", f = "ImagePickerModule.kt", l = {208, 215, 219}, m = "launchContract")
public final class g27 extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e27 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g27(e27 e27Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = e27Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e27.g(this.this$0, null, null, this);
    }
}
