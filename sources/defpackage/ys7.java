package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ys7 {
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
            return this.a.equals(aVar.a) && wl7.b(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return akb.k("WorkWellbeing(id=", this.a, ", label=", this.b, ")");
        }
    }

    public ys7(Set<a> set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ys7) && wl7.b(this.a, ((ys7) obj).a);
    }

    public final int hashCode() {
        Set<a> set = this.a;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }

    public final String toString() {
        return "JSTProfileWorkWellbeing(selected=" + this.a + ")";
    }

    public ys7() {
        this(null);
    }
}
