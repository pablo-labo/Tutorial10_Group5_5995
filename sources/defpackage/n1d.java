package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n1d implements p4a<a> {
    public final ix3 a;

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
            return bVar.hashCode();
        }

        public final String toString() {
            return "Data(deleteJobSeekerProfileStructuredDataPreferenceAttributes=" + this.a + ")";
        }
    }

    public static final class b {
        public final List<String> a;

        public b(List<String> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            List<String> list = this.a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return g7.h("DeleteJobSeekerProfileStructuredDataPreferenceAttributes(positivePreferenceAttributeIds=", ")", this.a);
        }
    }

    public n1d(ix3 ix3Var) {
        this.a = ix3Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        p1d p1dVar = p1d.a;
        ha.g gVar = ha.a;
        return new ena(p1dVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation RemoveSdcAttributes($input: DeleteJobSeekerProfileStructuredDataPreferenceAttributesInput!) { deleteJobSeekerProfileStructuredDataPreferenceAttributes(input: $input) { positivePreferenceAttributeIds } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = t4a.h;
        snaVar.getClass();
        List<vd2> list = o1d.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        ha.g gVar = ha.a;
        hc8Var.j();
        jx3.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1d) && this.a.equals(((n1d) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "5f37df084ec90e95d73eec6dd9d66eab621e23b9ae70949fa819eb8b572d3906";
    }

    @Override // defpackage.pua
    public final String name() {
        return "RemoveSdcAttributes";
    }

    public final String toString() {
        return "RemoveSdcAttributesMutation(input=" + this.a + ")";
    }
}
