package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fp {
    public static final a a;
    public static final fp b;
    public static final /* synthetic */ fp[] c;
    public static final /* synthetic */ wv4 d;
    private final String rawValue;

    public static final class a {
    }

    static {
        fp fpVar = new fp("PUBLIC", 0, "PUBLIC");
        fp fpVar2 = new fp("HIDDEN", 1, "HIDDEN");
        fp fpVar3 = new fp("UNKNOWN__", 2, "UNKNOWN__");
        b = fpVar3;
        fp[] fpVarArr = {fpVar, fpVar2, fpVar3};
        c = fpVarArr;
        d = new wv4(fpVarArr);
        a = new a();
        new bw4("AddJobSeekerProfileResumeState", u63.a0("PUBLIC", "HIDDEN"));
    }

    public fp(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fp valueOf(String str) {
        return (fp) Enum.valueOf(fp.class, str);
    }

    public static fp[] values() {
        return (fp[]) c.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
