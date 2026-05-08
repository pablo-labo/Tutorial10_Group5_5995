package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ozf {
    public static final ozf a;
    public static final ozf b;
    public static final ozf c;
    public static final /* synthetic */ ozf[] d;

    /* JADX INFO: Fake field, exist only in values array */
    ozf EF0;

    static {
        ozf ozfVar = new ozf("BodyLarge", 0);
        ozf ozfVar2 = new ozf("BodyMedium", 1);
        ozf ozfVar3 = new ozf("BodySmall", 2);
        ozf ozfVar4 = new ozf("DisplayLarge", 3);
        ozf ozfVar5 = new ozf("DisplayMedium", 4);
        ozf ozfVar6 = new ozf("DisplaySmall", 5);
        ozf ozfVar7 = new ozf("HeadlineLarge", 6);
        ozf ozfVar8 = new ozf("HeadlineMedium", 7);
        ozf ozfVar9 = new ozf("HeadlineSmall", 8);
        ozf ozfVar10 = new ozf("LabelLarge", 9);
        ozf ozfVar11 = new ozf("LabelMedium", 10);
        ozf ozfVar12 = new ozf("LabelSmall", 11);
        a = ozfVar12;
        ozf ozfVar13 = new ozf("TitleLarge", 12);
        b = ozfVar13;
        ozf ozfVar14 = new ozf("TitleMedium", 13);
        ozf ozfVar15 = new ozf("TitleSmall", 14);
        c = ozfVar15;
        d = new ozf[]{ozfVar, ozfVar2, ozfVar3, ozfVar4, ozfVar5, ozfVar6, ozfVar7, ozfVar8, ozfVar9, ozfVar10, ozfVar11, ozfVar12, ozfVar13, ozfVar14, ozfVar15};
    }

    public ozf() {
        throw null;
    }

    public static ozf valueOf(String str) {
        return (ozf) Enum.valueOf(ozf.class, str);
    }

    public static ozf[] values() {
        return (ozf[]) d.clone();
    }
}
