package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ad2<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object Y = new Object();
    public transient c V;
    public transient a W;
    public transient e X;
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;

    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            ad2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            ad2 ad2Var = ad2.this;
            Map<K, V> mapB = ad2Var.b();
            if (mapB != null) {
                return mapB.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iF = ad2Var.f(entry.getKey());
            return iF != -1 && ojh.l(ad2Var.n()[iF], entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            ad2 ad2Var = ad2.this;
            Map<K, V> mapB = ad2Var.b();
            return mapB != null ? mapB.entrySet().iterator() : new yc2(ad2Var);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            ad2 ad2Var = ad2.this;
            Map<K, V> mapB = ad2Var.b();
            if (mapB != null) {
                return mapB.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (ad2Var.i()) {
                return false;
            }
            int iD = ad2Var.d();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = ad2Var.a;
            Objects.requireNonNull(obj2);
            int iP = ypd.P(key, value, iD, obj2, ad2Var.k(), ad2Var.l(), ad2Var.n());
            if (iP == -1) {
                return false;
            }
            ad2Var.h(iP, iD);
            ad2Var.f--;
            ad2Var.e += 32;
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ad2.this.size();
        }
    }

    public abstract class b<T> implements Iterator<T> {
        public int a;
        public int b;
        public int c;

        public b() {
            this.a = ad2.this.e;
            this.b = ad2.this.isEmpty() ? -1 : 0;
            this.c = -1;
        }

        public abstract T a(int i);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b >= 0;
        }

        @Override // java.util.Iterator
        public final T next() {
            ad2 ad2Var = ad2.this;
            if (ad2Var.e != this.a) {
                q6.h();
                return null;
            }
            if (!hasNext()) {
                k20.p();
                return null;
            }
            int i = this.b;
            this.c = i;
            T tA = a(i);
            int i2 = this.b + 1;
            if (i2 >= ad2Var.f) {
                i2 = -1;
            }
            this.b = i2;
            return tA;
        }

        @Override // java.util.Iterator
        public final void remove() {
            ad2 ad2Var = ad2.this;
            if (ad2Var.e != this.a) {
                q6.h();
                return;
            }
            pnb.w("no calls to next() since the last call to remove()", this.c >= 0);
            this.a += 32;
            ad2Var.remove(ad2Var.l()[this.c]);
            this.b--;
            this.c = -1;
        }
    }

    public class c extends AbstractSet<K> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            ad2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return ad2.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            ad2 ad2Var = ad2.this;
            Map<K, V> mapB = ad2Var.b();
            return mapB != null ? mapB.keySet().iterator() : new xc2(ad2Var);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            ad2 ad2Var = ad2.this;
            Map<K, V> mapB = ad2Var.b();
            return mapB != null ? mapB.keySet().remove(obj) : ad2Var.j(obj) != ad2.Y;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ad2.this.size();
        }
    }

    public final class d extends g3<K, V> {
        public final K a;
        public int b;

        public d(int i) {
            Object obj = ad2.Y;
            this.a = (K) ad2.this.l()[i];
            this.b = i;
        }

        public final void a() {
            int i = this.b;
            K k = this.a;
            ad2 ad2Var = ad2.this;
            if (i != -1 && i < ad2Var.size()) {
                if (ojh.l(k, ad2Var.l()[this.b])) {
                    return;
                }
            }
            Object obj = ad2.Y;
            this.b = ad2Var.f(k);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            ad2 ad2Var = ad2.this;
            Map<K, V> mapB = ad2Var.b();
            if (mapB != null) {
                return mapB.get(this.a);
            }
            a();
            int i = this.b;
            if (i == -1) {
                return null;
            }
            return (V) ad2Var.n()[i];
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            ad2 ad2Var = ad2.this;
            Map<K, V> mapB = ad2Var.b();
            K k = this.a;
            if (mapB != null) {
                return mapB.put(k, v);
            }
            a();
            int i = this.b;
            if (i == -1) {
                ad2Var.put(k, v);
                return null;
            }
            V v2 = (V) ad2Var.n()[i];
            ad2Var.n()[this.b] = v;
            return v2;
        }
    }

    public class e extends AbstractCollection<V> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            ad2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            ad2 ad2Var = ad2.this;
            Map<K, V> mapB = ad2Var.b();
            return mapB != null ? mapB.values().iterator() : new zc2(ad2Var);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ad2.this.size();
        }
    }

    public static <K, V> ad2<K, V> a(int i) {
        ad2<K, V> ad2Var = new ad2<>();
        ad2Var.g(i);
        return ad2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(p6.c(i, "Invalid size: "));
        }
        g(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map<K, V> mapB = b();
        Iterator<Map.Entry<K, V>> it = mapB != null ? mapB.entrySet().iterator() : new yc2(this);
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public final Map<K, V> b() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (i()) {
            return;
        }
        this.e += 32;
        Map<K, V> mapB = b();
        if (mapB != null) {
            this.e = bm7.L1(size(), 3);
            mapB.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(l(), 0, this.f, (Object) null);
        Arrays.fill(n(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(k(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map<K, V> mapB = b();
        return mapB != null ? mapB.containsKey(obj) : f(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map<K, V> mapB = b();
        if (mapB != null) {
            return mapB.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (ojh.l(obj, n()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        a aVar = this.W;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.W = aVar2;
        return aVar2;
    }

    public final int f(Object obj) {
        if (i()) {
            return -1;
        }
        int iG = hh2.G(obj);
        int iD = d();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iW = ypd.W(iG & iD, obj2);
        if (iW == 0) {
            return -1;
        }
        int i = ~iD;
        int i2 = iG & i;
        do {
            int i3 = iW - 1;
            int i4 = k()[i3];
            if ((i4 & i) == i2 && ojh.l(obj, l()[i3])) {
                return i3;
            }
            iW = i4 & iD;
        } while (iW != 0);
        return -1;
    }

    public final void g(int i) {
        pnb.p("Expected size must be >= 0", i >= 0);
        this.e = bm7.L1(i, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map<K, V> mapB = b();
        if (mapB != null) {
            return mapB.get(obj);
        }
        int iF = f(obj);
        if (iF == -1) {
            return null;
        }
        return (V) n()[iF];
    }

    public final void h(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrK = k();
        Object[] objArrL = l();
        Object[] objArrN = n();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrL[i] = null;
            objArrN[i] = null;
            iArrK[i] = 0;
            return;
        }
        Object obj2 = objArrL[i3];
        objArrL[i] = obj2;
        objArrN[i] = objArrN[i3];
        objArrL[i3] = null;
        objArrN[i3] = null;
        iArrK[i] = iArrK[i3];
        iArrK[i3] = 0;
        int iG = hh2.G(obj2) & i2;
        int iW = ypd.W(iG, obj);
        if (iW == size) {
            ypd.X(obj, iG, i + 1);
            return;
        }
        while (true) {
            int i4 = iW - 1;
            int i5 = iArrK[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrK[i4] = ypd.F(i5, i + 1, i2);
                return;
            }
            iW = i6;
        }
    }

    public final boolean i() {
        return this.a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j(Object obj) {
        if (!i()) {
            int iD = d();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int iP = ypd.P(obj, null, iD, obj2, k(), l(), null);
            if (iP != -1) {
                Object obj3 = n()[iP];
                h(iP, iD);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return Y;
    }

    public final int[] k() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        c cVar = this.V;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.V = cVar2;
        return cVar2;
    }

    public final Object[] l() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] n() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int o(int i, int i2, int i3, int i4) {
        Object objT = ypd.t(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            ypd.X(objT, i3 & i5, i4 + 1);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrK = k();
        for (int i6 = 0; i6 <= i; i6++) {
            int iW = ypd.W(i6, obj);
            while (iW != 0) {
                int i7 = iW - 1;
                int i8 = iArrK[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iW2 = ypd.W(i10, objT);
                ypd.X(objT, i10, iW);
                iArrK[i7] = ypd.F(i9, iW2, i5);
                iW = i8 & i;
            }
        }
        this.a = objT;
        this.e = ypd.F(this.e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d7 -> B:28:0x00bf). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V put(K r20, V r21) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad2.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map<K, V> mapB = b();
        if (mapB != null) {
            return mapB.remove(obj);
        }
        V v = (V) j(obj);
        if (v == Y) {
            return null;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> mapB = b();
        return mapB != null ? mapB.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        e eVar = this.X;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.X = eVar2;
        return eVar2;
    }
}
