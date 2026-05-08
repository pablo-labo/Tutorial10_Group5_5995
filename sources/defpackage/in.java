package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class in implements p4a<b> {
    public final gn a;

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
            return m6.g("AddJobSeekerProfileResumeLicenses(licenses=", ")", this.a);
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
            return "Data(addJobSeekerProfileResumeLicenses=" + this.a + ")";
        }
    }

    public static final class c {
        public final String a;
        public final cv8 b;

        public c(String str, cv8 cv8Var) {
            this.a = str;
            this.b = cv8Var;
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
            return "License(__typename=" + this.a + ", licensesForMobileRichProfile=" + this.b + ")";
        }
    }

    public in(gn gnVar) {
        this.a = gnVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        ln lnVar = ln.a;
        ha.g gVar = ha.a;
        return new ena(lnVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddJobSeekerProfileResumeLicenses($input: AddJobSeekerProfileResumeLicensesInput!) { addJobSeekerProfileResumeLicenses(input: $input) { licenses { __typename ...licensesForMobileRichProfile } } }  fragment dateRangeForMobileRichProfile on JobSeekerProfileDateRange { fromDate { isCurrent month year } isCurrent toDate { isCurrent month year } }  fragment licensesForMobileRichProfile on JobSeekerProfileLicense { title endorsements metadata { collectionTimestamp } location { address address2 admin1 city country formattedLocation location postalCode state } taxonomyConceptTitle { label suid } type dateRange { __typename ...dateRangeForMobileRichProfile } id }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = jn.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        hn hnVar = hn.b;
        ha.g gVar = ha.a;
        hc8Var.j();
        hnVar.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof in) && this.a.equals(((in) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "efc859c9be5c08a4c019dbe09c5f95ce075ead47fff44f6a1d7dbda3bc86120e";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddJobSeekerProfileResumeLicenses";
    }

    public final String toString() {
        return "AddJobSeekerProfileResumeLicensesMutation(input=" + this.a + ")";
    }
}
