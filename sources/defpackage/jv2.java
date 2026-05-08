package defpackage;

import defpackage.g15;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class jv2 implements g15.a {
    public final String a;
    public final av2 b;
    public final g c;
    public final i d;
    public final h e;
    public final ArrayList f;
    public final a g;
    public final b h;
    public final ArrayList i;
    public final ArrayList j;
    public final String k;

    public static final class a {
        public final String a;
        public final rx7 b;

        public a(String str, rx7 rx7Var) {
            this.a = str;
            this.b = rx7Var;
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
            return "Job(__typename=" + this.a + ", jobData=" + this.b + ")";
        }
    }

    public static final class b {
        public final String a;
        public final String b;
        public final jk8 c;

        public b(String str, String str2, jk8 jk8Var) {
            this.a = str;
            this.b = str2;
            this.c = jk8Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("LastEvent(__typename=", this.a, ", id=", this.b, ", lastEvent=");
            sbF.append(this.c);
            sbF.append(")");
            return sbF.toString();
        }
    }

    public static final class c {
        public final Boolean a;
        public final r29 b;
        public final Date c;

        public c(Boolean bool, r29 r29Var, Date date) {
            this.a = bool;
            this.b = r29Var;
            this.c = date;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && this.b == cVar.b && wl7.b(this.c, cVar.c);
        }

        public final int hashCode() {
            Boolean bool = this.a;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            r29 r29Var = this.b;
            int iHashCode2 = (iHashCode + (r29Var == null ? 0 : r29Var.hashCode())) * 31;
            Date date = this.c;
            return iHashCode2 + (date != null ? date.hashCode() : 0);
        }

        public final String toString() {
            return "Lock(primary=" + this.a + ", reason=" + this.b + ", timestamp=" + this.c + ")";
        }
    }

    public static final class d {
        public final gy2 a;
        public final String b;
        public final String c;
        public final Boolean d;

        public d(gy2 gy2Var, String str, String str2, Boolean bool) {
            this.a = gy2Var;
            this.b = str;
            this.c = str2;
            this.d = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && wl7.b(this.b, dVar.b) && wl7.b(this.c, dVar.c) && wl7.b(this.d, dVar.d);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.d;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            return "Participant(role=" + this.a + ", accountKey=" + this.b + ", participantName=" + this.c + ", removed=" + this.d + ")";
        }
    }

    public static final class e {
        public final boolean a;
        public final Date b;

        public e(Date date, boolean z) {
            this.a = z;
            this.b = date;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && wl7.b(this.b, eVar.b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.a) * 31;
            Date date = this.b;
            return iHashCode + (date == null ? 0 : date.hashCode());
        }

        public final String toString() {
            return "RequireResponse(required=" + this.a + ", timestamp=" + this.b + ")";
        }
    }

    public static final class f {
        public final qy2 a;
        public final String b;

        public f(qy2 qy2Var, String str) {
            this.a = qy2Var;
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
            return this.a == fVar.a && this.b.equals(fVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Scope(key=" + this.a + ", value=" + this.b + ")";
        }
    }

    public static final class g {
        public final e a;

        public g(e eVar) {
            this.a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && wl7.b(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            e eVar = this.a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public final String toString() {
            return "UserContext(requireResponse=" + this.a + ")";
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
            return m6.g("UserLabelInfo(labels=", ")", this.a);
        }
    }

    public static final class i {
        public final Date a;
        public final Date b;
        public final int c;

        public i(Date date, Date date2, int i) {
            this.a = date;
            this.b = date2;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return wl7.b(this.a, iVar.a) && this.b.equals(iVar.b) && this.c == iVar.c;
        }

        public final int hashCode() {
            Date date = this.a;
            int iHashCode = date == null ? 0 : date.hashCode();
            return Integer.hashCode(this.c) + ((this.b.hashCode() + (iHashCode * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UserReadsInfo(lastVisited=");
            sb.append(this.a);
            sb.append(", readCursor=");
            sb.append(this.b);
            sb.append(", unreadCount=");
            return w20.k(sb, this.c, ")");
        }
    }

    public jv2(String str, av2 av2Var, g gVar, i iVar, h hVar, ArrayList arrayList, a aVar, b bVar, ArrayList arrayList2, ArrayList arrayList3, String str2) {
        this.a = str;
        this.b = av2Var;
        this.c = gVar;
        this.d = iVar;
        this.e = hVar;
        this.f = arrayList;
        this.g = aVar;
        this.h = bVar;
        this.i = arrayList2;
        this.j = arrayList3;
        this.k = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv2)) {
            return false;
        }
        jv2 jv2Var = (jv2) obj;
        return this.a.equals(jv2Var.a) && this.b == jv2Var.b && wl7.b(this.c, jv2Var.c) && wl7.b(this.d, jv2Var.d) && wl7.b(this.e, jv2Var.e) && this.f.equals(jv2Var.f) && wl7.b(this.g, jv2Var.g) && wl7.b(this.h, jv2Var.h) && this.i.equals(jv2Var.i) && this.j.equals(jv2Var.j) && this.k.equals(jv2Var.k);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        g gVar = this.c;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        i iVar = this.d;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        h hVar = this.e;
        int iD = z3.d(this.f, (iHashCode3 + (hVar == null ? 0 : hVar.a.hashCode())) * 31, 31);
        a aVar = this.g;
        int iHashCode4 = (iD + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.h;
        return this.k.hashCode() + z3.d(this.j, z3.d(this.i, (iHashCode4 + (bVar != null ? bVar.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConversationDetails(id=");
        sb.append(this.a);
        sb.append(", context=");
        sb.append(this.b);
        sb.append(", userContext=");
        sb.append(this.c);
        sb.append(", userReadsInfo=");
        sb.append(this.d);
        sb.append(", userLabelInfo=");
        sb.append(this.e);
        sb.append(", participants=");
        sb.append(this.f);
        sb.append(", job=");
        sb.append(this.g);
        sb.append(", lastEvent=");
        sb.append(this.h);
        sb.append(", locks=");
        sb.append(this.i);
        sb.append(", scope=");
        sb.append(this.j);
        sb.append(", __typename=");
        return l6.i(sb, this.k, ")");
    }
}
