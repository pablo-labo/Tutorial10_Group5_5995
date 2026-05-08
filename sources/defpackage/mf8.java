package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface mf8 extends td8 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("INSTANCE", 0);
            a = aVar;
            a aVar2 = new a("EXTENSION_RECEIVER", 1);
            b = aVar2;
            a aVar3 = new a("VALUE", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    boolean d();

    a f();

    int getIndex();

    String getName();

    cg8 getType();

    boolean u();
}
