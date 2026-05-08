package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class meg implements p4a<a> {
    public final leg a;

    public static final class a implements p4a.a {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.a.hashCode();
        }

        public final String toString() {
            return "Data(updateJobSeekerProfileResumeWorkExperiences=" + this.a + ")";
        }
    }

    public static final class b {
        public final ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("UpdateJobSeekerProfileResumeWorkExperiences(workExperiences=", ")", this.a);
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

    public meg(leg legVar) {
        this.a = legVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        oeg oegVar = oeg.a;
        ha.g gVar = ha.a;
        return new ena(oegVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateJobSeekerProfileResumeWorkExperiences($input: UpdateJobSeekerProfileResumeWorkExperiencesInput!) { updateJobSeekerProfileResumeWorkExperiences(input: $input) { workExperiences { __typename ...workExperiencesForMobileRichProfile } } }  fragment dateRangeForMobileRichProfile on JobSeekerProfileDateRange { fromDate { isCurrent month year } isCurrent toDate { isCurrent month year } }  fragment workExperiencesForMobileRichProfile on JobSeekerProfileWorkExperience { id title company location { country formattedLocation unknownLocation } dateRange { __typename ...dateRangeForMobileRichProfile } description }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = neg.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        zu2 zu2Var = zu2.d;
        ha.g gVar = ha.a;
        hc8Var.j();
        zu2Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof meg) && this.a.equals(((meg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "d62d58ade5290b3bf97c25e32bd28ef59139c762805be1d819cc7b83cef53d1d";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateJobSeekerProfileResumeWorkExperiences";
    }

    public final String toString() {
        return "UpdateJobSeekerProfileResumeWorkExperiencesMutation(input=" + this.a + ")";
    }
}
