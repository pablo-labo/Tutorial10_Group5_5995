package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e46 implements c9c<d> {

    public static final class a {
        public final String a;
        public final mu0 b;

        public a(String str, mu0 mu0Var) {
            this.a = str;
            this.b = mu0Var;
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
            return "Association(__typename=" + this.a + ", associationsForMobileRichProfile=" + this.b + ")";
        }
    }

    public static final class b {
        public final String a;
        public final s61 b;

        public b(String str, s61 s61Var) {
            this.a = str;
            this.b = s61Var;
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
            return "Award(__typename=" + this.a + ", awardsForMobileRichProfile=" + this.b + ")";
        }
    }

    public static final class c {
        public final String a;
        public final nz1 b;

        public c(String str, nz1 nz1Var) {
            this.a = str;
            this.b = nz1Var;
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
            return "Certification(__typename=" + this.a + ", certificationsForMobileRichProfile=" + this.b + ")";
        }
    }

    public static final class d implements c9c.a {
        public final g a;

        public d(g gVar) {
            this.a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            g gVar = this.a;
            if (gVar == null) {
                return 0;
            }
            return gVar.hashCode();
        }

        public final String toString() {
            return "Data(jobSeekerProfile=" + this.a + ")";
        }
    }

    public static final class e {
        public final String a;
        public final jo4 b;

        public e(String str, jo4 jo4Var) {
            this.a = str;
            this.b = jo4Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && this.b.equals(eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Education(__typename=" + this.a + ", educationsForMobileRichProfile=" + this.b + ")";
        }
    }

    public static final class f {
        public final y18 a;

        public f(y18 y18Var) {
            this.a = y18Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            y18 y18Var = this.a;
            if (y18Var == null) {
                return 0;
            }
            return y18Var.hashCode();
        }

        public final String toString() {
            return "FraudMetadata(state=" + this.a + ")";
        }
    }

    public static final class g {
        public final m a;

        public g(m mVar) {
            this.a = mVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && wl7.b(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            m mVar = this.a;
            if (mVar == null) {
                return 0;
            }
            return mVar.hashCode();
        }

        public final String toString() {
            return "JobSeekerProfile(profile=" + this.a + ")";
        }
    }

    public static final class h {
        public final String a;
        public final xj8 b;

        public h(String str, xj8 xj8Var) {
            this.a = str;
            this.b = xj8Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a.equals(hVar.a) && this.b.equals(hVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Language(__typename=" + this.a + ", languageSkillsForMobileRichProfile=" + this.b + ")";
        }
    }

    public static final class i {
        public final String a;
        public final cv8 b;

        public i(String str, cv8 cv8Var) {
            this.a = str;
            this.b = cv8Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a.equals(iVar.a) && this.b.equals(iVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "License(__typename=" + this.a + ", licensesForMobileRichProfile=" + this.b + ")";
        }
    }

    public static final class j {
        public final String a;
        public final String b;

        public j(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.a.equals(jVar.a) && wl7.b(this.b, jVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return akb.k("Link(id=", this.a, ", link=", this.b, ")");
        }
    }

    public static final class k {
        public final String a;
        public final it9 b;

        public k(String str, it9 it9Var) {
            this.a = str;
            this.b = it9Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.a.equals(kVar.a) && this.b.equals(kVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Military(__typename=" + this.a + ", militaryServiceForMobileRichProfile=" + this.b + ")";
        }
    }

    public static final class l {
        public final String a;
        public final q5b b;

        public l(String str, q5b q5bVar) {
            this.a = str;
            this.b = q5bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.a.equals(lVar.a) && this.b.equals(lVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Patent(__typename=" + this.a + ", patentsForMobileRichProfile=" + this.b + ")";
        }
    }

    public static final class m {
        public final ArrayList a;
        public final f b;

        public m(ArrayList arrayList, f fVar) {
            this.a = arrayList;
            this.b = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.a.equals(mVar.a) && wl7.b(this.b, mVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            f fVar = this.b;
            return iHashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public final String toString() {
            return "Profile(resume=" + this.a + ", fraudMetadata=" + this.b + ")";
        }
    }

    public static final class n {
        public final String a;
        public final r6c b;

        public n(String str, r6c r6cVar) {
            this.a = str;
            this.b = r6cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.a.equals(nVar.a) && this.b.equals(nVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Publication(__typename=" + this.a + ", publicationsForMobileRichProfile=" + this.b + ")";
        }
    }

    public static final class o {
        public final String a;
        public final String b;
        public final String c;
        public final ArrayList d;
        public final ArrayList e;
        public final ArrayList f;
        public final ArrayList g;
        public final ArrayList h;
        public final ArrayList i;
        public final ArrayList j;
        public final ArrayList k;
        public final ArrayList l;
        public final ArrayList m;
        public final ArrayList n;
        public final ArrayList o;

        public o(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, ArrayList arrayList9, ArrayList arrayList10, ArrayList arrayList11, ArrayList arrayList12) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = arrayList;
            this.e = arrayList2;
            this.f = arrayList3;
            this.g = arrayList4;
            this.h = arrayList5;
            this.i = arrayList6;
            this.j = arrayList7;
            this.k = arrayList8;
            this.l = arrayList9;
            this.m = arrayList10;
            this.n = arrayList11;
            this.o = arrayList12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return this.a.equals(oVar.a) && wl7.b(this.b, oVar.b) && wl7.b(this.c, oVar.c) && this.d.equals(oVar.d) && this.e.equals(oVar.e) && this.f.equals(oVar.f) && this.g.equals(oVar.g) && this.h.equals(oVar.h) && this.i.equals(oVar.i) && this.j.equals(oVar.j) && this.k.equals(oVar.k) && this.l.equals(oVar.l) && this.m.equals(oVar.m) && this.n.equals(oVar.n) && this.o.equals(oVar.o);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return this.o.hashCode() + z3.d(this.n, z3.d(this.m, z3.d(this.l, z3.d(this.k, z3.d(this.j, z3.d(this.i, z3.d(this.h, z3.d(this.g, z3.d(this.f, z3.d(this.e, z3.d(this.d, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("Resume(id=", this.a, ", summary=", this.b, ", additionalInfo=");
            sbF.append(this.c);
            sbF.append(", links=");
            sbF.append(this.d);
            sbF.append(", workExperiences=");
            sbF.append(this.e);
            sbF.append(", publications=");
            sbF.append(this.f);
            sbF.append(", military=");
            sbF.append(this.g);
            sbF.append(", patents=");
            sbF.append(this.h);
            sbF.append(", awards=");
            sbF.append(this.i);
            sbF.append(", associations=");
            sbF.append(this.j);
            sbF.append(", certifications=");
            sbF.append(this.k);
            sbF.append(", licenses=");
            sbF.append(this.l);
            sbF.append(", educations=");
            sbF.append(this.m);
            sbF.append(", languages=");
            sbF.append(this.n);
            sbF.append(", skills=");
            sbF.append(this.o);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class p {
        public final String a;
        public final gje b;

        public p(String str, gje gjeVar) {
            this.a = str;
            this.b = gjeVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.a.equals(pVar.a) && this.b.equals(pVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Skill(__typename=" + this.a + ", skillsForMobileRichProfile=" + this.b + ")";
        }
    }

    public static final class q {
        public final String a;
        public final j2h b;

        public q(String str, j2h j2hVar) {
            this.a = str;
            this.b = j2hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.a.equals(qVar.a) && this.b.equals(qVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "WorkExperience(__typename=" + this.a + ", workExperiencesForMobileRichProfile=" + this.b + ")";
        }
    }

    @Override // defpackage.g15
    public final ena a() {
        j46 j46Var = j46.a;
        ha.g gVar = ha.a;
        return new ena(j46Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query GetRichProfileResumeData { jobSeekerProfile { profile { resume { id summary additionalInfo links { id link } workExperiences { __typename ...workExperiencesForMobileRichProfile } publications { __typename ...publicationsForMobileRichProfile } military { __typename ...militaryServiceForMobileRichProfile } patents { __typename ...patentsForMobileRichProfile } awards { __typename ...awardsForMobileRichProfile } associations { __typename ...associationsForMobileRichProfile } certifications { __typename ...certificationsForMobileRichProfile } licenses { __typename ...licensesForMobileRichProfile } educations { __typename ...educationsForMobileRichProfile } languages { __typename ...languageSkillsForMobileRichProfile } skills { __typename ...skillsForMobileRichProfile } } fraudMetadata { state } } } }  fragment dateRangeForMobileRichProfile on JobSeekerProfileDateRange { fromDate { isCurrent month year } isCurrent toDate { isCurrent month year } }  fragment workExperiencesForMobileRichProfile on JobSeekerProfileWorkExperience { id title company location { country formattedLocation unknownLocation } dateRange { __typename ...dateRangeForMobileRichProfile } description }  fragment dateTypeForMobileRichProfile on JobSeekerProfileDateType { isCurrent month year }  fragment publicationsForMobileRichProfile on JobSeekerProfilePublication { id date { __typename ...dateTypeForMobileRichProfile } description title url }  fragment militaryServiceForMobileRichProfile on JobSeekerProfileMilitary { id country branch rank description serviceCode dateRange { __typename ...dateRangeForMobileRichProfile } }  fragment patentsForMobileRichProfile on JobSeekerProfilePatent { id date { __typename ...dateTypeForMobileRichProfile } patentNumber description title url }  fragment awardsForMobileRichProfile on JobSeekerProfileAward { id date { __typename ...dateTypeForMobileRichProfile } description title }  fragment associationsForMobileRichProfile on JobSeekerProfileAssociation { title description dateRange { __typename ...dateRangeForMobileRichProfile } id }  fragment certificationsForMobileRichProfile on JobSeekerProfileCertification { title description dateRange { __typename ...dateRangeForMobileRichProfile } id }  fragment licensesForMobileRichProfile on JobSeekerProfileLicense { title endorsements metadata { collectionTimestamp } location { address address2 admin1 city country formattedLocation location postalCode state } taxonomyConceptTitle { label suid } type dateRange { __typename ...dateRangeForMobileRichProfile } id }  fragment educationsForMobileRichProfile on JobSeekerProfileEducation { id school degree { degreeName field id taxonomyConceptDegree { label sectionIds { sectionId } suid taxonomyConceptId type uuid } taxonomyConceptField { label sectionIds { sectionId } suid taxonomyConceptId type uuid } } location { country formattedLocation unknownLocation } dateRange { __typename ...dateRangeForMobileRichProfile } additionalDetails }  fragment languageSkillsForMobileRichProfile on JobSeekerProfileLanguage { id taxonomyConceptLanguage { name taxonomyConceptName { label sectionIds { sectionId } suid taxonomyConceptId type context { suid } } } taxonomyConceptProficiency { name taxonomyConceptName { label sectionIds { sectionId } suid taxonomyConceptId type context { suid } } } }  fragment skillsForMobileRichProfile on JobSeekerProfileSkill { id text experience timeUnit isParentCrowtaxoAttribute childAchievementSkill { id suid label } taxonomyConceptTitle { label suid } skillBucket { suid label } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = f9c.e;
        snaVar.getClass();
        List<vd2> list = f46.q;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == e46.class;
    }

    public final int hashCode() {
        return fwc.a.b(e46.class).hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "b1da3ee0cf665103952117bd98edcdb430952634b79c2b317ab4f6844b0d7973";
    }

    @Override // defpackage.pua
    public final String name() {
        return "GetRichProfileResumeData";
    }
}
