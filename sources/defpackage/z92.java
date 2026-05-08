package defpackage;

import io.jsonwebtoken.JwtParser;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class z92 extends w92 {
    public static long[] A1(Collection<Long> collection) {
        collection.getClass();
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList B1(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final <T> List<T> C1(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        u1(iterable, arrayList);
        return arrayList;
    }

    public static <T> Set<T> D1(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        u1(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static <T> Set<T> E1(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return pi3.k(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(kc9.V(collection.size()));
                u1(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            u1(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : pi3.k(linkedHashSet2.iterator().next());
            }
        }
        return is4.a;
    }

    public static <T> boolean F0(Iterable<? extends T> iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static ArrayList F1(Iterable iterable, int i, int i2) {
        iterable.getClass();
        beb.f(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            it.getClass();
            Iterator itW = !it.hasNext() ? xr4.a : q92.w(new dke(i, i2, it, false, true, null));
            while (itW.hasNext()) {
                arrayList.add((List) itW.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList3.add(list.get(i5 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static y92 G0(Iterable iterable) {
        iterable.getClass();
        return new y92(iterable);
    }

    public static na7 G1(Iterable iterable) {
        iterable.getClass();
        return new na7(new wm1(iterable, 1));
    }

    public static double H0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double dFloatValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dFloatValue += (double) ((Number) it.next()).floatValue();
            i++;
            if (i < 0) {
                u63.n0();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i);
    }

    public static ArrayList H1(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(t92.r0(iterable, 10), t92.r0(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> boolean I0(Iterable<? extends T> iterable, T t) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).contains(t) : S0(iterable, t) >= 0;
    }

    public static <T> List<T> J0(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        iterable.getClass();
        if (i < 0) {
            h5.k(bg.d(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return z1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return zr4.a;
            }
            if (size == 1) {
                return u63.Z(X0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (T t : iterable) {
            if (i2 >= i) {
                arrayList.add(t);
            } else {
                i2++;
            }
        }
        return u63.e0(arrayList);
    }

    public static List K0(int i, List list) {
        list.getClass();
        if (i < 0) {
            h5.k(bg.d(i, "Requested element count ", " is less than zero."));
            return null;
        }
        List list2 = list;
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return q1(list2, size);
    }

    public static Object L0(final int i, Collection collection) {
        collection.getClass();
        boolean z = collection instanceof List;
        if (z) {
            return ((List) collection).get(i);
        }
        Function1 function1 = new Function1() { // from class: x92
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException(bg.c(JwtParser.SEPARATOR_CHAR, i, "Collection doesn't contain element at index "));
            }
        };
        if (z) {
            List list = (List) collection;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            function1.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            function1.invoke(Integer.valueOf(i));
            throw null;
        }
        int i2 = 0;
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        function1.invoke(Integer.valueOf(i));
        throw null;
    }

    public static <T> List<T> M0(Iterable<? extends T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <T> T N0(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return (T) O0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        s6.j("Collection is empty.");
        return null;
    }

    public static <T> T O0(List<? extends T> list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        s6.j("List is empty.");
        return null;
    }

    public static <T> T P0(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T> T Q0(List<? extends T> list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object R0(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static <T> int S0(Iterable<? extends T> iterable, T t) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i < 0) {
                u63.o0();
                throw null;
            }
            if (wl7.b(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T> Set<T> T0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Set<T> setD1 = D1(iterable);
        setD1.retainAll(w92.z0(iterable2));
        return setD1;
    }

    public static final void U0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) throws IOException {
        iterable.getClass();
        appendable.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        appendable.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                appendable.append(charSequence);
            }
            awd.c(appendable, obj, function1);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ void V0(Iterable iterable, StringBuilder sb, String str, String str2, String str3, Function1 function1, int i) throws IOException {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 4) != 0 ? "" : str2;
        String str6 = (i & 8) != 0 ? "" : str3;
        if ((i & 64) != 0) {
            function1 = null;
        }
        U0(iterable, sb, str4, str5, str6, "...", function1);
    }

    public static String W0(Iterable iterable, CharSequence charSequence, String str, String str2, Function1 function1, int i) throws IOException {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            function1 = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder();
        U0(iterable, sb, charSequence2, str3, str4, "...", function1);
        return sb.toString();
    }

    public static <T> T X0(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return (T) Y0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            s6.j("Collection is empty.");
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T Y0(List<? extends T> list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        s6.j("List is empty.");
        return null;
    }

    public static <T> T Z0(List<? extends T> list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable a1(List list) {
        list.getClass();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float b1(Iterable<Float> iterable) {
        iterable.getClass();
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Float c1(Iterable<Float> iterable) {
        iterable.getClass();
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static ArrayList d1(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(t92.r0(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && wl7.b(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList e1(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return h1((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        w92.w0(arrayList, iterable);
        w92.w0(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList f1(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return g1(obj, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        w92.w0(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList g1(Object obj, Collection collection) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList h1(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            w92.w0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static <T> List<T> i1(Iterable<? extends T> iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return z1(iterable);
        }
        List<T> listC1 = C1(iterable);
        Collections.reverse(listC1);
        return listC1;
    }

    public static <T> T j1(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return (T) k1((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            s6.j("Collection is empty.");
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        l5.q("Collection has more than one element.");
        return null;
    }

    public static <T> T k1(List<? extends T> list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            s6.j("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        l5.q("List has more than one element.");
        return null;
    }

    public static <T> T l1(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static <T> T m1(List<? extends T> list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> List<T> n1(List<? extends T> list, oh7 oh7Var) {
        list.getClass();
        oh7Var.getClass();
        return oh7Var.isEmpty() ? zr4.a : z1(list.subList(oh7Var.a, oh7Var.b + 1));
    }

    public static <T extends Comparable<? super T>> List<T> o1(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List<T> listC1 = C1(iterable);
            w92.D0(listC1);
            return listC1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return z1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        array.getClass();
        List<T> listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> p1(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List<T> listC1 = C1(iterable);
            w92.E0(comparator, listC1);
            return listC1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return z1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        pyd.Q(array, comparator);
        List<T> listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static <T> List<T> q1(Iterable<? extends T> iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            h5.k(bg.d(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return zr4.a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return z1(iterable);
            }
            if (i == 1) {
                return u63.Z(N0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<? extends T> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return u63.e0(arrayList);
    }

    public static List r1(int i, List list) {
        list.getClass();
        if (i < 0) {
            h5.k(bg.d(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return zr4.a;
        }
        int size = list.size();
        if (i >= size) {
            return z1(list);
        }
        if (i == 1) {
            return u63.Z(Y0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean[] s1(Collection<Boolean> collection) {
        collection.getClass();
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = it.next().booleanValue();
            i++;
        }
        return zArr;
    }

    public static byte[] t1(Collection<Byte> collection) {
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = it.next().byteValue();
            i++;
        }
        return bArr;
    }

    public static final void u1(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static double[] v1(Collection<Double> collection) {
        collection.getClass();
        double[] dArr = new double[collection.size()];
        Iterator<Double> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            dArr[i] = it.next().doubleValue();
            i++;
        }
        return dArr;
    }

    public static float[] w1(Collection<Float> collection) {
        collection.getClass();
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = it.next().floatValue();
            i++;
        }
        return fArr;
    }

    public static <T> HashSet<T> x1(Iterable<? extends T> iterable) {
        iterable.getClass();
        HashSet<T> hashSet = new HashSet<>(kc9.V(t92.r0(iterable, 12)));
        u1(iterable, hashSet);
        return hashSet;
    }

    public static int[] y1(Collection<Integer> collection) {
        collection.getClass();
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public static <T> List<T> z1(Iterable<? extends T> iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return u63.e0(C1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return zr4.a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return u63.Z(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }
}
