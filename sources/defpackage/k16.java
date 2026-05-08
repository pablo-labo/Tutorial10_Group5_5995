package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k16 implements c9c<a> {

    public static final class a implements c9c.a {
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
            return "Data(jobSeekerProfile=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;
        public final String b;
        public final u18 c;
        public final Object d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        public b(String str, String str2, u18 u18Var, Object obj, String str3, String str4, String str5, String str6, String str7) {
            this.a = str;
            this.b = str2;
            this.c = u18Var;
            this.d = obj;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = str6;
            this.i = str7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && wl7.b(this.b, bVar.b) && this.c == bVar.c && wl7.b(this.d, bVar.d) && wl7.b(this.e, bVar.e) && wl7.b(this.f, bVar.f) && wl7.b(this.g, bVar.g) && wl7.b(this.h, bVar.h) && wl7.b(this.i, bVar.i);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            u18 u18Var = this.c;
            int iHashCode3 = (iHashCode2 + (u18Var == null ? 0 : u18Var.hashCode())) * 31;
            Object obj = this.d;
            int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str2 = this.e;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.g;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.h;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.i;
            return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("FileInformation(id=", this.a, ", fileName=", this.b, ", fileType=");
            sbF.append(this.c);
            sbF.append(", uploadTimestamp=");
            sbF.append(this.d);
            sbF.append(", mediaType=");
            ia.r(sbF, this.e, ", fileDescription=", this.f, ", extension=");
            ia.r(sbF, this.g, ", clientApp=", this.h, ", standardHashCode=");
            return l6.i(sbF, this.i, ")");
        }
    }

    public static final class c {
        public final d a;

        public c(d dVar) {
            this.a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.a.hashCode();
        }

        public final String toString() {
            return "JobSeekerProfile(profile=" + this.a + ")";
        }
    }

    public static final class d {
        public final ArrayList a;

        public d(ArrayList arrayList) {
            this.a = arrayList;
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
            return m6.g("Profile(fileInformation=", ")", this.a);
        }
    }

    @Override // defpackage.g15
    public final ena a() {
        m16 m16Var = m16.a;
        ha.g gVar = ha.a;
        return new ena(m16Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query GetJobSeekerProfileResumeFileData { jobSeekerProfile { profile { fileInformation { id fileName fileType uploadTimestamp mediaType fileDescription extension clientApp standardHashCode } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = h9c.j;
        snaVar.getClass();
        List<vd2> list = l16.d;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == k16.class;
    }

    public final int hashCode() {
        return fwc.a.b(k16.class).hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "5f7f67c6d70b66cc21b446d9241997605c1b652da2fa3ddcd6ac21c65fa07383";
    }

    @Override // defpackage.pua
    public final String name() {
        return "GetJobSeekerProfileResumeFileData";
    }
}
