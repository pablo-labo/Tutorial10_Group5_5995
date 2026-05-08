package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d36 implements c9c<c> {

    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && wl7.b(this.b, aVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return akb.k("Criteria(query=", this.a, ", location=", this.b, ")");
        }
    }

    public static final class b {
        public final d a;

        public b(d dVar) {
            this.a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "CurrentJobSeekerPortrait(rawActivities=" + this.a + ")";
        }
    }

    public static final class c implements c9c.a {
        public final b a;

        public c(b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public final String toString() {
            return "Data(currentJobSeekerPortrait=" + this.a + ")";
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
            return m6.g("RawActivities(recentJobSearches=", ")", this.a);
        }
    }

    public static final class e {
        public final String a;
        public final Object b;
        public final a c;

        public e(String str, Object obj, a aVar) {
            this.a = str;
            this.b = obj;
            this.c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && this.b.equals(eVar.b) && this.c.equals(eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "RecentJobSearch(uid=" + this.a + ", timestamp=" + this.b + ", criteria=" + this.c + ")";
        }
    }

    @Override // defpackage.g15
    public final ena a() {
        h36 h36Var = h36.a;
        ha.g gVar = ha.a;
        return new ena(h36Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query GetRecentJobSearches { currentJobSeekerPortrait { rawActivities { recentJobSearches { uid timestamp criteria { query location } } } } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = h9c.j;
        snaVar.getClass();
        List<vd2> list = e36.e;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == d36.class;
    }

    public final int hashCode() {
        return fwc.a.b(d36.class).hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "88693537a6f16b1e5efb35e4acd2edb33be4916fff04455ef29e6c868f48af39";
    }

    @Override // defpackage.pua
    public final String name() {
        return "GetRecentJobSearches";
    }
}
