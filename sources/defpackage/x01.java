package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class x01 {
    public static final x01 a;
    public static final x01 b;
    public static final /* synthetic */ x01[] c;
    public static final /* synthetic */ wv4 d;
    private final String content;
    private final String logVariant;

    static {
        x01 x01Var = new x01("AUTO_MERGE_PARSED", 0, "auto_merge:parsed", "parsed");
        x01 x01Var2 = new x01("AUTO_MERGE_NO_RESUME", 1, "auto_merge:no_rez", "nonResumeDataOnly");
        a = x01Var2;
        x01 x01Var3 = new x01("AUTO_MERGE_IR", 2, "auto_merge:ir", "indeedResume");
        b = x01Var3;
        x01[] x01VarArr = {x01Var, x01Var2, x01Var3};
        c = x01VarArr;
        d = new wv4(x01VarArr);
    }

    public x01(String str, int i, String str2, String str3) {
        this.content = str2;
        this.logVariant = str3;
    }

    public static x01 valueOf(String str) {
        return (x01) Enum.valueOf(x01.class, str);
    }

    public static x01[] values() {
        return (x01[]) c.clone();
    }

    public final String a() {
        return this.content;
    }

    public final String c() {
        return this.logVariant;
    }
}
