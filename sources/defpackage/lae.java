package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lae implements p4a<a> {
    public final kae a;

    public static final class a implements p4a.a {
        public final c a;

        public a(c cVar) {
            this.a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Data(onlineStatusPreference=" + this.a + ")";
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
            return "OnlineStatusPreference1(isEnabled=" + this.a + ")";
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
            return dVar.hashCode();
        }

        public final String toString() {
            return "OnlineStatusPreference(setOnlineStatusPreference=" + this.a + ")";
        }
    }

    public static final class d {
        public final b a;

        public d(b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return Boolean.hashCode(bVar.a);
        }

        public final String toString() {
            return "SetOnlineStatusPreference(onlineStatusPreference=" + this.a + ")";
        }
    }

    public lae(kae kaeVar) {
        this.a = kaeVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        nae naeVar = nae.a;
        ha.g gVar = ha.a;
        return new ena(naeVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation setOnlineStatusPreference($input: SetOnlineStatusPreferenceInput!) { onlineStatusPreference { setOnlineStatusPreference(input: $input) { onlineStatusPreference { isEnabled } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = q4a.d;
        snaVar.getClass();
        List<vd2> list = mae.d;
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
        hc8Var.u0("isEnabled");
        ha.f.b(hc8Var, lb3Var, Boolean.valueOf(this.a.a));
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lae) && this.a.equals(((lae) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a.a);
    }

    @Override // defpackage.pua
    public final String id() {
        return "7a5f72ecc8e2243601722336ac984d98f9bf69e49a3c429aa5663c2179ed3c1e";
    }

    @Override // defpackage.pua
    public final String name() {
        return "setOnlineStatusPreference";
    }

    public final String toString() {
        return "SetOnlineStatusPreferenceMutation(input=" + this.a + ")";
    }
}
