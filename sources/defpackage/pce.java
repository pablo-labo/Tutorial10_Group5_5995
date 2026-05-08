package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class pce {
    public static final pce a;
    public static final pce b;
    public static final pce c;
    public static final pce d;
    public static final pce e;
    public static final /* synthetic */ pce[] f;

    /* JADX INFO: Fake field, exist only in values array */
    pce EF0;

    static {
        pce pceVar = new pce("CornerExtraLarge", 0);
        pce pceVar2 = new pce("CornerExtraLargeTop", 1);
        a = pceVar2;
        pce pceVar3 = new pce("CornerExtraSmall", 2);
        b = pceVar3;
        pce pceVar4 = new pce("CornerExtraSmallTop", 3);
        c = pceVar4;
        pce pceVar5 = new pce("CornerFull", 4);
        d = pceVar5;
        pce pceVar6 = new pce("CornerLarge", 5);
        pce pceVar7 = new pce("CornerLargeEnd", 6);
        pce pceVar8 = new pce("CornerLargeTop", 7);
        pce pceVar9 = new pce("CornerMedium", 8);
        e = pceVar9;
        f = new pce[]{pceVar, pceVar2, pceVar3, pceVar4, pceVar5, pceVar6, pceVar7, pceVar8, pceVar9, new pce("CornerNone", 9), new pce("CornerSmall", 10)};
    }

    public pce() {
        throw null;
    }

    public static pce valueOf(String str) {
        return (pce) Enum.valueOf(pce.class, str);
    }

    public static pce[] values() {
        return (pce[]) f.clone();
    }
}
