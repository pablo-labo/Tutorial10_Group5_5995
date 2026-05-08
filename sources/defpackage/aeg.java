package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class aeg implements p4a<a> {
    public final zdg a;

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
            return "Data(updateJobSeekerProfileResumeSkills=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final gje b;

        public b(String str, gje gjeVar) {
            this.a = str;
            this.b = gjeVar;
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
            return "Skill(__typename=" + this.a + ", skillsForMobileRichProfile=" + this.b + ")";
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
            return m6.g("UpdateJobSeekerProfileResumeSkills(skills=", ")", this.a);
        }
    }

    public aeg(zdg zdgVar) {
        this.a = zdgVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        ceg cegVar = ceg.a;
        ha.g gVar = ha.a;
        return new ena(cegVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateJobSeekerProfileResumeSkills($input: UpdateJobSeekerProfileResumeSkillsInput!) { updateJobSeekerProfileResumeSkills(input: $input) { skills { __typename ...skillsForMobileRichProfile } } }  fragment skillsForMobileRichProfile on JobSeekerProfileSkill { id text experience timeUnit isParentCrowtaxoAttribute childAchievementSkill { id suid label } taxonomyConceptTitle { label suid } skillBucket { suid label } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = beg.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        eg3 eg3Var = eg3.c;
        ha.g gVar = ha.a;
        hc8Var.j();
        eg3Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aeg) && this.a.equals(((aeg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "9847cffc6b7392724e5121ac15350984995ab4a1d7db7444e8e65d0400161554";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateJobSeekerProfileResumeSkills";
    }

    public final String toString() {
        return "UpdateJobSeekerProfileResumeSkillsMutation(input=" + this.a + ")";
    }
}
