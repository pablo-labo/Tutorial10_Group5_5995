package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tdg implements p4a<a> {
    public final sdg a;

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
            return "Data(updateJobSeekerProfileResumePublications=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final r6c b;

        public b(String str, r6c r6cVar) {
            this.a = str;
            this.b = r6cVar;
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
            return "Publication(__typename=" + this.a + ", publicationsForMobileRichProfile=" + this.b + ")";
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
            return m6.g("UpdateJobSeekerProfileResumePublications(publications=", ")", this.a);
        }
    }

    public tdg(sdg sdgVar) {
        this.a = sdgVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        vdg vdgVar = vdg.a;
        ha.g gVar = ha.a;
        return new ena(vdgVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation UpdateJobSeekerProfileResumePublications($input: UpdateJobSeekerProfileResumePublicationsInput!) { updateJobSeekerProfileResumePublications(input: $input) { publications { __typename ...publicationsForMobileRichProfile } } }  fragment dateTypeForMobileRichProfile on JobSeekerProfileDateType { isCurrent month year }  fragment publicationsForMobileRichProfile on JobSeekerProfilePublication { id date { __typename ...dateTypeForMobileRichProfile } description title url }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = s4a.R;
        snaVar.getClass();
        List<vd2> list = udg.c;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        cx3 cx3Var = cx3.c;
        ha.g gVar = ha.a;
        hc8Var.j();
        cx3Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdg) && this.a.equals(((tdg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "307febe44b3bc7782edaf5a75a68412c286530957e7dfc694d69c51a8f22e90b";
    }

    @Override // defpackage.pua
    public final String name() {
        return "UpdateJobSeekerProfileResumePublications";
    }

    public final String toString() {
        return "UpdateJobSeekerProfileResumePublicationsMutation(input=" + this.a + ")";
    }
}
