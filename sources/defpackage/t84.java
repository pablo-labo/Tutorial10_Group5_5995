package defpackage;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class t84<T> implements Provider<T> {
    public static final Object c = new Object();
    public volatile d65 a;
    public volatile Object b;

    public static Provider a(d65 d65Var) {
        if (d65Var instanceof t84) {
            return d65Var;
        }
        t84 t84Var = new t84();
        t84Var.b = c;
        t84Var.a = d65Var;
        return t84Var;
    }

    @Override // javax.inject.Provider
    public final T get() {
        T t;
        T t2 = (T) this.b;
        Object obj = c;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            try {
                t = (T) this.b;
                if (t == obj) {
                    t = this.a.get();
                    Object obj2 = this.b;
                    if (obj2 != obj && obj2 != t) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t + ". This is likely due to a circular dependency.");
                    }
                    this.b = t;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
