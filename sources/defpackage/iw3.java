package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class iw3 implements p4a<a> {
    public final hw3 a;

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
            return "Data(deleteJobSeekerProfileResumePatents=" + this.a + ")";
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
            return m6.g("DeleteJobSeekerProfileResumePatents(patentIds=", ")", this.a);
        }
    }

    public iw3(hw3 hw3Var) {
        this.a = hw3Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        kw3 kw3Var = kw3.a;
        ha.g gVar = ha.a;
        return new ena(kw3Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation DeleteJobSeekerProfileResumePatents($input: DeleteJobSeekerProfileResumePatentsInput!) { deleteJobSeekerProfileResumePatents(input: $input) { patentIds } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = jw3.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        tx txVar = tx.d;
        ha.g gVar = ha.a;
        hc8Var.j();
        txVar.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iw3) && this.a.equals(((iw3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "ee092966e487d91ffdb6736fc8cdb219a3a933b2319d24822074abac4a787dce";
    }

    @Override // defpackage.pua
    public final String name() {
        return "DeleteJobSeekerProfileResumePatents";
    }

    public final String toString() {
        return "DeleteJobSeekerProfileResumePatentsMutation(input=" + this.a + ")";
    }
}
