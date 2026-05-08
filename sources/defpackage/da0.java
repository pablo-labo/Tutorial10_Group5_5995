package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class da0 extends mj8 implements gu5<ga0> {
    final /* synthetic */ int $parameters;
    final /* synthetic */ String $sql;
    final /* synthetic */ z90 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da0(String str, z90 z90Var, int i) {
        super(0);
        this.$sql = str;
        this.this$0 = z90Var;
        this.$parameters = i;
    }

    @Override // defpackage.gu5
    public final ga0 invoke() {
        String str = this.$sql;
        sze szeVarH = this.this$0.h();
        int i = this.$parameters;
        this.this$0.getClass();
        return new h90(str, szeVarH, i);
    }
}
