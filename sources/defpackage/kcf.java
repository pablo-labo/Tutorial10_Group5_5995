package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class kcf {
    public static final kcf a;
    public static final kcf b;
    public static final kcf c;
    public static final /* synthetic */ kcf[] d;

    static {
        kcf kcfVar = new kcf("BULLETED", 0);
        a = kcfVar;
        kcf kcfVar2 = new kcf("NUMBERED", 1);
        b = kcfVar2;
        kcf kcfVar3 = new kcf("NONE", 2);
        c = kcfVar3;
        d = new kcf[]{kcfVar, kcfVar2, kcfVar3};
    }

    public kcf() {
        throw null;
    }

    public static kcf valueOf(String str) {
        return (kcf) Enum.valueOf(kcf.class, str);
    }

    public static kcf[] values() {
        return (kcf[]) d.clone();
    }
}
