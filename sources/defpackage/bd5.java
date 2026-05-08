package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class bd5 {
    public final hva<Boolean> a;
    public final hva<Boolean> b;

    public bd5() {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        this.a = aVar;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd5)) {
            return false;
        }
        bd5 bd5Var = (bd5) obj;
        return wl7.b(this.a, bd5Var.a) && wl7.b(this.b, bd5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FindConversationsSearchOptionsInput(adjacentContextSearch=" + this.a + ", allowUninitiatedConversationResults=" + this.b + ")";
    }
}
