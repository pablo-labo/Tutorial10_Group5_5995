package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class f94 {
    public static final f94 a;
    public static final f94 b;
    public static final f94 c;
    public static final /* synthetic */ f94[] d;

    static {
        f94 f94Var = new f94("ALWAYS", 0);
        a = f94Var;
        f94 f94Var2 = new f94("AUTO", 1);
        b = f94Var2;
        f94 f94Var3 = new f94("NEVER", 2);
        c = f94Var3;
        d = new f94[]{f94Var, f94Var2, f94Var3};
    }

    public f94() {
        throw null;
    }

    public static f94 valueOf(String str) {
        return (f94) Enum.valueOf(f94.class, str);
    }

    public static f94[] values() {
        return (f94[]) d.clone();
    }
}
