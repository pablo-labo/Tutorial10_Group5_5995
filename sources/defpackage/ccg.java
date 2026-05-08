package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ccg implements p4a<a> {
    public final hcg a;

    public static final class a implements p4a.a {
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
            return "Data(updateJobSeekerProfileResumeEducations=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final jo4 b;

        public b(String str, jo4 jo4Var) {
            this.a = str;
            this.b = jo4Var;
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
            return "Education(__typename=" + this.a + ", educationsForMobileRichProfile=" + this.b + ")";
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
            return m6.g("UpdateJobSeekerProfileResumeEducations(educations=", ")", this.a);
        }
    }

    public ccg(hcg hcgVar) {
        this.a = hcgVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        ecg ecgVar = ecg.a;
        ha.g gVar = ha.a;
        return new ena(ecgVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateJobSeekerProfileResumeEducation($input: UpdateJobSeekerProfileResumeEducationsInput!) { updateJobSeekerProfileResumeEducations(input: $input) { educations { __typename ...educationsForMobileRichProfile } } }  fragment dateRangeForMobileRichProfile on JobSeekerProfileDateRange { fromDate { isCurrent month year } isCurrent toDate { isCurrent month year } }  fragment educationsForMobileRichProfile on JobSeekerProfileEducation { id school degree { degreeName field id taxonomyConceptDegree { label sectionIds { sectionId } suid taxonomyConceptId type uuid } taxonomyConceptField { label sectionIds { sectionId } suid taxonomyConceptId type uuid } } location { country formattedLocation unknownLocation } dateRange { __typename ...dateRangeForMobileRichProfile } additionalDetails }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = dcg.c;
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
        icg.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccg) && this.a.equals(((ccg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "ee584c213988947ff86aaa3ba6e9a1b85b57253f09d3e0a4fd88d4fb4a8258b4";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateJobSeekerProfileResumeEducation";
    }

    public final String toString() {
        return "UpdateJobSeekerProfileResumeEducationMutation(input=" + this.a + ")";
    }
}
