package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nfg implements p4a<a> {
    public final lcg a;

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
            return "Data(updateJobSeekerProfileResumeLanguages=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final w8d b;

        public b(String str, w8d w8dVar) {
            this.a = str;
            this.b = w8dVar;
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
            return "Language(__typename=" + this.a + ", resumeLanguage=" + this.b + ")";
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
            return m6.g("UpdateJobSeekerProfileResumeLanguages(languages=", ")", this.a);
        }
    }

    public nfg(lcg lcgVar) {
        this.a = lcgVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        pfg pfgVar = pfg.a;
        ha.g gVar = ha.a;
        return new ena(pfgVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateProfileResumeLanguages($input: UpdateJobSeekerProfileResumeLanguagesInput!) { updateJobSeekerProfileResumeLanguages(input: $input) { languages { __typename ...resumeLanguage } } }  fragment taxonomyConcept on JobSeekerProfileTaxonomyConcept { label sectionIds { sectionId } suid taxonomyConceptId type context { suid } }  fragment taxonomyConceptWithName on JobSeekerProfileTaxonomyConceptWithName { name taxonomyConceptName { __typename ...taxonomyConcept } }  fragment resumeLanguage on JobSeekerProfileLanguage { id taxonomyConceptLanguage { __typename ...taxonomyConceptWithName } taxonomyConceptProficiency { __typename ...taxonomyConceptWithName } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = ofg.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        e52 e52Var = e52.d;
        ha.g gVar = ha.a;
        hc8Var.j();
        e52Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nfg) && this.a.equals(((nfg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "93d6db6c95ac88d5ee2ed0597dddec1aec720c2e50a4bffece1aa1010e99e306";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateProfileResumeLanguages";
    }

    public final String toString() {
        return "UpdateProfileResumeLanguagesMutation(input=" + this.a + ")";
    }
}
