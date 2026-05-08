package defpackage;

import com.google.j2objc.annotations.RetainedWith;
import defpackage.e47;
import defpackage.x37;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i47<E> extends x37<E> implements Set<E> {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 912559;

    @RetainedWith
    public transient e47<E> b;

    public static class a<E> extends x37.a<E> {
        @Override // x37.b
        public final x37.b a(Object obj) {
            obj.getClass();
            c(obj);
            return this;
        }

        public final i47<E> f() {
            int i = this.b;
            if (i == 0) {
                int i2 = i47.c;
                return syc.Y;
            }
            Object[] objArr = this.a;
            if (i != 1) {
                i47<E> i47VarJ = i47.j(i, objArr);
                this.b = i47VarJ.size();
                this.c = true;
                return i47VarJ;
            }
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            int i3 = i47.c;
            return new die(obj);
        }
    }

    public static class b implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public b(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            Object[] objArr = this.elements;
            int i = i47.c;
            int length = objArr.length;
            return length != 0 ? length != 1 ? i47.j(objArr.length, (Object[]) objArr.clone()) : new die(objArr[0]) : syc.Y;
        }
    }

    public static int i(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            pnb.p("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static <E> i47<E> j(int i, Object... objArr) {
        if (i == 0) {
            return syc.Y;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new die(obj);
        }
        int i2 = i(i);
        Object[] objArr2 = new Object[i2];
        int i3 = i2 - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj2 = objArr[i6];
            if (obj2 == null) {
                ja.k(p6.c(i6, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iF = hh2.F(iHashCode);
            while (true) {
                int i7 = iF & i3;
                Object obj3 = objArr2[i7];
                if (obj3 == null) {
                    objArr[i5] = obj2;
                    objArr2[i7] = obj2;
                    i4 += iHashCode;
                    i5++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iF++;
            }
        }
        Arrays.fill(objArr, i5, i, (Object) null);
        if (i5 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new die(obj4);
        }
        if (i(i5) < i2 / 2) {
            return j(i5, objArr);
        }
        int length = objArr.length;
        if (i5 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new syc(objArr, i4, objArr2, i3, i5);
    }

    public static <E> i47<E> k(Collection<? extends E> collection) {
        if ((collection instanceof i47) && !(collection instanceof SortedSet)) {
            i47<E> i47Var = (i47) collection;
            if (!i47Var.f()) {
                return i47Var;
            }
        }
        Object[] array = collection.toArray();
        return j(array.length, array);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.x37
    public e47<E> a() {
        e47<E> e47Var = this.b;
        if (e47Var != null) {
            return e47Var;
        }
        e47<E> e47VarL = l();
        this.b = e47VarL;
        return e47VarL;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof i47) && (this instanceof syc) && (((i47) obj) instanceof syc) && hashCode() != obj.hashCode()) {
            return false;
        }
        return abe.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return abe.c(this);
    }

    @Override // defpackage.x37, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public e47<E> l() {
        Object[] array = toArray(x37.a);
        e47.b bVar = e47.b;
        return e47.i(array.length, array);
    }

    @Override // defpackage.x37
    public Object writeReplace() {
        return new b(toArray(x37.a));
    }
}
