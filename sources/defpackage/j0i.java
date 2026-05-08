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
/* JADX INFO: loaded from: classes2.dex */
public final class j0i {
    public static final j0i V;
    public static final j0i W;
    public static final j0i X;
    public static final j0i Y;
    public static final /* synthetic */ j0i[] Z;
    public static final j0i a;
    public static final j0i b;
    public static final j0i c;
    public static final j0i d;
    public static final j0i e;
    public static final j0i f;
    private final Class<?> zzk;
    private final Class<?> zzl;
    private final Object zzm;

    static {
        j0i j0iVar = new j0i("VOID", 0, Void.class, Void.class, null);
        a = j0iVar;
        Class cls = Integer.TYPE;
        j0i j0iVar2 = new j0i("INT", 1, cls, Integer.class, 0);
        b = j0iVar2;
        j0i j0iVar3 = new j0i("LONG", 2, Long.TYPE, Long.class, 0L);
        c = j0iVar3;
        j0i j0iVar4 = new j0i("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        d = j0iVar4;
        j0i j0iVar5 = new j0i("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        e = j0iVar5;
        j0i j0iVar6 = new j0i("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f = j0iVar6;
        j0i j0iVar7 = new j0i("STRING", 6, String.class, String.class, "");
        V = j0iVar7;
        j0i j0iVar8 = new j0i("BYTE_STRING", 7, fvh.class, fvh.class, fvh.a);
        W = j0iVar8;
        j0i j0iVar9 = new j0i("ENUM", 8, cls, Integer.class, null);
        X = j0iVar9;
        j0i j0iVar10 = new j0i("MESSAGE", 9, Object.class, Object.class, null);
        Y = j0iVar10;
        Z = new j0i[]{j0iVar, j0iVar2, j0iVar3, j0iVar4, j0iVar5, j0iVar6, j0iVar7, j0iVar8, j0iVar9, j0iVar10};
    }

    public j0i(String str, int i, Class cls, Class cls2, Serializable serializable) {
        this.zzk = cls;
        this.zzl = cls2;
        this.zzm = serializable;
    }

    public static j0i[] values() {
        return (j0i[]) Z.clone();
    }

    public final Class<?> a() {
        return this.zzl;
    }
}
