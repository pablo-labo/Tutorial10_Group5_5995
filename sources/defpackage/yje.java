package defpackage;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public final class yje implements xje {
    public static final yje a = new yje();

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return xje.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof xje;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return o6.e(xje.class, new StringBuilder("@"), "()");
    }
}
