package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k90 extends mj8 implements gu5<j6g> {
    final /* synthetic */ l90 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k90(l90 l90Var) {
        super(0);
        this.this$0 = l90Var;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        l90 l90Var = this.this$0;
        ((gme) l90Var.Y).setValue(Boolean.valueOf(!((Boolean) ((gme) l90Var.Y).getValue()).booleanValue()));
        return j6g.a;
    }
}
