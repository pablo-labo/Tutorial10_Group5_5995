package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kl implements p4a<c> {
    public final il a;

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
            return m6.g("AddJobSeekerProfileResumeAssociations(associations=", ")", this.a);
        }
    }

    public static final class b {
        public final String a;
        public final mu0 b;

        public b(String str, mu0 mu0Var) {
            this.a = str;
            this.b = mu0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Association(__typename=" + this.a + ", associationsForMobileRichProfile=" + this.b + ")";
        }
    }

    public static final class c implements p4a.a {
        public final a a;

        public c(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.a.hashCode();
        }

        public final String toString() {
            return "Data(addJobSeekerProfileResumeAssociations=" + this.a + ")";
        }
    }

    public kl(il ilVar) {
        this.a = ilVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        ol olVar = ol.a;
        ha.g gVar = ha.a;
        return new ena(olVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddJobSeekerProfileResumeAssociations($input: AddJobSeekerProfileResumeAssociationsInput!) { addJobSeekerProfileResumeAssociations(input: $input) { associations { __typename ...associationsForMobileRichProfile } } }  fragment dateRangeForMobileRichProfile on JobSeekerProfileDateRange { fromDate { isCurrent month year } isCurrent toDate { isCurrent month year } }  fragment associationsForMobileRichProfile on JobSeekerProfileAssociation { title description dateRange { __typename ...dateRangeForMobileRichProfile } id }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = ll.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        jl jlVar = jl.b;
        ha.g gVar = ha.a;
        hc8Var.j();
        jlVar.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kl) && this.a.equals(((kl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "f9b1020d5b6db8fe0272c741e6e2e54c5af6a1b46b26b6162b176492a9e9493d";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddJobSeekerProfileResumeAssociations";
    }

    public final String toString() {
        return "AddJobSeekerProfileResumeAssociationsMutation(input=" + this.a + ")";
    }
}
