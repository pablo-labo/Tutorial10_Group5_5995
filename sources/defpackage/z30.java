package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z30 implements xa4 {
    public final a a;
    public final /* synthetic */ d40<Object> b;

    public static final class a implements na4 {
        public final /* synthetic */ d40<Object> a;

        public a(d40<Object> d40Var) {
            this.a = d40Var;
        }

        @Override // defpackage.na4
        public final void a(float f) {
            d40<Object> d40Var = this.a;
            d40Var.n.a(d40Var.f(f), 0.0f);
        }
    }

    public z30(d40<Object> d40Var) {
        this.b = d40Var;
        this.a = new a(d40Var);
    }

    @Override // defpackage.xa4
    public final Object a(va4 va4Var, ia4 ia4Var) {
        Object objA = this.b.a(n4a.b, new x30(this, va4Var, null), ia4Var);
        return objA == g13.a ? objA : j6g.a;
    }
}
