package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gd8 {

    public static final class a extends gd8 {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        @Override // defpackage.gd8
        public final String a() {
            return this.a + ':' + this.b;
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
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    public static final class b extends gd8 {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        @Override // defpackage.gd8
        public final String a() {
            return this.a + this.b;
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
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    public abstract String a();

    public final String toString() {
        return a();
    }
}
