package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tca {
    public static final a a;
    public static final bw4 b;
    public static final tca c;
    public static final /* synthetic */ tca[] d;
    public static final /* synthetic */ wv4 e;
    private final String rawValue;

    public static final class a {
    }

    static {
        tca tcaVar = new tca("OPTIONS", 0, "OPTIONS");
        tca tcaVar2 = new tca("LEGAL", 1, "LEGAL");
        tca tcaVar3 = new tca("RESOURCES", 2, "RESOURCES");
        tca tcaVar4 = new tca("ABOUT_YOU", 3, "ABOUT_YOU");
        tca tcaVar5 = new tca("ACCOUNT", 4, "ACCOUNT");
        tca tcaVar6 = new tca("UNKNOWN__", 5, "UNKNOWN__");
        c = tcaVar6;
        tca[] tcaVarArr = {tcaVar, tcaVar2, tcaVar3, tcaVar4, tcaVar5, tcaVar6};
        d = tcaVarArr;
        e = new wv4(tcaVarArr);
        a = new a();
        b = new bw4("NavigationCategoryId", u63.a0("OPTIONS", "LEGAL", "RESOURCES", "ABOUT_YOU", "ACCOUNT"));
    }

    public tca(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static tca valueOf(String str) {
        return (tca) Enum.valueOf(tca.class, str);
    }

    public static tca[] values() {
        return (tca[]) d.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
