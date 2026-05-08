package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pw3 implements p4a<a> {
    public final nw3 a;

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
            return "Data(deleteJobSeekerProfileResumePublications=" + this.a + ")";
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
            return m6.g("DeleteJobSeekerProfileResumePublications(publicationIds=", ")", this.a);
        }
    }

    public pw3(nw3 nw3Var) {
        this.a = nw3Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        rw3 rw3Var = rw3.a;
        ha.g gVar = ha.a;
        return new ena(rw3Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation DeleteJobSeekerProfileResumePublications($input: DeleteJobSeekerProfileResumePublicationsInput!) { deleteJobSeekerProfileResumePublications(input: $input) { publicationIds } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = qw3.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        ow3 ow3Var = ow3.b;
        ha.g gVar = ha.a;
        hc8Var.j();
        ow3Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pw3) && this.a.equals(((pw3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "3e0eef5250a5b638e2b998e804ebd1974201795480fec7fb3258eeeefac1a482";
    }

    @Override // defpackage.pua
    public final String name() {
        return "DeleteJobSeekerProfileResumePublications";
    }

    public final String toString() {
        return "DeleteJobSeekerProfileResumePublicationsMutation(input=" + this.a + ")";
    }
}
