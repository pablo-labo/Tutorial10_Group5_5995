package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface cu1 {
    public static final bm3 a = new bm3();

    public static final class a {
        public final xga a;

        public a(xga xgaVar) {
            this.a = xgaVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && wl7.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            xga xgaVar = this.a;
            if (xgaVar != null) {
                return xgaVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ReadResult(request=null, response=" + this.a + ')';
        }
    }

    b a(xga xgaVar, xga xgaVar2);

    a b(xga xgaVar);

    public static final class b {
        public final xga a;

        static {
            new b();
        }

        public b() {
            this.a = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return wl7.b(this.a, ((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            xga xgaVar = this.a;
            if (xgaVar != null) {
                return xgaVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "WriteResult(response=" + this.a + ')';
        }

        public b(xga xgaVar) {
            this.a = xgaVar;
        }
    }
}
