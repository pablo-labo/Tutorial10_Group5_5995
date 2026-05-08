package defpackage;

import defpackage.g15;

/* JADX INFO: loaded from: classes3.dex */
public final class ig3 implements g15.a {
    public final a a;
    public final Boolean b;
    public final b c;

    public static final class a {
        public final Boolean a;
        public final s38 b;
        public final Integer c;

        public a(Boolean bool, s38 s38Var, Integer num) {
            this.a = bool;
            this.b = s38Var;
            this.c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && this.b == aVar.b && wl7.b(this.c, aVar.c);
        }

        public final int hashCode() {
            Boolean bool = this.a;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            s38 s38Var = this.b;
            int iHashCode2 = (iHashCode + (s38Var == null ? 0 : s38Var.hashCode())) * 31;
            Integer num = this.c;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "FromDate(isCurrent=" + this.a + ", month=" + this.b + ", year=" + this.c + ")";
        }
    }

    public static final class b {
        public final Boolean a;
        public final s38 b;
        public final Integer c;

        public b(Boolean bool, s38 s38Var, Integer num) {
            this.a = bool;
            this.b = s38Var;
            this.c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && this.b == bVar.b && wl7.b(this.c, bVar.c);
        }

        public final int hashCode() {
            Boolean bool = this.a;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            s38 s38Var = this.b;
            int iHashCode2 = (iHashCode + (s38Var == null ? 0 : s38Var.hashCode())) * 31;
            Integer num = this.c;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "ToDate(isCurrent=" + this.a + ", month=" + this.b + ", year=" + this.c + ")";
        }
    }

    public ig3(a aVar, Boolean bool, b bVar) {
        this.a = aVar;
        this.b = bool;
        this.c = bVar;
    }

    public static ig3 a(ig3 ig3Var, a aVar, Boolean bool, b bVar, int i) {
        if ((i & 1) != 0) {
            aVar = ig3Var.a;
        }
        if ((i & 2) != 0) {
            bool = ig3Var.b;
        }
        if ((i & 4) != 0) {
            bVar = ig3Var.c;
        }
        ig3Var.getClass();
        return new ig3(aVar, bool, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig3)) {
            return false;
        }
        ig3 ig3Var = (ig3) obj;
        return wl7.b(this.a, ig3Var.a) && wl7.b(this.b, ig3Var.b) && wl7.b(this.c, ig3Var.c);
    }

    public final int hashCode() {
        a aVar = this.a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        b bVar = this.c;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "DateRangeForMobileRichProfile(fromDate=" + this.a + ", isCurrent=" + this.b + ", toDate=" + this.c + ")";
    }
}
