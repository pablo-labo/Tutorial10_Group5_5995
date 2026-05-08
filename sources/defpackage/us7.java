package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class us7 {
    public final Set<a> a;

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
            return akb.k("WorkArea(id=", this.a, ", label=", this.b, ")");
        }
    }

    public us7(Set<a> set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof us7) && wl7.b(this.a, ((us7) obj).a);
    }

    public final int hashCode() {
        Set<a> set = this.a;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }

    public final String toString() {
        return "JSTProfileWorkAreas(selected=" + this.a + ")";
    }

    public us7() {
        this(null);
    }
}
