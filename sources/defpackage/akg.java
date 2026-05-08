package defpackage;

import defpackage.ere;
import defpackage.me8;
import defpackage.qhd;
import defpackage.rw5;
import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class akg {
    public static final mq5 a = new mq5("kotlin.jvm.JvmStatic");

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[bnb.values().length];
            try {
                iArr[bnb.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bnb.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bnb.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[bnb.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[bnb.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[bnb.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[bnb.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[bnb.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr;
        }
    }

    public static final wd8 a(ud8 ud8Var) {
        wd8 wd8Var = ud8Var instanceof wd8 ? (wd8) ud8Var : null;
        if (wd8Var != null) {
            return wd8Var;
        }
        ye8 ye8VarB = b(ud8Var);
        return ye8VarB != null ? ye8VarB : c(ud8Var);
    }

    public static final ye8 b(Object obj) {
        ye8 ye8Var = obj instanceof ye8 ? (ye8) obj : null;
        if (ye8Var != null) {
            return ye8Var;
        }
        pv5 pv5Var = obj instanceof pv5 ? (pv5) obj : null;
        ud8 ud8VarCompute = pv5Var != null ? pv5Var.compute() : null;
        if (ud8VarCompute instanceof ye8) {
            return (ye8) ud8VarCompute;
        }
        return null;
    }

    public static final xf8<?> c(Object obj) {
        xf8<?> xf8Var = obj instanceof xf8 ? (xf8) obj : null;
        if (xf8Var != null) {
            return xf8Var;
        }
        o4c o4cVar = obj instanceof o4c ? (o4c) obj : null;
        ud8 ud8VarCompute = o4cVar != null ? o4cVar.compute() : null;
        if (ud8VarCompute instanceof xf8) {
            return (xf8) ud8VarCompute;
        }
        return null;
    }

    public static final ArrayList d(ie0 ie0Var) throws IllegalAccessException, InvocationTargetException {
        List listZ;
        ie0Var.getClass();
        lf0 annotations = ie0Var.getAnnotations();
        ArrayList<Annotation> arrayList = new ArrayList();
        Iterator<af0> it = annotations.iterator();
        while (true) {
            Annotation annotationI = null;
            if (!it.hasNext()) {
                break;
            }
            af0 next = it.next();
            qne qneVarG = next.g();
            if (qneVarG instanceof uuc) {
                annotationI = ((uuc) qneVarG).a;
            } else if (qneVarG instanceof qhd.a) {
                mvc mvcVar = ((qhd.a) qneVarG).a;
                xuc xucVar = mvcVar instanceof xuc ? (xuc) mvcVar : null;
                if (xucVar != null) {
                    annotationI = xucVar.a;
                }
            } else {
                annotationI = i(next);
            }
            if (annotationI != null) {
                arrayList.add(annotationI);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (jh2.p(jh2.m((Annotation) it2.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Annotation annotation : arrayList) {
                        Class clsP = jh2.p(jh2.m(annotation));
                        if (!clsP.getSimpleName().equals("Container") || clsP.getAnnotation(d2d.class) == null) {
                            listZ = u63.Z(annotation);
                        } else {
                            Object objInvoke = clsP.getDeclaredMethod("value", null).invoke(annotation, null);
                            objInvoke.getClass();
                            listZ = Arrays.asList((Annotation[]) objInvoke);
                            listZ.getClass();
                        }
                        w92.w0(arrayList2, listZ);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }

    public static final Object e(Type type) {
        type.getClass();
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (cls.equals(Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (cls.equals(Character.TYPE)) {
                    return (char) 0;
                }
                if (cls.equals(Byte.TYPE)) {
                    return (byte) 0;
                }
                if (cls.equals(Short.TYPE)) {
                    return (short) 0;
                }
                if (cls.equals(Integer.TYPE)) {
                    return 0;
                }
                if (cls.equals(Float.TYPE)) {
                    return Float.valueOf(0.0f);
                }
                if (cls.equals(Long.TYPE)) {
                    return 0L;
                }
                if (cls.equals(Double.TYPE)) {
                    return Double.valueOf(0.0d);
                }
                if (cls.equals(Void.TYPE)) {
                    r6.g("Parameter with void type is illegal");
                    return null;
                }
                l5.p(type, "Unknown primitive: ");
            }
        }
        return null;
    }

    public static final fv1 f(Class cls, rw5.c cVar, o8a o8aVar, hyf hyfVar, xf1 xf1Var, Function2 function2) {
        List<l5c> listA0;
        cls.getClass();
        cVar.getClass();
        o8aVar.getClass();
        xf1Var.getClass();
        function2.getClass();
        phd phdVarA = ux9.a(cls);
        if (cVar instanceof b5c) {
            listA0 = ((b5c) cVar).Z();
        } else {
            if (!(cVar instanceof g5c)) {
                ja.i(cVar, "Unsupported message: ");
                return null;
            }
            listA0 = ((g5c) cVar).a0();
        }
        List<l5c> list = listA0;
        g04 g04Var = phdVarA.a;
        xx9 xx9Var = g04Var.b;
        cng cngVar = cng.b;
        list.getClass();
        return (fv1) function2.invoke(new gn9(new h04(g04Var, o8aVar, xx9Var, hyfVar, cngVar, xf1Var, null, null, list)), cVar);
    }

    public static final hsc g(hv1 hv1Var) {
        hv1Var.getClass();
        if (hv1Var.L() == null) {
            return null;
        }
        aj3 aj3VarD = hv1Var.d();
        aj3VarD.getClass();
        return ((t52) aj3VarD).J0();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class<?> h(ClassLoader classLoader, a62 a62Var, int i) {
        String str = iw7.a;
        a62 a62VarG = iw7.g(a62Var.a().a);
        if (a62VarG != null) {
            a62Var = a62VarG;
        }
        String str2 = a62Var.a.a.a;
        String str3 = a62Var.b.a.a;
        if (wl7.b(str2, "kotlin")) {
            switch (str3.hashCode()) {
                case -901856463:
                    if (str3.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str3.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str3.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str3.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str3.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str3.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str3.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str3.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str3.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str2.length() > 0) {
            sb.append(str2.concat("."));
        }
        sb.append(wve.H(str3, JwtParser.SEPARATOR_CHAR, '$'));
        if (i > 0) {
            sb.append(";");
        }
        try {
            return Class.forName(sb.toString(), false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Annotation i(af0 af0Var) {
        t52 t52VarD = b04.d(af0Var);
        Class<?> clsJ = t52VarD != null ? j(t52VarD) : null;
        if (clsJ == null) {
            clsJ = null;
        }
        if (clsJ == null) {
            return null;
        }
        Set<Map.Entry<n8a, up2<?>>> setEntrySet = af0Var.i().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            n8a n8aVar = (n8a) entry.getKey();
            up2 up2Var = (up2) entry.getValue();
            ClassLoader classLoader = clsJ.getClassLoader();
            classLoader.getClass();
            Object objK = k(up2Var, classLoader);
            Pair pair = objK != null ? new Pair(n8aVar.c(), objK) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map mapF0 = lc9.f0(arrayList);
        Set setKeySet = mapF0.keySet();
        ArrayList arrayList2 = new ArrayList(t92.r0(setKeySet, 10));
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsJ.getDeclaredMethod((String) it2.next(), null));
        }
        return (Annotation) ze0.a(clsJ, mapF0, arrayList2);
    }

    public static final Class<?> j(t52 t52Var) {
        t52Var.getClass();
        qne qneVarG = t52Var.g();
        qneVarG.getClass();
        if (qneVarG instanceof pi8) {
            return ((awc) ((pi8) qneVarG).a).a;
        }
        if (qneVarG instanceof qhd.a) {
            mvc mvcVar = ((qhd.a) qneVarG).a;
            mvcVar.getClass();
            return ((hvc) mvcVar).a;
        }
        a62 a62VarF = b04.f(t52Var);
        if (a62VarF == null) {
            return null;
        }
        return h(wuc.d(t52Var.getClass()), a62VarF, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object k(up2<?> up2Var, ClassLoader classLoader) {
        ui8 ui8Var;
        Class<?> clsH;
        if (up2Var instanceof kf0) {
            return i((af0) ((kf0) up2Var).a);
        }
        int i = 0;
        if (up2Var instanceof rt0) {
            rt0 rt0Var = (rt0) up2Var;
            uyf uyfVar = rt0Var instanceof uyf ? (uyf) rt0Var : null;
            if (uyfVar != null && (ui8Var = uyfVar.c) != null) {
                T t = rt0Var.a;
                Iterable iterable = (Iterable) t;
                ArrayList arrayList = new ArrayList(t92.r0(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(k((up2) it.next(), classLoader));
                }
                n8a n8aVar = ei8.e;
                v62 v62VarD = ui8Var.M0().d();
                bnb bnbVarS = v62VarD == null ? null : ei8.s(v62VarD);
                switch (bnbVarS == null ? -1 : a.a[bnbVarS.ordinal()]) {
                    case -1:
                        if (!ei8.z(ui8Var)) {
                            r40.g(ui8Var, "Not an array type: ");
                            return null;
                        }
                        ui8 type = ((wxf) z92.k1(ui8Var.K0())).getType();
                        type.getClass();
                        v62 v62VarD2 = type.M0().d();
                        t52 t52Var = v62VarD2 instanceof t52 ? (t52) v62VarD2 : null;
                        if (t52Var == null) {
                            ja.i(type, "Not a class type: ");
                            return null;
                        }
                        if (ei8.I(type)) {
                            int size = ((List) t).size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                obj.getClass();
                                strArr[i] = obj;
                                i++;
                            }
                            return strArr;
                        }
                        if (ei8.b(t52Var, ere.a.Q)) {
                            int size2 = ((List) t).size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                Object obj2 = arrayList.get(i);
                                obj2.getClass();
                                clsArr[i] = obj2;
                                i++;
                            }
                            return clsArr;
                        }
                        a62 a62VarF = b04.f(t52Var);
                        if (a62VarF != null && (clsH = h(classLoader, a62VarF, 0)) != null) {
                            Object objNewInstance = Array.newInstance(clsH, ((List) t).size());
                            objNewInstance.getClass();
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i < size3) {
                                objArr[i] = arrayList.get(i);
                                i++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        l.g();
                        return null;
                    case 1:
                        int size4 = ((List) t).size();
                        boolean[] zArr = new boolean[size4];
                        while (i < size4) {
                            Object obj3 = arrayList.get(i);
                            obj3.getClass();
                            zArr[i] = ((Boolean) obj3).booleanValue();
                            i++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) t).size();
                        char[] cArr = new char[size5];
                        while (i < size5) {
                            Object obj4 = arrayList.get(i);
                            obj4.getClass();
                            cArr[i] = ((Character) obj4).charValue();
                            i++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) t).size();
                        byte[] bArr = new byte[size6];
                        while (i < size6) {
                            Object obj5 = arrayList.get(i);
                            obj5.getClass();
                            bArr[i] = ((Byte) obj5).byteValue();
                            i++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) t).size();
                        short[] sArr = new short[size7];
                        while (i < size7) {
                            Object obj6 = arrayList.get(i);
                            obj6.getClass();
                            sArr[i] = ((Short) obj6).shortValue();
                            i++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) t).size();
                        int[] iArr = new int[size8];
                        while (i < size8) {
                            Object obj7 = arrayList.get(i);
                            obj7.getClass();
                            iArr[i] = ((Integer) obj7).intValue();
                            i++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) t).size();
                        float[] fArr = new float[size9];
                        while (i < size9) {
                            Object obj8 = arrayList.get(i);
                            obj8.getClass();
                            fArr[i] = ((Float) obj8).floatValue();
                            i++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) t).size();
                        long[] jArr = new long[size10];
                        while (i < size10) {
                            Object obj9 = arrayList.get(i);
                            obj9.getClass();
                            jArr[i] = ((Long) obj9).longValue();
                            i++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) t).size();
                        double[] dArr = new double[size11];
                        while (i < size11) {
                            Object obj10 = arrayList.get(i);
                            obj10.getClass();
                            dArr[i] = ((Double) obj10).doubleValue();
                            i++;
                        }
                        return dArr;
                }
            }
        } else if (up2Var instanceof dw4) {
            Pair pair = (Pair) ((dw4) up2Var).a;
            a62 a62Var = (a62) pair.a();
            n8a n8aVar2 = (n8a) pair.b();
            Class<?> clsH2 = h(classLoader, a62Var, 0);
            if (clsH2 != null) {
                return Enum.valueOf(clsH2, n8aVar2.c());
            }
        } else {
            if (!(up2Var instanceof me8)) {
                if ((up2Var instanceof mx4) || (up2Var instanceof jma)) {
                    return null;
                }
                return up2Var.b();
            }
            me8.a aVar = (me8.a) ((me8) up2Var).a;
            if (aVar instanceof me8.a.b) {
                d62 d62Var = ((me8.a.b) aVar).a;
                return h(classLoader, d62Var.a, d62Var.b);
            }
            if (!(aVar instanceof me8.a.C0318a)) {
                l.g();
                return null;
            }
            v62 v62VarD3 = ((me8.a.C0318a) aVar).a.M0().d();
            t52 t52Var2 = v62VarD3 instanceof t52 ? (t52) v62VarD3 : null;
            if (t52Var2 != null) {
                return j(t52Var2);
            }
        }
        return null;
    }
}
