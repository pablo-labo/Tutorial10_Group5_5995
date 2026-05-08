package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {300}, m = "syncTriggers$room_runtime_release")
public final class huf extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ztf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huf(ztf ztfVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = ztfVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(this);
    }
}
