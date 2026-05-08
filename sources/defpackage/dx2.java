package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dx2 {
    public final String a;

    public dx2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dx2) && this.a.equals(((dx2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return l5.m("ConversationInput(conversationId=", this.a, ")");
    }
}
