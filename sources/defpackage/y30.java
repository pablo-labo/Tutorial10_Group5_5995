package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y30 implements xa4 {
    public final a a;
    public final /* synthetic */ q30<Object> b;

    public static final class a implements na4 {
        public final /* synthetic */ q30<Object> a;

        public a(q30<Object> q30Var) {
            this.a = q30Var;
        }

        @Override // defpackage.na4
        public final void a(float f) {
            q30<Object> q30Var = this.a;
            q30Var.o.a(q30Var.f(f), 0.0f);
        }
    }

    public y30(q30<Object> q30Var) {
        this.b = q30Var;
        this.a = new a(q30Var);
    }

    @Override // defpackage.xa4
    public final Object a(va4 va4Var, ia4 ia4Var) {
        Object objA = this.b.a(n4a.b, new w30(this, va4Var, null), ia4Var);
        return objA == g13.a ? objA : j6g.a;
    }
}
