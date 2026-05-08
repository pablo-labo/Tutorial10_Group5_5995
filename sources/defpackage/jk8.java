package defpackage;

import defpackage.g15;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class jk8 implements g15.a {
    public final String a;
    public final sw2 b;
    public final qw2 c;
    public final String d;
    public final Date e;
    public final b f;
    public final ArrayList g;
    public final String h;

    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return l6.i(u40.f("Attachment(contentHash=", this.a, ", fileName=", this.b, ", fileExtension="), this.c, ")");
        }
    }

    public static final class b {
        public final gy2 a;

        public b(gy2 gy2Var) {
            this.a = gy2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            gy2 gy2Var = this.a;
            if (gy2Var == null) {
                return 0;
            }
            return gy2Var.hashCode();
        }

        public final String toString() {
            return "Author(role=" + this.a + ")";
        }
    }

    public jk8(String str, sw2 sw2Var, qw2 qw2Var, String str2, Date date, b bVar, ArrayList arrayList, String str3) {
        this.a = str;
        this.b = sw2Var;
        this.c = qw2Var;
        this.d = str2;
        this.e = date;
        this.f = bVar;
        this.g = arrayList;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk8)) {
            return false;
        }
        jk8 jk8Var = (jk8) obj;
        return this.a.equals(jk8Var.a) && this.b == jk8Var.b && this.c == jk8Var.c && wl7.b(this.d, jk8Var.d) && this.e.equals(jk8Var.e) && this.f.equals(jk8Var.f) && this.g.equals(jk8Var.g) && this.h.equals(jk8Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        qw2 qw2Var = this.c;
        int iHashCode2 = (iHashCode + (qw2Var == null ? 0 : qw2Var.hashCode())) * 31;
        String str = this.d;
        return this.h.hashCode() + z3.d(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "LastEvent(id=" + this.a + ", type=" + this.b + ", subType=" + this.c + ", messagePreview=" + this.d + ", publicationDateTime=" + this.e + ", author=" + this.f + ", attachments=" + this.g + ", __typename=" + this.h + ")";
    }
}
