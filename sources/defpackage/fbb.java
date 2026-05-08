package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fbb {
    public static final fbb V;
    public static final fbb W;
    public static final fbb X;
    public static final fbb Y;
    public static final fbb Z;
    public static final fbb a;
    public static final fbb a0;
    public static final fbb b;
    public static final fbb b0;
    public static final fbb c;
    public static final fbb c0;
    public static final fbb d;
    public static final fbb d0;
    public static final fbb e;
    public static final fbb e0;
    public static final fbb f;
    public static final /* synthetic */ fbb[] f0;

    static {
        fbb fbbVar = new fbb("CARRIER", 0);
        a = fbbVar;
        fbb fbbVar2 = new fbb("NETWORK_TYPE", 1);
        b = fbbVar2;
        fbb fbbVar3 = new fbb("NETWORK_TECHNOLOGY", 2);
        c = fbbVar3;
        fbb fbbVar4 = new fbb("ANDROID_IDFA", 3);
        d = fbbVar4;
        fbb fbbVar5 = new fbb("PHYSICAL_MEMORY", 4);
        e = fbbVar5;
        fbb fbbVar6 = new fbb("SYSTEM_AVAILABLE_MEMORY", 5);
        f = fbbVar6;
        fbb fbbVar7 = new fbb("BATTERY_LEVEL", 6);
        V = fbbVar7;
        fbb fbbVar8 = new fbb("BATTERY_STATE", 7);
        W = fbbVar8;
        fbb fbbVar9 = new fbb("AVAILABLE_STORAGE", 8);
        X = fbbVar9;
        fbb fbbVar10 = new fbb("TOTAL_STORAGE", 9);
        Y = fbbVar10;
        fbb fbbVar11 = new fbb("IS_PORTRAIT", 10);
        Z = fbbVar11;
        fbb fbbVar12 = new fbb("RESOLUTION", 11);
        a0 = fbbVar12;
        fbb fbbVar13 = new fbb("SCALE", 12);
        b0 = fbbVar13;
        fbb fbbVar14 = new fbb("LANGUAGE", 13);
        c0 = fbbVar14;
        fbb fbbVar15 = new fbb("APP_SET_ID", 14);
        d0 = fbbVar15;
        fbb fbbVar16 = new fbb("APP_SET_ID_SCOPE", 15);
        e0 = fbbVar16;
        f0 = new fbb[]{fbbVar, fbbVar2, fbbVar3, fbbVar4, fbbVar5, fbbVar6, fbbVar7, fbbVar8, fbbVar9, fbbVar10, fbbVar11, fbbVar12, fbbVar13, fbbVar14, fbbVar15, fbbVar16};
    }

    public fbb() {
        throw null;
    }

    public static fbb valueOf(String str) {
        return (fbb) Enum.valueOf(fbb.class, str);
    }

    public static fbb[] values() {
        return (fbb[]) f0.clone();
    }
}
