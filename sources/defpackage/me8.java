package defpackage;

import defpackage.ere;

/* JADX INFO: loaded from: classes3.dex */
public final class me8 extends up2<a> {

    public static abstract class a {

        /* JADX INFO: renamed from: me8$a$a, reason: collision with other inner class name */
        public static final class C0318a extends a {
            public final ui8 a;

            public C0318a(ui8 ui8Var) {
                this.a = ui8Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0318a) && wl7.b(this.a, ((C0318a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "LocalClass(type=" + this.a + ')';
            }
        }

        public static final class b extends a {
            public final d62 a;

            public b(d62 d62Var) {
                this.a = d62Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "NormalClass(value=" + this.a + ')';
            }
        }
    }

    public me8(a62 a62Var, int i) {
        super(new a.b(new d62(a62Var, i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.up2
    public final ui8 a(xx9 xx9Var) {
        ui8 ui8VarC;
        xx9Var.getClass();
        gwf.b.getClass();
        gwf gwfVar = gwf.c;
        ei8 ei8VarL = xx9Var.l();
        ei8VarL.getClass();
        t52 t52VarJ = ei8VarL.j(ere.a.Q.g());
        T t = this.a;
        a aVar = (a) t;
        if (aVar instanceof a.C0318a) {
            ui8VarC = ((a.C0318a) t).a;
        } else {
            if (!(aVar instanceof a.b)) {
                l.g();
                return null;
            }
            d62 d62Var = ((a.b) t).a;
            a62 a62Var = d62Var.a;
            int i = d62Var.b;
            t52 t52VarA = rc5.a(xx9Var, a62Var);
            if (t52VarA == null) {
                ui8VarC = lx4.c(kx4.b, a62Var.toString(), String.valueOf(i));
            } else {
                mge mgeVarO = t52VarA.o();
                mgeVarO.getClass();
                p7g p7gVarL = boa.L(mgeVarO);
                for (int i2 = 0; i2 < i; i2++) {
                    p7gVarL = xx9Var.l().h(p7gVarL);
                }
                ui8VarC = p7gVarL;
            }
        }
        return yi8.b(gwfVar, t52VarJ, u63.Z(new yxf(ui8VarC)));
    }
}
