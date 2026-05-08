package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil3.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {212, 40}, m = "decode")
public final class jg1 extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ mg1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg1(mg1 mg1Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = mg1Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
