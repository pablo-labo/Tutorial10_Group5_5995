package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class hd2<T> extends vva<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<T> comparator;

    public hd2(bb1 bb1Var) {
        this.comparator = bb1Var;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return this.comparator.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hd2) {
            return this.comparator.equals(((hd2) obj).comparator);
        }
        return false;
    }

    public final int hashCode() {
        return this.comparator.hashCode();
    }

    public final String toString() {
        return this.comparator.toString();
    }
}
