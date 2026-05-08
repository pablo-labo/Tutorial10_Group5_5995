package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class w92 extends v92 {
    public static final boolean A0(Iterable iterable, Function1 function1, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static void B0(List list, Function1 function1) {
        int size;
        list.getClass();
        function1.getClass();
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof ze8) && !(list instanceof bf8)) {
                pxf.g(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                A0(list, function1, true);
                return;
            } catch (ClassCastException e) {
                wl7.e(e, pxf.class.getName());
                throw e;
            }
        }
        int size2 = list.size() - 1;
        int i = 0;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == size2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (size = list.size() - 1)) {
            return;
        }
        while (true) {
            list.remove(size);
            if (size == i) {
                return;
            } else {
                size--;
            }
        }
    }

    public static Object C0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        s6.j("List is empty.");
        return null;
    }

    public static void D0(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void E0(Comparator comparator, List list) {
        list.getClass();
        comparator.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static final int t0(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder sbG = o6.g(i, "Element index ", " must be in range [");
        sbG.append(new oh7(0, list.size() - 1, 1));
        sbG.append("].");
        throw new IndexOutOfBoundsException(sbG.toString());
    }

    public static final int u0(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbG = o6.g(i, "Position index ", " must be in range [");
        sbG.append(new oh7(0, list.size(), 1));
        sbG.append("].");
        throw new IndexOutOfBoundsException(sbG.toString());
    }

    public static void v0(ArrayList arrayList, r6e r6eVar) {
        arrayList.getClass();
        r6eVar.getClass();
        Iterator it = r6eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
    }

    public static void w0(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void x0(Collection collection, Object[] objArr) {
        collection.getClass();
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        collection.addAll(listAsList);
    }

    public static wad y0(List list) {
        list.getClass();
        return new wad(list);
    }

    public static final Collection z0(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? (Collection) iterable : z92.z1(iterable);
    }
}
