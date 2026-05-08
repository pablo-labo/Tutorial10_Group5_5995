package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class tc5 {
    public final hva<vw2> a;
    public final hva<bd5> b;

    public tc5(hva.c cVar, int i) {
        hva<vw2> hvaVar = (i & 1) != 0 ? hva.a.a : cVar;
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
        if (!(obj instanceof tc5)) {
            return false;
        }
        tc5 tc5Var = (tc5) obj;
        return wl7.b(this.a, tc5Var.a) && wl7.b(this.b, tc5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FindConversationsInput(filter=" + this.a + ", options=" + this.b + ")";
    }

    public tc5() {
        this(null, 3);
    }
}
