package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fjf {
    public static final fjf a;
    public static final /* synthetic */ fjf[] b;

    static {
        fjf fjfVar = new fjf("spacing", 0);
        a = fjfVar;
        b = new fjf[]{fjfVar, new fjf("spacingAndGlyphs", 1)};
    }

    public fjf() {
        throw null;
    }

    public static fjf valueOf(String str) {
        return (fjf) Enum.valueOf(fjf.class, str);
    }

    public static fjf[] values() {
        return (fjf[]) b.clone();
    }
}
