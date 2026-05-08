package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class kmh<K, V> extends AbstractMap<K, V> implements Cloneable {
    public int a;
    public Object[] b;

    public final class a implements Map.Entry<K, V> {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            Object value;
            Object value2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = getKey();
            Object key2 = entry.getKey();
            return (key == key2 || (key != null && key.equals(key2))) && ((value = getValue()) == (value2 = entry.getValue()) || (value != null && value.equals(value2)));
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            int i = this.a;
            if (i < 0) {
                return null;
            }
            kmh kmhVar = kmh.this;
            if (i >= kmhVar.a) {
                return null;
            }
            return (K) kmhVar.b[i << 1];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            int i;
            int i2 = this.a;
            if (i2 < 0) {
                return null;
            }
            kmh kmhVar = kmh.this;
            if (i2 < kmhVar.a && (i = (i2 << 1) + 1) >= 0) {
                return (V) kmhVar.b[i];
            }
            return null;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Object key = getKey();
            Object value = getValue();
            return (key != null ? key.hashCode() : 0) ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            kmh kmhVar = kmh.this;
            int i = kmhVar.a;
            V v2 = null;
            int i2 = this.a;
            if (i2 < 0 || i2 >= i) {
                k20.o();
                return null;
            }
            int i3 = (i2 << 1) + 1;
            if (i3 >= 0) {
                v2 = (V) kmhVar.b[i3];
            }
            kmhVar.b[i3] = v;
            return v2;
        }
    }

    public final class b extends AbstractSet<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return kmh.this.a;
        }
    }

    public final class c implements Iterator<Map.Entry<K, V>> {
        public boolean a;
        public int b;

        public c() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b < kmh.this.a;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            int i = this.b;
            kmh kmhVar = kmh.this;
            if (i == kmhVar.a) {
                k20.p();
                return null;
            }
            this.b = i + 1;
            this.a = false;
            return new a(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = this.b - 1;
            if (this.a || i < 0) {
                o6.h();
                return;
            }
            kmh.this.f(i << 1);
            this.b--;
            this.a = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a = 0;
        this.b = null;
    }

    @Override // java.util.AbstractMap
    public final Object clone() {
        try {
            kmh kmhVar = (kmh) super.clone();
            Object[] objArr = this.b;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                kmhVar.b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return kmhVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return -2 != d(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.a << 1;
        Object[] objArr = this.b;
        for (int i2 = 1; i2 < i; i2 += 2) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
            } else {
                if (obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int d(Object obj) {
        int i = this.a << 1;
        Object[] objArr = this.b;
        for (int i2 = 0; i2 < i; i2 += 2) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 == null) {
                    return i2;
                }
            } else {
                if (obj.equals(obj2)) {
                    return i2;
                }
            }
        }
        return -2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new b();
    }

    public final V f(int i) {
        int i2 = this.a << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        int i3 = i + 1;
        V v = i3 < 0 ? null : (V) this.b[i3];
        Object[] objArr = this.b;
        int i4 = (i2 - i) - 2;
        if (i4 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i4);
        }
        this.a--;
        Object[] objArr2 = this.b;
        objArr2[i2 - 2] = null;
        objArr2[i2 - 1] = null;
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        int iD = d(obj) + 1;
        if (iD < 0) {
            return null;
        }
        return (V) this.b[iD];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int iD = d(k) >> 1;
        if (iD == -1) {
            iD = this.a;
        }
        V v2 = null;
        if (iD < 0) {
            k20.o();
            return null;
        }
        int i = iD + 1;
        if (i < 0) {
            k20.o();
            return null;
        }
        Object[] objArr = this.b;
        int i2 = i << 1;
        int length = objArr == null ? 0 : objArr.length;
        if (i2 > length) {
            int i3 = (length / 2) * 3;
            int i4 = i3 + 1;
            if (i4 % 2 != 0) {
                i4 = i3 + 2;
            }
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 == 0) {
                this.b = null;
            } else {
                int i5 = this.a;
                if (i5 == 0 || i2 != objArr.length) {
                    Object[] objArr2 = new Object[i2];
                    this.b = objArr2;
                    if (i5 != 0) {
                        System.arraycopy(objArr, 0, objArr2, 0, i5 << 1);
                    }
                }
            }
        }
        int i6 = iD << 1;
        int i7 = i6 + 1;
        if (i7 >= 0) {
            v2 = (V) this.b[i7];
        }
        Object[] objArr3 = this.b;
        objArr3[i6] = k;
        objArr3[i7] = v;
        if (i > this.a) {
            this.a = i;
        }
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        return f(d(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a;
    }
}
