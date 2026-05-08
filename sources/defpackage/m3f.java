package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m3f {

    public static final class a extends m3f {
        public final String a;
        public final Map<String, Object> b;
        public final Map<String, String> c;
        public final EnumC0313a d;
        public final Boolean e;
        public final String f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: m3f$a$a, reason: collision with other inner class name */
        public static final class EnumC0313a {
            public static final /* synthetic */ EnumC0313a[] a = {new EnumC0313a("POST", 0), new EnumC0313a("PUT", 1), new EnumC0313a("DELETE", 2), new EnumC0313a("PATCH", 3)};

            /* JADX INFO: Fake field, exist only in values array */
            EnumC0313a EF5;

            public EnumC0313a() {
                throw null;
            }

            public static EnumC0313a valueOf(String str) {
                return (EnumC0313a) Enum.valueOf(EnumC0313a.class, str);
            }

            public static EnumC0313a[] values() {
                return (EnumC0313a[]) a.clone();
            }
        }

        public a(String str, Map<String, ? extends Object> map, Map<String, String> map2, EnumC0313a enumC0313a, Boolean bool, String str2) {
            str.getClass();
            enumC0313a.getClass();
            str2.getClass();
            this.a = str;
            this.b = map;
            this.c = map2;
            this.d = enumC0313a;
            this.e = bool;
            this.f = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && wl7.b(this.b, aVar.b) && wl7.b(this.c, aVar.c) && this.d == aVar.d && wl7.b(this.e, aVar.e) && wl7.b(this.f, aVar.f);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Map<String, Object> map = this.b;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, String> map2 = this.c;
            int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31)) * 31;
            Boolean bool = this.e;
            return this.f.hashCode() + ((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "APIAction(actionId=" + this.a + ", body=" + this.b + ", headers=" + this.c + ", method=" + this.d + ", refresh=" + this.e + ", url=" + this.f + ")";
        }
    }

    public static final class b extends m3f {
        public final String a;
        public final Map<String, Object> b;

        public b(String str, Map<String, ? extends Object> map) {
            str.getClass();
            this.a = str;
            this.b = map;
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
            int iHashCode = this.a.hashCode() * 31;
            Map<String, Object> map = this.b;
            return iHashCode + (map == null ? 0 : map.hashCode());
        }

        public final String toString() {
            return "CustomAction(actionId=" + this.a + ", data=" + this.b + ")";
        }
    }

    public static final class c extends m3f {
        public final String a;
        public final String b;
        public final Boolean c;

        public c(String str, String str2, Boolean bool) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b) && wl7.b(this.c, cVar.c);
        }

        public final int hashCode() {
            int iD = akb.d(this.a.hashCode() * 31, 31, this.b);
            Boolean bool = this.c;
            return iD + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            return l5.n(u40.f("GQLAction(actionId=", this.a, ", mutation=", this.b, ", refresh="), this.c, ")");
        }
    }

    public static final class d extends m3f {
        public final String a;
        public final Boolean b;
        public final String c;

        public d(String str, String str2, Boolean bool) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = bool;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return wl7.b(this.a, dVar.a) && wl7.b(this.b, dVar.b) && wl7.b(this.c, dVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Boolean bool = this.b;
            return this.c.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NavigationAction(actionId=");
            sb.append(this.a);
            sb.append(", newTab=");
            sb.append(this.b);
            sb.append(", url=");
            return l6.i(sb, this.c, ")");
        }
    }
}
