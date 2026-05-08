package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class njf {
    public static final njf a;
    public static final njf b;
    public static final /* synthetic */ njf[] c;

    static {
        njf njfVar = new njf("PERCENT", 0);
        a = njfVar;
        njf njfVar2 = new njf("INDEX", 1);
        b = njfVar2;
        c = new njf[]{njfVar, njfVar2};
    }

    public njf() {
        throw null;
    }

    public static njf valueOf(String str) {
        return (njf) Enum.valueOf(njf.class, str);
    }

    public static njf[] values() {
        return (njf[]) c.clone();
    }
}
