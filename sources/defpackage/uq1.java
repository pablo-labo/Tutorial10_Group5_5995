package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class uq1<F, T> extends vva<F> implements Serializable {
    private static final long serialVersionUID = 0;
    final ru5<F, ? extends T> function;
    final vva<T> ordering;

    public uq1(ru5<F, ? extends T> ru5Var, vva<T> vvaVar) {
        this.function = ru5Var;
        vvaVar.getClass();
        this.ordering = vvaVar;
    }

    @Override // java.util.Comparator
    public final int compare(F f, F f2) {
        return this.ordering.compare(this.function.apply(f), this.function.apply(f2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uq1) {
            uq1 uq1Var = (uq1) obj;
            if (this.function.equals(uq1Var.function) && this.ordering.equals(uq1Var.ordering)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.function, this.ordering});
    }

    public final String toString() {
        return this.ordering + ".onResultOf(" + this.function + ")";
    }
}
