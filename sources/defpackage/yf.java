package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yf {
    public final String a;
    public final List<String> b;

    public yf(String str, List<String> list) {
        str.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf)) {
            return false;
        }
        yf yfVar = (yf) obj;
        return wl7.b(this.a, yfVar.a) && this.b.equals(yfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("AddConversationLabelsInput(conversationId=", this.a, ", labels=", ")", this.b);
    }
}
