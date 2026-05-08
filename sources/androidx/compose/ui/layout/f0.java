package androidx.compose.ui.layout;

import defpackage.q3a;
import defpackage.q92;
import defpackage.r3a;
import defpackage.tva;
import defpackage.ze8;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public interface f0 {
    void a(a aVar);

    boolean b(Object obj, Object obj2);

    public static final class a implements Collection<Object>, ze8 {
        public final q3a<Object> a;

        public a(int i) {
            int i2 = tva.a;
            this.a = new q3a<>(6);
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            return this.a.b(obj);
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.a.c();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return this.a.a(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!this.a.a(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.a.g == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<Object> iterator() {
            q3a<Object> q3aVar = this.a;
            q3aVar.getClass();
            return new r3a.a(new r3a(q3aVar));
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.a.g(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return this.a.g(collection);
        }

        @Override // java.util.Collection
        public final boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return this.a.i(collection);
        }

        @Override // java.util.Collection
        public final int size() {
            return this.a.g;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return q92.E(this);
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) q92.F(this, tArr);
        }
    }
}
