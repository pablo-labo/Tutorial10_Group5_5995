package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class woa {
    public static final a a;
    public static final bw4 b;
    public static final woa c;
    public static final /* synthetic */ woa[] d;
    public static final /* synthetic */ wv4 e;
    private final String rawValue;

    public static final class a {
    }

    static {
        woa woaVar = new woa("AAID", 0, "AAID");
        woa woaVar2 = new woa("IDFA", 1, "IDFA");
        woa woaVar3 = new woa("UNKNOWN__", 2, "UNKNOWN__");
        c = woaVar3;
        woa[] woaVarArr = {woaVar, woaVar2, woaVar3};
        d = woaVarArr;
        e = new wv4(woaVarArr);
        a = new a();
        b = new bw4("OffsiteDeviceIdEnum", u63.a0("AAID", "IDFA"));
    }

    public woa(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static woa valueOf(String str) {
        return (woa) Enum.valueOf(woa.class, str);
    }

    public static woa[] values() {
        return (woa[]) d.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
