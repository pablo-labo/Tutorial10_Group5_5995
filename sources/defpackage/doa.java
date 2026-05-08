package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.ObservedTableVersions", f = "InvalidationTracker.kt", l = {602}, m = "collect")
public final class doa extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ eoa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doa(eoa eoaVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = eoaVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        this.this$0.a(null, this);
        return g13.a;
    }
}
