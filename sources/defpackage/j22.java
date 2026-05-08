package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@fd8
public final class j22<T> {
    public static final b b = new b();
    public final Object a;

    public static final class a extends b {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return wl7.b(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // j22.b
        public final String toString() {
            return "Closed(" + this.a + ')';
        }
    }

    public static class b {
        public String toString() {
            return "Failed";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T a(Object obj) {
        if (obj instanceof b) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j22) {
            return wl7.b(this.a, ((j22) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
