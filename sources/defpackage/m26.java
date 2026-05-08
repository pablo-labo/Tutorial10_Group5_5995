package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m26 implements c9c<b> {
    public final ota a;

    public static final class a {
        public final String a;
        public final c b;
        public final d c;

        public a(String str, c cVar, d dVar) {
            str.getClass();
            this.a = str;
            this.b = cVar;
            this.c = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && wl7.b(this.b, aVar.b) && wl7.b(this.c, aVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            c cVar = this.b;
            int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            d dVar = this.c;
            return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
        }

        public final String toString() {
            return "Account(__typename=" + this.a + ", onEmployerUser=" + this.b + ", onJobSeekerOnlineStatusAccount=" + this.c + ")";
        }
    }

    public static final class b implements c9c.a {
        public final g a;

        public b(g gVar) {
            this.a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            g gVar = this.a;
            if (gVar == null) {
                return 0;
            }
            return gVar.a.hashCode();
        }

        public final String toString() {
            return "Data(onlineStatuses=" + this.a + ")";
        }
    }

    public static final class c {
        public final f a;

        public c(f fVar) {
            this.a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            f fVar = this.a;
            if (fVar == null) {
                return 0;
            }
            return fVar.hashCode();
        }

        public final String toString() {
            return "OnEmployerUser(onlineStatus=" + this.a + ")";
        }
    }

    public static final class d {
        public final e a;

        public d(e eVar) {
            this.a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            e eVar = this.a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public final String toString() {
            return "OnJobSeekerOnlineStatusAccount(onlineStatus=" + this.a + ")";
        }
    }

    public static final class e {
        public final Integer a;
        public final String b;

        public e(Integer num, String str) {
            this.a = num;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return wl7.b(this.a, eVar.a) && this.b.equals(eVar.b);
        }

        public final int hashCode() {
            Integer num = this.a;
            return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
        }

        public final String toString() {
            return "OnlineStatus1(offlineSeconds=" + this.a + ", status=" + this.b + ")";
        }
    }

    public static final class f {
        public final Integer a;
        public final String b;

        public f(Integer num, String str) {
            this.a = num;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return wl7.b(this.a, fVar.a) && this.b.equals(fVar.b);
        }

        public final int hashCode() {
            Integer num = this.a;
            return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
        }

        public final String toString() {
            return "OnlineStatus(offlineSeconds=" + this.a + ", status=" + this.b + ")";
        }
    }

    public static final class g {
        public final ArrayList a;

        public g(ArrayList arrayList) {
            this.a = arrayList;
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
            return m6.g("OnlineStatuses(accounts=", ")", this.a);
        }
    }

    public m26(ota otaVar) {
        this.a = otaVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        p26 p26Var = p26.a;
        ha.g gVar = ha.a;
        return new ena(p26Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query getOnlineStatuses($input: OnlineStatusesInput!) { onlineStatuses(input: $input) { accounts { __typename ... on EmployerUser { onlineStatus { offlineSeconds status } } ... on JobSeekerOnlineStatusAccount { onlineStatus { offlineSeconds status } } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = d9c.i;
        snaVar.getClass();
        List<vd2> list = n26.g;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
        hc8Var.u0("input");
        zu2 zu2Var = zu2.c;
        ha.g gVar = ha.a;
        hc8Var.j();
        zu2Var.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m26) && this.a.equals(((m26) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "2e45d229252fa390a11a1f08720b16aa5baa4d2a03d50b3df7eb3635ff224d1a";
    }

    @Override // defpackage.pua
    public final String name() {
        return "getOnlineStatuses";
    }

    public final String toString() {
        return "GetOnlineStatusesQuery(input=" + this.a + ")";
    }
}
