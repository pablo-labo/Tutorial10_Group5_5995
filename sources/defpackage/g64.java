package defpackage;

import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class g64 implements f64 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public g64(h64 h64Var) {
        oq oqVar = new oq(h64Var, 5);
        qt8 qt8Var = qt8.a;
        this.a = boa.E(qt8Var, oqVar);
        this.b = boa.E(qt8Var, new mr(3, this, h64Var));
        this.c = boa.E(qt8Var, new qq(h64Var, 7));
        this.d = boa.E(qt8Var, new gq0(4, this, h64Var));
        this.e = boa.E(qt8Var, new a1(h64Var, this));
        this.f = boa.E(qt8Var, new pi(3, this, h64Var));
    }

    @Override // defpackage.f64
    public final po1 a() {
        return (po1) this.d.getValue();
    }

    @Override // defpackage.f64
    public final po1 b() {
        return (po1) this.b.getValue();
    }

    @Override // defpackage.f64
    public final g47<String, po1> c() {
        Object value = this.f.getValue();
        value.getClass();
        return (g47) value;
    }
}
