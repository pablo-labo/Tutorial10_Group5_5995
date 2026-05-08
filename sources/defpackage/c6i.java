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
public final class c6i {
    public static final /* synthetic */ c6i[] a;
    private final e6i zzt;
    private final int zzu;

    /* JADX INFO: Fake field, exist only in values array */
    c6i EF1;

    /* JADX INFO: Fake field, exist only in values array */
    c6i EF2;

    /* JADX INFO: Fake field, exist only in values array */
    c6i EF0;

    static {
        c6i c6iVar = new c6i("DOUBLE", 0, e6i.d, 1);
        c6i c6iVar2 = new c6i("FLOAT", 1, e6i.c, 5);
        e6i e6iVar = e6i.b;
        c6i c6iVar3 = new c6i("INT64", 2, e6iVar, 0);
        c6i c6iVar4 = new c6i("UINT64", 3, e6iVar, 0);
        e6i e6iVar2 = e6i.a;
        c6i c6iVar5 = new c6i("INT32", 4, e6iVar2, 0);
        c6i c6iVar6 = new c6i("FIXED64", 5, e6iVar, 1);
        c6i c6iVar7 = new c6i("FIXED32", 6, e6iVar2, 5);
        c6i c6iVar8 = new c6i("BOOL", 7, e6i.e, 0);
        c6i c6iVar9 = new c6i("STRING", 8, e6i.f, 2);
        e6i e6iVar3 = e6i.X;
        a = new c6i[]{c6iVar, c6iVar2, c6iVar3, c6iVar4, c6iVar5, c6iVar6, c6iVar7, c6iVar8, c6iVar9, new c6i("GROUP", 9, e6iVar3, 3), new c6i("MESSAGE", 10, e6iVar3, 2), new c6i("BYTES", 11, e6i.V, 2), new c6i("UINT32", 12, e6iVar2, 0), new c6i("ENUM", 13, e6i.W, 0), new c6i("SFIXED32", 14, e6iVar2, 5), new c6i("SFIXED64", 15, e6iVar, 1), new c6i("SINT32", 16, e6iVar2, 0), new c6i("SINT64", 17, e6iVar, 0)};
    }

    public c6i(String str, int i, e6i e6iVar, int i2) {
        this.zzt = e6iVar;
        this.zzu = i2;
    }

    public static c6i[] values() {
        return (c6i[]) a.clone();
    }
}
