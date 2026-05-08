package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.imagepicker.MediaHandler", f = "MediaHandler.kt", l = {28, 29}, m = "readExtras$expo_image_picker_release")
public final class hj9 extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ej9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj9(ej9 ej9Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = ej9Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, null, this);
    }
}
