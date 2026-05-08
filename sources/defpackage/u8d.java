package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class u8d {
    public static final u8d V;
    public static final /* synthetic */ u8d[] W;
    public static final /* synthetic */ wv4 X;
    public static final a a;
    public static final bw4 b;
    public static final u8d c;
    public static final u8d d;
    public static final u8d e;
    public static final u8d f;
    private final String rawValue;

    public static final class a {
    }

    static {
        u8d u8dVar = new u8d("DISMISSED", 0, "DISMISSED");
        c = u8dVar;
        u8d u8dVar2 = new u8d("ABORTED", 1, "ABORTED");
        d = u8dVar2;
        u8d u8dVar3 = new u8d("IMPRESSION", 2, "IMPRESSION");
        u8d u8dVar4 = new u8d("COMPLETED", 3, "COMPLETED");
        e = u8dVar4;
        u8d u8dVar5 = new u8d("FAILED", 4, "FAILED");
        f = u8dVar5;
        u8d u8dVar6 = new u8d("UNKNOWN__", 5, "UNKNOWN__");
        V = u8dVar6;
        u8d[] u8dVarArr = {u8dVar, u8dVar2, u8dVar3, u8dVar4, u8dVar5, u8dVar6};
        W = u8dVarArr;
        X = new wv4(u8dVarArr);
        a = new a();
        b = new bw4("ResumeFileSuggestionStatus", u63.a0("DISMISSED", "ABORTED", "IMPRESSION", "COMPLETED", "FAILED"));
    }

    public u8d(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static u8d valueOf(String str) {
        return (u8d) Enum.valueOf(u8d.class, str);
    }

    public static u8d[] values() {
        return (u8d[]) W.clone();
    }

    public final String a() {
        return this.rawValue;
    }
}
