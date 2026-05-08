package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public interface z9e {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("CRASHLYTICS", 0);
            a = aVar;
            a aVar2 = new a("PERFORMANCE", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2, new a("MATT_SAYS_HI", 2)};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public static final class b {
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
            return w40.f(new StringBuilder("SessionDetails(sessionId="), this.a, ')');
        }
    }

    boolean a();

    void b(b bVar);
}
