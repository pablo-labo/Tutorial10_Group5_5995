package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class hx1 {
    public static final hx1 a;
    public static final /* synthetic */ hx1[] b;

    static {
        hx1 hx1Var = new hx1("FOR_SUBTYPING", 0);
        a = hx1Var;
        b = new hx1[]{hx1Var, new hx1("FOR_INCORPORATION", 1), new hx1("FROM_EXPRESSION", 2)};
    }

    public hx1() {
        throw null;
    }

    public static hx1 valueOf(String str) {
        return (hx1) Enum.valueOf(hx1.class, str);
    }

    public static hx1[] values() {
        return (hx1[]) b.clone();
    }
}
