package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.ax5;
import java.io.File;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class zoe extends ax5 {
    public static final zoe o = new zoe();
    public static final Class<?>[] p = new Class[0];
    public static final Class<?>[] q = {g.class};
    public static final m62 r = new m62(new t65(1));
    public static final HashSet s;
    public static final HashSet t;
    public static final Class u;
    public static final g v;
    public final HashSet j = new HashSet(Arrays.asList(BigDecimal.class, BigInteger.class, URI.class, URL.class, File.class));
    public final boolean k = Boolean.parseBoolean(System.getProperty("org.apache.avro.specific.use_custom_coders", "false"));
    public final ConcurrentHashMap l = new ConcurrentHashMap();
    public final m62<g> m = new m62<>(new voe());
    public final Map<Type, g> n = Collections.synchronizedMap(new WeakHashMap());

    public class a {
    }

    public interface b {
    }

    static {
        new m62(new xoe());
        HashSet hashSet = new HashSet(Arrays.asList("_", "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while", "true", "false", "null", "Builder"));
        s = hashSet;
        HashSet hashSet2 = new HashSet(Arrays.asList("class", "schema", "classSchema"));
        hashSet2.addAll(hashSet);
        HashSet hashSet3 = new HashSet(Arrays.asList("var", "yield", "record"));
        t = hashSet3;
        hashSet3.addAll(hashSet);
        new HashSet(Arrays.asList("message", "cause")).addAll(hashSet2);
        u = a.class;
        v = g.s(g.u.NULL);
    }

    public static g t(Type type, HashMap map) {
        boolean z = type instanceof Class;
        if (z && CharSequence.class.isAssignableFrom((Class) type)) {
            return g.s(g.u.STRING);
        }
        if (type == ByteBuffer.class) {
            return g.s(g.u.BYTES);
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return g.s(g.u.INT);
        }
        if (type == Long.class || type == Long.TYPE) {
            return g.s(g.u.LONG);
        }
        if (type == Float.class || type == Float.TYPE) {
            return g.s(g.u.FLOAT);
        }
        if (type == Double.class || type == Double.TYPE) {
            return g.s(g.u.DOUBLE);
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return g.s(g.u.BOOLEAN);
        }
        if (type == Void.class || type == Void.TYPE) {
            return g.s(g.u.NULL);
        }
        if (!(type instanceof ParameterizedType)) {
            if (!z) {
                r40.l("Unknown type: ".concat(String.valueOf(type)));
                return null;
            }
            Class cls = (Class) type;
            String name = cls.getName();
            g gVarB = (g) map.get(name);
            if (gVarB == null) {
                try {
                    gVarB = (g) cls.getDeclaredField("SCHEMA$").get(null);
                    if (!name.equals(v(gVarB))) {
                        gVarB = new g.p().b(gVarB.toString().replace(gVarB.I(), cls.getPackage().getName()));
                    }
                } catch (IllegalAccessException e) {
                    throw new AvroRuntimeException(e);
                } catch (NoSuchFieldException unused) {
                    r40.m("Not a Specific class: ".concat(String.valueOf(cls)));
                    return null;
                }
            }
            map.put(name, gVarB);
            return gVarB;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Class cls2 = (Class) parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (Collection.class.isAssignableFrom(cls2)) {
            if (actualTypeArguments.length == 1) {
                return new g.a(t(actualTypeArguments[0], map));
            }
            r40.l("No array type specified.");
            return null;
        }
        if (!Map.class.isAssignableFrom(cls2)) {
            return Optional.class.isAssignableFrom(cls2) ? new g.v(new g.j(new g.j(g.s(g.u.NULL), t(actualTypeArguments[0], map)))) : t(cls2, map);
        }
        Type type2 = actualTypeArguments[0];
        Type type3 = actualTypeArguments[1];
        if ((type2 instanceof Class) && CharSequence.class.isAssignableFrom((Class) type2)) {
            return new g.l(t(type3, map));
        }
        r40.l("Map key class not CharSequence: ".concat(ipd.a(type2)));
        return null;
    }

    public static String v(g gVar) {
        String strI = gVar.I();
        String strH = gVar.H();
        if (strI == null) {
            return strH;
        }
        if ("".equals(strI)) {
            return strH;
        }
        return z3.m(y(strI, s), strI.endsWith("$") ? "" : ".", y(strH, t));
    }

    public static f54 w(ObjectInput objectInput) {
        return new f54(new j55(objectInput));
    }

    public static g54 x(ObjectOutput objectOutput) {
        return new g54(new k55(objectOutput));
    }

    public static String y(String str, Set set) {
        int length = str == null ? 0 : str.length();
        if (length != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    if (!str.contains(".")) {
                        return !set.contains(str) ? str : str.concat("$");
                    }
                    String[] strArrSplit = str.split("\\.");
                    String[] strArr = new String[strArrSplit.length];
                    for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                        strArr[i2] = y(strArrSplit[i2], set);
                    }
                    return String.join(".", strArr);
                }
            }
        }
        return str;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static Object z(Class cls, g gVar) {
        boolean zIsAssignableFrom = b.class.isAssignableFrom(cls);
        try {
            m62 m62Var = r;
            m62Var.getClass();
            return ((Constructor) m62Var.a.apply((Class<?>) cls)).newInstance(zIsAssignableFrom ? new Object[]{gVar} : null);
        } catch (Exception e) {
            l5.r(e);
            return null;
        }
    }

    @Override // defpackage.ax5
    public final int a(Object obj, Object obj2, g gVar, boolean z) {
        return (gVar.K().ordinal() == 1 && (obj instanceof Enum)) ? ((Enum) obj).ordinal() - ((Enum) obj2).ordinal() : super.a(obj, obj2, gVar, z);
    }

    @Override // defpackage.ax5
    public final wg3 b(g gVar) {
        return new ape(gVar, gVar, this);
    }

    @Override // defpackage.ax5
    public final wg3 c(g gVar, g gVar2) {
        return new ape(gVar, gVar2, this);
    }

    @Override // defpackage.ax5
    public final Object d(String str, g gVar) {
        Class clsU = u(gVar);
        if (clsU == null) {
            return super.d(str, gVar);
        }
        if (s.contains(str)) {
            str = t40.k(str, "$");
        }
        return Enum.valueOf(clsU, str);
    }

    @Override // defpackage.ax5
    public final Object e(Object obj, g gVar) {
        Class clsU = u(gVar);
        return clsU == null ? super.e(obj, gVar) : clsU.isInstance(obj) ? obj : z(clsU, gVar);
    }

    @Override // defpackage.ax5
    public final Object f(Object obj) {
        if (obj instanceof String) {
            return obj;
        }
        return this.j.contains(obj.getClass()) ? obj : super.f(obj);
    }

    @Override // defpackage.ax5
    public final g k(Object obj) {
        if (!(obj instanceof Enum)) {
            return ((xw5) obj).a();
        }
        try {
            return this.m.a.apply(obj.getClass());
        } catch (Exception e) {
            if (e instanceof AvroRuntimeException) {
                throw ((AvroRuntimeException) e);
            }
            throw new AvroRuntimeException(e);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.ax5
    public final ax5.f l(g gVar) {
        final Class clsU = u(gVar);
        if (clsU == null) {
            return new i73(this, 4);
        }
        boolean zIsAssignableFrom = b.class.isAssignableFrom(clsU);
        m62 m62Var = r;
        m62Var.getClass();
        final Constructor constructor = (Constructor) m62Var.a.apply((Class<?>) clsU);
        final Object[] objArr = zIsAssignableFrom ? new Object[]{gVar} : null;
        return new ax5.f() { // from class: yoe
            @Override // ax5.f
            public final Object g(Object obj, g gVar2) {
                try {
                    return clsU.isInstance(obj) ? obj : constructor.newInstance(objArr);
                } catch (ReflectiveOperationException e) {
                    l5.r(e);
                    return null;
                }
            }
        };
    }

    @Override // defpackage.ax5
    public final String m(Object obj) {
        if (obj != null) {
            if (this.j.contains(obj.getClass())) {
                return g.u.STRING.c();
            }
        }
        return super.m(obj);
    }

    @Override // defpackage.ax5
    public final boolean n(Object obj) {
        return (obj instanceof Enum) || (obj instanceof kx5);
    }

    @Override // defpackage.ax5
    public final Object p(Object obj, g gVar) {
        Class clsU = u(gVar);
        return clsU == null ? super.p(obj, gVar) : clsU.isInstance(obj) ? obj : z(clsU, gVar);
    }

    public final Class u(g gVar) {
        switch (gVar.K().ordinal()) {
            case 0:
            case 1:
            case 5:
                String strE = gVar.E();
                if (strE != null) {
                    woe woeVar = new woe(this, gVar);
                    ConcurrentHashMap concurrentHashMap = this.l;
                    Object objComputeIfAbsent = concurrentHashMap.get(strE);
                    if (objComputeIfAbsent == null) {
                        objComputeIfAbsent = concurrentHashMap.computeIfAbsent(strE, new r96(woeVar, 1));
                    }
                    Class cls = (Class) objComputeIfAbsent;
                    if (cls != u) {
                        return cls;
                    }
                }
                return null;
            case 2:
                return List.class;
            case 3:
                return Map.class;
            case 4:
                List<g> listL = gVar.L();
                if (listL.size() != 2) {
                    return Object.class;
                }
                g gVar2 = v;
                if (!listL.contains(gVar2)) {
                    return Object.class;
                }
                g gVar3 = listL.get(listL.get(0).equals(gVar2) ? 1 : 0);
                switch (gVar3.K().ordinal()) {
                    case 8:
                        return Integer.class;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        return Long.class;
                    case 10:
                        return Float.class;
                    case 11:
                        return Double.class;
                    case 12:
                        return Boolean.class;
                    default:
                        return u(gVar3);
                }
            case 6:
                return "String".equals(gVar.e("avro.java.string")) ? String.class : CharSequence.class;
            case 7:
                return ByteBuffer.class;
            case 8:
                return Integer.TYPE;
            case DatadogLogGenerator.CRASH /* 9 */:
                return Long.TYPE;
            case 10:
                return Float.TYPE;
            case 11:
                return Double.TYPE;
            case 12:
                return Boolean.TYPE;
            case 13:
                return Void.TYPE;
            default:
                r40.m("Unknown type: ".concat(String.valueOf(gVar)));
                return null;
        }
    }
}
