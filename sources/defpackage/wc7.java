package defpackage;

import defpackage.c9c;
import defpackage.ha;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wc7 implements c9c<e> {

    public static final class a {
        public final String a;
        public final i b;

        public a(String str, i iVar) {
            str.getClass();
            this.a = str;
            this.b = iVar;
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
            int iHashCode = this.a.hashCode() * 31;
            i iVar = this.b;
            return iHashCode + (iVar == null ? 0 : iVar.hashCode());
        }

        public final String toString() {
            return "Account(__typename=" + this.a + ", onPassportAccount=" + this.b + ")";
        }
    }

    public static final class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && wl7.b(this.b, bVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return akb.k("AccountName(firstName=", this.a, ", lastName=", this.b, ")");
        }
    }

    public static final class c {
        public final b a;
        public final f b;

        public c(b bVar, f fVar) {
            this.a = bVar;
            this.b = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b);
        }

        public final int hashCode() {
            b bVar = this.a;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            f fVar = this.b;
            return iHashCode + (fVar != null ? fVar.hashCode() : 0);
        }

        public final String toString() {
            return "AccountProfile(accountName=" + this.a + ", email=" + this.b + ")";
        }
    }

    public static final class d {
        public final a a;

        public d(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public final String toString() {
            return "CurrentUser(account=" + this.a + ")";
        }
    }

    public static final class e implements c9c.a {
        public final d a;
        public final g b;
        public final h c;

        public e(d dVar, g gVar, h hVar) {
            this.a = dVar;
            this.b = gVar;
            this.c = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return wl7.b(this.a, eVar.a) && wl7.b(this.b, eVar.b) && wl7.b(this.c, eVar.c);
        }

        public final int hashCode() {
            d dVar = this.a;
            int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            g gVar = this.b;
            int iHashCode2 = (iHashCode + (gVar == null ? 0 : Integer.hashCode(gVar.a))) * 31;
            h hVar = this.c;
            return iHashCode2 + (hVar != null ? Integer.hashCode(hVar.a) : 0);
        }

        public final String toString() {
            return "Data(currentUser=" + this.a + ", getGlobalUnreadEventCount=" + this.b + ", getUnreadConversationCount=" + this.c + ")";
        }
    }

    public static final class f {
        public final Object a;
        public final boolean b;

        public f(Object obj, boolean z) {
            this.a = obj;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && this.b == fVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Email(emailAddress=" + this.a + ", isVerified=" + this.b + ")";
        }
    }

    public static final class g {
        public final int a;

        public g(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return bg.d(this.a, "GetGlobalUnreadEventCount(globalUnreadEventCount=", ")");
        }
    }

    public static final class h {
        public final int a;

        public h(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return bg.d(this.a, "GetUnreadConversationCount(unreadConversationCount=", ")");
        }
    }

    public static final class i {
        public final c a;
        public final String b;
        public final Object c;
        public final String d;
        public final boolean e;
        public final boolean f;
        public final Object g;

        public i(c cVar, String str, Object obj, String str2, boolean z, boolean z2, Object obj2) {
            this.a = cVar;
            this.b = str;
            this.c = obj;
            this.d = str2;
            this.e = z;
            this.f = z2;
            this.g = obj2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return wl7.b(this.a, iVar.a) && this.b.equals(iVar.b) && this.c.equals(iVar.c) && this.d.equals(iVar.d) && this.e == iVar.e && this.f == iVar.f && this.g.equals(iVar.g);
        }

        public final int hashCode() {
            c cVar = this.a;
            return this.g.hashCode() + ia.f(ia.f(akb.d((this.c.hashCode() + akb.d((cVar == null ? 0 : cVar.hashCode()) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnPassportAccount(accountProfile=");
            sb.append(this.a);
            sb.append(", id=");
            sb.append(this.b);
            sb.append(", accountId=");
            sb.append(this.c);
            sb.append(", emailAddress=");
            sb.append(this.d);
            sb.append(", isConfirmed=");
            p6.j(sb, this.e, ", isSignedIn=", this.f, ", creationDate=");
            sb.append(this.g);
            sb.append(")");
            return sb.toString();
        }
    }

    @Override // defpackage.g15
    public final ena a() {
        cd7 cd7Var = cd7.a;
        ha.g gVar = ha.a;
        return new ena(cd7Var, false);
    }

    @Override // defpackage.pua
    public final String b() {
        return "query initGraph { currentUser { account { __typename ... on PassportAccount { accountProfile { accountName { firstName lastName } email { emailAddress isVerified } } id accountId emailAddress isConfirmed isSignedIn creationDate } } } getGlobalUnreadEventCount(input: { conversationFilter: { excludedLabels: [\"JS_MSG_FOLDER/ARCHIVE\",\"JS_MSG_FOLDER/SPAM\"] }  } ) { globalUnreadEventCount } getUnreadConversationCount(input: { conversationFilter: { excludedLabels: [\"JS_MSG_FOLDER/ARCHIVE\",\"JS_MSG_FOLDER/SPAM\"] }  } ) { unreadConversationCount } }";
    }

    @Override // defpackage.g15
    public final pd2 c() {
        sna snaVar = h9c.j;
        snaVar.getClass();
        List<vd2> list = xc7.i;
        list.getClass();
        zr4 zr4Var = zr4.a;
        return new pd2("data", snaVar, zr4Var, zr4Var, list);
    }

    @Override // defpackage.g15
    public final void d(hc8 hc8Var, lb3 lb3Var, boolean z) {
        lb3Var.getClass();
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == wc7.class;
    }

    public final int hashCode() {
        return fwc.a.b(wc7.class).hashCode();
    }

    @Override // defpackage.pua
    public final String id() {
        return "7ca90dc7ca7e0d98cab05b3cbbbdfe30ff76c71b9a928747e3fff9d024f2fa8e";
    }

    @Override // defpackage.pua
    public final String name() {
        return "initGraph";
    }
}
