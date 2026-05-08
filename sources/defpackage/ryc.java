package defpackage;

import defpackage.f47;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ryc<K, V> extends f47<K, V> {
    public static final ryc V = new ryc(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    public static class a<K, V> extends i47<Map.Entry<K, V>> {
        public final transient int V;
        public final transient f47<K, V> d;
        public final transient Object[] e;
        public final transient int f;

        /* JADX INFO: renamed from: ryc$a$a, reason: collision with other inner class name */
        public class C0413a extends e47<Map.Entry<K, V>> {
            public C0413a() {
            }

            @Override // defpackage.x37
            public final boolean f() {
                return true;
            }

            @Override // java.util.List
            public final Object get(int i) {
                pnb.s(i, a.this.V);
                a aVar = a.this;
                int i2 = i * 2;
                Object obj = aVar.e[aVar.f + i2];
                Objects.requireNonNull(obj);
                a aVar2 = a.this;
                Object obj2 = aVar2.e[i2 + (aVar2.f ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return a.this.V;
            }

            @Override // defpackage.e47, defpackage.x37
            public Object writeReplace() {
                return super.writeReplace();
            }
        }

        public a(f47<K, V> f47Var, Object[] objArr, int i, int i2) {
            this.d = f47Var;
            this.e = objArr;
            this.f = i;
            this.V = i2;
        }

        @Override // defpackage.x37
        public final int b(int i, Object[] objArr) {
            return a().b(i, objArr);
        }

        @Override // defpackage.x37, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.d.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.x37
        public final boolean f() {
            return true;
        }

        @Override // defpackage.i47, defpackage.x37, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: g */
        public final r6g<Map.Entry<K, V>> iterator() {
            return a().listIterator(0);
        }

        @Override // defpackage.i47
        public final e47<Map.Entry<K, V>> l() {
            return new C0413a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.V;
        }

        @Override // defpackage.i47, defpackage.x37
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class b<K> extends i47<K> {
        public final transient f47<K, ?> d;
        public final transient c e;

        public b(f47 f47Var, c cVar) {
            this.d = f47Var;
            this.e = cVar;
        }

        @Override // defpackage.i47, defpackage.x37
        public final e47<K> a() {
            return this.e;
        }

        @Override // defpackage.x37
        public final int b(int i, Object[] objArr) {
            return this.e.b(i, objArr);
        }

        @Override // defpackage.x37, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.d.get(obj) != null;
        }

        @Override // defpackage.x37
        public final boolean f() {
            return true;
        }

        @Override // defpackage.i47, defpackage.x37, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: g */
        public final r6g<K> iterator() {
            return this.e.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.d.size();
        }

        @Override // defpackage.i47, defpackage.x37
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class c extends e47<Object> {
        public final transient Object[] c;
        public final transient int d;
        public final transient int e;

        public c(Object[] objArr, int i, int i2) {
            this.c = objArr;
            this.d = i;
            this.e = i2;
        }

        @Override // defpackage.x37
        public final boolean f() {
            return true;
        }

        @Override // java.util.List
        public final Object get(int i) {
            pnb.s(i, this.e);
            Object obj = this.c[(i * 2) + this.d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.e;
        }

        @Override // defpackage.e47, defpackage.x37
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public ryc(Object obj, Object[] objArr, int i) {
        this.d = obj;
        this.e = objArr;
        this.f = i;
    }

    public static Object h(Object[] objArr, int i, int i2, int i3) {
        f47.a.C0227a c0227a = null;
        if (i == 1) {
            Objects.requireNonNull(objArr[i3]);
            Objects.requireNonNull(objArr[i3 ^ 1]);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = 0;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            while (i5 < i) {
                int i7 = (i5 * 2) + i3;
                int i8 = (i6 * 2) + i3;
                Object obj = objArr[i7];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i7 ^ 1];
                Objects.requireNonNull(obj2);
                int iF = hh2.F(obj.hashCode());
                while (true) {
                    int i9 = iF & i4;
                    int i10 = bArr[i9] & 255;
                    if (i10 == 255) {
                        bArr[i9] = (byte) i8;
                        if (i6 < i5) {
                            objArr[i8] = obj;
                            objArr[i8 ^ 1] = obj2;
                        }
                        i6++;
                    } else {
                        if (obj.equals(objArr[i10])) {
                            int i11 = i10 ^ 1;
                            Object obj3 = objArr[i11];
                            Objects.requireNonNull(obj3);
                            c0227a = new f47.a.C0227a(obj, obj2, obj3);
                            objArr[i11] = obj2;
                            break;
                        }
                        iF = i9 + 1;
                    }
                }
                i5++;
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), c0227a};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i12 = 0;
            while (i5 < i) {
                int i13 = (i5 * 2) + i3;
                int i14 = (i12 * 2) + i3;
                Object obj4 = objArr[i13];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i13 ^ 1];
                Objects.requireNonNull(obj5);
                int iF2 = hh2.F(obj4.hashCode());
                while (true) {
                    int i15 = iF2 & i4;
                    int i16 = sArr[i15] & 65535;
                    if (i16 == 65535) {
                        sArr[i15] = (short) i14;
                        if (i12 < i5) {
                            objArr[i14] = obj4;
                            objArr[i14 ^ 1] = obj5;
                        }
                        i12++;
                    } else {
                        if (obj4.equals(objArr[i16])) {
                            int i17 = i16 ^ 1;
                            Object obj6 = objArr[i17];
                            Objects.requireNonNull(obj6);
                            c0227a = new f47.a.C0227a(obj4, obj5, obj6);
                            objArr[i17] = obj5;
                            break;
                        }
                        iF2 = i15 + 1;
                    }
                }
                i5++;
            }
            return i12 == i ? sArr : new Object[]{sArr, Integer.valueOf(i12), c0227a};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i18 = 0;
        while (i5 < i) {
            int i19 = (i5 * 2) + i3;
            int i20 = (i18 * 2) + i3;
            Object obj7 = objArr[i19];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i19 ^ 1];
            Objects.requireNonNull(obj8);
            int iF3 = hh2.F(obj7.hashCode());
            while (true) {
                int i21 = iF3 & i4;
                int i22 = iArr[i21];
                if (i22 == -1) {
                    iArr[i21] = i20;
                    if (i18 < i5) {
                        objArr[i20] = obj7;
                        objArr[i20 ^ 1] = obj8;
                    }
                    i18++;
                } else {
                    if (obj7.equals(objArr[i22])) {
                        int i23 = i22 ^ 1;
                        Object obj9 = objArr[i23];
                        Objects.requireNonNull(obj9);
                        c0227a = new f47.a.C0227a(obj7, obj8, obj9);
                        objArr[i23] = obj8;
                        break;
                    }
                    iF3 = i21 + 1;
                }
            }
            i5++;
        }
        return i18 == i ? iArr : new Object[]{iArr, Integer.valueOf(i18), c0227a};
    }

    public static Object i(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iF = hh2.F(obj2.hashCode());
            while (true) {
                int i3 = iF & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iF = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iF2 = hh2.F(obj2.hashCode());
            while (true) {
                int i5 = iF2 & length2;
                int i6 = sArr[i5] & 65535;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iF2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iF3 = hh2.F(obj2.hashCode());
            while (true) {
                int i7 = iF3 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iF3 = i7 + 1;
            }
        }
    }

    @Override // defpackage.f47
    public final a b() {
        return new a(this, this.e, 0, this.f);
    }

    @Override // defpackage.f47
    public final b d() {
        return new b(this, new c(this.e, 0, this.f));
    }

    @Override // defpackage.f47
    public final x37<V> f() {
        return new c(this.e, 1, this.f);
    }

    @Override // defpackage.f47, java.util.Map
    public final V get(Object obj) {
        V v = (V) i(this.d, this.e, this.f, 0, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }

    @Override // defpackage.f47
    public Object writeReplace() {
        return super.writeReplace();
    }
}
