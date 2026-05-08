package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class m1i extends LinkedHashMap {
    private boolean zzb = true;

    static {
        new m1i().zzb = false;
    }

    public static int h(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof tyh)) {
                return obj.hashCode();
            }
            b0.l();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = ezh.a;
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

    public final m1i d() {
        if (isEmpty()) {
            return new m1i();
        }
        m1i m1iVar = new m1i(this);
        m1iVar.zzb = true;
        return m1iVar;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        this.zzb = false;
    }

    public final boolean g() {
        return this.zzb;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iH = 0;
        for (Map.Entry entry : entrySet()) {
            iH += h(entry.getValue()) ^ h(entry.getKey());
        }
        return iH;
    }

    public final void i() {
        if (this.zzb) {
            return;
        }
        b0.l();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        i();
        Charset charset = ezh.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        i();
        for (Object obj : map.keySet()) {
            Charset charset = ezh.a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        return super.remove(obj);
    }
}
