package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jo implements p4a<b> {
    public final ho a;

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
            return m6.g("AddJobSeekerProfileResumePatents(patents=", ")", this.a);
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
            return "Data(addJobSeekerProfileResumePatents=" + this.a + ")";
        }
    }

    public static final class c {
        public final String a;
        public final q5b b;

        public c(String str, q5b q5bVar) {
            this.a = str;
            this.b = q5bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Patent(__typename=" + this.a + ", patentsForMobileRichProfile=" + this.b + ")";
        }
    }

    public jo(ho hoVar) {
        this.a = hoVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        mo moVar = mo.a;
        ha.g gVar = ha.a;
        return new ena(moVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddJobSeekerProfileResumePatents($input: AddJobSeekerProfileResumePatentsInput!) { addJobSeekerProfileResumePatents(input: $input) { patents { __typename ...patentsForMobileRichProfile } } }  fragment dateTypeForMobileRichProfile on JobSeekerProfileDateType { isCurrent month year }  fragment patentsForMobileRichProfile on JobSeekerProfilePatent { id date { __typename ...dateTypeForMobileRichProfile } patentNumber description title url }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = ko.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        io ioVar = io.b;
        ha.g gVar = ha.a;
        hc8Var.j();
        ioVar.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jo) && this.a.equals(((jo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "1976c6deaf613286e2e92d0ce7084f444eb109b1b0b415d2047b7eaa684f6d37";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddJobSeekerProfileResumePatents";
    }

    public final String toString() {
        return "AddJobSeekerProfileResumePatentsMutation(input=" + this.a + ")";
    }
}
