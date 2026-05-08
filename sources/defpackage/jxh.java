package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class jxh {
    public static final jxh a;
    public static final jxh b;
    public static final jxh[] c;
    public static final /* synthetic */ jxh[] d;
    private final int zzab;

    /* JADX INFO: Fake field, exist only in values array */
    jxh EF0;

    static {
        nzh nzhVar = nzh.DOUBLE;
        jxh jxhVar = new jxh("DOUBLE", 0, 0, 1, nzhVar);
        nzh nzhVar2 = nzh.FLOAT;
        jxh jxhVar2 = new jxh("FLOAT", 1, 1, 1, nzhVar2);
        nzh nzhVar3 = nzh.LONG;
        jxh jxhVar3 = new jxh("INT64", 2, 2, 1, nzhVar3);
        jxh jxhVar4 = new jxh("UINT64", 3, 3, 1, nzhVar3);
        nzh nzhVar4 = nzh.INT;
        jxh jxhVar5 = new jxh("INT32", 4, 4, 1, nzhVar4);
        jxh jxhVar6 = new jxh("FIXED64", 5, 5, 1, nzhVar3);
        jxh jxhVar7 = new jxh("FIXED32", 6, 6, 1, nzhVar4);
        nzh nzhVar5 = nzh.BOOLEAN;
        jxh jxhVar8 = new jxh("BOOL", 7, 7, 1, nzhVar5);
        nzh nzhVar6 = nzh.STRING;
        jxh jxhVar9 = new jxh("STRING", 8, 8, 1, nzhVar6);
        nzh nzhVar7 = nzh.MESSAGE;
        jxh jxhVar10 = new jxh("MESSAGE", 9, 9, 1, nzhVar7);
        nzh nzhVar8 = nzh.BYTE_STRING;
        jxh jxhVar11 = new jxh("BYTES", 10, 10, 1, nzhVar8);
        jxh jxhVar12 = new jxh("UINT32", 11, 11, 1, nzhVar4);
        nzh nzhVar9 = nzh.ENUM;
        jxh jxhVar13 = new jxh("ENUM", 12, 12, 1, nzhVar9);
        jxh jxhVar14 = new jxh("SFIXED32", 13, 13, 1, nzhVar4);
        jxh jxhVar15 = new jxh("SFIXED64", 14, 14, 1, nzhVar3);
        jxh jxhVar16 = new jxh("SINT32", 15, 15, 1, nzhVar4);
        jxh jxhVar17 = new jxh("SINT64", 16, 16, 1, nzhVar3);
        jxh jxhVar18 = new jxh("GROUP", 17, 17, 1, nzhVar7);
        jxh jxhVar19 = new jxh("DOUBLE_LIST", 18, 18, 2, nzhVar);
        jxh jxhVar20 = new jxh("FLOAT_LIST", 19, 19, 2, nzhVar2);
        jxh jxhVar21 = new jxh("INT64_LIST", 20, 20, 2, nzhVar3);
        jxh jxhVar22 = new jxh("UINT64_LIST", 21, 21, 2, nzhVar3);
        jxh jxhVar23 = new jxh("INT32_LIST", 22, 22, 2, nzhVar4);
        jxh jxhVar24 = new jxh("FIXED64_LIST", 23, 23, 2, nzhVar3);
        jxh jxhVar25 = new jxh("FIXED32_LIST", 24, 24, 2, nzhVar4);
        jxh jxhVar26 = new jxh("BOOL_LIST", 25, 25, 2, nzhVar5);
        jxh jxhVar27 = new jxh("STRING_LIST", 26, 26, 2, nzhVar6);
        jxh jxhVar28 = new jxh("MESSAGE_LIST", 27, 27, 2, nzhVar7);
        jxh jxhVar29 = new jxh("BYTES_LIST", 28, 28, 2, nzhVar8);
        jxh jxhVar30 = new jxh("UINT32_LIST", 29, 29, 2, nzhVar4);
        jxh jxhVar31 = new jxh("ENUM_LIST", 30, 30, 2, nzhVar9);
        jxh jxhVar32 = new jxh("SFIXED32_LIST", 31, 31, 2, nzhVar4);
        jxh jxhVar33 = new jxh("SFIXED64_LIST", 32, 32, 2, nzhVar3);
        jxh jxhVar34 = new jxh("SINT32_LIST", 33, 33, 2, nzhVar4);
        jxh jxhVar35 = new jxh("SINT64_LIST", 34, 34, 2, nzhVar3);
        jxh jxhVar36 = new jxh("DOUBLE_LIST_PACKED", 35, 35, 3, nzhVar);
        a = jxhVar36;
        jxh jxhVar37 = new jxh("FLOAT_LIST_PACKED", 36, 36, 3, nzhVar2);
        jxh jxhVar38 = new jxh("INT64_LIST_PACKED", 37, 37, 3, nzhVar3);
        jxh jxhVar39 = new jxh("UINT64_LIST_PACKED", 38, 38, 3, nzhVar3);
        jxh jxhVar40 = new jxh("INT32_LIST_PACKED", 39, 39, 3, nzhVar4);
        jxh jxhVar41 = new jxh("FIXED64_LIST_PACKED", 40, 40, 3, nzhVar3);
        jxh jxhVar42 = new jxh("FIXED32_LIST_PACKED", 41, 41, 3, nzhVar4);
        jxh jxhVar43 = new jxh("BOOL_LIST_PACKED", 42, 42, 3, nzhVar5);
        jxh jxhVar44 = new jxh("UINT32_LIST_PACKED", 43, 43, 3, nzhVar4);
        jxh jxhVar45 = new jxh("ENUM_LIST_PACKED", 44, 44, 3, nzhVar9);
        jxh jxhVar46 = new jxh("SFIXED32_LIST_PACKED", 45, 45, 3, nzhVar4);
        jxh jxhVar47 = new jxh("SFIXED64_LIST_PACKED", 46, 46, 3, nzhVar3);
        jxh jxhVar48 = new jxh("SINT32_LIST_PACKED", 47, 47, 3, nzhVar4);
        jxh jxhVar49 = new jxh("SINT64_LIST_PACKED", 48, 48, 3, nzhVar3);
        b = jxhVar49;
        d = new jxh[]{jxhVar, jxhVar2, jxhVar3, jxhVar4, jxhVar5, jxhVar6, jxhVar7, jxhVar8, jxhVar9, jxhVar10, jxhVar11, jxhVar12, jxhVar13, jxhVar14, jxhVar15, jxhVar16, jxhVar17, jxhVar18, jxhVar19, jxhVar20, jxhVar21, jxhVar22, jxhVar23, jxhVar24, jxhVar25, jxhVar26, jxhVar27, jxhVar28, jxhVar29, jxhVar30, jxhVar31, jxhVar32, jxhVar33, jxhVar34, jxhVar35, jxhVar36, jxhVar37, jxhVar38, jxhVar39, jxhVar40, jxhVar41, jxhVar42, jxhVar43, jxhVar44, jxhVar45, jxhVar46, jxhVar47, jxhVar48, jxhVar49, new jxh("GROUP_LIST", 49, 49, 2, nzhVar7), new jxh("MAP", 50, 50, 4, nzh.VOID)};
        jxh[] jxhVarArrValues = values();
        c = new jxh[jxhVarArrValues.length];
        for (jxh jxhVar50 : jxhVarArrValues) {
            c[jxhVar50.zzab] = jxhVar50;
        }
    }

    public jxh(String str, int i, int i2, int i3, nzh nzhVar) {
        this.zzab = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            nzhVar.getClass();
        }
        if (i3 == 1) {
            nzh nzhVar2 = nzh.VOID;
            nzhVar.ordinal();
        }
    }

    public static jxh[] values() {
        return (jxh[]) d.clone();
    }

    public final int zza() {
        return this.zzab;
    }
}
