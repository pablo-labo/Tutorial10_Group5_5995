package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class sf9 {
    public static final a a;
    public static final bw4 b;
    public static final sf9 c;
    public static final /* synthetic */ sf9[] d;
    public static final /* synthetic */ wv4 e;
    private final String rawValue;

    public static final class a {
    }

    static {
        sf9 sf9Var = new sf9("OK", 0, "OK");
        sf9 sf9Var2 = new sf9("UNAUTHENTICATED", 1, "UNAUTHENTICATED");
        sf9 sf9Var3 = new sf9("FORBIDDEN", 2, "FORBIDDEN");
        sf9 sf9Var4 = new sf9("BAD_USER_INPUT", 3, "BAD_USER_INPUT");
        sf9 sf9Var5 = new sf9("INTERNAL_SERVER_ERROR", 4, "INTERNAL_SERVER_ERROR");
        sf9 sf9Var6 = new sf9("PARTIAL_SUCCESS", 5, "PARTIAL_SUCCESS");
        sf9 sf9Var7 = new sf9("QUERY_TOO_COMPLEX", 6, "QUERY_TOO_COMPLEX");
        sf9 sf9Var8 = new sf9("UNKNOWN__", 7, "UNKNOWN__");
        c = sf9Var8;
        sf9[] sf9VarArr = {sf9Var, sf9Var2, sf9Var3, sf9Var4, sf9Var5, sf9Var6, sf9Var7, sf9Var8};
        d = sf9VarArr;
        e = new wv4(sf9VarArr);
        a = new a();
        b = new bw4("MdsResponseCode", u63.a0("OK", "UNAUTHENTICATED", "FORBIDDEN", "BAD_USER_INPUT", "INTERNAL_SERVER_ERROR", "PARTIAL_SUCCESS", "QUERY_TOO_COMPLEX"));
    }

    public sf9(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static sf9 valueOf(String str) {
        return (sf9) Enum.valueOf(sf9.class, str);
    }

    public static sf9[] values() {
        return (sf9[]) d.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
