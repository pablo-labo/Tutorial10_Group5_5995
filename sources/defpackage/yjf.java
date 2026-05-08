package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yjf {
    public static final yjf a;
    public static final /* synthetic */ yjf[] b;

    /* JADX INFO: Fake field, exist only in values array */
    yjf EF0;

    static {
        yjf yjfVar = new yjf("Shown", 0);
        yjf yjfVar2 = new yjf("Hidden", 1);
        a = yjfVar2;
        b = new yjf[]{yjfVar, yjfVar2};
    }

    public yjf() {
        throw null;
    }

    public static yjf valueOf(String str) {
        return (yjf) Enum.valueOf(yjf.class, str);
    }

    public static yjf[] values() {
        return (yjf[]) b.clone();
    }
}
