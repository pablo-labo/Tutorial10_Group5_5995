package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class an implements p4a<b> {
    public final ym a;

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
            return m6.g("AddJobSeekerProfileResumeLanguages(languages=", ")", this.a);
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
            return "Data(addJobSeekerProfileResumeLanguages=" + this.a + ")";
        }
    }

    public static final class c {
        public final String a;
        public final w8d b;

        public c(String str, w8d w8dVar) {
            this.a = str;
            this.b = w8dVar;
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
            return "Language(__typename=" + this.a + ", resumeLanguage=" + this.b + ")";
        }
    }

    public an(ym ymVar) {
        this.a = ymVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        dn dnVar = dn.a;
        ha.g gVar = ha.a;
        return new ena(dnVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddJobSeekerProfileResumeLanguages($input: AddJobSeekerProfileResumeLanguagesInput!) { addJobSeekerProfileResumeLanguages(input: $input) { languages { __typename ...resumeLanguage } } }  fragment taxonomyConcept on JobSeekerProfileTaxonomyConcept { label sectionIds { sectionId } suid taxonomyConceptId type context { suid } }  fragment taxonomyConceptWithName on JobSeekerProfileTaxonomyConceptWithName { name taxonomyConceptName { __typename ...taxonomyConcept } }  fragment resumeLanguage on JobSeekerProfileLanguage { id taxonomyConceptLanguage { __typename ...taxonomyConceptWithName } taxonomyConceptProficiency { __typename ...taxonomyConceptWithName } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = bn.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        zm zmVar = zm.b;
        ha.g gVar = ha.a;
        hc8Var.j();
        zmVar.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof an) && this.a.equals(((an) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "3267f8ae94b89b0a7037f745c3b9bbbf9499dd24549f23dd3987f811c89719cb";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddJobSeekerProfileResumeLanguages";
    }

    public final String toString() {
        return "AddJobSeekerProfileResumeLanguagesMutation(input=" + this.a + ")";
    }
}
