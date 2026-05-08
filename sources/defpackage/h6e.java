package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h6e {
    public final sy2 a;
    public final hva<hw2> b;
    public final sw2 c;
    public final hva<qw2> d;
    public final hva<String> e;
    public final hva<String> f;
    public final String g;
    public final hva<List<yu2>> h;
    public final hva<List<nw2>> i;
    public final hva<List<lw2>> j;
    public final hva<String> k;
    public final hva<Boolean> l;
    public final hva<String> m;
    public final hva<ow2> n;
    public final hva<pz> o;
    public final hva<List<ix9>> p;

    public h6e() {
        throw null;
    }

    public h6e(sy2 sy2Var, hva.c cVar, hva.c cVar2, hva.c cVar3) {
        sw2 sw2Var = sw2.c;
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = sy2Var;
        this.b = aVar;
        this.c = sw2Var;
        this.d = aVar;
        this.e = cVar;
        this.f = cVar2;
        this.g = "android-messaging";
        this.h = cVar3;
        this.i = aVar;
        this.j = aVar;
        this.k = aVar;
        this.l = aVar;
        this.m = aVar;
        this.n = aVar;
        this.o = aVar;
        this.p = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6e)) {
            return false;
        }
        h6e h6eVar = (h6e) obj;
        return wl7.b(this.a, h6eVar.a) && wl7.b(this.b, h6eVar.b) && this.c == h6eVar.c && wl7.b(this.d, h6eVar.d) && wl7.b(this.e, h6eVar.e) && wl7.b(this.f, h6eVar.f) && wl7.b(this.g, h6eVar.g) && wl7.b(this.h, h6eVar.h) && wl7.b(this.i, h6eVar.i) && wl7.b(this.j, h6eVar.j) && wl7.b(this.k, h6eVar.k) && wl7.b(this.l, h6eVar.l) && wl7.b(this.m, h6eVar.m) && wl7.b(this.n, h6eVar.n) && wl7.b(this.o, h6eVar.o) && wl7.b(this.p, h6eVar.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + b0.e(this.o, b0.e(this.n, b0.e(this.m, b0.e(this.l, b0.e(this.k, b0.e(this.j, b0.e(this.i, b0.e(this.h, akb.d(b0.e(this.f, b0.e(this.e, b0.e(this.d, (this.c.hashCode() + b0.e(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31), 31), 31, this.g), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendConversationEventInput(conversation=");
        sb.append(this.a);
        sb.append(", author=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", subType=");
        sb.append(this.d);
        sb.append(", messageContentFormat=");
        w40.o(sb, this.e, ", messageBody=", this.f, ", source=");
        sb.append(this.g);
        sb.append(", attachments=");
        sb.append(this.h);
        sb.append(", recipients=");
        w40.o(sb, this.i, ", payload=", this.j, ", replyToEventId=");
        w40.o(sb, this.k, ", suppressNotification=", this.l, ", eventId=");
        w40.o(sb, this.m, ", reminders=", this.n, ", additionalParticipants=");
        return uz.e(sb, this.o, ", moderationMetadata=", this.p, ")");
    }
}
