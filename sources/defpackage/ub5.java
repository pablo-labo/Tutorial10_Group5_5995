package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ub5<E> {
    public final List<String> a;
    public final List<E> b;

    /* JADX WARN: Multi-variable type inference failed */
    public ub5(List<String> list, List<? extends E> list2) {
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub5)) {
            return false;
        }
        ub5 ub5Var = (ub5) obj;
        return this.a.equals(ub5Var.a) && wl7.b(this.b, ub5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FilterResult(tokens=" + this.a + ", items=" + this.b + ')';
    }
}
