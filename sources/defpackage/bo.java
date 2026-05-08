package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bo implements p4a<b> {
    public final wn a;

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
            return m6.g("AddJobSeekerProfileResumeMilitary(military=", ")", this.a);
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
            return "Data(addJobSeekerProfileResumeMilitary=" + this.a + ")";
        }
    }

    public static final class c {
        public final String a;
        public final it9 b;

        public c(String str, it9 it9Var) {
            this.a = str;
            this.b = it9Var;
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
            return "Military(__typename=" + this.a + ", militaryServiceForMobileRichProfile=" + this.b + ")";
        }
    }

    public bo(wn wnVar) {
        this.a = wnVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        fo foVar = fo.a;
        ha.g gVar = ha.a;
        return new ena(foVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddJobSeekerProfileResumeMilitaryService($input: AddJobSeekerProfileResumeMilitaryInput!) { addJobSeekerProfileResumeMilitary(input: $input) { military { __typename ...militaryServiceForMobileRichProfile } } }  fragment dateRangeForMobileRichProfile on JobSeekerProfileDateRange { fromDate { isCurrent month year } isCurrent toDate { isCurrent month year } }  fragment militaryServiceForMobileRichProfile on JobSeekerProfileMilitary { id country branch rank description serviceCode dateRange { __typename ...dateRangeForMobileRichProfile } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = co.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        xn xnVar = xn.b;
        ha.g gVar = ha.a;
        hc8Var.j();
        xnVar.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bo) && this.a.equals(((bo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "0b9861f97df9bf74791b0640fadc98381289f8bc27bfa6a4ccd792d88400903c";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddJobSeekerProfileResumeMilitaryService";
    }

    public final String toString() {
        return "AddJobSeekerProfileResumeMilitaryServiceMutation(input=" + this.a + ")";
    }
}
