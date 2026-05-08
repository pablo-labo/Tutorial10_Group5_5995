package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g16 implements c9c<a> {

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
            return Boolean.hashCode(this.a.a);
        }

        public final String toString() {
            return "Data(jobSeekerProfileDualResumesEnabled=" + this.a + ")";
        }
    }

    public static final class b {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return "JobSeekerProfileDualResumesEnabled(enabled=" + this.a + ")";
        }
    }

    @Override // defpackage.g15
    public final ena a() {
        i16 i16Var = i16.a;
        ha.g gVar = ha.a;
        return new ena(i16Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query GetJobSeekerProfileDualResumesEnabled { jobSeekerProfileDualResumesEnabled { enabled } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = f9c.e;
        snaVar.getClass();
        List<vd2> list = h16.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == g16.class;
    }

    public final int hashCode() {
        return fwc.a.b(g16.class).hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "6673628b26aaf7deb750591cbf81d50071d992919f1c1af86b8f3596b1d5f7c4";
    }

    @Override // defpackage.pua
    public final String name() {
        return "GetJobSeekerProfileDualResumesEnabled";
    }
}
