package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class in4 {
    public static final in4 a;
    public static final in4 b;
    public static final in4 c;
    public static final /* synthetic */ in4[] d;

    static {
        in4 in4Var = new in4("EDIT_SKILL_EDIT_HOME", 0);
        a = in4Var;
        in4 in4Var2 = new in4("EDIT_SKILL_NAME_AUTOCOMPLETE", 1);
        b = in4Var2;
        in4 in4Var3 = new in4("SKILLS_SET_LIST", 2);
        c = in4Var3;
        d = new in4[]{in4Var, in4Var2, in4Var3};
    }

    public in4() {
        throw null;
    }

    public static in4 valueOf(String str) {
        return (in4) Enum.valueOf(in4.class, str);
    }

    public static in4[] values() {
        return (in4[]) d.clone();
    }
}
