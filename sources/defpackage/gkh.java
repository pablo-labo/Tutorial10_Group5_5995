package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gkh extends qjh implements List, RandomAccess {
    public static final ujh b = new ujh(enh.e, 0);

    public static enh i(int i, Object[] objArr) {
        return i == 0 ? enh.e : new enh(objArr, i);
    }

    public static enh j(Object[] objArr) {
        if (objArr.length == 0) {
            return enh.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        for (int i = 0; i < length; i++) {
            if (objArr2[i] == null) {
                ja.k(p6.c(i, "at index "));
                return null;
            }
        }
        return i(length, objArr2);
    }

    @Override // defpackage.qjh
    public int a(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // defpackage.qjh
    public final s7h d() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (awd.t(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                ujh ujhVarListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (ujhVarListIterator.hasNext()) {
                        if (!it.hasNext() || !awd.t(ujhVarListIterator.next(), it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public gkh f() {
        return size() <= 1 ? this : new bkh(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public gkh subList(int i, int i2) {
        zih.b(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? enh.e : new ckh(this, i, i3);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final ujh listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            return isEmpty() ? b : new ujh(this, i);
        }
        l5.s(zih.c(i, size, "index"));
        return null;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
