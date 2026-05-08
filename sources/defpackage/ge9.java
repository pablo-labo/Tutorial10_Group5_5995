package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ge9 {
    public final a a;
    public final lc0 b;
    public final fc0 c;
    public final boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("MASK_MODE_ADD", 0);
            a = aVar;
            a aVar2 = new a("MASK_MODE_SUBTRACT", 1);
            b = aVar2;
            a aVar3 = new a("MASK_MODE_INTERSECT", 2);
            c = aVar3;
            a aVar4 = new a("MASK_MODE_NONE", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public ge9(a aVar, lc0 lc0Var, fc0 fc0Var, boolean z) {
        this.a = aVar;
        this.b = lc0Var;
        this.c = fc0Var;
        this.d = z;
    }
}
