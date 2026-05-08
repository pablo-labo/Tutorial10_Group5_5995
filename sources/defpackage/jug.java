package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class jug {
    public final WeakReference<ClassLoader> a;
    public final int b;

    public jug(ClassLoader classLoader) {
        this.a = new WeakReference<>(classLoader);
        this.b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jug) && this.a.get() == ((jug) obj).a.get();
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = this.a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
