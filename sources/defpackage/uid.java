package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uid {

    public static final class a extends uid {
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
            return l5.m("ErrorEvent(error=", this.a, ")");
        }
    }

    public static final class b extends uid {
        public final String a;

        public b(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("NewMessage(conversationId=", this.a, ")");
        }
    }

    public static final class c extends uid {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public c(String str, String str2, String str3, String str4) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b) && wl7.b(this.c, cVar.c) && wl7.b(this.d, cVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return z3.n(u40.f("OnlineStatusRefresh(advertiserKey=", this.a, ", accountKey=", this.b, ", newStatus="), this.c, ", accountType=", this.d, ")");
        }
    }

    public static final class d extends uid {
        public final String a;

        public d(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return l5.m("ReadReceipt(conversationId=", this.a, ")");
        }
    }
}
