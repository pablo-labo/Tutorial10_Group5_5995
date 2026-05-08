package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s19 {

    public static final class a extends s19 {
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
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("DontShow(openCc=", this.a, ")");
        }
    }

    public static final class b extends s19 {
        public final String a;
        public final String b;
        public final String c;

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && wl7.b(this.b, bVar.b) && wl7.b(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return l6.i(u40.f("Show(stayCc=", this.a, ", moveCc=", this.b, ", reason="), this.c, ")");
        }
    }
}
