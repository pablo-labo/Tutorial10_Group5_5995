package defpackage;

import defpackage.g15;

/* JADX INFO: loaded from: classes3.dex */
public final class mob implements g15.a {
    public final String a;
    public final a b;

    public static final class a {
        public final int a;
        public final String b;
        public final b c;

        public a(int i, String str, b bVar) {
            this.a = i;
            this.b = str;
            this.c = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && wl7.b(this.b, aVar.b) && wl7.b(this.c, aVar.c);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            b bVar = this.c;
            return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbJ = m6.j(this.a, "Bucket(value=", ", description=", this.b, ", payload=");
            sbJ.append(this.c);
            sbJ.append(")");
            return sbJ.toString();
        }
    }

    public static final class b {
        public final String a;
        public final uu9 b;

        public b(String str, uu9 uu9Var) {
            this.a = str;
            this.b = uu9Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            uu9 uu9Var = this.b;
            return iHashCode + (uu9Var == null ? 0 : uu9Var.hashCode());
        }

        public final String toString() {
            return "Payload(value=" + this.a + ", type=" + this.b + ")";
        }
    }

    public mob(String str, a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mob)) {
            return false;
        }
        mob mobVar = (mob) obj;
        return this.a.equals(mobVar.a) && this.b.equals(mobVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProctorAllocationResult(testName=" + this.a + ", bucket=" + this.b + ")";
    }
}
