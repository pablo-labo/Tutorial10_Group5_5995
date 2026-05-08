package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class hw2 {
    public final hva<String> a;
    public final hva<String> b;

    public hw2() {
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
        if (!(obj instanceof hw2)) {
            return false;
        }
        hw2 hw2Var = (hw2) obj;
        return wl7.b(this.a, hw2Var.a) && wl7.b(this.b, hw2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConversationEventAuthorInput(accountKey=" + this.a + ", externalParticipantId=" + this.b + ")";
    }
}
