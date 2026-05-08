package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class sy2 {
    public final hva<String> a;
    public final hva<bv2> b;

    public sy2(hva.c cVar, hva.c cVar2, int i) {
        hva<String> hvaVar = (i & 1) != 0 ? hva.a.a : cVar;
        hva<bv2> hvaVar2 = (i & 2) != 0 ? hva.a.a : cVar2;
        hvaVar.getClass();
        hvaVar2.getClass();
        this.a = hvaVar;
        this.b = hvaVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy2)) {
            return false;
        }
        sy2 sy2Var = (sy2) obj;
        return wl7.b(this.a, sy2Var.a) && wl7.b(this.b, sy2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConversationSelectionInput(id=" + this.a + ", contextAndScope=" + this.b + ")";
    }

    public sy2() {
        this(null, null, 3);
    }
}
