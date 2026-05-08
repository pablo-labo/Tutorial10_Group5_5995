package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fa3 {
    public final List<String> a;
    public final hva<ha3> b;

    /* JADX WARN: Multi-variable type inference failed */
    public fa3(List<String> list, hva<? extends ha3> hvaVar) {
        hvaVar.getClass();
        this.a = list;
        this.b = hvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa3)) {
            return false;
        }
        fa3 fa3Var = (fa3) obj;
        return this.a.equals(fa3Var.a) && wl7.b(this.b, fa3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomClassFilterInput(customClasses=" + this.a + ", operation=" + this.b + ")";
    }
}
