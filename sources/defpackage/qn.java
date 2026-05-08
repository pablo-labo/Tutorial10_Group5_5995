package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qn implements p4a<b> {
    public final on a;

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
            return m6.g("AddJobSeekerProfileResumeLinks(links=", ")", this.a);
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
            return "Data(addJobSeekerProfileResumeLinks=" + this.a + ")";
        }
    }

    public static final class c {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && wl7.b(this.b, cVar.b);
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

    public qn(on onVar) {
        this.a = onVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        tn tnVar = tn.a;
        ha.g gVar = ha.a;
        return new ena(tnVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddJobSeekerProfileResumeLinks($input: AddJobSeekerProfileResumeLinksInput!) { addJobSeekerProfileResumeLinks(input: $input) { links { id link } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = rn.c;
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
        pn.b.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qn) && this.a.equals(((qn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "49aacee1fbf1776b8642b0cc2ab9f0d4b0dd1dd53f41615938ecace40769bc21";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddJobSeekerProfileResumeLinks";
    }

    public final String toString() {
        return "AddJobSeekerProfileResumeLinksMutation(input=" + this.a + ")";
    }
}
