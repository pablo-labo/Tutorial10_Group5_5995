package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ax9 {
    public static final a a;
    public static final ax9 b;
    public static final ax9 c;
    public static final ax9 d;
    public static final ax9 e;
    public static final /* synthetic */ ax9[] f;

    public static final class a {
    }

    static {
        ax9 ax9Var = new ax9("FINAL", 0);
        b = ax9Var;
        ax9 ax9Var2 = new ax9("SEALED", 1);
        c = ax9Var2;
        ax9 ax9Var3 = new ax9("OPEN", 2);
        d = ax9Var3;
        ax9 ax9Var4 = new ax9("ABSTRACT", 3);
        e = ax9Var4;
        f = new ax9[]{ax9Var, ax9Var2, ax9Var3, ax9Var4};
        a = new a();
    }

    public ax9() {
        throw null;
    }

    public static ax9 valueOf(String str) {
        return (ax9) Enum.valueOf(ax9.class, str);
    }

    public static ax9[] values() {
        return (ax9[]) f.clone();
    }
}
