package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jm7 {
    public static final jm7 a;
    public static final jm7 b;
    public static final jm7 c;
    public static final jm7 d;
    public static final /* synthetic */ jm7[] e;

    static {
        jm7 jm7Var = new jm7("IGNORED", 0);
        a = jm7Var;
        jm7 jm7Var2 = new jm7("SCHEDULED", 1);
        b = jm7Var2;
        jm7 jm7Var3 = new jm7("DEFERRED", 2);
        c = jm7Var3;
        jm7 jm7Var4 = new jm7("IMMINENT", 3);
        d = jm7Var4;
        e = new jm7[]{jm7Var, jm7Var2, jm7Var3, jm7Var4};
    }

    public jm7() {
        throw null;
    }

    public static jm7 valueOf(String str) {
        return (jm7) Enum.valueOf(jm7.class, str);
    }

    public static jm7[] values() {
        return (jm7[]) e.clone();
    }
}
