package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class qd5 {
    public static final a a;
    public static final bw4 b;
    public static final qd5 c;
    public static final /* synthetic */ qd5[] d;
    public static final /* synthetic */ wv4 e;
    private final String rawValue;

    public static final class a {
    }

    static {
        qd5 qd5Var = new qd5("JOB_TITLE", 0, "JOB_TITLE");
        qd5 qd5Var2 = new qd5("JOB_CATEGORY", 1, "JOB_CATEGORY");
        qd5 qd5Var3 = new qd5("EMPLOYER_NAME", 2, "EMPLOYER_NAME");
        qd5 qd5Var4 = new qd5("UNKNOWN__", 3, "UNKNOWN__");
        c = qd5Var4;
        qd5[] qd5VarArr = {qd5Var, qd5Var2, qd5Var3, qd5Var4};
        d = qd5VarArr;
        e = new wv4(qd5VarArr);
        a = new a();
        b = new bw4("FindEmployersWhatType", u63.a0("JOB_TITLE", "JOB_CATEGORY", "EMPLOYER_NAME"));
    }

    public qd5(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static qd5 valueOf(String str) {
        return (qd5) Enum.valueOf(qd5.class, str);
    }

    public static qd5[] values() {
        return (qd5[]) d.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
