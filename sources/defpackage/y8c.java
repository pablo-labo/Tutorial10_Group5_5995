package defpackage;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
public final class y8c<T> {
    public final Class<? extends Annotation> a;
    public final Class<T> b;

    public @interface a {
    }

    public y8c(Class<? extends Annotation> cls, Class<T> cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static <T> y8c<T> a(Class<T> cls) {
        return new y8c<>(a.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y8c.class != obj.getClass()) {
            return false;
        }
        y8c y8cVar = (y8c) obj;
        if (this.b.equals(y8cVar.b)) {
            return this.a.equals(y8cVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class<T> cls = this.b;
        Class<? extends Annotation> cls2 = this.a;
        if (cls2 == a.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
