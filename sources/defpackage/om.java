package defpackage;

import defpackage.ha;
import defpackage.hva;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class om implements p4a<b> {
    public final hva<mm> a;

    public static final class a {
        public final d a;
        public final f b;
        public final g c;
        public final e d;
        public final c e;

        public a(d dVar, f fVar, g gVar, e eVar, c cVar) {
            this.a = dVar;
            this.b = fVar;
            this.c = gVar;
            this.d = eVar;
            this.e = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && wl7.b(this.b, aVar.b) && wl7.b(this.c, aVar.c) && wl7.b(this.d, aVar.d) && wl7.b(this.e, aVar.e);
        }

        public final int hashCode() {
            d dVar = this.a;
            int iHashCode = (dVar == null ? 0 : dVar.a.hashCode()) * 31;
            f fVar = this.b;
            int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.a.hashCode())) * 31;
            g gVar = this.c;
            int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.a.hashCode())) * 31;
            e eVar = this.d;
            int iHashCode4 = (iHashCode3 + (eVar == null ? 0 : eVar.a.hashCode())) * 31;
            c cVar = this.e;
            return iHashCode4 + (cVar != null ? cVar.a.hashCode() : 0);
        }

        public final String toString() {
            return "AddJobSeekerProfileResumeFile(jobSeekerProfileResume=" + this.a + ", originalResumeFile=" + this.b + ", pdfResumeFile=" + this.c + ", nameEmailPhoneRedactedPdfResumeFile=" + this.d + ", emailPhoneRedactedPdfResumeFile=" + this.e + ")";
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
            return aVar.hashCode();
        }

        public final String toString() {
            return "Data(addJobSeekerProfileResumeFile=" + this.a + ")";
        }
    }

    public static final class c {
        public final String a;

        public c(String str) {
            this.a = str;
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
            return l5.m("EmailPhoneRedactedPdfResumeFile(id=", this.a, ")");
        }
    }

    public static final class d {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("JobSeekerProfileResume(id=", this.a, ")");
        }
    }

    public static final class e {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a.equals(((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("NameEmailPhoneRedactedPdfResumeFile(id=", this.a, ")");
        }
    }

    public static final class f {
        public final String a;

        public f(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a.equals(((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("OriginalResumeFile(id=", this.a, ")");
        }
    }

    public static final class g {
        public final String a;

        public g(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a.equals(((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("PdfResumeFile(id=", this.a, ")");
        }
    }

    public om(hva<mm> hvaVar) {
        hvaVar.getClass();
        this.a = hvaVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        rm rmVar = rm.a;
        ha.g gVar = ha.a;
        return new ena(rmVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation AddJobSeekerProfileResumeFile($input: AddJobSeekerProfileResumeFileInput) { addJobSeekerProfileResumeFile(input: $input) { jobSeekerProfileResume { id } originalResumeFile { id } pdfResumeFile { id } nameEmailPhoneRedactedPdfResumeFile { id } emailPhoneRedactedPdfResumeFile { id } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = t4a.h;
        snaVar.getClass();
        List<vd2> list = pm.g;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hva<mm> hvaVar = this.a;
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("input");
            ha.g gVar = ha.a;
            ena enaVar = new ena(nm.a, false);
            V v = ((hva.c) hvaVar).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof om) && wl7.b(this.a, ((om) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "10beecdfe6d02424308d135b9be227cf92e333d072a09f1af57ccdbe906d84f5";
    }

    @Override // defpackage.pua
    public final String name() {
        return "AddJobSeekerProfileResumeFile";
    }

    public final String toString() {
        return "AddJobSeekerProfileResumeFileMutation(input=" + this.a + ")";
    }
}
