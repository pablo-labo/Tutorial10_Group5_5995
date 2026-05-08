package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class pnf {
    public static final pnf a;
    public static final pnf b;
    public static final pnf c;
    public static final /* synthetic */ pnf[] d;

    static {
        pnf pnfVar = new pnf("CENTERED", 0);
        a = pnfVar;
        pnf pnfVar2 = new pnf("START", 1);
        b = pnfVar2;
        pnf pnfVar3 = new pnf("END", 2);
        c = pnfVar3;
        d = new pnf[]{pnfVar, pnfVar2, pnfVar3};
    }

    public pnf() {
        throw null;
    }

    public static pnf valueOf(String str) {
        return (pnf) Enum.valueOf(pnf.class, str);
    }

    public static pnf[] values() {
        return (pnf[]) d.clone();
    }
}
