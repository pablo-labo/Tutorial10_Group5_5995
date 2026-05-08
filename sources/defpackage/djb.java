package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class djb<T> implements bjb<T>, Serializable {
    private static final long serialVersionUID = 0;
    private final List<? extends bjb<? super T>> components;

    public djb(List list) {
        this.components = list;
    }

    @Override // defpackage.bjb
    public final boolean apply(T t) {
        for (int i = 0; i < this.components.size(); i++) {
            if (!this.components.get(i).apply(t)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof djb) {
            return this.components.equals(((djb) obj).components);
        }
        return false;
    }

    public final int hashCode() {
        return this.components.hashCode() + 306654252;
    }

    public final String toString() {
        List<? extends bjb<? super T>> list = this.components;
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (T t : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(t);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
