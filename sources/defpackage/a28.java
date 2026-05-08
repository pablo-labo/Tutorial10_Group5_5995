package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a28 {
    public static final a a;
    public static final a28 b;
    public static final /* synthetic */ a28[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        a28 a28Var = new a28("COUNTRY", 0, "COUNTRY");
        a28 a28Var2 = new a28("ADMIN1", 1, "ADMIN1");
        a28 a28Var3 = new a28("ADMIN2", 2, "ADMIN2");
        a28 a28Var4 = new a28("ADMIN3", 3, "ADMIN3");
        a28 a28Var5 = new a28("ADMIN4", 4, "ADMIN4");
        a28 a28Var6 = new a28("CITY", 5, "CITY");
        a28 a28Var7 = new a28("POSTAL", 6, "POSTAL");
        a28 a28Var8 = new a28("ADDRESS", 7, "ADDRESS");
        a28 a28Var9 = new a28("UNKNOWN__", 8, "UNKNOWN__");
        b = a28Var9;
        a28[] a28VarArr = {a28Var, a28Var2, a28Var3, a28Var4, a28Var5, a28Var6, a28Var7, a28Var8, a28Var9};
        c = a28VarArr;
        d = new wv4(a28VarArr);
        a = new a();
        new bw4("JobSeekerProfileGeocodePrecision", u63.a0("COUNTRY", "ADMIN1", "ADMIN2", "ADMIN3", "ADMIN4", "CITY", "POSTAL", "ADDRESS"));
    }

    public a28(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a28 valueOf(String str) {
        return (a28) Enum.valueOf(a28.class, str);
    }

    public static a28[] values() {
        return (a28[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
