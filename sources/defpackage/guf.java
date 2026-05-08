package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {342}, m = "stopTrackingTable")
public final class guf extends pu2 {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ztf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public guf(ztf ztfVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = ztfVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ztf.c(this.this$0, null, 0, this);
    }
}
