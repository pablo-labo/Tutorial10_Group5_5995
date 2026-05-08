package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class iyf<T> {
    public final Class<? super T> a;
    public final Type b;
    public final int c;

    public iyf() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == iyf.class) {
                Type typeA = a.a(parameterizedType.getActualTypeArguments()[0]);
                this.b = typeA;
                this.a = (Class<? super T>) a.e(typeA);
                this.c = typeA.hashCode();
                return;
            }
        } else if (genericSuperclass == iyf.class) {
            r6.g("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
            throw null;
        }
        r6.g("Must only create direct subclasses of TypeToken");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iyf) {
            return a.c(this.b, ((iyf) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return a.g(this.b);
    }

    public iyf(Type type) {
        Objects.requireNonNull(type);
        Type typeA = a.a(type);
        this.b = typeA;
        this.a = (Class<? super T>) a.e(typeA);
        this.c = typeA.hashCode();
    }
}
