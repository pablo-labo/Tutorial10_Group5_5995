package defpackage;

import defpackage.mq5;
import io.jsonwebtoken.JwtParser;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class wuc {
    public static final List<yd8<? extends Object>> a;
    public static final Map<Class<? extends Object>, Class<? extends Object>> b;
    public static final Map<Class<? extends Object>, Class<? extends Object>> c;
    public static final Map<Class<? extends vu5<?>>, Integer> d;

    static {
        iwc iwcVar = fwc.a;
        int i = 0;
        List<yd8<? extends Object>> listA0 = u63.a0(iwcVar.b(Boolean.TYPE), iwcVar.b(Byte.TYPE), iwcVar.b(Character.TYPE), iwcVar.b(Double.TYPE), iwcVar.b(Float.TYPE), iwcVar.b(Integer.TYPE), iwcVar.b(Long.TYPE), iwcVar.b(Short.TYPE));
        a = listA0;
        List<yd8<? extends Object>> list = listA0;
        ArrayList arrayList = new ArrayList(t92.r0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            yd8 yd8Var = (yd8) it.next();
            arrayList.add(new Pair(jh2.q(yd8Var), jh2.r(yd8Var)));
        }
        b = lc9.f0(arrayList);
        List<yd8<? extends Object>> list2 = a;
        ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            yd8 yd8Var2 = (yd8) it2.next();
            arrayList2.add(new Pair(jh2.r(yd8Var2), jh2.q(yd8Var2)));
        }
        c = lc9.f0(arrayList2);
        List listA02 = u63.a0(gu5.class, Function1.class, Function2.class, wu5.class, xu5.class, yu5.class, zu5.class, av5.class, bv5.class, cv5.class, hu5.class, iu5.class, ju5.class, ku5.class, lu5.class, mu5.class, nu5.class, ou5.class, pu5.class, qu5.class, su5.class, tu5.class, uu5.class);
        ArrayList arrayList3 = new ArrayList(t92.r0(listA02, 10));
        for (Object obj : listA02) {
            int i2 = i + 1;
            if (i < 0) {
                u63.o0();
                throw null;
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        d = lc9.f0(arrayList3);
    }

    public static final a62 a(Class<?> cls) {
        cls.getClass();
        if (cls.isPrimitive()) {
            l5.q(m6.f(cls, "Can't compute ClassId for primitive type: "));
            return null;
        }
        if (cls.isArray()) {
            l5.q(m6.f(cls, "Can't compute ClassId for array type: "));
            return null;
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            mq5 mq5Var = new mq5(cls.getName());
            return new a62(mq5Var.b(), mq5.a.a(mq5Var.a.f()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return a(declaringClass).d(n8a.h(cls.getSimpleName()));
        }
        mq5 mq5Var2 = new mq5(cls.getName());
        return new a62(mq5Var2.b(), mq5Var2.a.f());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String b(Class<?> cls) {
        cls.getClass();
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String strReplace = cls.getName().replace(JwtParser.SEPARATOR_CHAR, '/');
                strReplace.getClass();
                return strReplace;
            }
            StringBuilder sb = new StringBuilder("L");
            String strReplace2 = cls.getName().replace(JwtParser.SEPARATOR_CHAR, '/');
            strReplace2.getClass();
            sb.append(strReplace2);
            sb.append(';');
            return sb.toString();
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        l5.q(m6.f(cls, "Unsupported primitive type: "));
        return null;
    }

    public static final List<Type> c(Type type) {
        type.getClass();
        if (!(type instanceof ParameterizedType)) {
            return zr4.a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return a7e.W(new hh5(v6e.O(type, su1.c), tu1.d, z6e.a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return ut0.E0(actualTypeArguments);
    }

    public static final ClassLoader d(Class<?> cls) {
        cls.getClass();
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        systemClassLoader.getClass();
        return systemClassLoader;
    }
}
