package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class au3 implements p4a<a> {
    public final zt3 a;

    public static final class a implements p4a.a {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public final String toString() {
            return "Data(deleteJobSeekerProfileFile=" + this.a + ")";
        }
    }

    public static final class b {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("DeleteJobSeekerProfileFile(id=", this.a, ")");
        }
    }

    public au3(zt3 zt3Var) {
        zt3Var.getClass();
        this.a = zt3Var;
    }

    @Override // defpackage.g15
    public final ena a() {
        cu3 cu3Var = cu3.a;
        ha.g gVar = ha.a;
        return new ena(cu3Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation DeleteJobSeekerProfileFile($input: DeleteJobSeekerProfileFileInput!) { deleteJobSeekerProfileFile(input: $input) { id } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = t4a.h;
        snaVar.getClass();
        List<vd2> list = bu3.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        ha.g gVar = ha.a;
        hc8Var.j();
        zt3 zt3Var = this.a;
        zt3Var.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, zt3Var.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof au3) && wl7.b(this.a, ((au3) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "5de9741e33406ebc8faec91fa6b5fea842912a7297929fdf5f55473fac64132e";
    }

    @Override // defpackage.pua
    public final String name() {
        return "DeleteJobSeekerProfileFile";
    }

    public final String toString() {
        return "DeleteJobSeekerProfileFileMutation(input=" + this.a + ")";
    }
}
