package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c40 extends mj8 implements gu5<j6g> {
    final /* synthetic */ Object $targetValue;
    final /* synthetic */ q30<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(q30<Object> q30Var, Object obj) {
        super(0);
        this.this$0 = q30Var;
        this.$targetValue = obj;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        q30<Object> q30Var = this.this$0;
        t30 t30Var = q30Var.o;
        Object obj = this.$targetValue;
        float f = q30Var.e().f(obj);
        if (!Float.isNaN(f)) {
            t30Var.a(f, 0.0f);
            q30Var.i(null);
        }
        q30Var.h(obj);
        return j6g.a;
    }
}
