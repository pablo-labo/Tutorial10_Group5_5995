package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {440, 448}, m = "checkInvalidatedTables")
public final class auf extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ztf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auf(ztf ztfVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = ztfVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ztf.a(this.this$0, null, this);
    }
}
