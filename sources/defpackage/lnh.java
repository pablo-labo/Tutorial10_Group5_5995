package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class lnh {
    static {
        Boolean bool = new Boolean(true);
        String str = new String();
        Character ch = new Character((char) 0);
        Byte b = new Byte((byte) 0);
        Short sh = new Short((short) 0);
        Integer num = new Integer(0);
        Float f = new Float(0.0f);
        Long l = new Long(0L);
        Double d = new Double(0.0d);
        BigInteger bigInteger = new BigInteger("0");
        BigDecimal bigDecimal = new BigDecimal("0");
        wnh wnhVar = new wnh();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(Boolean.class, bool);
        concurrentHashMap.put(String.class, str);
        concurrentHashMap.put(Character.class, ch);
        concurrentHashMap.put(Byte.class, b);
        concurrentHashMap.put(Short.class, sh);
        concurrentHashMap.put(Integer.class, num);
        concurrentHashMap.put(Float.class, f);
        concurrentHashMap.put(Long.class, l);
        concurrentHashMap.put(Double.class, d);
        concurrentHashMap.put(BigInteger.class, bigInteger);
        concurrentHashMap.put(BigDecimal.class, bigDecimal);
        concurrentHashMap.put(wnh.class, wnhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(T t) {
        T t2;
        if (t == 0 || c(t.getClass())) {
            return t;
        }
        if (t instanceof foh) {
            return (T) ((foh) ((foh) t).clone());
        }
        Class<?> cls = t.getClass();
        if (cls.isArray()) {
            t2 = (T) Array.newInstance(cls.getComponentType(), Array.getLength(t));
        } else if (t instanceof kmh) {
            t2 = (T) ((kmh) ((kmh) t).clone());
        } else {
            if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
                Object[] array = ((List) t).toArray();
                b(array, array);
                return (T) Arrays.asList(array);
            }
            try {
                t2 = (T) cls.newInstance();
            } catch (IllegalAccessException e) {
                throw pg8.Z(cls, e);
            } catch (InstantiationException e2) {
                throw pg8.Z(cls, e2);
            }
        }
        b(t, t2);
        return t2;
    }

    public static void b(Object obj, Object obj2) {
        int i;
        Class<?> cls = obj.getClass();
        if (cls != obj2.getClass()) {
            o6.h();
            return;
        }
        int i2 = 0;
        if (cls.isArray()) {
            if (Array.getLength(obj) != Array.getLength(obj2)) {
                o6.h();
                return;
            }
            Iterator it = pg8.a0(obj).iterator();
            while (it.hasNext()) {
                Array.set(obj2, i2, a(it.next()));
                i2++;
            }
            return;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            Collection collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                collection2.add(a(it2.next()));
            }
            return;
        }
        boolean zIsAssignableFrom = foh.class.isAssignableFrom(cls);
        if (zIsAssignableFrom || !Map.class.isAssignableFrom(cls)) {
            xmh xmhVarA = zIsAssignableFrom ? ((foh) obj).b : xmh.a(cls, false);
            Iterator<String> it3 = xmhVarA.d.iterator();
            while (it3.hasNext()) {
                hoh hohVarB = xmhVarA.b(it3.next());
                if (!Modifier.isFinal(hohVarB.b.getModifiers()) && (!zIsAssignableFrom || !hohVarB.a)) {
                    Object objA = hoh.a(obj, hohVarB.b);
                    if (objA != null) {
                        hohVarB.c(obj2, a(objA));
                    }
                }
            }
            return;
        }
        if (!kmh.class.isAssignableFrom(cls)) {
            Map map = (Map) obj2;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                map.put((String) entry.getKey(), a(entry.getValue()));
            }
            return;
        }
        kmh kmhVar = (kmh) obj2;
        kmh kmhVar2 = (kmh) obj;
        int i3 = kmhVar2.a;
        while (i2 < i3) {
            Object obj3 = null;
            if (i2 >= 0 && i2 < kmhVar2.a && (i = (i2 << 1) + 1) >= 0) {
                obj3 = kmhVar2.b[i];
            }
            Object objA2 = a(obj3);
            int i4 = kmhVar.a;
            if (i2 < 0 || i2 >= i4) {
                k20.o();
                return;
            }
            int i5 = (i2 << 1) + 1;
            if (i5 >= 0) {
                Object obj4 = kmhVar.b[i5];
            }
            kmhVar.b[i5] = objA2;
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(Class cls) {
        boolean z = cls instanceof WildcardType;
        Object obj = cls;
        if (z) {
            WildcardType wildcardType = (WildcardType) cls;
            Object[] lowerBounds = wildcardType.getLowerBounds();
            obj = lowerBounds.length != 0 ? lowerBounds[0] : wildcardType.getUpperBounds()[0];
        }
        if (obj instanceof Class) {
            Class cls2 = (Class) obj;
            if (cls2.isPrimitive() || cls2 == Character.class || cls2 == String.class || cls2 == Integer.class || cls2 == Long.class || cls2 == Short.class || cls2 == Byte.class || cls2 == Float.class || cls2 == Double.class || cls2 == BigInteger.class || cls2 == BigDecimal.class || cls2 == wnh.class || cls2 == Boolean.class) {
                return true;
            }
        }
        return false;
    }
}
