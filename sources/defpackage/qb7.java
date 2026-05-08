package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qb7 implements c9c<a> {
    public final wb7 a;

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
            return "Data(inferredApplicationStatusForJobs=" + this.a + ")";
        }
    }

    public static final class b {
        public final d a;
        public final boolean b;
        public final String c;
        public final List<String> d;

        public b(d dVar, boolean z, String str, List<String> list) {
            this.a = dVar;
            this.b = z;
            this.c = str;
            this.d = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && this.b == bVar.b && this.c.equals(bVar.c) && wl7.b(this.d, bVar.d);
        }

        public final int hashCode() {
            d dVar = this.a;
            int iD = akb.d(ia.f((dVar == null ? 0 : dVar.a.hashCode()) * 31, 31, this.b), 31, this.c);
            List<String> list = this.d;
            return iD + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return "InferredApplicationStatus(job=" + this.a + ", employerStartedReview=" + this.b + ", replyLikelihoodAdjusted=" + this.c + ", applicationInsights=" + this.d + ")";
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
            return m6.g("InferredApplicationStatusForJobs(inferredApplicationStatus=", ")", this.a);
        }
    }

    public static final class d {
        public final String a;

        public d(String str) {
            this.a = str;
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
            return l5.m("Job(key=", this.a, ")");
        }
    }

    public qb7(wb7 wb7Var) {
        this.a = wb7Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        sb7 sb7Var = sb7.a;
        ha.g gVar = ha.a;
        return new ena(sb7Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query InferredApplicationStatusForGhostedApplication($input: InferredApplicationStatusForJobsInput!) { inferredApplicationStatusForJobs(input: $input) { inferredApplicationStatus { job { key } employerStartedReview replyLikelihoodAdjusted applicationInsights } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = e9c.h;
        snaVar.getClass();
        List<vd2> list = rb7.d;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        pv3 pv3Var = pv3.c;
        ha.g gVar = ha.a;
        hc8Var.j();
        pv3Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qb7) && this.a.equals(((qb7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "9e7c84dd513c3c00962378a7e6b8a2b3f831809d3170ab74dcc49485f5d5e44e";
    }

    @Override // defpackage.pua
    public final String name() {
        return "InferredApplicationStatusForGhostedApplication";
    }

    public final String toString() {
        return "InferredApplicationStatusForGhostedApplicationQuery(input=" + this.a + ")";
    }
}
