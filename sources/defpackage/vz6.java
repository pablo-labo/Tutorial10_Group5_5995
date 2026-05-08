package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vz6 {
    public static final vz6 a;
    public static final vz6 b;
    public static final /* synthetic */ vz6[] c;

    static {
        vz6 vz6Var = new vz6("Feedback", 0);
        a = vz6Var;
        vz6 vz6Var2 = new vz6("Notification", 1);
        b = vz6Var2;
        c = new vz6[]{vz6Var, vz6Var2};
    }

    public vz6() {
        throw null;
    }

    public static vz6 valueOf(String str) {
        return (vz6) Enum.valueOf(vz6.class, str);
    }

    public static vz6[] values() {
        return (vz6[]) c.clone();
    }
}
