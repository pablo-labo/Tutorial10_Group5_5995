package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vxc implements p4a<a> {
    public final uxc a;

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
            return "Data(registerDevice=" + this.a + ")";
        }
    }

    public static final class b {
        public final boolean a;
        public final String b;

        public b(String str, boolean z) {
            this.a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "RegisterDevice(success=" + this.a + ", message=" + this.b + ")";
        }
    }

    public vxc(uxc uxcVar) {
        this.a = uxcVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        xxc xxcVar = xxc.a;
        ha.g gVar = ha.a;
        return new ena(xxcVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation registerDevice($input: RegisterDeviceInput!) { registerDevice(input: $input) { success message } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = t4a.h;
        snaVar.getClass();
        List<vd2> list = wxc.b;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        xn xnVar = xn.c;
        ha.g gVar = ha.a;
        hc8Var.j();
        xnVar.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vxc) && this.a.equals(((vxc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "90998e49ba2b4b6eb0332149750bc440025d44256f7dc324cba94b8a019083d4";
    }

    @Override // defpackage.pua
    public final String name() {
        return "registerDevice";
    }

    public final String toString() {
        return "RegisterDeviceMutation(input=" + this.a + ")";
    }
}
