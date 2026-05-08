package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hu3 implements p4a<a> {
    public final fu3 a;

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
            return "Data(deleteJobSeekerProfileResumeAssociations=" + this.a + ")";
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
            return m6.g("DeleteJobSeekerProfileResumeAssociations(associationIds=", ")", this.a);
        }
    }

    public hu3(fu3 fu3Var) {
        this.a = fu3Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        ju3 ju3Var = ju3.a;
        ha.g gVar = ha.a;
        return new ena(ju3Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation DeleteJobSeekerProfileResumeAssociations($input: DeleteJobSeekerProfileResumeAssociationsInput!) { deleteJobSeekerProfileResumeAssociations(input: $input) { associationIds } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = iu3.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        gu3 gu3Var = gu3.b;
        ha.g gVar = ha.a;
        hc8Var.j();
        gu3Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hu3) && this.a.equals(((hu3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "f9f074ecdf07dc5c97e1571d0b5d71e0af476845adf6c88de91b4d694bf23c84";
    }

    @Override // defpackage.pua
    public final String name() {
        return "DeleteJobSeekerProfileResumeAssociations";
    }

    public final String toString() {
        return "DeleteJobSeekerProfileResumeAssociationsMutation(input=" + this.a + ")";
    }
}
