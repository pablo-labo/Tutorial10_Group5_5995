package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vcg implements p4a<a> {
    public final ucg a;

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
            return "Data(updateJobSeekerProfileResumeLinks=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && wl7.b(this.b, bVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return akb.k("Link(id=", this.a, ", link=", this.b, ")");
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
            return m6.g("UpdateJobSeekerProfileResumeLinks(links=", ")", this.a);
        }
    }

    public vcg(ucg ucgVar) {
        this.a = ucgVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        xcg xcgVar = xcg.a;
        ha.g gVar = ha.a;
        return new ena(xcgVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateJobSeekerProfileResumeLinks($input: UpdateJobSeekerProfileResumeLinksInput!) { updateJobSeekerProfileResumeLinks(input: $input) { links { id link } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = wcg.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        tx txVar = tx.e;
        ha.g gVar = ha.a;
        hc8Var.j();
        txVar.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vcg) && this.a.equals(((vcg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "25f3ff0f338bab185aff7bae6fc4b55a160e45e2a7425357c958d3f52ab14220";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateJobSeekerProfileResumeLinks";
    }

    public final String toString() {
        return "UpdateJobSeekerProfileResumeLinksMutation(input=" + this.a + ")";
    }
}
