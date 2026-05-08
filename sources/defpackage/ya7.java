package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ya7 implements c9c<a> {
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
        public final String b;
        public final List<String> c;

        public b(d dVar, String str, List<String> list) {
            this.a = dVar;
            this.b = str;
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
            return wl7.b(this.a, bVar.a) && this.b.equals(bVar.b) && wl7.b(this.c, bVar.c);
        }

        public final int hashCode() {
            d dVar = this.a;
            int iD = akb.d((dVar == null ? 0 : dVar.a.hashCode()) * 31, 31, this.b);
            List<String> list = this.c;
            return iD + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InferredApplicationStatus(job=");
            sb.append(this.a);
            sb.append(", replyLikelihoodAdjusted=");
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

    public ya7(wb7 wb7Var) {
        this.a = wb7Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        ab7 ab7Var = ab7.a;
        ha.g gVar = ha.a;
        return new ena(ab7Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query InferredApplicationStatusForEmployerReplyLikelihoodForGrp4($input: InferredApplicationStatusForJobsInput!) { inferredApplicationStatusForJobs(input: $input) { inferredApplicationStatus { job { key } replyLikelihoodAdjusted applicationInsights } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = e9c.h;
        snaVar.getClass();
        List<vd2> list = za7.d;
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
        return (obj instanceof ya7) && this.a.equals(((ya7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "e26544fbd6c533d77ca575f8480176b47893872e6d1ddc12309dd9894266afd0";
    }

    @Override // defpackage.pua
    public final String name() {
        return "InferredApplicationStatusForEmployerReplyLikelihoodForGrp4";
    }

    public final String toString() {
        return "InferredApplicationStatusForEmployerReplyLikelihoodForGrp4Query(input=" + this.a + ")";
    }
}
