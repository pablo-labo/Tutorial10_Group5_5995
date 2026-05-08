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
/* JADX INFO: loaded from: classes.dex */
public final class d95 {
    public static final d95 a;
    public static final d95 b;
    public static final d95[] c;
    public static final /* synthetic */ d95[] d;
    private final a collection;
    private final Class<?> elementType;
    private final int id;
    private final kw7 javaType;
    private final boolean primitiveScalar;

    /* JADX INFO: Fake field, exist only in values array */
    d95 EF0;

    public enum a {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        a(boolean z) {
            this.isList = z;
        }
    }

    static {
        kw7 kw7Var = kw7.e;
        a aVar = a.SCALAR;
        d95 d95Var = new d95("DOUBLE", 0, 0, aVar, kw7Var);
        kw7 kw7Var2 = kw7.d;
        d95 d95Var2 = new d95("FLOAT", 1, 1, aVar, kw7Var2);
        kw7 kw7Var3 = kw7.c;
        d95 d95Var3 = new d95("INT64", 2, 2, aVar, kw7Var3);
        d95 d95Var4 = new d95("UINT64", 3, 3, aVar, kw7Var3);
        kw7 kw7Var4 = kw7.b;
        d95 d95Var5 = new d95("INT32", 4, 4, aVar, kw7Var4);
        d95 d95Var6 = new d95("FIXED64", 5, 5, aVar, kw7Var3);
        d95 d95Var7 = new d95("FIXED32", 6, 6, aVar, kw7Var4);
        kw7 kw7Var5 = kw7.f;
        d95 d95Var8 = new d95("BOOL", 7, 7, aVar, kw7Var5);
        kw7 kw7Var6 = kw7.V;
        d95 d95Var9 = new d95("STRING", 8, 8, aVar, kw7Var6);
        kw7 kw7Var7 = kw7.Y;
        d95 d95Var10 = new d95("MESSAGE", 9, 9, aVar, kw7Var7);
        kw7 kw7Var8 = kw7.W;
        d95 d95Var11 = new d95("BYTES", 10, 10, aVar, kw7Var8);
        d95 d95Var12 = new d95("UINT32", 11, 11, aVar, kw7Var4);
        kw7 kw7Var9 = kw7.X;
        d95 d95Var13 = new d95("ENUM", 12, 12, aVar, kw7Var9);
        d95 d95Var14 = new d95("SFIXED32", 13, 13, aVar, kw7Var4);
        d95 d95Var15 = new d95("SFIXED64", 14, 14, aVar, kw7Var3);
        d95 d95Var16 = new d95("SINT32", 15, 15, aVar, kw7Var4);
        d95 d95Var17 = new d95("SINT64", 16, 16, aVar, kw7Var3);
        d95 d95Var18 = new d95("GROUP", 17, 17, aVar, kw7Var7);
        a aVar2 = a.VECTOR;
        d95 d95Var19 = new d95("DOUBLE_LIST", 18, 18, aVar2, kw7Var);
        d95 d95Var20 = new d95("FLOAT_LIST", 19, 19, aVar2, kw7Var2);
        d95 d95Var21 = new d95("INT64_LIST", 20, 20, aVar2, kw7Var3);
        d95 d95Var22 = new d95("UINT64_LIST", 21, 21, aVar2, kw7Var3);
        d95 d95Var23 = new d95("INT32_LIST", 22, 22, aVar2, kw7Var4);
        d95 d95Var24 = new d95("FIXED64_LIST", 23, 23, aVar2, kw7Var3);
        d95 d95Var25 = new d95("FIXED32_LIST", 24, 24, aVar2, kw7Var4);
        d95 d95Var26 = new d95("BOOL_LIST", 25, 25, aVar2, kw7Var5);
        d95 d95Var27 = new d95("STRING_LIST", 26, 26, aVar2, kw7Var6);
        d95 d95Var28 = new d95("MESSAGE_LIST", 27, 27, aVar2, kw7Var7);
        d95 d95Var29 = new d95("BYTES_LIST", 28, 28, aVar2, kw7Var8);
        d95 d95Var30 = new d95("UINT32_LIST", 29, 29, aVar2, kw7Var4);
        d95 d95Var31 = new d95("ENUM_LIST", 30, 30, aVar2, kw7Var9);
        d95 d95Var32 = new d95("SFIXED32_LIST", 31, 31, aVar2, kw7Var4);
        d95 d95Var33 = new d95("SFIXED64_LIST", 32, 32, aVar2, kw7Var3);
        d95 d95Var34 = new d95("SINT32_LIST", 33, 33, aVar2, kw7Var4);
        d95 d95Var35 = new d95("SINT64_LIST", 34, 34, aVar2, kw7Var3);
        a aVar3 = a.PACKED_VECTOR;
        d95 d95Var36 = new d95("DOUBLE_LIST_PACKED", 35, 35, aVar3, kw7Var);
        a = d95Var36;
        d95 d95Var37 = new d95("FLOAT_LIST_PACKED", 36, 36, aVar3, kw7Var2);
        d95 d95Var38 = new d95("INT64_LIST_PACKED", 37, 37, aVar3, kw7Var3);
        d95 d95Var39 = new d95("UINT64_LIST_PACKED", 38, 38, aVar3, kw7Var3);
        d95 d95Var40 = new d95("INT32_LIST_PACKED", 39, 39, aVar3, kw7Var4);
        d95 d95Var41 = new d95("FIXED64_LIST_PACKED", 40, 40, aVar3, kw7Var3);
        d95 d95Var42 = new d95("FIXED32_LIST_PACKED", 41, 41, aVar3, kw7Var4);
        d95 d95Var43 = new d95("BOOL_LIST_PACKED", 42, 42, aVar3, kw7Var5);
        d95 d95Var44 = new d95("UINT32_LIST_PACKED", 43, 43, aVar3, kw7Var4);
        d95 d95Var45 = new d95("ENUM_LIST_PACKED", 44, 44, aVar3, kw7Var9);
        d95 d95Var46 = new d95("SFIXED32_LIST_PACKED", 45, 45, aVar3, kw7Var4);
        d95 d95Var47 = new d95("SFIXED64_LIST_PACKED", 46, 46, aVar3, kw7Var3);
        d95 d95Var48 = new d95("SINT32_LIST_PACKED", 47, 47, aVar3, kw7Var4);
        d95 d95Var49 = new d95("SINT64_LIST_PACKED", 48, 48, aVar3, kw7Var3);
        b = d95Var49;
        d = new d95[]{d95Var, d95Var2, d95Var3, d95Var4, d95Var5, d95Var6, d95Var7, d95Var8, d95Var9, d95Var10, d95Var11, d95Var12, d95Var13, d95Var14, d95Var15, d95Var16, d95Var17, d95Var18, d95Var19, d95Var20, d95Var21, d95Var22, d95Var23, d95Var24, d95Var25, d95Var26, d95Var27, d95Var28, d95Var29, d95Var30, d95Var31, d95Var32, d95Var33, d95Var34, d95Var35, d95Var36, d95Var37, d95Var38, d95Var39, d95Var40, d95Var41, d95Var42, d95Var43, d95Var44, d95Var45, d95Var46, d95Var47, d95Var48, d95Var49, new d95("GROUP_LIST", 49, 49, aVar2, kw7Var7), new d95("MAP", 50, 50, a.MAP, kw7.a)};
        d95[] d95VarArrValues = values();
        c = new d95[d95VarArrValues.length];
        for (d95 d95Var50 : d95VarArrValues) {
            c[d95Var50.id] = d95Var50;
        }
    }

    public d95(String str, int i, int i2, a aVar, kw7 kw7Var) {
        int iOrdinal;
        this.id = i2;
        this.collection = aVar;
        this.javaType = kw7Var;
        int iOrdinal2 = aVar.ordinal();
        if (iOrdinal2 == 1 || iOrdinal2 == 3) {
            this.elementType = kw7Var.a();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (aVar != a.SCALAR || (iOrdinal = kw7Var.ordinal()) == 6 || iOrdinal == 7 || iOrdinal == 9) ? false : true;
    }

    public static d95 valueOf(String str) {
        return (d95) Enum.valueOf(d95.class, str);
    }

    public static d95[] values() {
        return (d95[]) d.clone();
    }

    public final int a() {
        return this.id;
    }
}
