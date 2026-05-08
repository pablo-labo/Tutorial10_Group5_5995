package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aa0 extends mj8 implements gu5<sze> {
    final /* synthetic */ sze $database;
    final /* synthetic */ z90 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(z90 z90Var, sze szeVar) {
        super(0);
        this.this$0 = z90Var;
        this.$database = szeVar;
    }

    @Override // defpackage.gu5
    public final sze invoke() {
        sze writableDatabase;
        tze tzeVar = this.this$0.a;
        if (tzeVar != null && (writableDatabase = tzeVar.getWritableDatabase()) != null) {
            return writableDatabase;
        }
        sze szeVar = this.$database;
        szeVar.getClass();
        return szeVar;
    }
}
