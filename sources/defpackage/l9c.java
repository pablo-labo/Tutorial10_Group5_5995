package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface l9c<T> {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final j6g b = j6g.a;
    }

    @fd8
    public static final class b<T> implements l9c<T> {
        public final T b;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return wl7.b(this.b, ((b) obj).b);
            }
            return false;
        }

        @Override // defpackage.l9c
        public final T getValue() {
            return this.b;
        }

        public final int hashCode() {
            T t = this.b;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public final String toString() {
            return "Value(value=" + this.b + ')';
        }
    }

    T getValue();
}
