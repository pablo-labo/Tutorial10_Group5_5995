package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ba9 {
    public static final ba9 a;
    public static final ba9 b;
    public static final ba9 c;
    public static final ba9 d;
    public static final /* synthetic */ ba9[] e;

    static {
        ba9 ba9Var = new ba9("LANGUAGE_LIST", 0);
        a = ba9Var;
        ba9 ba9Var2 = new ba9("ADD_NEW_LANGUAGE", 1);
        b = ba9Var2;
        ba9 ba9Var3 = new ba9("LANGUAGE_EDIT_HOME", 2);
        c = ba9Var3;
        ba9 ba9Var4 = new ba9("LANGUAGE_NAME", 3);
        d = ba9Var4;
        e = new ba9[]{ba9Var, ba9Var2, ba9Var3, ba9Var4};
    }

    public ba9() {
        throw null;
    }

    public static ba9 valueOf(String str) {
        return (ba9) Enum.valueOf(ba9.class, str);
    }

    public static ba9[] values() {
        return (ba9[]) e.clone();
    }
}
