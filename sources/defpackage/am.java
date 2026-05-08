package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class am implements p4a<c> {
    public final yl a;

    public static final class a {
        public final ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
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
            return m6.g("AddJobSeekerProfileResumeCertifications(certifications=", ")", this.a);
        }
    }

    public static final class b {
        public final String a;
        public final nz1 b;

        public b(String str, nz1 nz1Var) {
            this.a = str;
            this.b = nz1Var;
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
            return "Certification(__typename=" + this.a + ", certificationsForMobileRichProfile=" + this.b + ")";
        }
    }

    public static final class c implements p4a.a {
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
            return "Data(addJobSeekerProfileResumeCertifications=" + this.a + ")";
        }
    }

    public am(yl ylVar) {
        this.a = ylVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        em emVar = em.a;
        ha.g gVar = ha.a;
        return new ena(emVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddJobSeekerProfileResumeCertifications($input: AddJobSeekerProfileResumeCertificationsInput!) { addJobSeekerProfileResumeCertifications(input: $input) { certifications { __typename ...certificationsForMobileRichProfile } } }  fragment dateRangeForMobileRichProfile on JobSeekerProfileDateRange { fromDate { isCurrent month year } isCurrent toDate { isCurrent month year } }  fragment certificationsForMobileRichProfile on JobSeekerProfileCertification { title description dateRange { __typename ...dateRangeForMobileRichProfile } id }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = bm.c;
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
        zl.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof am) && this.a.equals(((am) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "20520f7d96b5f90e590e2c77752bcd970504201e9a26e509bbe78137ac2e42f4";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddJobSeekerProfileResumeCertifications";
    }

    public final String toString() {
        return "AddJobSeekerProfileResumeCertificationsMutation(input=" + this.a + ")";
    }
}
