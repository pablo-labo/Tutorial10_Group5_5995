package defpackage;

import defpackage.g15;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class xaf implements g15.a {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final String d;
    public final String e;
    public final ArrayList f;

    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("Context(suid=", this.a, ")");
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
            return l5.m("SectionId(sectionId=", this.a, ")");
        }
    }

    public xaf(String str, ArrayList arrayList, String str2, String str3, String str4, ArrayList arrayList2) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xaf)) {
            return false;
        }
        xaf xafVar = (xaf) obj;
        return wl7.b(this.a, xafVar.a) && this.b.equals(xafVar.b) && wl7.b(this.c, xafVar.c) && wl7.b(this.d, xafVar.d) && wl7.b(this.e, xafVar.e) && this.f.equals(xafVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = z3.d(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.c;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return this.f.hashCode() + ((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyConcept(label=");
        sb.append(this.a);
        sb.append(", sectionIds=");
        sb.append(this.b);
        sb.append(", suid=");
        ia.r(sb, this.c, ", taxonomyConceptId=", this.d, ", type=");
        sb.append(this.e);
        sb.append(", context=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
