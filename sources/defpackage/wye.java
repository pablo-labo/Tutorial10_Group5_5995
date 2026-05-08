package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wye {
    public final String a;

    public wye(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wye) && wl7.b(this.a, ((wye) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return l5.m("SuggestedMessageRewriteInput(messageDraft=", this.a, ")");
    }
}
