package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qi1 extends zna<Object> {
    public final /* synthetic */ ri1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi1(ri1 ri1Var) {
        super(cj1.b);
        this.b = ri1Var;
    }

    @Override // defpackage.zna
    public final void a(qf8<?> qf8Var, Object obj, Object obj2) {
        qf8Var.getClass();
        if (wl7.b(obj, obj2)) {
            return;
        }
        ri1 ri1Var = this.b;
        ri1Var.m = true;
        ri1Var.invalidateSelf();
    }
}
