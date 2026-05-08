package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uz3 extends zna<Object> {
    public final /* synthetic */ vz3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz3(Object obj, vz3 vz3Var) {
        super(obj);
        this.b = vz3Var;
    }

    @Override // defpackage.zna
    public final void b(qf8 qf8Var) {
        qf8Var.getClass();
        if (this.b.a) {
            r6.g("Cannot modify readonly DescriptorRendererOptions");
        }
    }
}
