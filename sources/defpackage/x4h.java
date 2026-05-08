package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x4h {
    public static final a a = new a();

    public static class a {
        public final String toString() {
            return "NULL_VALUE";
        }
    }

    public static final class b {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
        }

        public final String toString() {
            return this.a.toString();
        }
    }

    public static void a(Object obj) throws Throwable {
        if (obj instanceof b) {
            throw ((b) obj).a;
        }
    }
}
