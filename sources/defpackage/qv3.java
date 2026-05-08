package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qv3 implements p4a<a> {
    public final ov3 a;

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
            return "Data(deleteJobSeekerProfileResumeLicenses=" + this.a + ")";
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
            return m6.g("DeleteJobSeekerProfileResumeLicenses(licenseIds=", ")", this.a);
        }
    }

    public qv3(ov3 ov3Var) {
        this.a = ov3Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        sv3 sv3Var = sv3.a;
        ha.g gVar = ha.a;
        return new ena(sv3Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation DeleteJobSeekerProfileResumeLicenses($input: DeleteJobSeekerProfileResumeLicensesInput!) { deleteJobSeekerProfileResumeLicenses(input: $input) { licenseIds } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = rv3.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        pv3 pv3Var = pv3.b;
        ha.g gVar = ha.a;
        hc8Var.j();
        pv3Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qv3) && this.a.equals(((qv3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "663dd2dfaa90070c2eaa27b097c6d9563f21c31dc4c2b1dab325cde680340ba0";
    }

    @Override // defpackage.pua
    public final String name() {
        return "DeleteJobSeekerProfileResumeLicenses";
    }

    public final String toString() {
        return "DeleteJobSeekerProfileResumeLicensesMutation(input=" + this.a + ")";
    }
}
