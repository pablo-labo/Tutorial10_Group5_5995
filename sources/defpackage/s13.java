package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s13<K, V> {
    public final b89 a;
    public final LinkedHashMap<K, V> b = new LinkedHashMap<>();
    public int c = 0;

    public s13(b89 b89Var) {
        this.a = b89Var;
    }

    public final synchronized int a() {
        return this.b.size();
    }

    public final synchronized ArrayList b(tf2 tf2Var) {
        ArrayList arrayList;
        arrayList = new ArrayList(this.b.entrySet().size());
        for (Map.Entry<K, V> entry : this.b.entrySet()) {
            if (tf2Var.mo35apply(entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    public final synchronized int c() {
        return this.c;
    }

    public final synchronized void d(Object obj, Object obj2) {
        V vRemove = this.b.remove(obj);
        this.c -= vRemove == null ? 0 : this.a.a(vRemove);
        this.b.put(obj, obj2);
        this.c += this.a.a(obj2);
    }

    public final synchronized V e(K k) {
        V vRemove;
        vRemove = this.b.remove(k);
        this.c -= vRemove == null ? 0 : this.a.a(vRemove);
        return vRemove;
    }

    public final synchronized ArrayList<V> f(cjb<K> cjbVar) {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<K, V>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (cjbVar.mo35apply(next.getKey())) {
                arrayList.add(next.getValue());
                int i = this.c;
                V value = next.getValue();
                this.c = i - (value == null ? 0 : this.a.a(value));
                it.remove();
            }
        }
        return arrayList;
    }
}
