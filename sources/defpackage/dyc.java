package defpackage;

import defpackage.ha;
import defpackage.p4a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dyc implements p4a<b> {
    public final ayc a;

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

    public static final class b implements p4a.a {
        public final g a;

        public b(g gVar) {
            this.a = gVar;
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
            return "Data(onlineStatus=" + this.a + ")";
        }
    }

    public static final class c {
        public final e a;

        public c(e eVar) {
            this.a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            e eVar = this.a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public final String toString() {
            return "OnEmployerUser(onlineStatus=" + this.a + ")";
        }
    }

    public static final class d {
        public final f a;

        public d(f fVar) {
            this.a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            f fVar = this.a;
            if (fVar == null) {
                return 0;
            }
            return fVar.hashCode();
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
            return "OnlineStatus2(offlineSeconds=" + this.a + ", status=" + this.b + ")";
        }
    }

    public static final class g {
        public final h a;

        public g(h hVar) {
            this.a = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && wl7.b(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            h hVar = this.a;
            if (hVar == null) {
                return 0;
            }
            return hVar.a.hashCode();
        }

        public final String toString() {
            return "OnlineStatus(registerListeners=" + this.a + ")";
        }
    }

    public static final class h {
        public final ArrayList a;

        public h(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a.equals(((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return m6.g("RegisterListeners(accounts=", ")", this.a);
        }
    }

    public dyc(ayc aycVar) {
        this.a = aycVar;
    }

    @Override // defpackage.g15
    public final ena a() {
        gyc gycVar = gyc.a;
        ha.g gVar = ha.a;
        return new ena(gycVar, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "mutation registerOnlineStatusListeners($input: RegisterListenersOnlineStatusInput!) { onlineStatus { registerListeners(input: $input) { accounts { __typename ... on EmployerUser { onlineStatus { offlineSeconds status } } ... on JobSeekerOnlineStatusAccount { onlineStatus { offlineSeconds status } } } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = q4a.d;
        snaVar.getClass();
        List<vd2> list = eyc.h;
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
        byc.a.b(hc8Var, lb3Var, this.a);
        hc8Var.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dyc) && this.a.equals(((dyc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "b964e2f56135b9d6ed296a12419b18a68a414051600eda10770173b1d7c51c08";
    }

    @Override // defpackage.pua
    public final String name() {
        return "registerOnlineStatusListeners";
    }

    public final String toString() {
        return "RegisterOnlineStatusListenersMutation(input=" + this.a + ")";
    }
}
