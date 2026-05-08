package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ya1 {

    public static final class a extends ya1 {
        public static final a a = new a();
    }

    public static final class b extends ya1 {
        public static final b a = new b();
    }

    public static final class c extends ya1 {
        public static final c a = new c();
    }

    public static final class d extends ya1 {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public d(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return wl7.b(this.a, dVar.a) && wl7.b(this.b, dVar.b) && wl7.b(this.c, dVar.c) && wl7.b(this.d, dVar.d);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            return z3.n(u40.f("MailTo(to=", this.a, ", subject=", this.b, ", cc="), this.c, ", body=", this.d, ")");
        }
    }

    public static final class e extends ya1 {
        public final String a;
        public final String b;

        public e(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return wl7.b(this.a, eVar.a) && wl7.b(this.b, eVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return akb.k("Market(id=", this.a, ", referrer=", this.b, ")");
        }
    }

    public static final class f extends ya1 {
        public static final f a = new f();
    }

    public static final class g extends ya1 {
        public static final g a = new g();
    }

    public static final class h extends ya1 {
        public static final h a = new h();
    }

    public static final class i extends ya1 {
        public static final i a = new i();
    }
}
