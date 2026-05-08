package defpackage;

/* JADX INFO: loaded from: classes.dex */
@sy3
public abstract class al5 {
    public final a a = a.b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("Visible", 0);
            a = aVar;
            a aVar2 = new a("Clip", 1);
            b = aVar2;
            a aVar3 = new a("ExpandIndicator", 2);
            c = aVar3;
            a aVar4 = new a("ExpandOrCollapseIndicator", 3);
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

    public al5(int i) {
    }
}
