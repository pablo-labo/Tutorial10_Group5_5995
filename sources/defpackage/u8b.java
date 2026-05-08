package defpackage;

import defpackage.stf;

/* JADX INFO: loaded from: classes.dex */
public class u8b<K, V> extends b3<K, V> {
    public static final u8b c = new u8b(stf.e, 0);
    public final stf<K, V> a;
    public final int b;

    public u8b(stf<K, V> stfVar, int i) {
        this.a = stfVar;
        this.b = i;
    }

    public w8b<K, V> b() {
        return new w8b<>(this);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.a.d(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    public final u8b d(Object obj, fy8 fy8Var) {
        stf.a aVarU = this.a.u(obj, obj != null ? obj.hashCode() : 0, 0, fy8Var);
        return aVarU == null ? this : new u8b(aVarU.a, this.b + aVarU.b);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return (V) this.a.g(obj, obj != null ? obj.hashCode() : 0, 0);
    }
}
