package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class fb9<T> implements ms9 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final a<T> b;

    public interface a<T> {
        T a(z9b z9bVar);
    }

    public fb9(a<T> aVar) {
        this.b = aVar;
    }

    public final void a(z9b z9bVar) {
        this.a.put(this.b.a(z9bVar), z9bVar);
    }
}
