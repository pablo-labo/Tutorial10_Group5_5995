package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g53 implements p4a<b> {

    public static final class a {
        public final Object a;
        public final Object b;
        public final Object c;
        public final Object d;

        public a(Object obj, Object obj2, Object obj3, Object obj4) {
            this.a = obj;
            this.b = obj2;
            this.c = obj3;
            this.d = obj4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && wl7.b(this.b, aVar.b) && wl7.b(this.c, aVar.c) && wl7.b(this.d, aVar.d);
        }

        public final int hashCode() {
            Object obj = this.a;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.b;
            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Object obj3 = this.c;
            int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
            Object obj4 = this.d;
            return iHashCode3 + (obj4 != null ? obj4.hashCode() : 0);
        }

        public final String toString() {
            return "CreateJobSeekerProfileResumeFileTempUrls(emailPhoneRedactedResumeUrl=" + this.a + ", nameEmailPhoneRedactedResumeUrl=" + this.b + ", originalResumeUrl=" + this.c + ", pdfResumeUrl=" + this.d + ")";
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
            return "Data(createJobSeekerProfileResumeFileTempUrls=" + this.a + ")";
        }
    }

    @Override // defpackage.g15
    public final ena a() {
        j53 j53Var = j53.a;
        ha.g gVar = ha.a;
        return new ena(j53Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation CreateJobSeekerProfileResumeFileDownloadUrls { createJobSeekerProfileResumeFileTempUrls { emailPhoneRedactedResumeUrl nameEmailPhoneRedactedResumeUrl originalResumeUrl pdfResumeUrl } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = t4a.h;
        snaVar.getClass();
        List<vd2> list = h53.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == g53.class;
    }

    public final int hashCode() {
        return fwc.a.b(g53.class).hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "a71e5ebb002602deae32e7ef702ca75991765a2ce575fe5460b21cd3ebc8dbac";
    }

    @Override // defpackage.pua
    public final String name() {
        return "CreateJobSeekerProfileResumeFileDownloadUrls";
    }
}
