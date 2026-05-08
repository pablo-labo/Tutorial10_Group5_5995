package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jp implements p4a<b> {
    public final hp a;

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
            return m6.g("AddJobSeekerProfileResumeWorkExperiences(workExperiences=", ")", this.a);
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
            return "Data(addJobSeekerProfileResumeWorkExperiences=" + this.a + ")";
        }
    }

    public static final class c {
        public final String a;
        public final j2h b;

        public c(String str, j2h j2hVar) {
            this.a = str;
            this.b = j2hVar;
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
            return "WorkExperience(__typename=" + this.a + ", workExperiencesForMobileRichProfile=" + this.b + ")";
        }
    }

    public jp(hp hpVar) {
        this.a = hpVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        mp mpVar = mp.a;
        ha.g gVar = ha.a;
        return new ena(mpVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddJobSeekerProfileResumeWorkExperiences($input: AddJobSeekerProfileResumeWorkExperiencesInput!) { addJobSeekerProfileResumeWorkExperiences(input: $input) { workExperiences { __typename ...workExperiencesForMobileRichProfile } } }  fragment dateRangeForMobileRichProfile on JobSeekerProfileDateRange { fromDate { isCurrent month year } isCurrent toDate { isCurrent month year } }  fragment workExperiencesForMobileRichProfile on JobSeekerProfileWorkExperience { id title company location { country formattedLocation unknownLocation } dateRange { __typename ...dateRangeForMobileRichProfile } description }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = kp.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        ip ipVar = ip.b;
        ha.g gVar = ha.a;
        hc8Var.j();
        ipVar.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jp) && this.a.equals(((jp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "de2d048028960b808dbfeccdc0da760d357b66ebc970d6f1620ae8782925381f";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddJobSeekerProfileResumeWorkExperiences";
    }

    public final String toString() {
        return "AddJobSeekerProfileResumeWorkExperiencesMutation(input=" + this.a + ")";
    }
}
