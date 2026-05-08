package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fjg {
    public static final a a;
    public static final fjg b;
    public static final /* synthetic */ fjg[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        fjg fjgVar = new fjg("SERP", 0, "SERP");
        fjg fjgVar2 = new fjg("SERPGLOBAL", 1, "SERPGLOBAL");
        fjg fjgVar3 = new fjg("HPCLASSIC", 2, "HPCLASSIC");
        fjg fjgVar4 = new fjg("UNKNOWN__", 3, "UNKNOWN__");
        b = fjgVar4;
        fjg[] fjgVarArr = {fjgVar, fjgVar2, fjgVar3, fjgVar4};
        c = fjgVarArr;
        d = new wv4(fjgVarArr);
        a = new a();
        new bw4("UserInteractionSurface", u63.a0("SERP", "SERPGLOBAL", "HPCLASSIC"));
    }

    public fjg(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fjg valueOf(String str) {
        return (fjg) Enum.valueOf(fjg.class, str);
    }

    public static fjg[] values() {
        return (fjg[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
