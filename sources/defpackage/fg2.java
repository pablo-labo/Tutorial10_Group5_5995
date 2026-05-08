package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface fg2 {
    <T> j6c<Set<T>> a(y8c<T> y8cVar);

    <T> j6c<T> b(y8c<T> y8cVar);

    default <T> T c(y8c<T> y8cVar) {
        j6c<T> j6cVarB = b(y8cVar);
        if (j6cVarB == null) {
            return null;
        }
        return j6cVarB.get();
    }

    default <T> Set<T> d(y8c<T> y8cVar) {
        return a(y8cVar).get();
    }

    default <T> j6c<T> e(Class<T> cls) {
        return b(y8c.a(cls));
    }

    <T> wr3<T> f(y8c<T> y8cVar);

    default <T> T get(Class<T> cls) {
        return (T) c(y8c.a(cls));
    }
}
