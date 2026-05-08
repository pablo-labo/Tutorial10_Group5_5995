package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class eab {
    public static final eab a;
    public static final eab b;
    public static final /* synthetic */ eab[] c;

    static {
        eab eabVar = new eab("FILE", 0);
        a = eabVar;
        eab eabVar2 = new eab("DIRECTORY", 1);
        b = eabVar2;
        c = new eab[]{eabVar, eabVar2};
    }

    public eab() {
        throw null;
    }

    public static eab valueOf(String str) {
        return (eab) Enum.valueOf(eab.class, str);
    }

    public static eab[] values() {
        return (eab[]) c.clone();
    }
}
