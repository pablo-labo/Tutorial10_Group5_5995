package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yu2 {
    public final String a;
    public final String b;

    public yu2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu2)) {
            return false;
        }
        yu2 yu2Var = (yu2) obj;
        return wl7.b(this.a, yu2Var.a) && wl7.b(this.b, yu2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return akb.k("ConversationAttachmentInput(contentHash=", this.a, ", fileName=", this.b, ")");
    }
}
