package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class nz8 {

    public static class a<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final ru5<? super F, ? extends T> function;

        /* JADX INFO: renamed from: nz8$a$a, reason: collision with other inner class name */
        public class C0336a extends urf<F, T> {
            public C0336a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // defpackage.trf
            public final T a(F f) {
                return a.this.function.apply(f);
            }
        }

        public a(ru5 ru5Var, List list) {
            list.getClass();
            this.fromList = list;
            this.function = ru5Var;
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i) {
            return this.function.apply(this.fromList.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new C0336a(this.fromList.listIterator(i));
        }

        @Override // java.util.AbstractList, java.util.List
        public final T remove(int i) {
            return this.function.apply(this.fromList.remove(i));
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i, int i2) {
            this.fromList.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.fromList.size();
        }
    }

    public static class b<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final ru5<? super F, ? extends T> function;

        public class a extends urf<F, T> {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // defpackage.trf
            public final T a(F f) {
                return b.this.function.apply(f);
            }
        }

        public b(ru5 ru5Var, List list) {
            list.getClass();
            this.fromList = list;
            this.function = ru5Var;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new a(this.fromList.listIterator(i));
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i, int i2) {
            this.fromList.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.fromList.size();
        }
    }

    @SafeVarargs
    public static <E> ArrayList<E> a(E... eArr) {
        int length = eArr.length;
        wg2.o(length, "arraySize");
        ArrayList<E> arrayList = new ArrayList<>(bm7.O1(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static AbstractList b(ru5 ru5Var, List list) {
        return list != null ? new a(ru5Var, list) : new b(ru5Var, list);
    }
}
