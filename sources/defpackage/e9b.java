package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e9b<K, V> extends f4<Map.Entry<? extends K, ? extends V>> {
    public final u8b<K, V> a;

    public e9b(u8b<K, V> u8bVar) {
        this.a = u8bVar;
    }

    @Override // defpackage.l1
    public final int a() {
        u8b<K, V> u8bVar = this.a;
        u8bVar.getClass();
        return u8bVar.b;
    }

    @Override // defpackage.l1, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        u8b<K, V> u8bVar = this.a;
        V v = u8bVar.get(key);
        return v != null ? v.equals(entry.getValue()) : entry.getValue() == null && u8bVar.containsKey(entry.getKey());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        stf<K, V> stfVar = this.a.a;
        ttf[] ttfVarArr = new ttf[8];
        for (int i = 0; i < 8; i++) {
            ttfVarArr[i] = new utf();
        }
        return new f9b(stfVar, ttfVarArr);
    }
}
