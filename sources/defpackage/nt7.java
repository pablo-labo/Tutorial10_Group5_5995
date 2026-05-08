package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class nt7 {
    public static final nt7 a;
    public static final /* synthetic */ nt7[] b;

    static {
        nt7 nt7Var = new nt7("SHOWN", 0);
        a = nt7Var;
        b = new nt7[]{nt7Var};
    }

    public nt7() {
        throw null;
    }

    public static nt7 valueOf(String str) {
        return (nt7) Enum.valueOf(nt7.class, str);
    }

    public static nt7[] values() {
        return (nt7[]) b.clone();
    }
}
