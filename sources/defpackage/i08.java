package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i08 implements c9c<a> {

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
            return cVar.hashCode();
        }

        public final String toString() {
            return "Data(jobSeekerProfile=" + this.a + ")";
        }
    }

    public static final class b {
        public final h08 a;

        public b(h08 h08Var) {
            this.a = h08Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            h08 h08Var = this.a;
            if (h08Var == null) {
                return 0;
            }
            return h08Var.hashCode();
        }

        public final String toString() {
            return "JobSeekerPro(status=" + this.a + ")";
        }
    }

    public static final class c {
        public final d a;

        public c(d dVar) {
            this.a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public final String toString() {
            return "JobSeekerProfile(profile=" + this.a + ")";
        }
    }

    public static final class d {
        public final b a;

        public d(b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public final String toString() {
            return "Profile(jobSeekerPro=" + this.a + ")";
        }
    }

    @Override // defpackage.g15
    public final ena a() {
        k08 k08Var = k08.a;
        ha.g gVar = ha.a;
        return new ena(k08Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query JobSeekerProStatus { jobSeekerProfile { profile { jobSeekerPro { status } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = h9c.j;
        snaVar.getClass();
        List<vd2> list = j08.d;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == i08.class;
    }

    public final int hashCode() {
        return fwc.a.b(i08.class).hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "34887a61cea94bae21d8aa2b6143a317082695421688dc6c1a2d9d45070bbb3a";
    }

    @Override // defpackage.pua
    public final String name() {
        return "JobSeekerProStatus";
    }
}
