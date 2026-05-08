package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kb7 implements c9c<a> {
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
        public final List<String> c;

        public b(d dVar, boolean z, List<String> list) {
            this.a = dVar;
            this.b = z;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && this.b == bVar.b && wl7.b(this.c, bVar.c);
        }

        public final int hashCode() {
            d dVar = this.a;
            int iF = ia.f((dVar == null ? 0 : dVar.a.hashCode()) * 31, 31, this.b);
            List<String> list = this.c;
            return iF + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InferredApplicationStatus(job=");
            sb.append(this.a);
            sb.append(", employerStartedReview=");
            sb.append(this.b);
            sb.append(", applicationInsights=");
            return g7.i(sb, this.c, ")");
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

    public kb7(wb7 wb7Var) {
        this.a = wb7Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        mb7 mb7Var = mb7.a;
        ha.g gVar = ha.a;
        return new ena(mb7Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query InferredApplicationStatusForEmployerStartedReview($input: InferredApplicationStatusForJobsInput!) { inferredApplicationStatusForJobs(input: $input) { inferredApplicationStatus { job { key } employerStartedReview applicationInsights } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = e9c.h;
        snaVar.getClass();
        List<vd2> list = lb7.d;
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
        return (obj instanceof kb7) && this.a.equals(((kb7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "b109f14e2dc6c6fcd17411fed18f77a01e389d112293acc1e86e8b1b5f800286";
    }

    @Override // defpackage.pua
    public final String name() {
        return "InferredApplicationStatusForEmployerStartedReview";
    }

    public final String toString() {
        return "InferredApplicationStatusForEmployerStartedReviewQuery(input=" + this.a + ")";
    }
}
