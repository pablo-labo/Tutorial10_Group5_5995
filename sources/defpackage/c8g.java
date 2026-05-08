package defpackage;

import defpackage.hva;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class c8g {
    public final String a;
    public final hva<Date> b;
    public final hva<String> c;

    public c8g() {
        throw null;
    }

    public c8g(hva.c cVar, String str) {
        hva.a aVar = hva.a.a;
        str.getClass();
        aVar.getClass();
        this.a = str;
        this.b = cVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8g)) {
            return false;
        }
        c8g c8gVar = (c8g) obj;
        return wl7.b(this.a, c8gVar.a) && wl7.b(this.b, c8gVar.b) && wl7.b(this.c, c8gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b0.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateConversationReadCursorInput(conversationId=");
        sb.append(this.a);
        sb.append(", readCursor=");
        sb.append(this.b);
        sb.append(", conversationEventId=");
        return akb.l(sb, this.c, ")");
    }
}
