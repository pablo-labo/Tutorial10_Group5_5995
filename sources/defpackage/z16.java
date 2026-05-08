package defpackage;

import defpackage.c9c;
import defpackage.ha;
import defpackage.hva;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z16 implements c9c<a> {
    public final hva<ey7> a;

    public static final class a implements c9c.a {
        public final c a;

        public a(c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "Data(jobData=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final rx7 b;

        public b(String str, rx7 rx7Var) {
            this.a = str;
            this.b = rx7Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Job(__typename=" + this.a + ", jobData=" + this.b + ")";
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
            return m6.g("JobData(results=", ")", this.a);
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
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Result(job=" + this.a + ")";
        }
    }

    public z16(hva<ey7> hvaVar) {
        hvaVar.getClass();
        this.a = hvaVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        b26 b26Var = b26.a;
        ha.g gVar = ha.a;
        return new ena(b26Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query getJobsData($jobDataInput: JobDataInput) { jobData(input: $jobDataInput) { results { job { __typename ...JobData } } } }  fragment JobData on Job { key url title location { formatted { short long } } sourceEmployerName employer { dossier { images { squareLogoUrls { url64 url128 } } } ugcStats { ratings { overallRating { value } } } } compensation { formattedText } attributes { key label } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = d9c.i;
        snaVar.getClass();
        List<vd2> list = a26.d;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hva<ey7> hvaVar = this.a;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("jobDataInput");
            ha.g gVar = ha.a;
            ena enaVar = new ena(fy7.a, false);
            V v = ((hva.c) hvaVar).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z16) && wl7.b(this.a, ((z16) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "f3cf3db39e3700493d11670f3de0ec2a87776dd9e5b48b3cde311e5de46e3cc4";
    }

    @Override // defpackage.pua
    public final String name() {
        return "getJobsData";
    }

    public final String toString() {
        return "GetJobsDataQuery(jobDataInput=" + this.a + ")";
    }
}
