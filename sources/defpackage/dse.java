package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dse {
    public static final dse a;
    public static final dse b;
    public static final dse c;
    public static final /* synthetic */ dse[] d;

    static {
        dse dseVar = new dse("BEGINNING", 0);
        a = dseVar;
        dse dseVar2 = new dse("MIDDLE", 1);
        b = dseVar2;
        dse dseVar3 = new dse("AFTER_DOT", 2);
        c = dseVar3;
        d = new dse[]{dseVar, dseVar2, dseVar3};
    }

    public dse() {
        throw null;
    }

    public static dse valueOf(String str) {
        return (dse) Enum.valueOf(dse.class, str);
    }

    public static dse[] values() {
        return (dse[]) d.clone();
    }
}
