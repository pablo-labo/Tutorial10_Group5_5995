package defpackage;

import defpackage.ere;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class y52 {
    public static final Set<a62> c;
    public final g04 a;
    public final on9 b;

    public static final class a {
        public final a62 a;
        public final o52 b;

        public a(a62 a62Var, o52 o52Var) {
            a62Var.getClass();
            this.a = a62Var;
            this.b = o52Var;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return wl7.b(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    static {
        mq5 mq5VarG = ere.a.c.g();
        c = pi3.k(new a62(mq5VarG.b(), mq5VarG.a.f()));
    }

    public y52(g04 g04Var) {
        this.a = g04Var;
        this.b = g04Var.a.d(new x52(this, 0));
    }
}
