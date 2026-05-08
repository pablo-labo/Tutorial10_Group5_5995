package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class prd {
    public static final prd a;
    public static final prd b;
    public static final /* synthetic */ prd[] c;

    static {
        prd prdVar = new prd("Up", 0);
        a = prdVar;
        prd prdVar2 = new prd("Down", 1);
        b = prdVar2;
        c = new prd[]{prdVar, prdVar2};
    }

    public prd() {
        throw null;
    }

    public static prd valueOf(String str) {
        return (prd) Enum.valueOf(prd.class, str);
    }

    public static prd[] values() {
        return (prd[]) c.clone();
    }
}
