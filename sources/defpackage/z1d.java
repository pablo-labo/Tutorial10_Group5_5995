package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z1d {
    public static final b a;
    public static final a b;
    public static final /* synthetic */ z1d[] c;

    public static final class a extends z1d {
        public a() {
            super("HTML", 1);
        }

        @Override // defpackage.z1d
        public final String a(String str) {
            return wve.I(wve.I(str, "<", "&lt;"), ">", "&gt;");
        }
    }

    public static final class b extends z1d {
        public b() {
            super("PLAIN", 0);
        }

        @Override // defpackage.z1d
        public final String a(String str) {
            return str;
        }
    }

    static {
        b bVar = new b();
        a = bVar;
        a aVar = new a();
        b = aVar;
        c = new z1d[]{bVar, aVar};
    }

    public z1d() {
        throw null;
    }

    public static z1d valueOf(String str) {
        return (z1d) Enum.valueOf(z1d.class, str);
    }

    public static z1d[] values() {
        return (z1d[]) c.clone();
    }

    public abstract String a(String str);
}
