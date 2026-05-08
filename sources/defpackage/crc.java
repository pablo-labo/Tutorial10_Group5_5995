package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil.RealImageLoader", f = "RealImageLoader.kt", l = {169, 180, 184}, m = "executeMain")
public final class crc extends pu2 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ frc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crc(frc frcVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = frcVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return frc.a(this.this$0, null, 0, this);
    }
}
