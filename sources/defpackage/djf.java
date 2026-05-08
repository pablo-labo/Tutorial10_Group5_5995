package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class djf {
    public static final djf a;
    public static final djf b;
    public static final /* synthetic */ djf[] c;

    static {
        djf djfVar = new djf("start", 0);
        a = djfVar;
        djf djfVar2 = new djf("middle", 1);
        b = djfVar2;
        c = new djf[]{djfVar, djfVar2, new djf("end", 2)};
    }

    public djf() {
        throw null;
    }

    public static djf valueOf(String str) {
        return (djf) Enum.valueOf(djf.class, str);
    }

    public static djf[] values() {
        return (djf[]) c.clone();
    }
}
