package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ww3 implements p4a<a> {
    public final uw3 a;

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
            return "Data(deleteJobSeekerProfileResumeSkills=" + this.a + ")";
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
            return m6.g("DeleteJobSeekerProfileResumeSkills(skillIds=", ")", this.a);
        }
    }

    public ww3(uw3 uw3Var) {
        this.a = uw3Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        yw3 yw3Var = yw3.a;
        ha.g gVar = ha.a;
        return new ena(yw3Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation DeleteJobSeekerProfileResumeSkills($input: DeleteJobSeekerProfileResumeSkillsInput!) { deleteJobSeekerProfileResumeSkills(input: $input) { skillIds } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = xw3.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        vw3 vw3Var = vw3.b;
        ha.g gVar = ha.a;
        hc8Var.j();
        vw3Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ww3) && this.a.equals(((ww3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "539a96f178d2a49c8f9e025248e9d1a5ebf0bd88513c9be733f1984dab6421ef";
    }

    @Override // defpackage.pua
    public final String name() {
        return "DeleteJobSeekerProfileResumeSkills";
    }

    public final String toString() {
        return "DeleteJobSeekerProfileResumeSkillsMutation(input=" + this.a + ")";
    }
}
