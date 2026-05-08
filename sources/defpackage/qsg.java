package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qsg {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public static final class a extends qsg {
        public final int e;
        public final int f;

        public a(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i3, i4, i5, i6);
            this.e = i;
            this.f = i2;
        }

        @Override // defpackage.qsg
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.e == aVar.e && this.f == aVar.f && this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        @Override // defpackage.qsg
        public final int hashCode() {
            return Integer.hashCode(this.f) + Integer.hashCode(this.e) + super.hashCode();
        }

        public final String toString() {
            return sve.x("ViewportHint.Access(\n            |    pageOffset=" + this.e + ",\n            |    indexInPage=" + this.f + ",\n            |    presentedItemsBefore=" + this.a + ",\n            |    presentedItemsAfter=" + this.b + ",\n            |    originalPageOffsetFirst=" + this.c + ",\n            |    originalPageOffsetLast=" + this.d + ",\n            |)");
        }
    }

    public static final class b extends qsg {
        public final String toString() {
            return sve.x("ViewportHint.Initial(\n            |    presentedItemsBefore=" + this.a + ",\n            |    presentedItemsAfter=" + this.b + ",\n            |    originalPageOffsetFirst=" + this.c + ",\n            |    originalPageOffsetLast=" + this.d + ",\n            |)");
        }
    }

    public qsg(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a(zz8 zz8Var) {
        zz8Var.getClass();
        int iOrdinal = zz8Var.ordinal();
        if (iOrdinal == 0) {
            l5.q("Cannot get presentedItems for loadType: REFRESH");
            return 0;
        }
        if (iOrdinal == 1) {
            return this.a;
        }
        if (iOrdinal == 2) {
            return this.b;
        }
        l.g();
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsg)) {
            return false;
        }
        qsg qsgVar = (qsg) obj;
        return this.a == qsgVar.a && this.b == qsgVar.b && this.c == qsgVar.c && this.d == qsgVar.d;
    }

    public int hashCode() {
        return Integer.hashCode(this.d) + Integer.hashCode(this.c) + Integer.hashCode(this.b) + Integer.hashCode(this.a);
    }
}
