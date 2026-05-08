package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class en2<T> implements olg<T> {
    public final Function1<mm2, T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public en2(Function1<? super mm2, ? extends T> function1) {
        this.a = function1;
    }

    @Override // defpackage.olg
    public final T a(t8b t8bVar) {
        return this.a.invoke(t8bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof en2) && wl7.b(this.a, ((en2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
