package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class aj4 {
    public static final aj4 a;
    public static final aj4 b;
    public static final aj4 c;
    public static final aj4 d;
    public static final aj4 e;
    public static final /* synthetic */ aj4[] f;

    /* JADX INFO: Fake field, exist only in values array */
    aj4 EF0;

    static {
        aj4 aj4Var = new aj4("EDIT_ROOT_PAGE", 0);
        aj4 aj4Var2 = new aj4("EDUCATION_LEVEL", 1);
        a = aj4Var2;
        aj4 aj4Var3 = new aj4("FIELD_OF_STUDY", 2);
        b = aj4Var3;
        aj4 aj4Var4 = new aj4("SCHOOL_NAME", 3);
        c = aj4Var4;
        aj4 aj4Var5 = new aj4("SCHOOL_COUNTRY_SELECTOR", 4);
        d = aj4Var5;
        aj4 aj4Var6 = new aj4("SCHOOL_LOCATION", 5);
        e = aj4Var6;
        f = new aj4[]{aj4Var, aj4Var2, aj4Var3, aj4Var4, aj4Var5, aj4Var6};
    }

    public aj4() {
        throw null;
    }

    public static aj4 valueOf(String str) {
        return (aj4) Enum.valueOf(aj4.class, str);
    }

    public static aj4[] values() {
        return (aj4[]) f.clone();
    }
}
