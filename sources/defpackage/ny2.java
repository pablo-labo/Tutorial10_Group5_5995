package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class ny2 {
    public final hva<aib> a;
    public final hva<t7d> b;

    public ny2(hva.c cVar, int i) {
        hva<aib> hvaVar = (i & 1) != 0 ? hva.a.a : cVar;
        hva.a aVar = hva.a.a;
        hvaVar.getClass();
        aVar.getClass();
        this.a = hvaVar;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny2)) {
            return false;
        }
        ny2 ny2Var = (ny2) obj;
        return wl7.b(this.a, ny2Var.a) && wl7.b(this.b, ny2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConversationScopeDataInput(preOrPostApply=" + this.a + ", resume=" + this.b + ")";
    }

    public ny2() {
        this(null, 3);
    }
}
