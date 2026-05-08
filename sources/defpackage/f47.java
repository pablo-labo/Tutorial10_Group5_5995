package defpackage;

import com.google.j2objc.annotations.RetainedWith;
import defpackage.ryc;
import defpackage.x37;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f47<K, V> implements Map<K, V>, Serializable {
    private static final long serialVersionUID = 912559;

    @RetainedWith
    public transient i47<Map.Entry<K, V>> a;

    @RetainedWith
    public transient i47<K> b;

    @RetainedWith
    public transient x37<V> c;

    public static class a<K, V> {
        public Object[] a;
        public int b = 0;
        public C0227a c;

        /* JADX INFO: renamed from: f47$a$a, reason: collision with other inner class name */
        public static final class C0227a {
            public final Object a;
            public final Object b;
            public final Object c;

            public C0227a(Object obj, Object obj2, Object obj3) {
                this.a = obj;
                this.b = obj2;
                this.c = obj3;
            }

            public final IllegalArgumentException a() {
                StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
                Object obj = this.a;
                sb.append(obj);
                sb.append("=");
                sb.append(this.b);
                sb.append(" and ");
                sb.append(obj);
                sb.append("=");
                sb.append(this.c);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public a(int i) {
            this.a = new Object[i * 2];
        }

        public f47<K, V> a() {
            ryc rycVar;
            C0227a c0227a = this.c;
            if (c0227a != null) {
                throw c0227a.a();
            }
            int i = this.b;
            Object[] objArrCopyOf = this.a;
            if (i == 0) {
                rycVar = ryc.V;
            } else {
                ryc rycVar2 = ryc.V;
                if (i == 1) {
                    Objects.requireNonNull(objArrCopyOf[0]);
                    Objects.requireNonNull(objArrCopyOf[1]);
                    rycVar = new ryc(null, objArrCopyOf, 1);
                } else {
                    pnb.u(i, objArrCopyOf.length >> 1);
                    Object objH = ryc.h(objArrCopyOf, i, i47.i(i), 0);
                    if (objH instanceof Object[]) {
                        Object[] objArr = (Object[]) objH;
                        this.c = (C0227a) objArr[2];
                        Object obj = objArr[0];
                        int iIntValue = ((Integer) objArr[1]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                        objH = obj;
                        i = iIntValue;
                    }
                    rycVar = new ryc(objH, objArrCopyOf, i);
                }
            }
            C0227a c0227a2 = this.c;
            if (c0227a2 == null) {
                return rycVar;
            }
            throw c0227a2.a();
        }

        public a<K, V> b(K k, V v) {
            int i = (this.b + 1) * 2;
            Object[] objArr = this.a;
            if (i > objArr.length) {
                this.a = Arrays.copyOf(objArr, x37.b.b(objArr.length, i));
            }
            if (k == null) {
                ja.k(t40.i(v, "null key in entry: null="));
                return null;
            }
            if (v == null) {
                ja.k(v40.e(k, "null value in entry: ", "=null"));
                return null;
            }
            Object[] objArr2 = this.a;
            int i2 = this.b;
            int i3 = i2 * 2;
            objArr2[i3] = k;
            objArr2[i3 + 1] = v;
            this.b = i2 + 1;
            return this;
        }
    }

    public static class b<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        public b(f47<K, V> f47Var) {
            Object[] objArr = new Object[f47Var.size()];
            Object[] objArr2 = new Object[f47Var.size()];
            ryc.a aVarB = f47Var.a;
            if (aVarB == null) {
                aVarB = f47Var.b();
                f47Var.a = aVarB;
            }
            r6g<Map.Entry<K, V>> it = aVarB.iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        public a<K, V> a(int i) {
            return new a<>(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object readResolve() {
            Object obj = this.keys;
            if (obj instanceof i47) {
                i47 i47Var = (i47) obj;
                x37 x37Var = (x37) this.values;
                a<K, V> aVarA = a(i47Var.size());
                Iterator it = i47Var.iterator();
                r6g it2 = x37Var.iterator();
                while (it.hasNext()) {
                    aVarA.b(it.next(), it2.next());
                }
                return aVarA.a();
            }
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) this.values;
            a<K, V> aVarA2 = a(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                aVarA2.b(objArr[i], objArr2[i]);
            }
            return aVarA2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> f47<K, V> a(Map<? extends K, ? extends V> map) {
        if ((map instanceof f47) && !(map instanceof SortedMap)) {
            return (f47) map;
        }
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        boolean z = setEntrySet instanceof Collection;
        a aVar = new a(z ? setEntrySet.size() : 4);
        if (z) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = aVar.a;
            if (size > objArr.length) {
                aVar.a = Arrays.copyOf(objArr, x37.b.b(objArr.length, size));
            }
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVar.b(entry.getKey(), entry.getValue());
        }
        return aVar.a();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract ryc.a b();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract ryc.b d();

    @Override // java.util.Map
    public final Set entrySet() {
        i47<Map.Entry<K, V>> i47Var = this.a;
        if (i47Var != null) {
            return i47Var;
        }
        ryc.a aVarB = b();
        this.a = aVarB;
        return aVarB;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return jc9.b(obj, this);
    }

    public abstract x37<V> f();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public x37<V> values() {
        x37<V> x37Var = this.c;
        if (x37Var != null) {
            return x37Var;
        }
        x37<V> x37VarF = f();
        this.c = x37VarF;
        return x37VarF;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public final int hashCode() {
        ryc.a aVarB = this.a;
        if (aVarB == null) {
            aVarB = b();
            this.a = aVarB;
        }
        return abe.c(aVarB);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        i47<K> i47Var = this.b;
        if (i47Var != null) {
            return i47Var;
        }
        ryc.b bVarD = d();
        this.b = bVarD;
        return bVarD;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        wg2.o(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public Object writeReplace() {
        return new b(this);
    }
}
