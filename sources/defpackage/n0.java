package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n0<K, V> implements Iterable<V>, ze8 {

    public static abstract class a<K, V, T extends V> {
        public final int a;

        public a(int i) {
            this.a = i;
        }
    }

    public abstract it0<V> a();

    public final boolean isEmpty() {
        return ((fx0) this).a.a() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return a().iterator();
    }
}
