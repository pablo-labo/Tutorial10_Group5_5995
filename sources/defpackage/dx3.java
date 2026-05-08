package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dx3 implements p4a<a> {
    public final bx3 a;

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
            return "Data(deleteJobSeekerProfileResumeWorkExperiences=" + this.a + ")";
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
            return m6.g("DeleteJobSeekerProfileResumeWorkExperiences(workExperienceIds=", ")", this.a);
        }
    }

    public dx3(bx3 bx3Var) {
        this.a = bx3Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        fx3 fx3Var = fx3.a;
        ha.g gVar = ha.a;
        return new ena(fx3Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation DeleteJobSeekerProfileResumeWorkExperiences($input: DeleteJobSeekerProfileResumeWorkExperiencesInput!) { deleteJobSeekerProfileResumeWorkExperiences(input: $input) { workExperienceIds } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = ex3.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        cx3 cx3Var = cx3.b;
        ha.g gVar = ha.a;
        hc8Var.j();
        cx3Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dx3) && this.a.equals(((dx3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "d350877a9b1da9173851820e016cdfd33e0c8fdfa1ef5e0c08abe898d60fd976";
    }

    @Override // defpackage.pua
    public final String name() {
        return "DeleteJobSeekerProfileResumeWorkExperiences";
    }

    public final String toString() {
        return "DeleteJobSeekerProfileResumeWorkExperiencesMutation(input=" + this.a + ")";
    }
}
