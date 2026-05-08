package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class nl7 {
    public static final nl7 a;
    public static final nl7 b;
    public static final nl7 c;
    public static final nl7 d;
    public static final nl7 e;
    public static final /* synthetic */ nl7[] f;

    static {
        nl7 nl7Var = new nl7("INTERVIEW_LOCATION", 0);
        a = nl7Var;
        nl7 nl7Var2 = new nl7("INTERVIEW_PHONE", 1);
        b = nl7Var2;
        nl7 nl7Var3 = new nl7("INTERVIEW_VIDEO", 2);
        c = nl7Var3;
        nl7 nl7Var4 = new nl7("INTERVIEW_THIRD_PARTY_VIDEO", 3);
        d = nl7Var4;
        nl7 nl7Var5 = new nl7("UNKNOWN", 4);
        e = nl7Var5;
        f = new nl7[]{nl7Var, nl7Var2, nl7Var3, nl7Var4, nl7Var5};
    }

    public nl7() {
        throw null;
    }

    public static nl7 valueOf(String str) {
        return (nl7) Enum.valueOf(nl7.class, str);
    }

    public static nl7[] values() {
        return (nl7[]) f.clone();
    }
}
