package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vl8 {
    public static final vl8 a;
    public static final vl8 b;
    public static final /* synthetic */ vl8[] c;

    static {
        vl8 vl8Var = new vl8("Ltr", 0);
        a = vl8Var;
        vl8 vl8Var2 = new vl8("Rtl", 1);
        b = vl8Var2;
        c = new vl8[]{vl8Var, vl8Var2};
    }

    public vl8() {
        throw null;
    }

    public static vl8 valueOf(String str) {
        return (vl8) Enum.valueOf(vl8.class, str);
    }

    public static vl8[] values() {
        return (vl8[]) c.clone();
    }
}
