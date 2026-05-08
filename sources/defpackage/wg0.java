package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wg0<T> {

    public static final class a<T> extends wg0<T> {
        public final p81 a;

        public a(p81 p81Var) {
            p81Var.getClass();
            this.a = p81Var;
        }

        @Override // defpackage.wg0
        public final p81 a() {
            return this.a;
        }

        @Override // defpackage.wg0
        public final T b() {
            return null;
        }

        @Override // defpackage.wg0
        public final boolean d() {
            return false;
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
            return "Failure(" + this.a + ")";
        }
    }

    public static final class b<T> extends wg0<T> {
        public final T a;

        public b(T t) {
            this.a = t;
        }

        @Override // defpackage.wg0
        public final p81 a() {
            return null;
        }

        @Override // defpackage.wg0
        public final T b() {
            return this.a;
        }

        @Override // defpackage.wg0
        public final boolean d() {
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && wl7.b(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            T t = this.a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public final String toString() {
            return v40.e(this.a, "Success(", ")");
        }
    }

    public abstract p81 a();

    public abstract T b();

    public final boolean c() {
        return !d();
    }

    public abstract boolean d();
}
