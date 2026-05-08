package defpackage;

import defpackage.c7e;
import defpackage.mnf;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t09 {
    public final mnf.a a;
    public final Collection<c7e.a> b;
    public final Collection<List<oh7>> c;

    /* JADX WARN: Multi-variable type inference failed */
    public t09(mnf.a aVar, Collection<c7e.a> collection, Collection<? extends List<oh7>> collection2) {
        aVar.getClass();
        collection2.getClass();
        this.a = aVar;
        this.b = collection;
        this.c = collection2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t09)) {
            return false;
        }
        t09 t09Var = (t09) obj;
        return wl7.b(this.a, t09Var.a) && wl7.b(this.b, t09Var.b) && wl7.b(this.c, t09Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LocalParsingResult(iteratorPosition=" + this.a + ", parsedNodes=" + this.b + ", rangesToProcessFurther=" + this.c + ')';
    }
}
