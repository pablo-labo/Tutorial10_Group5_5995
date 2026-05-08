package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class mke<T> extends n3<T> {
    public static final /* synthetic */ int c = 0;
    public Object a;
    public int b;

    public static final class a<T> implements Iterator<T>, ze8 {
        public final ct0 a;

        public a(T[] tArr) {
            tArr.getClass();
            this.a = new ct0(tArr);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            return (T) this.a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class b {
        public static mke a() {
            return new mke(0);
        }
    }

    public static final class c<T> implements Iterator<T>, ze8 {
        public final T a;
        public boolean b = true;

        public c(T t) {
            this.a = t;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.b) {
                this.b = false;
                return this.a;
            }
            k20.p();
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public mke(int i) {
    }

    @Override // defpackage.n3
    public final int a() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(T t) {
        Object obj;
        int i = this.b;
        if (i == 0) {
            this.a = t;
        } else {
            Object obj2 = this.a;
            if (i == 1) {
                if (wl7.b(obj2, t)) {
                    return false;
                }
                this.a = new Object[]{this.a, t};
            } else if (i < 5) {
                obj2.getClass();
                Object[] objArr = (Object[]) obj2;
                if (ut0.f0(t, objArr)) {
                    return false;
                }
                int i2 = this.b;
                if (i2 == 4) {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    LinkedHashSet linkedHashSet = new LinkedHashSet(kc9.V(objArrCopyOf.length));
                    ut0.y0(objArrCopyOf, linkedHashSet);
                    linkedHashSet.add(t);
                    obj = linkedHashSet;
                } else {
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i2 + 1);
                    objArrCopyOf2[objArrCopyOf2.length - 1] = t;
                    obj = objArrCopyOf2;
                }
                this.a = obj;
            } else {
                obj2.getClass();
                if (!pxf.c(obj2).add(t)) {
                    return false;
                }
            }
        }
        this.b++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a = null;
        this.b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (a() == 0) {
            return false;
        }
        if (a() == 1) {
            return wl7.b(this.a, obj);
        }
        int iA = a();
        Object obj2 = this.a;
        if (iA < 5) {
            obj2.getClass();
            return ut0.f0(obj, (Object[]) obj2);
        }
        obj2.getClass();
        return ((Set) obj2).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<T> iterator() {
        int i = this.b;
        if (i == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        Object obj = this.a;
        if (i == 1) {
            return new c(obj);
        }
        if (i < 5) {
            obj.getClass();
            return new a((Object[]) obj);
        }
        obj.getClass();
        return pxf.c(obj).iterator();
    }
}
