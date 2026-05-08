package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q16 implements c9c<a> {

    public static final class a implements c9c.a {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "Data(jobSeekerResumes=" + this.a + ")";
        }
    }

    public static final class b {
        public final ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("JobSeekerResumes(resumes=", ")", this.a);
        }
    }

    public static final class c {
        public final String a;
        public final String b;
        public final String c;
        public final t18 d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final Object i;

        public c(String str, String str2, String str3, t18 t18Var, String str4, String str5, String str6, String str7, Object obj) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = t18Var;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && wl7.b(this.b, cVar.b) && wl7.b(this.c, cVar.c) && this.d == cVar.d && wl7.b(this.e, cVar.e) && wl7.b(this.f, cVar.f) && wl7.b(this.g, cVar.g) && wl7.b(this.h, cVar.h) && wl7.b(this.i, cVar.i);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            t18 t18Var = this.d;
            int iHashCode4 = (iHashCode3 + (t18Var == null ? 0 : t18Var.hashCode())) * 31;
            String str3 = this.e;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.g;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.h;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Object obj = this.i;
            return iHashCode8 + (obj != null ? obj.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("Metadata1(id=", this.a, ", clientApp=", this.b, ", fileName=");
            sbF.append(this.c);
            sbF.append(", fileType=");
            sbF.append(this.d);
            sbF.append(", mediaType=");
            ia.r(sbF, this.e, ", fileDescription=", this.f, ", extension=");
            ia.r(sbF, this.g, ", standardHashCode=", this.h, ", uploadTimestamp=");
            sbF.append(this.i);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class d {
        public final String a;
        public final String b;
        public final String c;
        public final t18 d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final Object i;

        public d(String str, String str2, String str3, t18 t18Var, String str4, String str5, String str6, String str7, Object obj) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = t18Var;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && wl7.b(this.b, dVar.b) && wl7.b(this.c, dVar.c) && this.d == dVar.d && wl7.b(this.e, dVar.e) && wl7.b(this.f, dVar.f) && wl7.b(this.g, dVar.g) && wl7.b(this.h, dVar.h) && wl7.b(this.i, dVar.i);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            t18 t18Var = this.d;
            int iHashCode4 = (iHashCode3 + (t18Var == null ? 0 : t18Var.hashCode())) * 31;
            String str3 = this.e;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.g;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.h;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Object obj = this.i;
            return iHashCode8 + (obj != null ? obj.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("Metadata(id=", this.a, ", clientApp=", this.b, ", fileName=");
            sbF.append(this.c);
            sbF.append(", fileType=");
            sbF.append(this.d);
            sbF.append(", mediaType=");
            ia.r(sbF, this.e, ", fileDescription=", this.f, ", extension=");
            ia.r(sbF, this.g, ", standardHashCode=", this.h, ", uploadTimestamp=");
            sbF.append(this.i);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class e {
        public final String a;
        public final c b;

        public e(String str, c cVar) {
            this.a = str;
            this.b = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && this.b.equals(eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OriginalUploadedFile(url=" + this.a + ", metadata=" + this.b + ")";
        }
    }

    public static final class f {
        public final String a;
        public final d b;

        public f(String str, d dVar) {
            this.a = str;
            this.b = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && this.b.equals(fVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PdfResumeFile(url=" + this.a + ", metadata=" + this.b + ")";
        }
    }

    public static final class g {
        public final String a;
        public final f b;
        public final e c;

        public g(String str, f fVar, e eVar) {
            this.a = str;
            this.b = fVar;
            this.c = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a.equals(gVar.a) && wl7.b(this.b, gVar.b) && wl7.b(this.c, gVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            f fVar = this.b;
            int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
            e eVar = this.c;
            return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
        }

        public final String toString() {
            return "Resume(resumeId=" + this.a + ", pdfResumeFile=" + this.b + ", originalUploadedFile=" + this.c + ")";
        }
    }

    @Override // defpackage.g15
    public final ena a() {
        s16 s16Var = s16.a;
        ha.g gVar = ha.a;
        return new ena(s16Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query GetJobSeekerResumes { jobSeekerResumes { resumes { resumeId pdfResumeFile { url metadata { id clientApp fileName fileType mediaType fileDescription extension standardHashCode uploadTimestamp } } originalUploadedFile { url metadata { id clientApp fileName fileType mediaType fileDescription extension standardHashCode uploadTimestamp } } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = f9c.e;
        snaVar.getClass();
        List<vd2> list = r16.g;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == q16.class;
    }

    public final int hashCode() {
        return fwc.a.b(q16.class).hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "0f1af05ca9e9bde6a8110091d1720700c2786de90a2db212f5090dc5bf9a3fd6";
    }

    @Override // defpackage.pua
    public final String name() {
        return "GetJobSeekerResumes";
    }
}
