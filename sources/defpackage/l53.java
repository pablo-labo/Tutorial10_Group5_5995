package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l53 implements p4a<b> {

    public static final class a {
        public final Object a;
        public final String b;

        public a(Object obj, String str) {
            this.a = obj;
            this.b = str;
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
            return "CreateJobSeekerProfileUploadResumeFileTempUrl(uploadURL=" + this.a + ", fileId=" + this.b + ")";
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
            return "Data(createJobSeekerProfileUploadResumeFileTempUrl=" + this.a + ")";
        }
    }

    @Override // defpackage.g15
    public final ena a() {
        o53 o53Var = o53.a;
        ha.g gVar = ha.a;
        return new ena(o53Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation CreateJobSeekerProfileUploadResumeFileTempUrl { createJobSeekerProfileUploadResumeFileTempUrl { uploadURL fileId } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = t4a.h;
        snaVar.getClass();
        List<vd2> list = m53.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == l53.class;
    }

    public final int hashCode() {
        return fwc.a.b(l53.class).hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "ddc8e321a0aac9b3d1c0b4a57209a474191d0db5b2c9fe58e17c69133720af0b";
    }

    @Override // defpackage.pua
    public final String name() {
        return "CreateJobSeekerProfileUploadResumeFileTempUrl";
    }
}
