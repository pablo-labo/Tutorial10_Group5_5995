package defpackage;

import defpackage.x37;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e47<E> extends x37<E> implements List<E>, RandomAccess {
    public static final b b = new b(qyc.e, 0);
    private static final long serialVersionUID = -889275714;

    public static final class a<E> extends x37.a<E> {
        public a() {
            super(4);
        }

        @Override // x37.b
        public final x37.b a(Object obj) {
            c(obj);
            return this;
        }

        public final qyc f() {
            this.c = true;
            return e47.i(this.b, this.a);
        }
    }

    public static class b<E> extends l2<E> {
        public final e47<E> c;

        public b(e47<E> e47Var, int i) {
            super(e47Var.size(), i);
            this.c = e47Var;
        }

        @Override // defpackage.l2
        public final E a(int i) {
            return this.c.get(i);
        }
    }

    public static class c implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public c(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return e47.k(this.elements);
        }
    }

    public static qyc i(int i, Object[] objArr) {
        return i == 0 ? qyc.e : new qyc(objArr, i);
    }

    public static <E> e47<E> j(Collection<? extends E> collection) {
        if (!(collection instanceof x37)) {
            Object[] array = collection.toArray();
            pg8.l(array.length, array);
            return i(array.length, array);
        }
        e47<E> e47VarA = ((x37) collection).a();
        if (!e47VarA.f()) {
            return e47VarA;
        }
        Object[] array2 = e47VarA.toArray(x37.a);
        return i(array2.length, array2);
    }

    public static qyc k(Object[] objArr) {
        if (objArr.length == 0) {
            return qyc.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        pg8.l(objArr2.length, objArr2);
        return i(objArr2.length, objArr2);
    }

    public static qyc m(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        pg8.l(5, objArr);
        return i(5, objArr);
    }

    public static qyc n(Object obj) {
        Object[] objArr = {obj};
        pg8.l(1, objArr);
        return i(1, objArr);
    }

    public static qyc o(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        pg8.l(2, objArr);
        return i(2, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static qyc q(Comparator comparator, List list) {
        Collection collection;
        comparator.getClass();
        if (list instanceof Collection) {
            collection = list;
        } else {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collection = arrayList;
        }
        Object[] array = collection.toArray();
        pg8.l(array.length, array);
        Arrays.sort(array, comparator);
        return i(array.length, array);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.x37
    @Deprecated
    public final e47<E> a() {
        return this;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.x37
    public int b(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.x37, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator<E> it = iterator();
                        Iterator<E> it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && ojh.l(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (ojh.l(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.x37
    /* JADX INFO: renamed from: g */
    public final r6g<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
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

    @Override // defpackage.x37, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final b listIterator(int i) {
        pnb.u(i, size());
        return isEmpty() ? b : new b(this, i);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
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
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r */
    public e47<E> subList(int i, int i2) {
        pnb.v(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? qyc.e : new d(i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.x37
    public Object writeReplace() {
        return new c(toArray(x37.a));
    }

    public class d extends e47<E> {
        public final transient int c;
        public final transient int d;

        public d(int i, int i2) {
            this.c = i;
            this.d = i2;
        }

        @Override // defpackage.x37
        public final Object[] c() {
            return e47.this.c();
        }

        @Override // defpackage.x37
        public final int d() {
            return e47.this.e() + this.c + this.d;
        }

        @Override // defpackage.x37
        public final int e() {
            return e47.this.e() + this.c;
        }

        @Override // defpackage.x37
        public final boolean f() {
            return true;
        }

        @Override // java.util.List
        public final E get(int i) {
            pnb.s(i, this.d);
            return e47.this.get(i + this.c);
        }

        @Override // defpackage.e47, defpackage.x37, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // defpackage.e47, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // defpackage.e47, java.util.List
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final e47<E> subList(int i, int i2) {
            pnb.v(i, i2, this.d);
            e47 e47Var = e47.this;
            int i3 = this.c;
            return e47Var.subList(i + i3, i2 + i3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.d;
        }

        @Override // defpackage.e47, defpackage.x37
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // defpackage.e47, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }
}
