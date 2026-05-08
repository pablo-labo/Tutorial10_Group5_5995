package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.jni.JavaScriptFunction;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import expo.modules.kotlin.types.ValueOrUndefined;
import java.util.List;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF1' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class s23 {
    public static final s23 V;
    public static final s23 W;
    public static final s23 X;
    public static final s23 Y;
    public static final s23 Z;
    public static final s23 a;
    public static final s23 a0;
    public static final s23 b;
    public static final s23 b0;
    public static final s23 c;
    public static final s23 c0;
    public static final s23 d;
    public static final s23 d0;
    public static final s23 e;
    public static final s23 e0;
    public static final s23 f;
    public static final s23 f0;
    public static final s23 g0;
    public static final s23 h0;
    public static final s23 i0;
    public static final s23 j0;
    public static final s23 k0;
    public static final /* synthetic */ s23[] l0;
    private final yd8<?> clazz;
    private final int value;

    /* JADX INFO: Fake field, exist only in values array */
    s23 EF1;

    static {
        iwc iwcVar = fwc.a;
        s23 s23Var = new s23("NONE", 0, iwcVar.b(Void.class), 0);
        s23 s23Var2 = new s23("DOUBLE", 1, iwcVar.b(Double.TYPE));
        a = s23Var2;
        Class cls = Integer.TYPE;
        s23 s23Var3 = new s23("INT", 2, iwcVar.b(cls));
        b = s23Var3;
        s23 s23Var4 = new s23("LONG", 3, iwcVar.b(Long.TYPE));
        c = s23Var4;
        s23 s23Var5 = new s23("FLOAT", 4, iwcVar.b(Float.TYPE));
        d = s23Var5;
        s23 s23Var6 = new s23("BOOLEAN", 5, iwcVar.b(Boolean.TYPE));
        e = s23Var6;
        s23 s23Var7 = new s23("STRING", 6, iwcVar.b(String.class));
        f = s23Var7;
        s23 s23Var8 = new s23("JS_OBJECT", 7, iwcVar.b(JavaScriptObject.class));
        V = s23Var8;
        s23 s23Var9 = new s23("JS_VALUE", 8, iwcVar.b(JavaScriptValue.class));
        W = s23Var9;
        s23 s23Var10 = new s23("READABLE_ARRAY", 9, iwcVar.b(ReadableArray.class));
        X = s23Var10;
        s23 s23Var11 = new s23("READABLE_MAP", 10, iwcVar.b(ReadableMap.class));
        Y = s23Var11;
        s23 s23Var12 = new s23("UINT8_TYPED_ARRAY", 11, iwcVar.b(byte[].class));
        Z = s23Var12;
        s23 s23Var13 = new s23("TYPED_ARRAY", 12, iwcVar.b(pyf.class));
        a0 = s23Var13;
        s23 s23Var14 = new s23("PRIMITIVE_ARRAY", 13, iwcVar.b(Object[].class));
        b0 = s23Var14;
        s23 s23Var15 = new s23("ARRAY", 14, iwcVar.b(Object[].class));
        c0 = s23Var15;
        s23 s23Var16 = new s23("LIST", 15, iwcVar.b(List.class));
        d0 = s23Var16;
        s23 s23Var17 = new s23("MAP", 16, iwcVar.b(Map.class));
        e0 = s23Var17;
        s23 s23Var18 = new s23("VIEW_TAG", 17, iwcVar.b(cls));
        f0 = s23Var18;
        s23 s23Var19 = new s23("SHARED_OBJECT_ID", 18, iwcVar.b(cls));
        g0 = s23Var19;
        s23 s23Var20 = new s23("JS_FUNCTION", 19, iwcVar.b(JavaScriptFunction.class));
        h0 = s23Var20;
        s23 s23Var21 = new s23("ANY", 20, iwcVar.b(Object.class));
        i0 = s23Var21;
        s23 s23Var22 = new s23("NULLABLE", 21, iwcVar.b(Object.class));
        j0 = s23Var22;
        s23 s23Var23 = new s23("VALUE_OR_UNDEFINED", 22, iwcVar.b(ValueOrUndefined.class));
        k0 = s23Var23;
        l0 = new s23[]{s23Var, s23Var2, s23Var3, s23Var4, s23Var5, s23Var6, s23Var7, s23Var8, s23Var9, s23Var10, s23Var11, s23Var12, s23Var13, s23Var14, s23Var15, s23Var16, s23Var17, s23Var18, s23Var19, s23Var20, s23Var21, s23Var22, s23Var23};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s23(String str, int i, yd8 yd8Var) {
        int i2 = c0h.p0;
        c0h.p0 = i2 + 1;
        this(str, i, yd8Var, 1 << i2);
    }

    public static s23 valueOf(String str) {
        return (s23) Enum.valueOf(s23.class, str);
    }

    public static s23[] values() {
        return (s23[]) l0.clone();
    }

    public final yd8<?> a() {
        return this.clazz;
    }

    public final int c() {
        return this.value;
    }

    public s23(String str, int i, yd8 yd8Var, int i2) {
        this.clazz = yd8Var;
        this.value = i2;
    }
}
