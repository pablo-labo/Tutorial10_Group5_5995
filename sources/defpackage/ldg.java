package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ldg implements p4a<a> {
    public final kdg a;

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
            return "Data(updateJobSeekerProfileResumePatents=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final q5b b;

        public b(String str, q5b q5bVar) {
            this.a = str;
            this.b = q5bVar;
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
            return "Patent(__typename=" + this.a + ", patentsForMobileRichProfile=" + this.b + ")";
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
            return m6.g("UpdateJobSeekerProfileResumePatents(patents=", ")", this.a);
        }
    }

    public ldg(kdg kdgVar) {
        this.a = kdgVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        ndg ndgVar = ndg.a;
        ha.g gVar = ha.a;
        return new ena(ndgVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateJobSeekerProfileResumePatents($input: UpdateJobSeekerProfileResumePatentsInput!) { updateJobSeekerProfileResumePatents(input: $input) { patents { __typename ...patentsForMobileRichProfile } } }  fragment dateTypeForMobileRichProfile on JobSeekerProfileDateType { isCurrent month year }  fragment patentsForMobileRichProfile on JobSeekerProfilePatent { id date { __typename ...dateTypeForMobileRichProfile } patentNumber description title url }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = mdg.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        vw3 vw3Var = vw3.d;
        ha.g gVar = ha.a;
        hc8Var.j();
        vw3Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ldg) && this.a.equals(((ldg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "4c07702f16113b6c482bb5a725a9e23bbf4cd4083e8a17a3499ac494895ded8c";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateJobSeekerProfileResumePatents";
    }

    public final String toString() {
        return "UpdateJobSeekerProfileResumePatentsMutation(input=" + this.a + ")";
    }
}
