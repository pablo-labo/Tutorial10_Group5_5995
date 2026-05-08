package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ca9 {
    public static final ca9 a;
    public static final ca9 b;
    public static final ca9 c;
    public static final ca9 d;
    public static final ca9 e;
    public static final /* synthetic */ ca9[] f;

    static {
        ca9 ca9Var = new ca9("SKILLS_LIST", 0);
        a = ca9Var;
        ca9 ca9Var2 = new ca9("SKILLS_SET_LIST", 1);
        b = ca9Var2;
        ca9 ca9Var3 = new ca9("SKILL_EDIT_HOME", 2);
        c = ca9Var3;
        ca9 ca9Var4 = new ca9("SKILL_NAME_AUTOCOMPLETE", 3);
        d = ca9Var4;
        ca9 ca9Var5 = new ca9("ADD_NEW_SKILL", 4);
        e = ca9Var5;
        f = new ca9[]{ca9Var, ca9Var2, ca9Var3, ca9Var4, ca9Var5};
    }

    public ca9() {
        throw null;
    }

    public static ca9 valueOf(String str) {
        return (ca9) Enum.valueOf(ca9.class, str);
    }

    public static ca9[] values() {
        return (ca9[]) f.clone();
    }
}
