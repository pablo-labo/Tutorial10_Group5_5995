package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class r0h {
    public static final a a;
    public static final b b;
    public static final c c;
    public static final /* synthetic */ r0h[] d;
    private final u0h javaType;
    private final int wireType;

    /* JADX INFO: Fake field, exist only in values array */
    r0h EF0;

    /* JADX INFO: Fake field, exist only in values array */
    r0h EF1;

    /* JADX INFO: Fake field, exist only in values array */
    r0h EF2;

    public enum a extends r0h {
    }

    public enum b extends r0h {
    }

    public enum c extends r0h {
    }

    public enum d extends r0h {
    }

    static {
        r0h r0hVar = new r0h("DOUBLE", 0, u0h.DOUBLE, 1);
        r0h r0hVar2 = new r0h("FLOAT", 1, u0h.FLOAT, 5);
        u0h u0hVar = u0h.LONG;
        r0h r0hVar3 = new r0h("INT64", 2, u0hVar, 0);
        r0h r0hVar4 = new r0h("UINT64", 3, u0hVar, 0);
        u0h u0hVar2 = u0h.INT;
        r0h r0hVar5 = new r0h("INT32", 4, u0hVar2, 0);
        r0h r0hVar6 = new r0h("FIXED64", 5, u0hVar, 1);
        r0h r0hVar7 = new r0h("FIXED32", 6, u0hVar2, 5);
        r0h r0hVar8 = new r0h("BOOL", 7, u0h.BOOLEAN, 0);
        a aVar = new a("STRING", 8, u0h.STRING, 2);
        a = aVar;
        u0h u0hVar3 = u0h.MESSAGE;
        b bVar = new b("GROUP", 9, u0hVar3, 3);
        b = bVar;
        c cVar = new c("MESSAGE", 10, u0hVar3, 2);
        c = cVar;
        d = new r0h[]{r0hVar, r0hVar2, r0hVar3, r0hVar4, r0hVar5, r0hVar6, r0hVar7, r0hVar8, aVar, bVar, cVar, new d("BYTES", 11, u0h.BYTE_STRING, 2), new r0h("UINT32", 12, u0hVar2, 0), new r0h("ENUM", 13, u0h.ENUM, 0), new r0h("SFIXED32", 14, u0hVar2, 5), new r0h("SFIXED64", 15, u0hVar, 1), new r0h("SINT32", 16, u0hVar2, 0), new r0h("SINT64", 17, u0hVar, 0)};
    }

    public r0h(String str, int i, u0h u0hVar, int i2) {
        this.javaType = u0hVar;
        this.wireType = i2;
    }

    public static r0h valueOf(String str) {
        return (r0h) Enum.valueOf(r0h.class, str);
    }

    public static r0h[] values() {
        return (r0h[]) d.clone();
    }

    public final u0h a() {
        return this.javaType;
    }

    public final int c() {
        return this.wireType;
    }
}
