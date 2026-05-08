package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gm implements p4a<b> {
    public final lk a;

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
            return m6.g("AddJobSeekerProfileResumeEducations(educations=", ")", this.a);
        }
    }

    public static final class b implements p4a.a {
        public final a a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.a.hashCode();
        }

        public final String toString() {
            return "Data(addJobSeekerProfileResumeEducations=" + this.a + ")";
        }
    }

    public static final class c {
        public final String a;
        public final jo4 b;

        public c(String str, jo4 jo4Var) {
            this.a = str;
            this.b = jo4Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Education(__typename=" + this.a + ", educationsForMobileRichProfile=" + this.b + ")";
        }
    }

    public gm(lk lkVar) {
        this.a = lkVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        jm jmVar = jm.a;
        ha.g gVar = ha.a;
        return new ena(jmVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddJobSeekerProfileResumeEducation($input: AddJobSeekerProfileEducationsInput!) { addJobSeekerProfileResumeEducations(input: $input) { educations { __typename ...educationsForMobileRichProfile } } }  fragment dateRangeForMobileRichProfile on JobSeekerProfileDateRange { fromDate { isCurrent month year } isCurrent toDate { isCurrent month year } }  fragment educationsForMobileRichProfile on JobSeekerProfileEducation { id school degree { degreeName field id taxonomyConceptDegree { label sectionIds { sectionId } suid taxonomyConceptId type uuid } taxonomyConceptField { label sectionIds { sectionId } suid taxonomyConceptId type uuid } } location { country formattedLocation unknownLocation } dateRange { __typename ...dateRangeForMobileRichProfile } additionalDetails }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = hm.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        zf zfVar = zf.c;
        ha.g gVar = ha.a;
        hc8Var.j();
        zfVar.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gm) && this.a.equals(((gm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "b52e1261d5ba70ec07445ca660d8a8d709cfdd096c88676245657d9e15cdbfde";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddJobSeekerProfileResumeEducation";
    }

    public final String toString() {
        return "AddJobSeekerProfileResumeEducationMutation(input=" + this.a + ")";
    }
}
