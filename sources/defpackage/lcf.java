package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class lcf {
    public static final lcf a;
    public static final lcf b;
    public static final lcf c;
    public static final /* synthetic */ lcf[] d;

    static {
        lcf lcfVar = new lcf("BULLETED", 0);
        a = lcfVar;
        lcf lcfVar2 = new lcf("NUMBERED", 1);
        b = lcfVar2;
        lcf lcfVar3 = new lcf("NONE", 2);
        c = lcfVar3;
        d = new lcf[]{lcfVar, lcfVar2, lcfVar3};
    }

    public lcf() {
        throw null;
    }

    public static lcf valueOf(String str) {
        return (lcf) Enum.valueOf(lcf.class, str);
    }

    public static lcf[] values() {
        return (lcf[]) d.clone();
    }
}
