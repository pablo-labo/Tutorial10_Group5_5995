package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i9b<K, V> extends l1<V> {
    public final u8b<K, V> a;

    public i9b(u8b<K, V> u8bVar) {
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
        return this.a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        stf<K, V> stfVar = this.a.a;
        ttf[] ttfVarArr = new ttf[8];
        for (int i = 0; i < 8; i++) {
            ttfVarArr[i] = new ytf();
        }
        return new j9b(stfVar, ttfVarArr);
    }
}
