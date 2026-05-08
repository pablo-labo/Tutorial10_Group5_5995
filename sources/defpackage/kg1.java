package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {232, 46}, m = "decode")
public final class kg1 extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ig1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg1(ig1 ig1Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = ig1Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
