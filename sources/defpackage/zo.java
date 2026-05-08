package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zo implements p4a<b> {
    public final xo a;

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
            return m6.g("AddJobSeekerProfileResumeSkills(skills=", ")", this.a);
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
            return "Data(addJobSeekerProfileResumeSkills=" + this.a + ")";
        }
    }

    public static final class c {
        public final String a;
        public final gje b;

        public c(String str, gje gjeVar) {
            this.a = str;
            this.b = gjeVar;
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
            return "Skill(__typename=" + this.a + ", skillsForMobileRichProfile=" + this.b + ")";
        }
    }

    public zo(xo xoVar) {
        this.a = xoVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        cp cpVar = cp.a;
        ha.g gVar = ha.a;
        return new ena(cpVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddJobSeekerProfileResumeSkills($input: AddJobSeekerProfileResumeSkillsInput!) { addJobSeekerProfileResumeSkills(input: $input) { skills { __typename ...skillsForMobileRichProfile } } }  fragment skillsForMobileRichProfile on JobSeekerProfileSkill { id text experience timeUnit isParentCrowtaxoAttribute childAchievementSkill { id suid label } taxonomyConceptTitle { label suid } skillBucket { suid label } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = ap.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        yo yoVar = yo.b;
        ha.g gVar = ha.a;
        hc8Var.j();
        yoVar.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zo) && this.a.equals(((zo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "f1d55d83a32ef46f1fc25c13a5a8d37e406833aa034b1958f0c81592be2b25be";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddJobSeekerProfileResumeSkills";
    }

    public final String toString() {
        return "AddJobSeekerProfileResumeSkillsMutation(input=" + this.a + ")";
    }
}
