package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wbg implements p4a<b> {
    public final vbg a;

    public static final class a {
        public final String a;
        public final nz1 b;

        public a(String str, nz1 nz1Var) {
            this.a = str;
            this.b = nz1Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Certification(__typename=" + this.a + ", certificationsForMobileRichProfile=" + this.b + ")";
        }
    }

    public static final class b implements p4a.a {
        public final c a;

        public b(c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.a.hashCode();
        }

        public final String toString() {
            return "Data(updateJobSeekerProfileResumeCertifications=" + this.a + ")";
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
            return m6.g("UpdateJobSeekerProfileResumeCertifications(certifications=", ")", this.a);
        }
    }

    public wbg(vbg vbgVar) {
        this.a = vbgVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        zbg zbgVar = zbg.a;
        ha.g gVar = ha.a;
        return new ena(zbgVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateJobSeekerProfileResumeCertifications($input: UpdateJobSeekerProfileResumeCertificationsInput!) { updateJobSeekerProfileResumeCertifications(input: $input) { certifications { __typename ...certificationsForMobileRichProfile } } }  fragment dateRangeForMobileRichProfile on JobSeekerProfileDateRange { fromDate { isCurrent month year } isCurrent toDate { isCurrent month year } }  fragment certificationsForMobileRichProfile on JobSeekerProfileCertification { title description dateRange { __typename ...dateRangeForMobileRichProfile } id }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = xbg.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        iv3 iv3Var = iv3.c;
        ha.g gVar = ha.a;
        hc8Var.j();
        iv3Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wbg) && this.a.equals(((wbg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "72e93f6eadddce9458ab54490b07c04ccde6f8c8bdd6b38af39606f15cc1b86d";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateJobSeekerProfileResumeCertifications";
    }

    public final String toString() {
        return "UpdateJobSeekerProfileResumeCertificationsMutation(input=" + this.a + ")";
    }
}
