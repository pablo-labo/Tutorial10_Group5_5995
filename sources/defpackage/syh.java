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
public final class syh {
    public static final syh a;
    public static final syh b;
    public static final syh[] c;
    public static final /* synthetic */ syh[] d;
    private final j0i zzaz;
    private final int zzba;
    private final xyh zzbb;
    private final Class<?> zzbc;
    private final boolean zzbd;

    /* JADX INFO: Fake field, exist only in values array */
    syh EF0;

    static {
        j0i j0iVar = j0i.e;
        xyh xyhVar = xyh.SCALAR;
        syh syhVar = new syh("DOUBLE", 0, 0, xyhVar, j0iVar);
        j0i j0iVar2 = j0i.d;
        syh syhVar2 = new syh("FLOAT", 1, 1, xyhVar, j0iVar2);
        j0i j0iVar3 = j0i.c;
        syh syhVar3 = new syh("INT64", 2, 2, xyhVar, j0iVar3);
        syh syhVar4 = new syh("UINT64", 3, 3, xyhVar, j0iVar3);
        j0i j0iVar4 = j0i.b;
        syh syhVar5 = new syh("INT32", 4, 4, xyhVar, j0iVar4);
        syh syhVar6 = new syh("FIXED64", 5, 5, xyhVar, j0iVar3);
        syh syhVar7 = new syh("FIXED32", 6, 6, xyhVar, j0iVar4);
        j0i j0iVar5 = j0i.f;
        syh syhVar8 = new syh("BOOL", 7, 7, xyhVar, j0iVar5);
        j0i j0iVar6 = j0i.V;
        syh syhVar9 = new syh("STRING", 8, 8, xyhVar, j0iVar6);
        j0i j0iVar7 = j0i.Y;
        syh syhVar10 = new syh("MESSAGE", 9, 9, xyhVar, j0iVar7);
        j0i j0iVar8 = j0i.W;
        syh syhVar11 = new syh("BYTES", 10, 10, xyhVar, j0iVar8);
        syh syhVar12 = new syh("UINT32", 11, 11, xyhVar, j0iVar4);
        j0i j0iVar9 = j0i.X;
        syh syhVar13 = new syh("ENUM", 12, 12, xyhVar, j0iVar9);
        syh syhVar14 = new syh("SFIXED32", 13, 13, xyhVar, j0iVar4);
        syh syhVar15 = new syh("SFIXED64", 14, 14, xyhVar, j0iVar3);
        syh syhVar16 = new syh("SINT32", 15, 15, xyhVar, j0iVar4);
        syh syhVar17 = new syh("SINT64", 16, 16, xyhVar, j0iVar3);
        syh syhVar18 = new syh("GROUP", 17, 17, xyhVar, j0iVar7);
        xyh xyhVar2 = xyh.VECTOR;
        syh syhVar19 = new syh("DOUBLE_LIST", 18, 18, xyhVar2, j0iVar);
        syh syhVar20 = new syh("FLOAT_LIST", 19, 19, xyhVar2, j0iVar2);
        syh syhVar21 = new syh("INT64_LIST", 20, 20, xyhVar2, j0iVar3);
        syh syhVar22 = new syh("UINT64_LIST", 21, 21, xyhVar2, j0iVar3);
        syh syhVar23 = new syh("INT32_LIST", 22, 22, xyhVar2, j0iVar4);
        syh syhVar24 = new syh("FIXED64_LIST", 23, 23, xyhVar2, j0iVar3);
        syh syhVar25 = new syh("FIXED32_LIST", 24, 24, xyhVar2, j0iVar4);
        syh syhVar26 = new syh("BOOL_LIST", 25, 25, xyhVar2, j0iVar5);
        syh syhVar27 = new syh("STRING_LIST", 26, 26, xyhVar2, j0iVar6);
        syh syhVar28 = new syh("MESSAGE_LIST", 27, 27, xyhVar2, j0iVar7);
        syh syhVar29 = new syh("BYTES_LIST", 28, 28, xyhVar2, j0iVar8);
        syh syhVar30 = new syh("UINT32_LIST", 29, 29, xyhVar2, j0iVar4);
        syh syhVar31 = new syh("ENUM_LIST", 30, 30, xyhVar2, j0iVar9);
        syh syhVar32 = new syh("SFIXED32_LIST", 31, 31, xyhVar2, j0iVar4);
        syh syhVar33 = new syh("SFIXED64_LIST", 32, 32, xyhVar2, j0iVar3);
        syh syhVar34 = new syh("SINT32_LIST", 33, 33, xyhVar2, j0iVar4);
        syh syhVar35 = new syh("SINT64_LIST", 34, 34, xyhVar2, j0iVar3);
        xyh xyhVar3 = xyh.PACKED_VECTOR;
        syh syhVar36 = new syh("DOUBLE_LIST_PACKED", 35, 35, xyhVar3, j0iVar);
        a = syhVar36;
        syh syhVar37 = new syh("FLOAT_LIST_PACKED", 36, 36, xyhVar3, j0iVar2);
        syh syhVar38 = new syh("INT64_LIST_PACKED", 37, 37, xyhVar3, j0iVar3);
        syh syhVar39 = new syh("UINT64_LIST_PACKED", 38, 38, xyhVar3, j0iVar3);
        syh syhVar40 = new syh("INT32_LIST_PACKED", 39, 39, xyhVar3, j0iVar4);
        syh syhVar41 = new syh("FIXED64_LIST_PACKED", 40, 40, xyhVar3, j0iVar3);
        syh syhVar42 = new syh("FIXED32_LIST_PACKED", 41, 41, xyhVar3, j0iVar4);
        syh syhVar43 = new syh("BOOL_LIST_PACKED", 42, 42, xyhVar3, j0iVar5);
        syh syhVar44 = new syh("UINT32_LIST_PACKED", 43, 43, xyhVar3, j0iVar4);
        syh syhVar45 = new syh("ENUM_LIST_PACKED", 44, 44, xyhVar3, j0iVar9);
        syh syhVar46 = new syh("SFIXED32_LIST_PACKED", 45, 45, xyhVar3, j0iVar4);
        syh syhVar47 = new syh("SFIXED64_LIST_PACKED", 46, 46, xyhVar3, j0iVar3);
        syh syhVar48 = new syh("SINT32_LIST_PACKED", 47, 47, xyhVar3, j0iVar4);
        syh syhVar49 = new syh("SINT64_LIST_PACKED", 48, 48, xyhVar3, j0iVar3);
        b = syhVar49;
        d = new syh[]{syhVar, syhVar2, syhVar3, syhVar4, syhVar5, syhVar6, syhVar7, syhVar8, syhVar9, syhVar10, syhVar11, syhVar12, syhVar13, syhVar14, syhVar15, syhVar16, syhVar17, syhVar18, syhVar19, syhVar20, syhVar21, syhVar22, syhVar23, syhVar24, syhVar25, syhVar26, syhVar27, syhVar28, syhVar29, syhVar30, syhVar31, syhVar32, syhVar33, syhVar34, syhVar35, syhVar36, syhVar37, syhVar38, syhVar39, syhVar40, syhVar41, syhVar42, syhVar43, syhVar44, syhVar45, syhVar46, syhVar47, syhVar48, syhVar49, new syh("GROUP_LIST", 49, 49, xyhVar2, j0iVar7), new syh("MAP", 50, 50, xyh.MAP, j0i.a)};
        syh[] syhVarArrValues = values();
        c = new syh[syhVarArrValues.length];
        for (syh syhVar50 : syhVarArrValues) {
            c[syhVar50.zzba] = syhVar50;
        }
    }

    public syh(String str, int i, int i2, xyh xyhVar, j0i j0iVar) {
        int i3;
        this.zzba = i2;
        this.zzbb = xyhVar;
        this.zzaz = j0iVar;
        int i4 = qyh.a[xyhVar.ordinal()];
        if (i4 == 1 || i4 == 2) {
            this.zzbc = j0iVar.a();
        } else {
            this.zzbc = null;
        }
        this.zzbd = (xyhVar != xyh.SCALAR || (i3 = qyh.b[j0iVar.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : true;
    }

    public static syh[] values() {
        return (syh[]) d.clone();
    }

    public final int zza() {
        return this.zzba;
    }
}
