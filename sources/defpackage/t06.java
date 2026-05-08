package defpackage;

import defpackage.c9c;
import defpackage.ha;
import defpackage.hva;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t06 implements c9c<b> {
    public final hva<List<String>> a;

    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("ApplyLink(url=", this.a, ")");
        }
    }

    public static final class b implements c9c.a {
        public final e a;

        public b(e eVar) {
            this.a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "Data(jobData=" + this.a + ")";
        }
    }

    public static final class c {
        public final a a;

        public c(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.a.hashCode();
        }

        public final String toString() {
            return "IndeedApply(applyLink=" + this.a + ")";
        }
    }

    public static final class d {
        public final c a;

        public d(c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Job(indeedApply=" + this.a + ")";
        }
    }

    public static final class e {
        public final ArrayList a;

        public e(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a.equals(((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("JobData(results=", ")", this.a);
        }
    }

    public static final class f {
        public final d a;

        public f(d dVar) {
            this.a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a.equals(((f) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "Result(job=" + this.a + ")";
        }
    }

    public t06(hva hvaVar) {
        or0 or0Var = or0.INDEED;
        hvaVar.getClass();
        this.a = hvaVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        w06 w06Var = w06.a;
        ha.g gVar = ha.a;
        return new ena(w06Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query getIndeedApplyLinks($jobKeys: [ID!], $property: ApplyDomainProperty!) { jobData(jobKeys: $jobKeys) { results { job { indeedApply { applyLink(property: $property) { url } } } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = e9c.h;
        snaVar.getClass();
        List<vd2> list = u06.f;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hva<List<String>> hvaVar = this.a;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("jobKeys");
            hy8 hy8Var = new hy8(ha.a);
            Object obj = ((hva.c) hvaVar).a;
            if (obj == null) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, obj);
            }
        }
        hc8Var.u0("property");
        hc8Var.T0(or0.INDEED.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t06) || !wl7.b(this.a, ((t06) obj).a)) {
            return false;
        }
        or0 or0Var = or0.INDEED;
        return true;
    }

    public final int hashCode() {
        return or0.INDEED.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.pua
    public final String id() {
        return "a2951de38b8fb65dce41638122b7ac8fd5527fabee2694a03fe1239163f1dc86";
    }

    @Override // defpackage.pua
    public final String name() {
        return "getIndeedApplyLinks";
    }

    public final String toString() {
        return "GetIndeedApplyLinksQuery(jobKeys=" + this.a + ", property=" + or0.INDEED + ")";
    }
}
