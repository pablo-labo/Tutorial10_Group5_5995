package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class pl8 {
    public static final a a;
    public static final pl8 b;
    public static final pl8 c;
    public static final pl8 d;
    public static final /* synthetic */ pl8[] e;

    public static final class a {
        public static String a(pl8 pl8Var) {
            int iOrdinal = pl8Var.ordinal();
            if (iOrdinal == 0) {
                return "create";
            }
            if (iOrdinal == 1) {
                return "update";
            }
            if (iOrdinal == 2) {
                return "delete";
            }
            l.g();
            return null;
        }
    }

    static {
        pl8 pl8Var = new pl8("CREATE", 0);
        b = pl8Var;
        pl8 pl8Var2 = new pl8("UPDATE", 1);
        c = pl8Var2;
        pl8 pl8Var3 = new pl8("DELETE", 2);
        d = pl8Var3;
        e = new pl8[]{pl8Var, pl8Var2, pl8Var3};
        a = new a();
    }

    public pl8() {
        throw null;
    }

    public static pl8 valueOf(String str) {
        return (pl8) Enum.valueOf(pl8.class, str);
    }

    public static pl8[] values() {
        return (pl8[]) e.clone();
    }
}
