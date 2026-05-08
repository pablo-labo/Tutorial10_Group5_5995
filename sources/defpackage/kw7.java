package defpackage;

import java.io.Serializable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class kw7 {
    public static final kw7 V;
    public static final kw7 W;
    public static final kw7 X;
    public static final kw7 Y;
    public static final /* synthetic */ kw7[] Z;
    public static final kw7 a;
    public static final kw7 b;
    public static final kw7 c;
    public static final kw7 d;
    public static final kw7 e;
    public static final kw7 f;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        kw7 kw7Var = new kw7("VOID", 0, Void.class, Void.class, null);
        a = kw7Var;
        Class cls = Integer.TYPE;
        kw7 kw7Var2 = new kw7("INT", 1, cls, Integer.class, 0);
        b = kw7Var2;
        kw7 kw7Var3 = new kw7("LONG", 2, Long.TYPE, Long.class, 0L);
        c = kw7Var3;
        kw7 kw7Var4 = new kw7("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        d = kw7Var4;
        kw7 kw7Var5 = new kw7("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        e = kw7Var5;
        kw7 kw7Var6 = new kw7("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f = kw7Var6;
        kw7 kw7Var7 = new kw7("STRING", 6, String.class, String.class, "");
        V = kw7Var7;
        kw7 kw7Var8 = new kw7("BYTE_STRING", 7, tr1.class, tr1.class, tr1.a);
        W = kw7Var8;
        kw7 kw7Var9 = new kw7("ENUM", 8, cls, Integer.class, null);
        X = kw7Var9;
        kw7 kw7Var10 = new kw7("MESSAGE", 9, Object.class, Object.class, null);
        Y = kw7Var10;
        Z = new kw7[]{kw7Var, kw7Var2, kw7Var3, kw7Var4, kw7Var5, kw7Var6, kw7Var7, kw7Var8, kw7Var9, kw7Var10};
    }

    public kw7(String str, int i, Class cls, Class cls2, Serializable serializable) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = serializable;
    }

    public static kw7 valueOf(String str) {
        return (kw7) Enum.valueOf(kw7.class, str);
    }

    public static kw7[] values() {
        return (kw7[]) Z.clone();
    }

    public final Class<?> a() {
        return this.boxedType;
    }
}
