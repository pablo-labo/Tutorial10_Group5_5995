package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class gr7 {
    public static final gr7 a;
    public static final gr7 b;
    public static final gr7 c;
    public static final /* synthetic */ gr7[] d;

    static {
        gr7 gr7Var = new gr7("PORTRAIT", 0);
        a = gr7Var;
        gr7 gr7Var2 = new gr7("LANDSCAPE", 1);
        b = gr7Var2;
        gr7 gr7Var3 = new gr7("UNDEFINED", 2);
        c = gr7Var3;
        d = new gr7[]{gr7Var, gr7Var2, gr7Var3};
    }

    public gr7() {
        throw null;
    }

    public static gr7 valueOf(String str) {
        return (gr7) Enum.valueOf(gr7.class, str);
    }

    public static gr7[] values() {
        return (gr7[]) d.clone();
    }
}
