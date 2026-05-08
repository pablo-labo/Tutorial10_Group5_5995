package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pbg implements p4a<b> {
    public final obg a;

    public static final class a {
        public final String a;
        public final s61 b;

        public a(String str, s61 s61Var) {
            this.a = str;
            this.b = s61Var;
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
            return "Award(__typename=" + this.a + ", awardsForMobileRichProfile=" + this.b + ")";
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
            return "Data(updateJobSeekerProfileResumeAwards=" + this.a + ")";
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
            return m6.g("UpdateJobSeekerProfileResumeAwards(awards=", ")", this.a);
        }
    }

    public pbg(obg obgVar) {
        this.a = obgVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        sbg sbgVar = sbg.a;
        ha.g gVar = ha.a;
        return new ena(sbgVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateJobSeekerProfileResumeAwards($input: UpdateJobSeekerProfileResumeAwardsInput!) { updateJobSeekerProfileResumeAwards(input: $input) { awards { __typename ...awardsForMobileRichProfile } } }  fragment dateTypeForMobileRichProfile on JobSeekerProfileDateType { isCurrent month year }  fragment awardsForMobileRichProfile on JobSeekerProfileAward { id date { __typename ...dateTypeForMobileRichProfile } description title }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = qbg.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        fv3 fv3Var = fv3.d;
        ha.g gVar = ha.a;
        hc8Var.j();
        fv3Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pbg) && this.a.equals(((pbg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "b09eaf3dfe0392a0d691534a4546cb70994f59ad058090b4a463c1b8def635f2";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateJobSeekerProfileResumeAwards";
    }

    public final String toString() {
        return "UpdateJobSeekerProfileResumeAwardsMutation(input=" + this.a + ")";
    }
}
