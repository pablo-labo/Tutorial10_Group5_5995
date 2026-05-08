package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class vm2<T> extends vva<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<? super T>[] comparators;

    public vm2(uq1 uq1Var, uq1 uq1Var2) {
        this.comparators = new Comparator[]{uq1Var, uq1Var2};
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int i = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.comparators;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vm2) {
            return Arrays.equals(this.comparators, ((vm2) obj).comparators);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.comparators);
    }

    public final String toString() {
        return l6.i(new StringBuilder("Ordering.compound("), Arrays.toString(this.comparators), ")");
    }
}
