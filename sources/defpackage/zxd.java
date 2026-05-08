package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface zxd {

    public static final class a {
        public final byd a;
        public final byd b;

        public a(byd bydVar, byd bydVar2) {
            this.a = bydVar;
            this.b = bydVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a.equals(aVar.a) && this.b.equals(aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("[");
            byd bydVar = this.a;
            sb.append(bydVar);
            byd bydVar2 = this.b;
            if (bydVar.equals(bydVar2)) {
                str = "";
            } else {
                str = ", " + bydVar2;
            }
            return l6.i(sb, str, "]");
        }
    }

    a e(long j);

    boolean h();

    long k();

    public static class b implements zxd {
        public final long a;
        public final a b;

        public b(long j, long j2) {
            this.a = j;
            byd bydVar = j2 == 0 ? byd.c : new byd(0L, j2);
            this.b = new a(bydVar, bydVar);
        }

        @Override // defpackage.zxd
        public final a e(long j) {
            return this.b;
        }

        @Override // defpackage.zxd
        public final boolean h() {
            return false;
        }

        @Override // defpackage.zxd
        public final long k() {
            return this.a;
        }

        public b(long j) {
            this(j, 0L);
        }
    }
}
