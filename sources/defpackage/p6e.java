package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p6e {
    public String a;
    public a b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("OK", 0);
            a = aVar;
            a aVar2 = new a("DISCARDED", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
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

    public final String toString() {
        return "SendMessageResponse{receiverId='" + this.a + "', status='" + this.b + "'}";
    }
}
