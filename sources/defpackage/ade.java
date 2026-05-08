package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ade implements ct2 {
    public final a a;
    public final dc0 b;
    public final dc0 c;
    public final dc0 d;
    public final boolean e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("SIMULTANEOUSLY", 0);
            a = aVar;
            a aVar2 = new a("INDIVIDUALLY", 1);
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

    public ade(String str, a aVar, dc0 dc0Var, dc0 dc0Var2, dc0 dc0Var3, boolean z) {
        this.a = aVar;
        this.b = dc0Var;
        this.c = dc0Var2;
        this.d = dc0Var3;
        this.e = z;
    }

    @Override // defpackage.ct2
    public final ks2 a(j79 j79Var, s69 s69Var, ba1 ba1Var) {
        return new juf(ba1Var, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}
