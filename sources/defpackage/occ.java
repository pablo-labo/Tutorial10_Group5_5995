package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class occ {
    public static final occ a;
    public static final occ b;
    public static final /* synthetic */ occ[] c;

    static {
        occ occVar = new occ("SPINNER", 0);
        a = occVar;
        occ occVar2 = new occ("DEFAULT", 1);
        b = occVar2;
        c = new occ[]{occVar, occVar2};
    }

    public occ() {
        throw null;
    }

    public static occ valueOf(String str) {
        return (occ) Enum.valueOf(occ.class, str);
    }

    public static occ[] values() {
        return (occ[]) c.clone();
    }
}
