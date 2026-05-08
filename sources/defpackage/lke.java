package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class lke<E> extends AbstractList<E> implements RandomAccess {
    public int a;
    public Object b;

    public static class a<T> implements Iterator<T> {
        public static final a a = new a();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new IllegalStateException();
        }
    }

    public class b extends c<E> {
        public final int b;

        public b() {
            this.b = ((AbstractList) lke.this).modCount;
        }

        @Override // lke.c
        public final void a() {
            lke lkeVar = lke.this;
            int i = ((AbstractList) lkeVar).modCount;
            int i2 = this.b;
            if (i == i2) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) lkeVar).modCount + "; expected: " + i2);
        }

        @Override // java.util.Iterator
        public final void remove() {
            a();
            lke.this.clear();
        }
    }

    public static abstract class c<T> implements Iterator<T> {
        public boolean a;

        public abstract void a();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.a;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.a) {
                k20.p();
                return null;
            }
            this.a = true;
            a();
            return (T) lke.this.b;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        if (i < 0 || i > (i2 = this.a)) {
            v40.k(this.a, o6.g(i, "Index: ", ", Size: "));
            return;
        }
        if (i2 == 0) {
            this.b = e;
        } else if (i2 == 1 && i == 0) {
            this.b = new Object[]{e, this.b};
        } else {
            Object[] objArr = new Object[i2 + 1];
            Object obj = this.b;
            if (i2 == 1) {
                objArr[0] = obj;
            } else {
                Object[] objArr2 = (Object[]) obj;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                System.arraycopy(objArr2, i, objArr, i + 1, this.a - i);
            }
            objArr[i] = e;
            this.b = objArr;
        }
        this.a++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b = null;
        this.a = 0;
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.a)) {
            v40.k(this.a, o6.g(i, "Index: ", ", Size: "));
            return null;
        }
        E e = (E) this.b;
        return i2 == 1 ? e : (E) ((Object[]) e)[i];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        int i = this.a;
        if (i == 0) {
            return a.a;
        }
        if (i == 1) {
            return new b();
        }
        Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        a(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.a)) {
            v40.k(this.a, o6.g(i, "Index: ", ", Size: "));
            return null;
        }
        Object obj = (E) this.b;
        if (i2 == 1) {
            this.b = null;
        } else {
            Object[] objArr = (Object[]) obj;
            Object obj2 = objArr[i];
            if (i2 == 2) {
                this.b = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.a - 1] = null;
            }
            obj = (E) obj2;
        }
        this.a--;
        ((AbstractList) this).modCount++;
        return (E) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.a)) {
            v40.k(this.a, o6.g(i, "Index: ", ", Size: "));
            return null;
        }
        E e2 = (E) this.b;
        if (i2 == 1) {
            this.b = e;
            return e2;
        }
        Object[] objArr = (Object[]) e2;
        E e3 = (E) objArr[i];
        objArr[i] = e;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super E> comparator) {
        int i = this.a;
        if (i >= 2) {
            Arrays.sort((Object[]) this.b, 0, i, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            a(4);
            throw null;
        }
        int length = tArr.length;
        int i = this.a;
        if (i == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.b;
                return tArr2;
            }
            tArr[0] = this.b;
        } else {
            if (length < i) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.b, i, tArr.getClass());
                if (tArr3 != null) {
                    return tArr3;
                }
                a(6);
                throw null;
            }
            if (i != 0) {
                System.arraycopy(this.b, 0, tArr, 0, i);
            }
        }
        int i2 = this.a;
        if (length > i2) {
            tArr[i2] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        int i = this.a;
        if (i == 0) {
            this.b = e;
        } else {
            Object obj = this.b;
            if (i == 1) {
                this.b = new Object[]{obj, e};
            } else {
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                if (i >= length) {
                    int iA = akb.a(length, 3, 2, 1);
                    int i2 = i + 1;
                    if (iA < i2) {
                        iA = i2;
                    }
                    Object[] objArr2 = new Object[iA];
                    this.b = objArr2;
                    System.arraycopy(objArr, 0, objArr2, 0, length);
                    objArr = objArr2;
                }
                objArr[this.a] = e;
            }
        }
        this.a++;
        ((AbstractList) this).modCount++;
        return true;
    }
}
