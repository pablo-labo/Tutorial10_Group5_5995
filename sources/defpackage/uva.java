package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public class uva<E> implements Set<E>, ze8 {
    public final sva<E> a;

    @uh3(c = "androidx.collection.OrderedSetWrapper$iterator$1", f = "OrderedScatterSet.kt", l = {1454}, m = "invokeSuspend")
    public static final class a extends n7d implements Function2<t6e<? super E>, lu2<? super j6g>, Object> {
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ uva<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(uva<E> uvaVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = uvaVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.this$0, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, lu2<? super j6g> lu2Var) {
            return ((a) create((t6e) obj, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            t6e t6eVar;
            Object[] objArr;
            long[] jArr;
            int i;
            int i2 = this.label;
            if (i2 == 0) {
                r7d.b(obj);
                t6eVar = (t6e) this.L$0;
                sva<E> svaVar = this.this$0.a;
                objArr = svaVar.b;
                jArr = svaVar.c;
                i = svaVar.e;
            } else {
                if (i2 != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$0;
                jArr = (long[]) this.L$2;
                objArr = (Object[]) this.L$1;
                t6eVar = (t6e) this.L$0;
                r7d.b(obj);
            }
            if (i == Integer.MAX_VALUE) {
                return j6g.a;
            }
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj2 = objArr[i];
            this.L$0 = t6eVar;
            this.L$1 = objArr;
            this.L$2 = jArr;
            this.I$0 = i3;
            this.label = 1;
            t6eVar.a(this, obj2);
            return g13.a;
        }
    }

    public uva(q3a q3aVar) {
        q3aVar.getClass();
        this.a = q3aVar;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        collection.getClass();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.a((E) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return wl7.b(this.a, ((uva) obj).a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return q92.w(new a(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) q92.F(this, tArr);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return q92.E(this);
    }
}
