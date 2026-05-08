package defpackage;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class u2i<K, V> extends LinkedHashMap<K, V> {
    public static final u2i a;
    private boolean zza = true;

    static {
        u2i u2iVar = new u2i();
        a = u2iVar;
        u2iVar.zza = false;
    }

    public static int d(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof jzh)) {
                return obj.hashCode();
            }
            b0.l();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = mzh.a;
        int i = length;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5d
            java.util.Map r6 = (java.util.Map) r6
            r0 = 1
            if (r5 == r6) goto L59
            int r2 = r5.size()
            int r3 = r6.size()
            if (r2 == r3) goto L16
        L14:
            r5 = r1
            goto L5a
        L16:
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L1e:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r6.containsKey(r3)
            if (r3 != 0) goto L35
            goto L14
        L35:
            java.lang.Object r3 = r2.getValue()
            java.lang.Object r2 = r2.getKey()
            java.lang.Object r2 = r6.get(r2)
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L52
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L52
            byte[] r3 = (byte[]) r3
            byte[] r2 = (byte[]) r2
            boolean r2 = java.util.Arrays.equals(r3, r2)
            goto L56
        L52:
            boolean r2 = r3.equals(r2)
        L56:
            if (r2 != 0) goto L1e
            goto L14
        L59:
            r5 = r0
        L5a:
            if (r5 == 0) goto L5d
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u2i.equals(java.lang.Object):boolean");
    }

    public final u2i<K, V> f() {
        if (isEmpty()) {
            return new u2i<>();
        }
        u2i<K, V> u2iVar = new u2i<>(this);
        u2iVar.zza = true;
        return u2iVar;
    }

    public final void g() {
        this.zza = false;
    }

    public final boolean h() {
        return this.zza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iD = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iD += d(entry.getValue()) ^ d(entry.getKey());
        }
        return iD;
    }

    public final void i() {
        if (this.zza) {
            return;
        }
        b0.l();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        i();
        Charset charset = mzh.a;
        k.getClass();
        v.getClass();
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        i();
        for (K k : map.keySet()) {
            Charset charset = mzh.a;
            k.getClass();
            map.get(k).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        i();
        return (V) super.remove(obj);
    }
}
