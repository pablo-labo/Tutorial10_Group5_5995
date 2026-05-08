package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public @interface z5c {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final /* synthetic */ a[] b;

        static {
            a aVar = new a("DEFAULT", 0);
            a = aVar;
            b = new a[]{aVar, new a("SIGNED", 1), new a("FIXED", 2)};
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

    a intEncoding() default a.a;

    int tag();
}
