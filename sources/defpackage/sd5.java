package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sd5 implements c9c<b> {

    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && wl7.b(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return akb.k("Compensation(key=", this.a, ", formattedText=", this.b, ")");
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
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            e eVar = this.a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public final String toString() {
            return "Data(findRelevantJobs=" + this.a + ")";
        }
    }

    public static final class c {
        public final String a;

        public c(String str) {
            this.a = str;
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
            return l5.m("Description(text=", this.a, ")");
        }
    }

    public static final class d {
        public final String a;
        public final q b;

        public d(String str, q qVar) {
            this.a = str;
            this.b = qVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && wl7.b(this.b, dVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            q qVar = this.b;
            return iHashCode + (qVar == null ? 0 : qVar.hashCode());
        }

        public final String toString() {
            return "Employer(key=" + this.a + ", ugcStats=" + this.b + ")";
        }
    }

    public static final class e {
        public final String a;
        public final ArrayList b;

        public e(String str, ArrayList arrayList) {
            this.a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && this.b.equals(eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "FindRelevantJobs(trackingKey=" + this.a + ", results=" + this.b + ")";
        }
    }

    public static final class f {
        public final String a;

        public f(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a.equals(((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("Formatted(short=", this.a, ")");
        }
    }

    public static final class g {
        public final ArrayList a;

        public g(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a.equals(((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("IndeedApply(scopes=", ")", this.a);
        }
    }

    public static final class h {
        public final Object a;

        public h(Object obj) {
            this.a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a.equals(((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return v40.e(this.a, "IndeedJobData(viewJobRedirectClickUrl=", ")");
        }
    }

    public static final class i {
        public final String a;
        public final String b;
        public final d c;
        public final j d;
        public final a e;
        public final g f;
        public final Object g;
        public final c h;

        public i(String str, String str2, d dVar, j jVar, a aVar, g gVar, Object obj, c cVar) {
            this.a = str;
            this.b = str2;
            this.c = dVar;
            this.d = jVar;
            this.e = aVar;
            this.f = gVar;
            this.g = obj;
            this.h = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a.equals(iVar.a) && this.b.equals(iVar.b) && wl7.b(this.c, iVar.c) && this.d.equals(iVar.d) && wl7.b(this.e, iVar.e) && this.f.equals(iVar.f) && this.g.equals(iVar.g) && this.h.equals(iVar.h);
        }

        public final int hashCode() {
            int iD = akb.d(this.a.hashCode() * 31, 31, this.b);
            d dVar = this.c;
            int iHashCode = (this.d.hashCode() + ((iD + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
            a aVar = this.e;
            return this.h.a.hashCode() + ((this.g.hashCode() + z3.d(this.f.a, (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31, 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("Job(title=", this.a, ", sourceEmployerName=", this.b, ", employer=");
            sbF.append(this.c);
            sbF.append(", location=");
            sbF.append(this.d);
            sbF.append(", compensation=");
            sbF.append(this.e);
            sbF.append(", indeedApply=");
            sbF.append(this.f);
            sbF.append(", dateOnIndeed=");
            sbF.append(this.g);
            sbF.append(", description=");
            sbF.append(this.h);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class j {
        public final f a;

        public j(f fVar) {
            this.a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a.equals(((j) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "Location(formatted=" + this.a + ")";
        }
    }

    public static final class k {
        public final String a;
        public final l b;
        public final m c;

        public k(String str, l lVar, m mVar) {
            str.getClass();
            this.a = str;
            this.b = lVar;
            this.c = mVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return wl7.b(this.a, kVar.a) && wl7.b(this.b, kVar.b) && wl7.b(this.c, kVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            l lVar = this.b;
            int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.a.hashCode())) * 31;
            m mVar = this.c;
            return iHashCode2 + (mVar != null ? mVar.hashCode() : 0);
        }

        public final String toString() {
            return "MatchReason(__typename=" + this.a + ", onDefaultRelevantJobsMatchInfo=" + this.b + ", onRecentQueryRelevantJobsMatchInfo=" + this.c + ")";
        }
    }

    public static final class l {
        public final String a;

        public l(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.a.equals(((l) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("OnDefaultRelevantJobsMatchInfo(reason=", this.a, ")");
        }
    }

    public static final class m {
        public final String a;
        public final String b;
        public final String c;

        public m(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return wl7.b(this.a, mVar.a) && wl7.b(this.b, mVar.b) && this.c.equals(mVar.c);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return l6.i(u40.f("OnRecentQueryRelevantJobsMatchInfo(query=", this.a, ", location=", this.b, ", reason="), this.c, ")");
        }
    }

    public static final class n {
        public final Double a;

        public n(Double d) {
            this.a = d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && wl7.b(this.a, ((n) obj).a);
        }

        public final int hashCode() {
            Double d = this.a;
            if (d == null) {
                return 0;
            }
            return d.hashCode();
        }

        public final String toString() {
            return "OverallRating(value=" + this.a + ")";
        }
    }

    public static final class o {
        public final n a;

        public o(n nVar) {
            this.a = nVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && wl7.b(this.a, ((o) obj).a);
        }

        public final int hashCode() {
            n nVar = this.a;
            if (nVar == null) {
                return 0;
            }
            return nVar.hashCode();
        }

        public final String toString() {
            return "Ratings(overallRating=" + this.a + ")";
        }
    }

    public static final class p {
        public final k a;
        public final i b;
        public final h c;

        public p(k kVar, i iVar, h hVar) {
            this.a = kVar;
            this.b = iVar;
            this.c = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.a.equals(pVar.a) && this.b.equals(pVar.b) && wl7.b(this.c, pVar.c);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            h hVar = this.c;
            return iHashCode + (hVar == null ? 0 : hVar.a.hashCode());
        }

        public final String toString() {
            return "Result(matchReason=" + this.a + ", job=" + this.b + ", indeedJobData=" + this.c + ")";
        }
    }

    public static final class q {
        public final o a;

        public q(o oVar) {
            this.a = oVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && wl7.b(this.a, ((q) obj).a);
        }

        public final int hashCode() {
            o oVar = this.a;
            if (oVar == null) {
                return 0;
            }
            return oVar.hashCode();
        }

        public final String toString() {
            return "UgcStats(ratings=" + this.a + ")";
        }
    }

    @Override // defpackage.g15
    public final ena a() {
        vd5 vd5Var = vd5.a;
        ha.g gVar = ha.a;
        return new ena(vd5Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query findRelevantJobs { findRelevantJobs(input: { limit: 5 context: \"androidWidget\" } ) { trackingKey results { matchReason { __typename ... on DefaultRelevantJobsMatchInfo { reason } ... on RecentQueryRelevantJobsMatchInfo { query location reason } } job { title sourceEmployerName employer { key ugcStats { ratings { overallRating { value } } } } location { formatted { short } } compensation { key formattedText } indeedApply { scopes } dateOnIndeed description { text } } indeedJobData { viewJobRedirectClickUrl } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = h9c.j;
        snaVar.getClass();
        List<vd2> list = td5.q;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == sd5.class;
    }

    public final int hashCode() {
        return fwc.a.b(sd5.class).hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "fe4949ece63b07df3873de51d04e07f5e68ec154e92863def9c8d72825025da5";
    }

    @Override // defpackage.pua
    public final String name() {
        return "findRelevantJobs";
    }
}
