package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ba0 extends mj8 implements gu5<ga0> {
    final /* synthetic */ String $sql;
    final /* synthetic */ z90 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba0(z90 z90Var, String str) {
        super(0);
        this.this$0 = z90Var;
        this.$sql = str;
    }

    @Override // defpackage.gu5
    public final ga0 invoke() {
        return new e90(this.this$0.h().O0(this.$sql));
    }
}
