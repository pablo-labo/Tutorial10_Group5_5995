package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class rp7 {
    public static final rp7 a;
    public static final rp7 b;
    public static final rp7 c;
    public static final /* synthetic */ rp7[] d;

    static {
        rp7 rp7Var = new rp7("QA", 0);
        a = rp7Var;
        rp7 rp7Var2 = new rp7("E2EQA", 1);
        b = rp7Var2;
        rp7 rp7Var3 = new rp7("PROD", 2);
        c = rp7Var3;
        d = new rp7[]{rp7Var, rp7Var2, rp7Var3};
    }

    public rp7() {
        throw null;
    }

    public static rp7 valueOf(String str) {
        return (rp7) Enum.valueOf(rp7.class, str);
    }

    public static rp7[] values() {
        return (rp7[]) d.clone();
    }
}
