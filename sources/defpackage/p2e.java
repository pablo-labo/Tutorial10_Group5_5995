package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p2e {
    public final a a;
    public final a b;
    public final boolean c;

    public static final class a {
        public final b5d a;
        public final int b;
        public final long c;

        public a(b5d b5dVar, int i, long j) {
            this.a = b5dVar;
            this.b = i;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + w40.c(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
        }
    }

    public p2e(a aVar, a aVar2, boolean z) {
        this.a = aVar;
        this.b = aVar2;
        this.c = z;
    }

    public static p2e a(p2e p2eVar, a aVar, a aVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            aVar = p2eVar.a;
        }
        if ((i & 2) != 0) {
            aVar2 = p2eVar.b;
        }
        if ((i & 4) != 0) {
            z = p2eVar.c;
        }
        p2eVar.getClass();
        return new p2e(aVar, aVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2e)) {
            return false;
        }
        p2e p2eVar = (p2e) obj;
        return wl7.b(this.a, p2eVar.a) && wl7.b(this.b, p2eVar.b) && this.c == p2eVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return m6.i(sb, this.c, ')');
    }
}
