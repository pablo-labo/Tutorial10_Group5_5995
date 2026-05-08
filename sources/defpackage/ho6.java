package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ho6 {
    public static final ho6 a;
    public static final /* synthetic */ ho6[] b;

    /* JADX INFO: Fake field, exist only in values array */
    ho6 EF0;

    static {
        ho6 ho6Var = new ho6("LONG", 0);
        ho6 ho6Var2 = new ho6("LONGOFFSET", 1);
        ho6 ho6Var3 = new ho6("LONGGENERIC", 2);
        ho6 ho6Var4 = new ho6("SHORT", 3);
        ho6 ho6Var5 = new ho6("SHORTOFFSET", 4);
        ho6 ho6Var6 = new ho6("SHORTGENERIC", 5);
        ho6 ho6Var7 = new ho6("UNDEFINED", 6);
        a = ho6Var7;
        b = new ho6[]{ho6Var, ho6Var2, ho6Var3, ho6Var4, ho6Var5, ho6Var6, ho6Var7};
    }

    public ho6() {
        throw null;
    }

    public static ho6 valueOf(String str) {
        return (ho6) Enum.valueOf(ho6.class, str);
    }

    public static ho6[] values() {
        return (ho6[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        switch (ordinal()) {
            case 0:
                return "long";
            case 1:
                return "longOffset";
            case 2:
                return "longGeneric";
            case 3:
                return "short";
            case 4:
                return "shortOffset";
            case 5:
                return "shortGeneric";
            case 6:
                return "";
            default:
                o6.h();
                return null;
        }
    }
}
