package defpackage;

import defpackage.v03;

/* JADX INFO: loaded from: classes3.dex */
public final class vkf implements v03.b<tkf<?>> {
    public final ThreadLocal<?> a;

    public vkf(ThreadLocal<?> threadLocal) {
        this.a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vkf) && wl7.b(this.a, ((vkf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.a + ')';
    }
}
