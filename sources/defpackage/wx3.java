package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wx3 {

    public static final class a extends wx3 {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("Failure(detail=", this.a, ")");
        }
    }

    public static final class b extends wx3 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -215178246;
        }

        public final String toString() {
            return "Success";
        }
    }
}
