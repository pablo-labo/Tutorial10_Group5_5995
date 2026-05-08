package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public class rei {
    public static final rei V;
    public static final rei W;
    public static final oei X;
    public static final wei Y;
    public static final uei Z;
    public static final rei a;
    public static final cfi a0;
    public static final rei b;
    public static final rei b0;
    public static final rei c;
    public static final rei c0;
    public static final rei d;
    public static final rei d0;
    public static final rei e;
    public static final rei e0;
    public static final rei f;
    public static final rei f0;
    public static final rei g0;
    public static final /* synthetic */ rei[] h0;
    private final zei zzzb;
    private final int zzzc;

    static {
        rei reiVar = new rei("DOUBLE", 0, zei.DOUBLE, 1);
        a = reiVar;
        rei reiVar2 = new rei("FLOAT", 1, zei.FLOAT, 5);
        b = reiVar2;
        zei zeiVar = zei.LONG;
        rei reiVar3 = new rei("INT64", 2, zeiVar, 0);
        c = reiVar3;
        rei reiVar4 = new rei("UINT64", 3, zeiVar, 0);
        d = reiVar4;
        zei zeiVar2 = zei.INT;
        rei reiVar5 = new rei("INT32", 4, zeiVar2, 0);
        e = reiVar5;
        rei reiVar6 = new rei("FIXED64", 5, zeiVar, 1);
        f = reiVar6;
        rei reiVar7 = new rei("FIXED32", 6, zeiVar2, 5);
        V = reiVar7;
        rei reiVar8 = new rei("BOOL", 7, zei.BOOLEAN, 0);
        W = reiVar8;
        oei oeiVar = new oei("STRING", 8, zei.STRING, 2);
        X = oeiVar;
        zei zeiVar3 = zei.MESSAGE;
        wei weiVar = new wei("GROUP", 9, zeiVar3, 3);
        Y = weiVar;
        uei ueiVar = new uei("MESSAGE", 10, zeiVar3, 2);
        Z = ueiVar;
        cfi cfiVar = new cfi("BYTES", 11, zei.BYTE_STRING, 2);
        a0 = cfiVar;
        rei reiVar9 = new rei("UINT32", 12, zeiVar2, 0);
        b0 = reiVar9;
        rei reiVar10 = new rei("ENUM", 13, zei.ENUM, 0);
        c0 = reiVar10;
        rei reiVar11 = new rei("SFIXED32", 14, zeiVar2, 5);
        d0 = reiVar11;
        rei reiVar12 = new rei("SFIXED64", 15, zeiVar, 1);
        e0 = reiVar12;
        rei reiVar13 = new rei("SINT32", 16, zeiVar2, 0);
        f0 = reiVar13;
        rei reiVar14 = new rei("SINT64", 17, zeiVar, 0);
        g0 = reiVar14;
        h0 = new rei[]{reiVar, reiVar2, reiVar3, reiVar4, reiVar5, reiVar6, reiVar7, reiVar8, oeiVar, weiVar, ueiVar, cfiVar, reiVar9, reiVar10, reiVar11, reiVar12, reiVar13, reiVar14};
    }

    public rei(String str, int i, zei zeiVar, int i2) {
        this.zzzb = zeiVar;
        this.zzzc = i2;
    }

    public static rei[] values() {
        return (rei[]) h0.clone();
    }

    public final zei a() {
        return this.zzzb;
    }
}
