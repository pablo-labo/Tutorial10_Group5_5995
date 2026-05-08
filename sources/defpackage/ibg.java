package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ibg implements p4a<b> {
    public final hbg a;

    public static final class a {
        public final String a;
        public final mu0 b;

        public a(String str, mu0 mu0Var) {
            this.a = str;
            this.b = mu0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Association(__typename=" + this.a + ", associationsForMobileRichProfile=" + this.b + ")";
        }
    }

    public static final class b implements p4a.a {
        public final c a;

        public b(c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.a.hashCode();
        }

        public final String toString() {
            return "Data(updateJobSeekerProfileResumeAssociations=" + this.a + ")";
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
            return m6.g("UpdateJobSeekerProfileResumeAssociations(associations=", ")", this.a);
        }
    }

    public ibg(hbg hbgVar) {
        this.a = hbgVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        lbg lbgVar = lbg.a;
        ha.g gVar = ha.a;
        return new ena(lbgVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateJobSeekerProfileResumeAssociations($input: UpdateJobSeekerProfileResumeAssociationsInput!) { updateJobSeekerProfileResumeAssociations(input: $input) { associations { __typename ...associationsForMobileRichProfile } } }  fragment dateRangeForMobileRichProfile on JobSeekerProfileDateRange { fromDate { isCurrent month year } isCurrent toDate { isCurrent month year } }  fragment associationsForMobileRichProfile on JobSeekerProfileAssociation { title description dateRange { __typename ...dateRangeForMobileRichProfile } id }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = jbg.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        uu3 uu3Var = uu3.c;
        ha.g gVar = ha.a;
        hc8Var.j();
        uu3Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ibg) && this.a.equals(((ibg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "68ea31d3664dc6db0671ff02807f04fc327989eec8a714a1176d55214a350d33";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateJobSeekerProfileResumeAssociations";
    }

    public final String toString() {
        return "UpdateJobSeekerProfileResumeAssociationsMutation(input=" + this.a + ")";
    }
}
