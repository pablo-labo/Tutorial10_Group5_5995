package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class geg implements p4a<a> {
    public final kcg a;

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
            return cVar.hashCode();
        }

        public final String toString() {
            return "Data(updateJobSeekerProfileResume=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && wl7.b(this.b, bVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return akb.k("Resume(id=", this.a, ", summary=", this.b, ")");
        }
    }

    public static final class c {
        public final b a;

        public c(b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public final String toString() {
            return "UpdateJobSeekerProfileResume(resume=" + this.a + ")";
        }
    }

    public geg(kcg kcgVar) {
        this.a = kcgVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        ieg iegVar = ieg.a;
        ha.g gVar = ha.a;
        return new ena(iegVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateJobSeekerProfileResumeSummary($input: UpdateJobSeekerProfileResumeInput!) { updateJobSeekerProfileResume(input: $input) { resume { id summary } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = heg.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        pv3 pv3Var = pv3.d;
        ha.g gVar = ha.a;
        hc8Var.j();
        pv3Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof geg) && this.a.equals(((geg) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "e63d31c34957317eebb78ba10a3f1bacbabb5756b31e70a203beab74c3209523";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateJobSeekerProfileResumeSummary";
    }

    public final String toString() {
        return "UpdateJobSeekerProfileResumeSummaryMutation(input=" + this.a + ")";
    }
}
