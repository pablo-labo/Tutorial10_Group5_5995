package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ocg implements p4a<a> {
    public final ncg a;

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
            return "Data(updateJobSeekerProfileResumeLicenses=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final cv8 b;

        public b(String str, cv8 cv8Var) {
            this.a = str;
            this.b = cv8Var;
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
            return "License(__typename=" + this.a + ", licensesForMobileRichProfile=" + this.b + ")";
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
            return m6.g("UpdateJobSeekerProfileResumeLicenses(licenses=", ")", this.a);
        }
    }

    public ocg(ncg ncgVar) {
        this.a = ncgVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        qcg qcgVar = qcg.a;
        ha.g gVar = ha.a;
        return new ena(qcgVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateJobSeekerProfileResumeLicenses($input: UpdateJobSeekerProfileResumeLicensesInput!) { updateJobSeekerProfileResumeLicenses(input: $input) { licenses { __typename ...licensesForMobileRichProfile } } }  fragment dateRangeForMobileRichProfile on JobSeekerProfileDateRange { fromDate { isCurrent month year } isCurrent toDate { isCurrent month year } }  fragment licensesForMobileRichProfile on JobSeekerProfileLicense { title endorsements metadata { collectionTimestamp } location { address address2 admin1 city country formattedLocation location postalCode state } taxonomyConceptTitle { label suid } type dateRange { __typename ...dateRangeForMobileRichProfile } id }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = pcg.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        mw2 mw2Var = mw2.d;
        ha.g gVar = ha.a;
        hc8Var.j();
        mw2Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ocg) && this.a.equals(((ocg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "4849956bc997489f1a8a4ec3be6684d44009943a1da7aedbff2741b734c654f2";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateJobSeekerProfileResumeLicenses";
    }

    public final String toString() {
        return "UpdateJobSeekerProfileResumeLicensesMutation(input=" + this.a + ")";
    }
}
