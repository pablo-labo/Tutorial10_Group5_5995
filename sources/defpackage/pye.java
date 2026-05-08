package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pye {
    public final hva<String> a;

    public pye(hva<String> hvaVar) {
        hvaVar.getClass();
        this.a = hvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pye) && wl7.b(this.a, ((pye) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SuggestedMessageConversationContextualDataInput(conversationId=" + this.a + ")";
    }
}
