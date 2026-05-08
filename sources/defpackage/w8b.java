package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class w8b<K, V> extends m3<K, V> {
    public u8b<K, V> a;
    public bf9 b = new bf9();
    public stf<K, V> c;
    public V d;
    public int e;
    public int f;

    public w8b(u8b<K, V> u8bVar) {
        this.a = u8bVar;
        this.c = u8bVar.a;
        this.f = u8bVar.b;
    }

    public u8b<K, V> a() {
        stf<K, V> stfVar = this.c;
        u8b<K, V> u8bVar = this.a;
        if (stfVar != u8bVar.a) {
            this.b = new bf9();
            u8bVar = new u8b<>(this.c, this.f);
        }
        this.a = u8bVar;
        return u8bVar;
    }

    public final void b(int i) {
        this.f = i;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = stf.e;
        b(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.c.d(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        return (V) this.c.g(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        this.d = null;
        this.c = this.c.l(k != null ? k.hashCode() : 0, k, v, 0, this);
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        u8b<K, V> u8bVarA = null;
        u8b<K, V> u8bVar = map instanceof u8b ? (u8b) map : null;
        if (u8bVar == null) {
            w8b w8bVar = map instanceof w8b ? (w8b) map : null;
            if (w8bVar != null) {
                u8bVarA = w8bVar.a();
            }
        } else {
            u8bVarA = u8bVar;
        }
        if (u8bVarA == null) {
            super.putAll(map);
            return;
        }
        hy3 hy3Var = new hy3();
        hy3Var.a = 0;
        int i = this.f;
        stf<K, V> stfVar = this.c;
        stf<K, V> stfVar2 = u8bVarA.a;
        stfVar2.getClass();
        this.c = stfVar.m(stfVar2, 0, hy3Var, this);
        int i2 = (u8bVarA.b + i) - hy3Var.a;
        if (i != i2) {
            b(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.f;
        stf<K, V> stfVarO = this.c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (stfVarO == null) {
            stfVarO = stf.e;
        }
        this.c = stfVarO;
        return i != this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        this.d = null;
        stf<K, V> stfVarN = this.c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (stfVarN == null) {
            stfVarN = stf.e;
        }
        this.c = stfVarN;
        return this.d;
    }
}
