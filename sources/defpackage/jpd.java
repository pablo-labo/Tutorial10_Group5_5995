package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface jpd<T> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final /* synthetic */ a[] b;

        static {
            a aVar = new a("CONTINUE", 0);
            a = aVar;
            b = new a[]{aVar, new a("TERMINATE", 1), new a("SKIP_SUBTREE", 2), new a("SKIP_SIBLINGS", 3)};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) b.clone();
        }
    }
}
