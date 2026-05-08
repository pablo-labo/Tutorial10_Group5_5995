package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class cac {
    public static final cac a;
    public static final cac b;
    public static final /* synthetic */ cac[] c;

    static {
        cac cacVar = new cac("MAIN", 0);
        a = cacVar;
        cac cacVar2 = new cac("DEFAULT", 1);
        b = cacVar2;
        c = new cac[]{cacVar, cacVar2};
    }

    public cac() {
        throw null;
    }

    public static cac valueOf(String str) {
        return (cac) Enum.valueOf(cac.class, str);
    }

    public static cac[] values() {
        return (cac[]) c.clone();
    }
}
