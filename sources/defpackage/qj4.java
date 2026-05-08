package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class qj4 {
    public static final qj4 a;
    public static final qj4 b;
    public static final /* synthetic */ qj4[] c;

    static {
        qj4 qj4Var = new qj4("LANGUAGE_EDIT_HOME", 0);
        a = qj4Var;
        qj4 qj4Var2 = new qj4("LANGUAGE_NAME", 1);
        b = qj4Var2;
        c = new qj4[]{qj4Var, qj4Var2};
    }

    public qj4() {
        throw null;
    }

    public static qj4 valueOf(String str) {
        return (qj4) Enum.valueOf(qj4.class, str);
    }

    public static qj4[] values() {
        return (qj4[]) c.clone();
    }
}
