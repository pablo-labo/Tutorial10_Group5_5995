package defpackage;

import defpackage.ljd;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f75<K, V> extends ljd<K, V> {
    public final HashMap<K, ljd.c<K, V>> e = new HashMap<>();

    @Override // defpackage.ljd
    public final ljd.c<K, V> a(K k) {
        return this.e.get(k);
    }

    @Override // defpackage.ljd
    public final V b(K k) {
        V v = (V) super.b(k);
        this.e.remove(k);
        return v;
    }
}
