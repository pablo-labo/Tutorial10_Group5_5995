package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil3.decode.StaticImageDecoder", f = "StaticImageDecoder.kt", l = {168}, m = "decode")
public final class ate extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ate(zse zseVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = zseVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
