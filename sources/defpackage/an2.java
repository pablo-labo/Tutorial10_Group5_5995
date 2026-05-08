package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "expo.modules.imagepicker.exporters.CompressionImageExporter", f = "CompressionImageExporter.kt", l = {52}, m = "readBitmap")
public final class an2 extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bn2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an2(bn2 bn2Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = bn2Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
