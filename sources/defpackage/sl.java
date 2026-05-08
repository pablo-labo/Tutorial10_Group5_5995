package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sl implements p4a<c> {
    public final ql a;

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
            return m6.g("AddJobSeekerProfileResumeAwards(awards=", ")", this.a);
        }
    }

    public static final class b {
        public final String a;
        public final s61 b;

        public b(String str, s61 s61Var) {
            this.a = str;
            this.b = s61Var;
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
            return "Award(__typename=" + this.a + ", awardsForMobileRichProfile=" + this.b + ")";
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
            return "Data(addJobSeekerProfileResumeAwards=" + this.a + ")";
        }
    }

    public sl(ql qlVar) {
        this.a = qlVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        wl wlVar = wl.a;
        ha.g gVar = ha.a;
        return new ena(wlVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddJobSeekerProfileResumeAwards($input: AddJobSeekerProfileResumeAwardsInput!) { addJobSeekerProfileResumeAwards(input: $input) { awards { __typename ...awardsForMobileRichProfile } } }  fragment dateTypeForMobileRichProfile on JobSeekerProfileDateType { isCurrent month year }  fragment awardsForMobileRichProfile on JobSeekerProfileAward { id date { __typename ...dateTypeForMobileRichProfile } description title }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = tl.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        rl rlVar = rl.b;
        ha.g gVar = ha.a;
        hc8Var.j();
        rlVar.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sl) && this.a.equals(((sl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "d141d7f97c6889f833414b4da56fe19ea20d31ae71bb31bf7ae702d413dd965e";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddJobSeekerProfileResumeAwards";
    }

    public final String toString() {
        return "AddJobSeekerProfileResumeAwardsMutation(input=" + this.a + ")";
    }
}
