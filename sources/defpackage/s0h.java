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
/* JADX INFO: loaded from: classes3.dex */
public class s0h {
    public static final s0h a;
    public static final s0h b;
    public static final b c;
    public static final c d;
    public static final s0h e;
    public static final /* synthetic */ s0h[] f;
    private final t0h javaType;
    private final int wireType;

    /* JADX INFO: Fake field, exist only in values array */
    s0h EF0;

    /* JADX INFO: Fake field, exist only in values array */
    s0h EF1;

    /* JADX INFO: Fake field, exist only in values array */
    s0h EF2;

    public enum a extends s0h {
    }

    public enum b extends s0h {
        @Override // defpackage.s0h
        public final boolean e() {
            return false;
        }
    }

    public enum c extends s0h {
        @Override // defpackage.s0h
        public final boolean e() {
            return false;
        }
    }

    public enum d extends s0h {
        @Override // defpackage.s0h
        public final boolean e() {
            return false;
        }
    }

    static {
        s0h s0hVar = new s0h("DOUBLE", 0, t0h.DOUBLE, 1);
        s0h s0hVar2 = new s0h("FLOAT", 1, t0h.FLOAT, 5);
        t0h t0hVar = t0h.LONG;
        s0h s0hVar3 = new s0h("INT64", 2, t0hVar, 0);
        s0h s0hVar4 = new s0h("UINT64", 3, t0hVar, 0);
        t0h t0hVar2 = t0h.INT;
        s0h s0hVar5 = new s0h("INT32", 4, t0hVar2, 0);
        a = s0hVar5;
        s0h s0hVar6 = new s0h("FIXED64", 5, t0hVar, 1);
        s0h s0hVar7 = new s0h("FIXED32", 6, t0hVar2, 5);
        s0h s0hVar8 = new s0h("BOOL", 7, t0h.BOOLEAN, 0);
        b = s0hVar8;
        a aVar = new a("STRING", 8, t0h.STRING, 2);
        t0h t0hVar3 = t0h.MESSAGE;
        b bVar = new b("GROUP", 9, t0hVar3, 3);
        c = bVar;
        c cVar = new c("MESSAGE", 10, t0hVar3, 2);
        d = cVar;
        d dVar = new d("BYTES", 11, t0h.BYTE_STRING, 2);
        s0h s0hVar9 = new s0h("UINT32", 12, t0hVar2, 0);
        s0h s0hVar10 = new s0h("ENUM", 13, t0h.ENUM, 0);
        e = s0hVar10;
        f = new s0h[]{s0hVar, s0hVar2, s0hVar3, s0hVar4, s0hVar5, s0hVar6, s0hVar7, s0hVar8, aVar, bVar, cVar, dVar, s0hVar9, s0hVar10, new s0h("SFIXED32", 14, t0hVar2, 5), new s0h("SFIXED64", 15, t0hVar, 1), new s0h("SINT32", 16, t0hVar2, 0), new s0h("SINT64", 17, t0hVar, 0)};
    }

    public s0h(String str, int i, t0h t0hVar, int i2) {
        this.javaType = t0hVar;
        this.wireType = i2;
    }

    public static s0h valueOf(String str) {
        return (s0h) Enum.valueOf(s0h.class, str);
    }

    public static s0h[] values() {
        return (s0h[]) f.clone();
    }

    public final t0h a() {
        return this.javaType;
    }

    public final int c() {
        return this.wireType;
    }

    public boolean e() {
        return !(this instanceof a);
    }
}
