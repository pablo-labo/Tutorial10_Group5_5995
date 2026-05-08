package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class saa {

    public static final class a extends saa {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 933482055;
        }

        public final String toString() {
            return "Back";
        }
    }

    public static final class b extends saa {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1125564264;
        }

        public final String toString() {
            return "Close";
        }
    }

    public static final class c extends saa {
    }

    public static final class d extends saa {
        public final int a;

        public d(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return bg.d(this.a, "CustomIcon(imageResId=", ")");
        }
    }

    public static final class f extends saa {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 933793547;
        }

        public final String toString() {
            return "Logo";
        }
    }

    public static final class g extends saa {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -511458231;
        }

        public final String toString() {
            return "Profile";
        }
    }

    public static final class h extends saa {
        public final String a;
        public final int b;
        public final int c;
        public final float d;

        public h(float f, int i, int i2, String str) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return wl7.b(this.a, hVar.a) && this.b == hVar.b && this.c == hVar.c && Float.compare(this.d, hVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + w40.c(this.c, w40.c(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sbH = w40.h(this.b, "RnCustomButton(uri=", this.a, ", width=", ", height=");
            sbH.append(this.c);
            sbH.append(", scale=");
            sbH.append(this.d);
            sbH.append(")");
            return sbH.toString();
        }
    }

    public static final class i extends saa {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -81570040;
        }

        public final String toString() {
            return "Search";
        }
    }

    public static final class j extends saa {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -77701854;
        }

        public final String toString() {
            return "SignIn";
        }
    }

    public static final class e extends saa {
        public final fv6 a;
        public final String b;
        public final long c;
        public final String d;

        public e(fv6 fv6Var, String str, long j, String str2) {
            fv6Var.getClass();
            str.getClass();
            this.a = fv6Var;
            this.b = str;
            this.c = j;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && wl7.b(this.b, eVar.b) && da2.c(this.c, eVar.c) && wl7.b(this.d, eVar.d);
        }

        public final int hashCode() {
            int iD = akb.d(this.a.hashCode() * 31, 31, this.b);
            int i = da2.j;
            int iD2 = ia.d(iD, 31, this.c);
            String str = this.d;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            String strI = da2.i(this.c);
            StringBuilder sb = new StringBuilder("CustomIdlIcon(idlIconName=");
            sb.append(this.a);
            sb.append(", a11yDescription=");
            sb.append(this.b);
            sb.append(", color=");
            return z3.n(sb, strI, ", testTag=", this.d, ")");
        }

        public e(fv6 fv6Var, String str, String str2, int i) {
            this(fv6Var, str, da2.i, (i & 8) != 0 ? "UIPTopNavCustomIdlIcon" : str2);
        }
    }
}
