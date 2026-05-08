package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rh3 {

    public static final class a extends rh3 {
        public final String a;
        public final boolean c;
        public final String b = "language";
        public final String d = "add";

        public a(String str, boolean z) {
            this.a = str;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && wl7.b(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + akb.d(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return z3.o(u40.f("Add(title=", this.a, ", sectionType=", this.b, ", withCallback="), this.c, ")");
        }
    }

    public static final class b extends rh3 {
        public final String a = "Edit Language (no languages in profile)";
        public final String b = "language";
        public final String c = "edit";

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && wl7.b(this.b, bVar.b) && wl7.b(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return l6.i(u40.f("Disabled(title=", this.a, ", sectionType=", this.b, ", mode="), this.c, ")");
        }
    }

    public static final class c extends rh3 {
        public final String a;
        public final String c;
        public final Map<String, Object> d;
        public final boolean e;
        public final String b = "language";
        public final String f = "edit";

        public c(String str, String str2, Map map, boolean z) {
            this.a = str;
            this.c = str2;
            this.d = map;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b) && wl7.b(this.c, cVar.c) && wl7.b(this.d, cVar.d) && this.e == cVar.e;
        }

        public final int hashCode() {
            int iD = akb.d(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, Object> map = this.d;
            return Boolean.hashCode(this.e) + ((iHashCode + (map != null ? map.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("Edit(title=", this.a, ", sectionType=", this.b, ", itemId=");
            sbF.append(this.c);
            sbF.append(", formData=");
            sbF.append(this.d);
            sbF.append(", withCallback=");
            return z3.o(sbF, this.e, ")");
        }
    }

    public static final class d extends rh3 {
        public final String a;
        public final String b;
        public final String c = "add";

        public d(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return wl7.b(this.a, dVar.a) && wl7.b(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return akb.k("NativeAdd(title=", this.a, ", sectionType=", this.b, ")");
        }
    }
}
