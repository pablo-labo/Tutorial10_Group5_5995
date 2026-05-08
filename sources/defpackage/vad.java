package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class vad<T> extends vva<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final vva<? super T> forwardOrder;

    public vad(vva<? super T> vvaVar) {
        this.forwardOrder = vvaVar;
    }

    @Override // defpackage.vva
    public final <S extends T> vva<S> a() {
        return this.forwardOrder;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return this.forwardOrder.compare(t2, t);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vad) {
            return this.forwardOrder.equals(((vad) obj).forwardOrder);
        }
        return false;
    }

    public final int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public final String toString() {
        return this.forwardOrder + ".reverse()";
    }
}
