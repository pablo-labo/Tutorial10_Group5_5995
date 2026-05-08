package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class w5 {
    public static final w5 a;
    public static final w5 b;
    public static final w5 c;
    public static final /* synthetic */ w5[] d;

    static {
        w5 w5Var = new w5("CONVERSATION_RESTORED", 0);
        a = w5Var;
        w5 w5Var2 = new w5("CONVERSATION_ARCHIVED", 1);
        b = w5Var2;
        w5 w5Var3 = new w5("CONVERSATION_MOVED_TO_SPAM", 2);
        c = w5Var3;
        d = new w5[]{w5Var, w5Var2, w5Var3};
    }

    public w5() {
        throw null;
    }

    public static w5 valueOf(String str) {
        return (w5) Enum.valueOf(w5.class, str);
    }

    public static w5[] values() {
        return (w5[]) d.clone();
    }
}
