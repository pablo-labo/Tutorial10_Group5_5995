package defpackage;

import defpackage.om;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v8d {

    public static final class a extends v8d {
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
            return l5.m("FailedFinalize(detail=", this.a, ")");
        }
    }

    public static final class b extends v8d {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("FailedParse(detail=", this.a, ")");
        }
    }

    public static final class c extends v8d {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && wl7.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("FailedPresign(detail=", this.a, ")");
        }
    }

    public static final class d extends v8d {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && wl7.b(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("FailedReplaceDelete(detail=", this.a, ")");
        }
    }

    public static final class e extends v8d {
        public final int a;
        public final String b;

        public e(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && wl7.b(this.b, eVar.b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "FailedS3Upload(httpCode=" + this.a + ", detail=" + this.b + ")";
        }
    }

    public static final class f extends v8d {
        public final String a;

        public f(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && wl7.b(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return l5.m("FailedUnexpected(detail=", this.a, ")");
        }
    }

    public static final class g extends v8d {
        public final om.a a;

        public g(om.a aVar) {
            aVar.getClass();
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && wl7.b(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Success(addJobSeekerProfileResumeFile=" + this.a + ")";
        }
    }
}
