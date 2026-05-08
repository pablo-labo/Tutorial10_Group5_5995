package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class hhf {
    public static final hhf a;
    public static final hhf b;
    public static final /* synthetic */ hhf[] c;

    static {
        hhf hhfVar = new hhf("Filled", 0);
        a = hhfVar;
        hhf hhfVar2 = new hhf("Outlined", 1);
        b = hhfVar2;
        c = new hhf[]{hhfVar, hhfVar2};
    }

    public hhf() {
        throw null;
    }

    public static hhf valueOf(String str) {
        return (hhf) Enum.valueOf(hhf.class, str);
    }

    public static hhf[] values() {
        return (hhf[]) c.clone();
    }
}
