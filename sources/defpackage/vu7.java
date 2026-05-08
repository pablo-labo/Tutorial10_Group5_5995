package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class vu7 {
    public final mma a;
    public final Collection<ef0> b;
    public final boolean c;

    public vu7(mma mmaVar, Collection collection) {
        this(mmaVar, collection, mmaVar.a == lma.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu7)) {
            return false;
        }
        vu7 vu7Var = (vu7) obj;
        return wl7.b(this.a, vu7Var.a) && wl7.b(this.b, vu7Var.b) && this.c == vu7Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.b);
        sb.append(", definitelyNotNull=");
        return m6.i(sb, this.c, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vu7(mma mmaVar, Collection<? extends ef0> collection, boolean z) {
        collection.getClass();
        this.a = mmaVar;
        this.b = collection;
        this.c = z;
    }
}
