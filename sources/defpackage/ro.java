package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ro implements p4a<b> {
    public final po a;

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
            return m6.g("AddJobSeekerProfileResumePublications(publications=", ")", this.a);
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
            return "Data(addJobSeekerProfileResumePublications=" + this.a + ")";
        }
    }

    public static final class c {
        public final String a;
        public final r6c b;

        public c(String str, r6c r6cVar) {
            this.a = str;
            this.b = r6cVar;
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
            return "Publication(__typename=" + this.a + ", publicationsForMobileRichProfile=" + this.b + ")";
        }
    }

    public ro(po poVar) {
        this.a = poVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        uo uoVar = uo.a;
        ha.g gVar = ha.a;
        return new ena(uoVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddJobSeekerProfileResumePublications($input: AddJobSeekerProfileResumePublicationsInput!) { addJobSeekerProfileResumePublications(input: $input) { publications { __typename ...publicationsForMobileRichProfile } } }  fragment dateTypeForMobileRichProfile on JobSeekerProfileDateType { isCurrent month year }  fragment publicationsForMobileRichProfile on JobSeekerProfilePublication { id date { __typename ...dateTypeForMobileRichProfile } description title url }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = so.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        qo qoVar = qo.b;
        ha.g gVar = ha.a;
        hc8Var.j();
        qoVar.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ro) && this.a.equals(((ro) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "9891b40f5da5d8e4b440ee1038832a5128c0ce30ad4f21a647e614e5b65b85cf";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddJobSeekerProfileResumePublications";
    }

    public final String toString() {
        return "AddJobSeekerProfileResumePublicationsMutation(input=" + this.a + ")";
    }
}
