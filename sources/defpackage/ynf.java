package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ynf implements c9c<a> {
    public final wnf a;

    public static final class a implements c9c.a {
        public final c a;

        public a(c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.a.hashCode();
        }

        public final String toString() {
            return "Data(topChoicesAfterDate=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final String b;
        public final Object c;

        public b(Object obj, String str, String str2) {
            this.a = str;
            this.b = str2;
            this.c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("TopChoice(jobKey=", this.a, ", jobSeekerAccountKey=", this.b, ", timestamp=");
            sbF.append(this.c);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class c {
        public final ArrayList a;

        public c(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("TopChoicesAfterDate(topChoices=", ")", this.a);
        }
    }

    public ynf(wnf wnfVar) {
        this.a = wnfVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        aof aofVar = aof.a;
        ha.g gVar = ha.a;
        return new ena(aofVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query TopChoices($input: TopChoicesAfterDateInput!) { topChoicesAfterDate(input: $input) { topChoices { jobKey jobSeekerAccountKey timestamp } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = h9c.j;
        snaVar.getClass();
        List<vd2> list = znf.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        jl jlVar = jl.d;
        ha.g gVar = ha.a;
        hc8Var.j();
        jlVar.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ynf) && this.a.equals(((ynf) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "00990c10aca0d84d1872aea23179b0ad5b230860a00125b72ba5411f053b4394";
    }

    @Override // defpackage.pua
    public final String name() {
        return "TopChoices";
    }

    public final String toString() {
        return "TopChoicesQuery(input=" + this.a + ")";
    }
}
