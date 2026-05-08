package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fdg implements p4a<a> {
    public final bdg a;

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
            return "Data(updateJobSeekerProfileResumeMilitary=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final it9 b;

        public b(String str, it9 it9Var) {
            this.a = str;
            this.b = it9Var;
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
            return "Military(__typename=" + this.a + ", militaryServiceForMobileRichProfile=" + this.b + ")";
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
            return m6.g("UpdateJobSeekerProfileResumeMilitary(military=", ")", this.a);
        }
    }

    public fdg(bdg bdgVar) {
        this.a = bdgVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        hdg hdgVar = hdg.a;
        ha.g gVar = ha.a;
        return new ena(hdgVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateJobSeekerProfileResumeMilitaryService($input: UpdateJobSeekerProfileResumeMilitaryInput!) { updateJobSeekerProfileResumeMilitary(input: $input) { military { __typename ...militaryServiceForMobileRichProfile } } }  fragment dateRangeForMobileRichProfile on JobSeekerProfileDateRange { fromDate { isCurrent month year } isCurrent toDate { isCurrent month year } }  fragment militaryServiceForMobileRichProfile on JobSeekerProfileMilitary { id country branch rank description serviceCode dateRange { __typename ...dateRangeForMobileRichProfile } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = gdg.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        ow3 ow3Var = ow3.c;
        ha.g gVar = ha.a;
        hc8Var.j();
        ow3Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fdg) && this.a.equals(((fdg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "494ed4da07189e3ca6a4a79473140c611fb1422b7b7c8d9071bae31e507ff2b6";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateJobSeekerProfileResumeMilitaryService";
    }

    public final String toString() {
        return "UpdateJobSeekerProfileResumeMilitaryServiceMutation(input=" + this.a + ")";
    }
}
