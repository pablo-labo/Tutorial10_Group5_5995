package defpackage;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import defpackage.w2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ti8 {
    public static final /* synthetic */ ti8[] A0;
    public static final /* synthetic */ wv4 B0;
    public static final List<ti8> V;
    public static final List<ti8> W;
    public static final List<ti8> X;
    public static final List<ti8> Y;
    public static final List<ti8> Z;
    public static final HashMap<String, ti8> a;
    public static final List<ti8> a0;
    public static final Set<ti8> b;
    public static final List<ti8> b0;
    public static final Set<ti8> c;
    public static final List<ti8> c0;
    public static final List<ti8> d;
    public static final List<ti8> d0;
    public static final List<ti8> e;
    public static final Map<hf0, ti8> e0;
    public static final List<ti8> f;
    public static final ti8 f0;
    public static final ti8 g0;
    public static final ti8 h0;
    public static final ti8 i0;
    public static final ti8 j0;
    public static final ti8 k0;
    public static final ti8 l0;
    public static final ti8 m0;
    public static final ti8 n0;
    public static final ti8 o0;
    public static final ti8 p0;
    public static final ti8 q0;
    public static final ti8 r0;
    public static final ti8 s0;
    public static final ti8 t0;
    public static final ti8 u0;
    public static final ti8 v0;
    public static final ti8 w0;
    public static final ti8 x0;
    public static final ti8 y0;
    public static final ti8 z0;
    private final String description;
    private final boolean isDefault;

    static {
        ti8 ti8Var = new ti8(0, "CLASS", "class", true);
        f0 = ti8Var;
        ti8 ti8Var2 = new ti8(1, "ANNOTATION_CLASS", "annotation class", true);
        g0 = ti8Var2;
        ti8 ti8Var3 = new ti8(2, "TYPE_PARAMETER", "type parameter", false);
        h0 = ti8Var3;
        ti8 ti8Var4 = new ti8(3, "PROPERTY", "property", true);
        i0 = ti8Var4;
        ti8 ti8Var5 = new ti8(4, "FIELD", "field", true);
        j0 = ti8Var5;
        ti8 ti8Var6 = new ti8(5, "LOCAL_VARIABLE", "local variable", true);
        k0 = ti8Var6;
        ti8 ti8Var7 = new ti8(6, "VALUE_PARAMETER", "value parameter", true);
        l0 = ti8Var7;
        ti8 ti8Var8 = new ti8(7, "CONSTRUCTOR", "constructor", true);
        m0 = ti8Var8;
        ti8 ti8Var9 = new ti8(8, "FUNCTION", "function", true);
        n0 = ti8Var9;
        ti8 ti8Var10 = new ti8(9, "PROPERTY_GETTER", "getter", true);
        o0 = ti8Var10;
        ti8 ti8Var11 = new ti8(10, "PROPERTY_SETTER", "setter", true);
        p0 = ti8Var11;
        ti8 ti8Var12 = new ti8(11, CredentialProviderBaseController.TYPE_TAG, "type usage", false);
        q0 = ti8Var12;
        ti8 ti8Var13 = new ti8(12, "EXPRESSION", "expression", false);
        ti8 ti8Var14 = new ti8(13, "FILE", "file", false);
        r0 = ti8Var14;
        ti8 ti8Var15 = new ti8(14, "TYPEALIAS", "typealias", false);
        ti8 ti8Var16 = new ti8(15, "TYPE_PROJECTION", "type projection", false);
        ti8 ti8Var17 = new ti8(16, "STAR_PROJECTION", "star projection", false);
        ti8 ti8Var18 = new ti8(17, "PROPERTY_PARAMETER", "property constructor parameter", false);
        ti8 ti8Var19 = new ti8(18, "CLASS_ONLY", "class", false);
        s0 = ti8Var19;
        ti8 ti8Var20 = new ti8(19, "OBJECT", "object", false);
        t0 = ti8Var20;
        ti8 ti8Var21 = new ti8(20, "STANDALONE_OBJECT", "standalone object", false);
        u0 = ti8Var21;
        ti8 ti8Var22 = new ti8(21, "COMPANION_OBJECT", "companion object", false);
        v0 = ti8Var22;
        ti8 ti8Var23 = new ti8(22, "INTERFACE", "interface", false);
        w0 = ti8Var23;
        ti8 ti8Var24 = new ti8(23, "ENUM_CLASS", "enum class", false);
        x0 = ti8Var24;
        ti8 ti8Var25 = new ti8(24, "ENUM_ENTRY", "enum entry", false);
        y0 = ti8Var25;
        ti8 ti8Var26 = new ti8(25, "LOCAL_CLASS", "local class", false);
        z0 = ti8Var26;
        ti8[] ti8VarArr = {ti8Var, ti8Var2, ti8Var3, ti8Var4, ti8Var5, ti8Var6, ti8Var7, ti8Var8, ti8Var9, ti8Var10, ti8Var11, ti8Var12, ti8Var13, ti8Var14, ti8Var15, ti8Var16, ti8Var17, ti8Var18, ti8Var19, ti8Var20, ti8Var21, ti8Var22, ti8Var23, ti8Var24, ti8Var25, ti8Var26, new ti8(26, "LOCAL_FUNCTION", "local function", false), new ti8(27, "MEMBER_FUNCTION", "member function", false), new ti8(28, "TOP_LEVEL_FUNCTION", "top level function", false), new ti8(29, "MEMBER_PROPERTY", "member property", false), new ti8(30, "MEMBER_PROPERTY_WITH_BACKING_FIELD", "member property with backing field", false), new ti8(31, "MEMBER_PROPERTY_WITH_DELEGATE", "member property with delegate", false), new ti8(32, "MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", "member property without backing field or delegate", false), new ti8(33, "TOP_LEVEL_PROPERTY", "top level property", false), new ti8(34, "TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", "top level property with backing field", false), new ti8(35, "TOP_LEVEL_PROPERTY_WITH_DELEGATE", "top level property with delegate", false), new ti8(36, "TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", "top level property without backing field or delegate", false), new ti8(37, "BACKING_FIELD", "backing field", true), new ti8(38, "INITIALIZER", "initializer", false), new ti8(39, "DESTRUCTURING_DECLARATION", "destructuring declaration", false), new ti8(40, "LAMBDA_EXPRESSION", "lambda expression", false), new ti8(41, "ANONYMOUS_FUNCTION", "anonymous function", false), new ti8(42, "OBJECT_LITERAL", "object literal", false)};
        A0 = ti8VarArr;
        wv4 wv4Var = new wv4(ti8VarArr);
        B0 = wv4Var;
        a = new HashMap<>();
        w2.b bVar = new w2.b();
        while (bVar.hasNext()) {
            ti8 ti8Var27 = (ti8) bVar.next();
            a.put(ti8Var27.name(), ti8Var27);
        }
        wv4 wv4Var2 = B0;
        ArrayList arrayList = new ArrayList();
        wv4Var2.getClass();
        w2.b bVar2 = new w2.b();
        while (bVar2.hasNext()) {
            Object next = bVar2.next();
            if (((ti8) next).isDefault) {
                arrayList.add(next);
            }
        }
        b = z92.E1(arrayList);
        c = z92.E1(B0);
        ti8 ti8Var28 = g0;
        ti8 ti8Var29 = f0;
        d = u63.a0(ti8Var28, ti8Var29);
        e = u63.a0(z0, ti8Var29);
        f = u63.a0(s0, ti8Var29);
        ti8 ti8Var30 = v0;
        ti8 ti8Var31 = t0;
        V = u63.a0(ti8Var30, ti8Var31, ti8Var29);
        W = u63.a0(u0, ti8Var31, ti8Var29);
        X = u63.a0(w0, ti8Var29);
        Y = u63.a0(x0, ti8Var29);
        ti8 ti8Var32 = y0;
        ti8 ti8Var33 = i0;
        ti8 ti8Var34 = j0;
        Z = u63.a0(ti8Var32, ti8Var33, ti8Var34);
        ti8 ti8Var35 = p0;
        a0 = u63.Z(ti8Var35);
        ti8 ti8Var36 = o0;
        b0 = u63.Z(ti8Var36);
        c0 = u63.Z(n0);
        ti8 ti8Var37 = r0;
        d0 = u63.Z(ti8Var37);
        hf0 hf0Var = hf0.CONSTRUCTOR_PARAMETER;
        ti8 ti8Var38 = l0;
        e0 = lc9.a0(new Pair(hf0Var, ti8Var38), new Pair(hf0.FIELD, ti8Var34), new Pair(hf0.PROPERTY, ti8Var33), new Pair(hf0.FILE, ti8Var37), new Pair(hf0.PROPERTY_GETTER, ti8Var36), new Pair(hf0.PROPERTY_SETTER, ti8Var35), new Pair(hf0.RECEIVER, ti8Var38), new Pair(hf0.SETTER_PARAMETER, ti8Var38), new Pair(hf0.PROPERTY_DELEGATE_FIELD, ti8Var34));
    }

    public ti8(int i, String str, String str2, boolean z) {
        this.description = str2;
        this.isDefault = z;
    }

    public static ti8 valueOf(String str) {
        return (ti8) Enum.valueOf(ti8.class, str);
    }

    public static ti8[] values() {
        return (ti8[]) A0.clone();
    }
}
