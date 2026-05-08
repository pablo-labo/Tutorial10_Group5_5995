package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w83 implements c9c<b> {
    public final x83 a;

    public static final class a {
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
            return cVar.hashCode();
        }

        public final String toString() {
            return "CurrentJobSeekerResponsiveness(responsiveness=" + this.a + ")";
        }
    }

    public static final class b implements c9c.a {
        public final a a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public final String toString() {
            return "Data(currentJobSeekerResponsiveness=" + this.a + ")";
        }
    }

    public static final class c {
        public final Double a;
        public final int b;
        public final int c;

        public c(Double d, int i, int i2) {
            this.a = d;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            Double d = this.a;
            return Integer.hashCode(this.c) + w40.c(this.b, (d == null ? 0 : d.hashCode()) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Responsiveness(messagingResponseRate=");
            sb.append(this.a);
            sb.append(", outreachesReceivedCount=");
            sb.append(this.b);
            sb.append(", outreachesRespondedCount=");
            return w20.k(sb, this.c, ")");
        }
    }

    public w83(x83 x83Var) {
        this.a = x83Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        b93 b93Var = b93.a;
        ha.g gVar = ha.a;
        return new ena(b93Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query CurrentJobSeekerResponsivenessQuery($input: CurrentJobSeekerResponsivenessQueryInput!) { currentJobSeekerResponsiveness(input: $input) { responsiveness { messagingResponseRate outreachesReceivedCount outreachesRespondedCount } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = g9c.b;
        snaVar.getClass();
        List<vd2> list = z83.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        ha.g gVar = ha.a;
        hc8Var.j();
        y83.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w83) && this.a.equals(((w83) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "a44a37bc56b8132bb0567c243bb982c14e6361145d61acbbb5e715de7dc01cd3";
    }

    @Override // defpackage.pua
    public final String name() {
        return "CurrentJobSeekerResponsivenessQuery";
    }

    public final String toString() {
        return "CurrentJobSeekerResponsivenessQuery(input=" + this.a + ")";
    }
}
