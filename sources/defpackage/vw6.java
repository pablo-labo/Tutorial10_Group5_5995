package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vw6 {

    public static final class a extends vw6 {
        public final String a;

        public a(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.vw6
        public final String a() {
            return this.a;
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
            return l5.m("NotSelected(placeholderText=", this.a, ")");
        }
    }

    public static final class b extends vw6 {
        public final String a;

        public b(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.vw6
        public final String a() {
            return this.a;
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
            return l5.m("Selected(text=", this.a, ")");
        }
    }

    public abstract String a();
}
