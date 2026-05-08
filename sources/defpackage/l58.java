package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l58 {
    public static final a a;
    public static final l58 b;
    public static final /* synthetic */ l58[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        l58 l58Var = new l58("ADMIN1", 0, "ADMIN1");
        l58 l58Var2 = new l58("ADMIN2", 1, "ADMIN2");
        l58 l58Var3 = new l58("ADMIN3", 2, "ADMIN3");
        l58 l58Var4 = new l58("ADMIN4", 3, "ADMIN4");
        l58 l58Var5 = new l58("CITY", 4, "CITY");
        l58 l58Var6 = new l58("COUNTRY", 5, "COUNTRY");
        l58 l58Var7 = new l58("ZIPCODE", 6, "ZIPCODE");
        l58 l58Var8 = new l58("STATION", 7, "STATION");
        l58 l58Var9 = new l58("PLACE", 8, "PLACE");
        l58 l58Var10 = new l58("UNKNOWN", 9, "UNKNOWN");
        l58 l58Var11 = new l58("UNKNOWN__", 10, "UNKNOWN__");
        b = l58Var11;
        l58[] l58VarArr = {l58Var, l58Var2, l58Var3, l58Var4, l58Var5, l58Var6, l58Var7, l58Var8, l58Var9, l58Var10, l58Var11};
        c = l58VarArr;
        d = new wv4(l58VarArr);
        a = new a();
        new bw4("JobSeekerProfileStructuredDataLatLngPrecision", u63.a0("ADMIN1", "ADMIN2", "ADMIN3", "ADMIN4", "CITY", "COUNTRY", "ZIPCODE", "STATION", "PLACE", "UNKNOWN"));
    }

    public l58(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static l58 valueOf(String str) {
        return (l58) Enum.valueOf(l58.class, str);
    }

    public static l58[] values() {
        return (l58[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
