package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qv0 {
    public final Object a;
    public final jv0 b;
    public final m17 c;

    public qv0(Object obj, jv0 jv0Var, m17 m17Var) {
        this.a = obj;
        this.b = jv0Var;
        this.c = m17Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv0)) {
            return false;
        }
        qv0 qv0Var = (qv0) obj;
        jv0 jv0Var = qv0Var.b;
        jv0 jv0Var2 = this.b;
        return wl7.b(jv0Var2, jv0Var) && jv0Var2.b(this.a, qv0Var.a) && wl7.b(this.c, qv0Var.c);
    }

    public final int hashCode() {
        jv0 jv0Var = this.b;
        return this.c.hashCode() + ((jv0Var.a(this.a) + (jv0Var.hashCode() * 31)) * 31);
    }
}
